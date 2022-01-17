// Generated from D:/prog/ITMO/5-term/MT/Lab3\CppParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.function.Supplier;

/**
 * This class provides an empty implementation of {@link CppParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 */
public class CppParserBaseVisitor extends AbstractParseTreeVisitor<Void> implements CppParserVisitor<Void> {
	StringBuilder builder = new StringBuilder();
	int level = 0;

	protected void printWS() {
		builder.append("&nbsp;".repeat(Math.max(0, level)));
	}

	protected void newLine() {
		builder.append(System.lineSeparator());
	}

	private Void withLevel(Supplier<Void> s) {
		++level;
		Void res = s.get();
		--level;
		return res;
	}

	public Void visitChildrenWS(RuleNode node) {
		int n = node.getChildCount();

		for(int i = 0; i < n; ++i) {
			ParseTree c = node.getChild(i);
			c.accept(this);
			if (i != n - 1) {
				builder.append(' ');
			}
		}

		return defaultResult();
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitS(CppParser.SContext ctx) {
		level = 0;
		builder = new StringBuilder();
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitArgs(CppParser.ArgsContext ctx) { return visitChildrenWS(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitFuncSignature(CppParser.FuncSignatureContext ctx) {
		return visitChildrenWS(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitFunc(CppParser.FuncContext ctx) {
		ctx.funcSignature().accept(this);
		builder.append(" ")
				.append(ctx.OpenBlock().getText());
		newLine();
		ctx.funcBody().accept(this);
		builder.append(ctx.CloseBlock().getText());
		newLine();
		return defaultResult();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitFuncBody(CppParser.FuncBodyContext ctx) {
		return withLevel(() -> visitChildren(ctx));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitReturn_rule(CppParser.Return_ruleContext ctx) { return visitChildrenWS(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitArgsExpr(CppParser.ArgsExprContext ctx) { return visitChildrenWS(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitFuncCall(CppParser.FuncCallContext ctx) { return visitChildrenWS(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitLine(CppParser.LineContext ctx) {
		printWS();
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitVar_name(CppParser.Var_nameContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitVar(CppParser.VarContext ctx) { return visitChildrenWS(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitVar_definition(CppParser.Var_definitionContext ctx) { return visitChildrenWS(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitType(CppParser.TypeContext ctx) { return visitChildrenWS(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitExpr(CppParser.ExprContext ctx) { return visitChildrenWS(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitTernar_op(CppParser.Ternar_opContext ctx) { return visitChildrenWS(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitOp_level_2(CppParser.Op_level_2Context ctx) { return visitChildrenWS(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitOp_level_1(CppParser.Op_level_1Context ctx) { return visitChildrenWS(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitRvalue(CppParser.RvalueContext ctx) { return visitChildrenWS(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitBraces(CppParser.BracesContext ctx) {return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Void visitAssign(CppParser.AssignContext ctx) { return visitChildrenWS(ctx); }

	@Override
	public Void visitTerminal(final TerminalNode node) {
		int type = node.getSymbol().getType();
		if (type != CppLexer.EOF) {
			builder.append(node.getText());
		}
		if (type == CppLexer.EndExpr || type == CppLexer.EOF) {
			newLine();
		}
		return defaultResult();
	}
}