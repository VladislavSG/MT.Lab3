// Generated from C:/prog/ITMO/5 term/MT.Lab3\CppParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CppParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, While=2, Return=3, Long=4, Const=5, Constexpr=6, Sign=7, TypeID=8, 
		LParent=9, RParent=10, OpenBlock=11, CloseBlock=12, LSParent=13, RSParent=14, 
		String=15, Integer=16, Bool=17, EndExpr=18, Comma=19, PlusPlus=20, MinusMinus=21, 
		Plus=22, Minus=23, Mul=24, Div=25, Rem=26, Less=27, Greater=28, LessOrEqual=29, 
		GreaterOrEqual=30, Equals=31, NotEquals=32, Assign=33, TernIf=34, TernIfSep=35, 
		ID=36, WS=37, COMMENT=38;
	public static final int
		RULE_s = 0, RULE_args = 1, RULE_funcSignature = 2, RULE_func = 3, RULE_codeBlock = 4, 
		RULE_funcBody = 5, RULE_if_rule = 6, RULE_while_rule = 7, RULE_return_rule = 8, 
		RULE_argsExpr = 9, RULE_funcCall = 10, RULE_line = 11, RULE_var_name = 12, 
		RULE_var = 13, RULE_var_definition = 14, RULE_type = 15, RULE_not_array_type = 16, 
		RULE_array_type = 17, RULE_expr = 18, RULE_e = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "args", "funcSignature", "func", "codeBlock", "funcBody", "if_rule", 
			"while_rule", "return_rule", "argsExpr", "funcCall", "line", "var_name", 
			"var", "var_definition", "type", "not_array_type", "array_type", "expr", 
			"e"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'while'", "'return'", "'long'", "'const'", "'constexpr'", 
			null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", null, null, null, 
			"';'", "','", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'!='", "'='", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "If", "While", "Return", "Long", "Const", "Constexpr", "Sign", 
			"TypeID", "LParent", "RParent", "OpenBlock", "CloseBlock", "LSParent", 
			"RSParent", "String", "Integer", "Bool", "EndExpr", "Comma", "PlusPlus", 
			"MinusMinus", "Plus", "Minus", "Mul", "Div", "Rem", "Less", "Greater", 
			"LessOrEqual", "GreaterOrEqual", "Equals", "NotEquals", "Assign", "TernIf", 
			"TernIfSep", "ID", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CppParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CppParser.EOF, 0); }
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				func();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Long) | (1L << Const) | (1L << Constexpr) | (1L << Sign) | (1L << TypeID))) != 0) );
			setState(45);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CppParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CppParser.Comma, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Long) | (1L << Const) | (1L << Constexpr) | (1L << Sign) | (1L << TypeID))) != 0)) {
				{
				setState(47);
				var();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(48);
					match(Comma);
					setState(49);
					var();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncSignatureContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CppParser.ID, 0); }
		public TerminalNode LParent() { return getToken(CppParser.LParent, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode RParent() { return getToken(CppParser.RParent, 0); }
		public FuncSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcSignature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitFuncSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncSignatureContext funcSignature() throws RecognitionException {
		FuncSignatureContext _localctx = new FuncSignatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			type();
			setState(58);
			match(ID);
			setState(59);
			match(LParent);
			setState(60);
			args();
			setState(61);
			match(RParent);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public FuncSignatureContext funcSignature() {
			return getRuleContext(FuncSignatureContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			funcSignature();
			setState(64);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public TerminalNode OpenBlock() { return getToken(CppParser.OpenBlock, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public TerminalNode CloseBlock() { return getToken(CppParser.CloseBlock, 0); }
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_codeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(OpenBlock);
			setState(67);
			funcBody();
			setState(68);
			match(CloseBlock);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncBodyContext extends ParserRuleContext {
		public List<If_ruleContext> if_rule() {
			return getRuleContexts(If_ruleContext.class);
		}
		public If_ruleContext if_rule(int i) {
			return getRuleContext(If_ruleContext.class,i);
		}
		public List<While_ruleContext> while_rule() {
			return getRuleContexts(While_ruleContext.class);
		}
		public While_ruleContext while_rule(int i) {
			return getRuleContext(While_ruleContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Return) | (1L << Long) | (1L << Const) | (1L << Constexpr) | (1L << Sign) | (1L << TypeID) | (1L << LParent) | (1L << String) | (1L << Integer) | (1L << Bool) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << ID))) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case If:
					{
					setState(70);
					if_rule();
					}
					break;
				case While:
					{
					setState(71);
					while_rule();
					}
					break;
				case Return:
				case Long:
				case Const:
				case Constexpr:
				case Sign:
				case TypeID:
				case LParent:
				case String:
				case Integer:
				case Bool:
				case PlusPlus:
				case MinusMinus:
				case ID:
					{
					setState(72);
					line();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_ruleContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CppParser.If, 0); }
		public TerminalNode LParent() { return getToken(CppParser.LParent, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RParent() { return getToken(CppParser.RParent, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public If_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_rule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitIf_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_ruleContext if_rule() throws RecognitionException {
		If_ruleContext _localctx = new If_ruleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(If);
			setState(79);
			match(LParent);
			setState(80);
			expr();
			setState(81);
			match(RParent);
			setState(82);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_ruleContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CppParser.While, 0); }
		public TerminalNode LParent() { return getToken(CppParser.LParent, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RParent() { return getToken(CppParser.RParent, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public While_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_rule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitWhile_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_ruleContext while_rule() throws RecognitionException {
		While_ruleContext _localctx = new While_ruleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(While);
			setState(85);
			match(LParent);
			setState(86);
			expr();
			setState(87);
			match(RParent);
			setState(88);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_ruleContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(CppParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_rule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitReturn_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_ruleContext return_rule() throws RecognitionException {
		Return_ruleContext _localctx = new Return_ruleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(Return);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LParent) | (1L << String) | (1L << Integer) | (1L << Bool) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << ID))) != 0)) {
				{
				setState(91);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CppParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CppParser.Comma, i);
		}
		public ArgsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitArgsExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsExprContext argsExpr() throws RecognitionException {
		ArgsExprContext _localctx = new ArgsExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argsExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LParent) | (1L << String) | (1L << Integer) | (1L << Bool) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << ID))) != 0)) {
				{
				setState(94);
				expr();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(95);
					match(Comma);
					setState(96);
					expr();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CppParser.ID, 0); }
		public TerminalNode LParent() { return getToken(CppParser.LParent, 0); }
		public ArgsExprContext argsExpr() {
			return getRuleContext(ArgsExprContext.class,0);
		}
		public TerminalNode RParent() { return getToken(CppParser.RParent, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
			setState(105);
			match(LParent);
			setState(106);
			argsExpr();
			setState(107);
			match(RParent);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode EndExpr() { return getToken(CppParser.EndExpr, 0); }
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Long:
			case Const:
			case Constexpr:
			case Sign:
			case TypeID:
				{
				setState(109);
				var_definition();
				}
				break;
			case LParent:
			case String:
			case Integer:
			case Bool:
			case PlusPlus:
			case MinusMinus:
			case ID:
				{
				setState(110);
				expr();
				}
				break;
			case Return:
				{
				setState(111);
				return_rule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114);
			match(EndExpr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CppParser.ID, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			type();
			setState(119);
			var_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_definitionContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CppParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitVar_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			var();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(122);
				match(Assign);
				setState(123);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Not_array_typeContext not_array_type() {
			return getRuleContext(Not_array_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				array_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				not_array_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_array_typeContext extends ParserRuleContext {
		public TerminalNode TypeID() { return getToken(CppParser.TypeID, 0); }
		public TerminalNode Sign() { return getToken(CppParser.Sign, 0); }
		public TerminalNode Long() { return getToken(CppParser.Long, 0); }
		public TerminalNode Const() { return getToken(CppParser.Const, 0); }
		public TerminalNode Constexpr() { return getToken(CppParser.Constexpr, 0); }
		public Not_array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_array_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitNot_array_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_array_typeContext not_array_type() throws RecognitionException {
		Not_array_typeContext _localctx = new Not_array_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_not_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const || _la==Constexpr) {
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==Const || _la==Constexpr) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sign) {
				{
				setState(133);
				match(Sign);
				}
			}

			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Long) {
				{
				setState(136);
				match(Long);
				}
			}

			setState(139);
			match(TypeID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_typeContext extends ParserRuleContext {
		public Not_array_typeContext not_array_type() {
			return getRuleContext(Not_array_typeContext.class,0);
		}
		public TerminalNode LSParent() { return getToken(CppParser.LSParent, 0); }
		public TerminalNode RSParent() { return getToken(CppParser.RSParent, 0); }
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			not_array_type();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSParent) {
				{
				setState(142);
				match(LSParent);
				setState(143);
				match(RSParent);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(CppParser.String, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(String);
				}
				break;
			case LParent:
			case Integer:
			case Bool:
			case PlusPlus:
			case MinusMinus:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				e(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ternar_opContext extends EContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode TernIf() { return getToken(CppParser.TernIf, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TernIfSep() { return getToken(CppParser.TernIfSep, 0); }
		public Ternar_opContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitTernar_op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_level_2Context extends EContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(CppParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CppParser.MinusMinus, 0); }
		public Op_level_2Context(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitOp_level_2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_level_1Context extends EContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(CppParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CppParser.MinusMinus, 0); }
		public Op_level_1Context(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitOp_level_1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RvalueContext extends EContext {
		public TerminalNode Integer() { return getToken(CppParser.Integer, 0); }
		public TerminalNode Bool() { return getToken(CppParser.Bool, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public RvalueContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitRvalue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_level_4Context extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode Plus() { return getToken(CppParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CppParser.Minus, 0); }
		public Op_level_4Context(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitOp_level_4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_level_3Context extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode Mul() { return getToken(CppParser.Mul, 0); }
		public TerminalNode Div() { return getToken(CppParser.Div, 0); }
		public TerminalNode Rem() { return getToken(CppParser.Rem, 0); }
		public Op_level_3Context(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitOp_level_3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_level_6Context extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode Equals() { return getToken(CppParser.Equals, 0); }
		public TerminalNode NotEquals() { return getToken(CppParser.NotEquals, 0); }
		public Op_level_6Context(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitOp_level_6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_level_5Context extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode Less() { return getToken(CppParser.Less, 0); }
		public TerminalNode Greater() { return getToken(CppParser.Greater, 0); }
		public TerminalNode LessOrEqual() { return getToken(CppParser.LessOrEqual, 0); }
		public TerminalNode GreaterOrEqual() { return getToken(CppParser.GreaterOrEqual, 0); }
		public Op_level_5Context(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitOp_level_5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracesContext extends EContext {
		public TerminalNode LParent() { return getToken(CppParser.LParent, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode RParent() { return getToken(CppParser.RParent, 0); }
		public BracesContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends EContext {
		public TerminalNode ID() { return getToken(CppParser.ID, 0); }
		public TerminalNode Assign() { return getToken(CppParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_e, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new Op_level_2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(151);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(152);
				e(9);
				}
				break;
			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(ID);
				setState(154);
				match(Assign);
				setState(155);
				expr();
				}
				break;
			case 3:
				{
				_localctx = new BracesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(LParent);
				setState(157);
				e(0);
				setState(158);
				match(RParent);
				}
				break;
			case 4:
				{
				_localctx = new RvalueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(160);
					match(Integer);
					}
					break;
				case 2:
					{
					setState(161);
					match(Bool);
					}
					break;
				case 3:
					{
					setState(162);
					funcCall();
					}
					break;
				case 4:
					{
					setState(163);
					var_name();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Op_level_3Context(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(168);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(169);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mul) | (1L << Div) | (1L << Rem))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						e(9);
						}
						break;
					case 2:
						{
						_localctx = new Op_level_4Context(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(171);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(172);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						e(8);
						}
						break;
					case 3:
						{
						_localctx = new Op_level_5Context(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(174);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(175);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessOrEqual) | (1L << GreaterOrEqual))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						e(7);
						}
						break;
					case 4:
						{
						_localctx = new Op_level_6Context(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(177);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(178);
						_la = _input.LA(1);
						if ( !(_la==Equals || _la==NotEquals) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						e(6);
						}
						break;
					case 5:
						{
						_localctx = new Op_level_1Context(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(180);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(181);
						_la = _input.LA(1);
						if ( !(_la==PlusPlus || _la==MinusMinus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 6:
						{
						_localctx = new Ternar_opContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(182);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(183);
						match(TernIf);
						setState(184);
						expr();
						setState(185);
						match(TernIfSep);
						setState(186);
						expr();
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\65\n\3\f\3\16\38\13\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n_\n\n\3\13\3\13\3\13\7"+
		"\13d\n\13\f\13\16\13g\13\13\5\13i\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\5\rs\n\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\5\20\177\n\20"+
		"\3\21\3\21\5\21\u0083\n\21\3\22\5\22\u0086\n\22\3\22\5\22\u0089\n\22\3"+
		"\22\5\22\u008c\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u0093\n\23\3\24\3\24"+
		"\5\24\u0097\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00a7\n\25\5\25\u00a9\n\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u00bf\n\25\f\25\16\25\u00c2\13\25\3\25\2\3(\26\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(\2\b\3\2\7\b\3\2\26\27\3\2\32\34\3"+
		"\2\30\31\3\2\35 \3\2!\"\2\u00cd\2+\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\bA\3"+
		"\2\2\2\nD\3\2\2\2\fM\3\2\2\2\16P\3\2\2\2\20V\3\2\2\2\22\\\3\2\2\2\24h"+
		"\3\2\2\2\26j\3\2\2\2\30r\3\2\2\2\32v\3\2\2\2\34x\3\2\2\2\36{\3\2\2\2 "+
		"\u0082\3\2\2\2\"\u0085\3\2\2\2$\u008f\3\2\2\2&\u0096\3\2\2\2(\u00a8\3"+
		"\2\2\2*,\5\b\5\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60"+
		"\7\2\2\3\60\3\3\2\2\2\61\66\5\34\17\2\62\63\7\25\2\2\63\65\5\34\17\2\64"+
		"\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3"+
		"\2\2\29\61\3\2\2\29:\3\2\2\2:\5\3\2\2\2;<\5 \21\2<=\7&\2\2=>\7\13\2\2"+
		">?\5\4\3\2?@\7\f\2\2@\7\3\2\2\2AB\5\6\4\2BC\5\n\6\2C\t\3\2\2\2DE\7\r\2"+
		"\2EF\5\f\7\2FG\7\16\2\2G\13\3\2\2\2HL\5\16\b\2IL\5\20\t\2JL\5\30\r\2K"+
		"H\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\r\3\2\2\2"+
		"OM\3\2\2\2PQ\7\3\2\2QR\7\13\2\2RS\5&\24\2ST\7\f\2\2TU\5\n\6\2U\17\3\2"+
		"\2\2VW\7\4\2\2WX\7\13\2\2XY\5&\24\2YZ\7\f\2\2Z[\5\n\6\2[\21\3\2\2\2\\"+
		"^\7\5\2\2]_\5&\24\2^]\3\2\2\2^_\3\2\2\2_\23\3\2\2\2`e\5&\24\2ab\7\25\2"+
		"\2bd\5&\24\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2"+
		"\2h`\3\2\2\2hi\3\2\2\2i\25\3\2\2\2jk\7&\2\2kl\7\13\2\2lm\5\24\13\2mn\7"+
		"\f\2\2n\27\3\2\2\2os\5\36\20\2ps\5&\24\2qs\5\22\n\2ro\3\2\2\2rp\3\2\2"+
		"\2rq\3\2\2\2st\3\2\2\2tu\7\24\2\2u\31\3\2\2\2vw\7&\2\2w\33\3\2\2\2xy\5"+
		" \21\2yz\5\32\16\2z\35\3\2\2\2{~\5\34\17\2|}\7#\2\2}\177\5&\24\2~|\3\2"+
		"\2\2~\177\3\2\2\2\177\37\3\2\2\2\u0080\u0083\5$\23\2\u0081\u0083\5\"\22"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083!\3\2\2\2\u0084\u0086"+
		"\t\2\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0089\7\t\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u008c\7\6\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\7\n\2\2\u008e#\3\2\2\2\u008f\u0092\5\"\22\2"+
		"\u0090\u0091\7\17\2\2\u0091\u0093\7\20\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093%\3\2\2\2\u0094\u0097\7\21\2\2\u0095\u0097\5(\25\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\'\3\2\2\2\u0098\u0099\b\25\1"+
		"\2\u0099\u009a\t\3\2\2\u009a\u00a9\5(\25\13\u009b\u009c\7&\2\2\u009c\u009d"+
		"\7#\2\2\u009d\u00a9\5&\24\2\u009e\u009f\7\13\2\2\u009f\u00a0\5(\25\2\u00a0"+
		"\u00a1\7\f\2\2\u00a1\u00a9\3\2\2\2\u00a2\u00a7\7\22\2\2\u00a3\u00a7\7"+
		"\23\2\2\u00a4\u00a7\5\26\f\2\u00a5\u00a7\5\32\16\2\u00a6\u00a2\3\2\2\2"+
		"\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a9"+
		"\3\2\2\2\u00a8\u0098\3\2\2\2\u00a8\u009b\3\2\2\2\u00a8\u009e\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00c0\3\2\2\2\u00aa\u00ab\f\n\2\2\u00ab\u00ac\t\4"+
		"\2\2\u00ac\u00bf\5(\25\13\u00ad\u00ae\f\t\2\2\u00ae\u00af\t\5\2\2\u00af"+
		"\u00bf\5(\25\n\u00b0\u00b1\f\b\2\2\u00b1\u00b2\t\6\2\2\u00b2\u00bf\5("+
		"\25\t\u00b3\u00b4\f\7\2\2\u00b4\u00b5\t\7\2\2\u00b5\u00bf\5(\25\b\u00b6"+
		"\u00b7\f\f\2\2\u00b7\u00bf\t\3\2\2\u00b8\u00b9\f\6\2\2\u00b9\u00ba\7$"+
		"\2\2\u00ba\u00bb\5&\24\2\u00bb\u00bc\7%\2\2\u00bc\u00bd\5&\24\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00aa\3\2\2\2\u00be\u00ad\3\2\2\2\u00be\u00b0\3\2"+
		"\2\2\u00be\u00b3\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00b8\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1)\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\26-\669KM^ehr~\u0082\u0085\u0088\u008b\u0092\u0096"+
		"\u00a6\u00a8\u00be\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}