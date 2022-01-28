import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Visitor extends CppParserBaseVisitor<StringBuilder> {
	int level = 0;

	protected StringBuilder printWS() {
		return new StringBuilder("&nbsp;".repeat(Math.max(0, level)));
	}

	protected StringBuilder newLine() {
		return new StringBuilder("<br>")
				.append(System.lineSeparator());
	}

	protected StringBuilder withLevel(Supplier<StringBuilder> s) {
		level += 4;
		StringBuilder res = s.get();
		level -= 4;
		return res;
	}

	protected StringBuilder withColor(StringBuilder s, String color) {
		return withTag(s, "span", "style=\"color:" + color + "\"");
	}

	protected StringBuilder withColor(String s, String color) {
		return withColor(new StringBuilder(s), color);
	}

	private StringBuilder withTag(StringBuilder s, String tag, String args) {
		StringBuilder res = new StringBuilder("<").append(tag);
		if (args != null) {
			res.append(' ').append(args);
		}
		return res.append('>')
				  .append(s)
				  .append("</").append(tag).append('>');
	}

	private Stream<ParseTree> toStream(final ParserRuleContext ctx) {
		return ctx.children == null ? Stream.empty() : ctx.children.stream();
	}

	protected StringBuilder concat(Stream<ParseTree> stream, BinaryOperator<StringBuilder> concat) {
		return stream.map(rc -> rc.accept(this))
				.reduce(new StringBuilder(), concat);
	}

	protected StringBuilder concat(Stream<ParseTree> stream) {
		return concat(stream, StringBuilder::append);
	}

	protected StringBuilder concat(ParseTree... args) {
		return concat(Arrays.stream(args));
	}

	protected StringBuilder concat(ParserRuleContext ctx) {
		return concat(toStream(ctx));
	}

	@Override public StringBuilder visitS(CppParser.SContext ctx) {
		return concat(toStream(ctx),
					  (a, n) -> aggregateResult(a, n, newLine()));
	}

	@Override public StringBuilder visitFuncSignature(CppParser.FuncSignatureContext ctx) {
		return ctx.type().accept(this)
			.append(' ')
			.append(withColor(ctx.ID().getText(), "#f1c40f"))
			.append(concat(ctx.children.stream().skip(2)));
	}

	@Override public StringBuilder visitFunc(CppParser.FuncContext ctx) {
		return concat(ctx);
	}

	@Override public StringBuilder visitCodeBlock(CppParser.CodeBlockContext ctx) {
		return new StringBuilder(" ")
			.append(ctx.OpenBlock().accept(this)).append(newLine())
			.append(withLevel(() -> ctx.funcBody().accept(this)))
			.append(printWS()).append(ctx.CloseBlock().accept(this));
	}

	@Override public StringBuilder visitFuncBody(CppParser.FuncBodyContext ctx) {
		return concat(ctx);
	}

	@Override public StringBuilder visitLine(CppParser.LineContext ctx) {
		return printWS().append(concat(ctx));
	}

	@Override
	public StringBuilder visitType(final CppParser.TypeContext ctx) {
		return withTag(super.visitType(ctx), "b", null);
	}

	@Override
	public StringBuilder visitArray_type(final CppParser.Array_typeContext ctx) {
		return concat(ctx);
	}

	@Override
	public StringBuilder visitIf_rule(final CppParser.If_ruleContext ctx) {
		return printWS().append(ctx.If().accept(this))
				.append(' ')
				.append(concat(
							ctx.LParent(),
							ctx.expr(),
							ctx.RParent(),
							ctx.codeBlock()
						));
	}

	@Override
	public StringBuilder visitWhile_rule(final CppParser.While_ruleContext ctx) {
		return printWS().append(ctx.While().accept(this))
				.append(' ')
				.append(concat(
							ctx.LParent(),
							ctx.expr(),
							ctx.RParent(),
							ctx.codeBlock()
						));
	}

	@Override
	public StringBuilder visitOp_level_2(final CppParser.Op_level_2Context ctx) {
		return concat(ctx);
	}

	@Override
	public StringBuilder visitOp_level_1(final CppParser.Op_level_1Context ctx) {
		return concat(ctx);
	}

	@Override
	public StringBuilder visitBraces(final CppParser.BracesContext ctx) {
		return concat(ctx);
	}

	@Override
	public StringBuilder visitFuncCall(final CppParser.FuncCallContext ctx) {
		return concat(ctx);
	}

	private StringBuilder visitCommaList(RuleNode node) {
		StringBuilder res = new StringBuilder();

		for(int i = 0; i < node.getChildCount(); ++i) {
			ParseTree c = node.getChild(i);
			res.append(c.accept(this));
			if (c instanceof TerminalNode && ((TerminalNode) c).getSymbol().getType() == CppLexer.Comma) {
				res.append(' ');
			}
		}

		return res;
	}

	@Override
	public StringBuilder visitArgs(final CppParser.ArgsContext ctx) {
		return visitCommaList(ctx);
	}

	@Override
	public StringBuilder visitArgsExpr(final CppParser.ArgsExprContext ctx) {
		return visitCommaList(ctx);
	}

	@Override
	public StringBuilder visitTerminal(final TerminalNode node) {
		final StringBuilder res = new StringBuilder();
		int type = node.getSymbol().getType();
		Consumer<String> color = (String c) -> res.append(withColor(node.getText(), c));
		switch (type) {
			case CppLexer.EOF: break;
			case CppLexer.String: {
				color.accept("green");
				break;
			}
			case CppLexer.Return:
			case CppLexer.While:
			case CppLexer.If: {
				color.accept("#e67e22");
				break;
			}
			case CppLexer.Bool: {
				color.accept("#800080");
				break;
			}
			case CppLexer.Integer: {
				color.accept("blue");
				break;
			}
			default: {
				res.append(node.getText());
				break;
			}
		}
		if (type == CppLexer.EndExpr
		    || type == CppLexer.CloseBlock) {
			res.append(newLine());
		}
		return res;
	}

	@Override
	protected StringBuilder aggregateResult(final StringBuilder aggregate, final StringBuilder nextResult) {
		return aggregateResult(aggregate, nextResult, new StringBuilder(" "));
	}

	protected StringBuilder aggregateResult(final StringBuilder aggregate,
											final StringBuilder nextResult,
											final StringBuilder sep) {
		if (aggregate.isEmpty()) return nextResult;
		if (nextResult.isEmpty()) return aggregate;
		return aggregate.append(sep).append(nextResult);
	}

	@Override
	protected StringBuilder defaultResult() {
		return new StringBuilder();
	}
}