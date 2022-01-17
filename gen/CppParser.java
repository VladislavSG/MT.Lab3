// Generated from D:/prog/ITMO/5-term/MT/Lab3\CppParser.g4 by ANTLR 4.9.2
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
		Long=1, Const=2, Constexpr=3, Sign=4, TypeID=5, Return=6, LParent=7, RParent=8, 
		OpenBlock=9, CloseBlock=10, LSParent=11, RSParent=12, ID=13, String=14, 
		Integer=15, EndExpr=16, Comma=17, Assign=18, Digit=19, PlusPlus=20, MinusMinus=21, 
		Plus=22, Minus=23, Mul=24, Div=25, Rem=26, TernIf=27, TernIfSep=28, WS=29, 
		COMMENT=30;
	public static final int
		RULE_s = 0, RULE_args = 1, RULE_funcSignature = 2, RULE_func = 3, RULE_funcBody = 4, 
		RULE_return_rule = 5, RULE_argsExpr = 6, RULE_funcCall = 7, RULE_line = 8, 
		RULE_var_name = 9, RULE_var = 10, RULE_var_definition = 11, RULE_type = 12, 
		RULE_expr = 13, RULE_e = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "args", "funcSignature", "func", "funcBody", "return_rule", "argsExpr", 
			"funcCall", "line", "var_name", "var", "var_definition", "type", "expr", 
			"e"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'long'", "'const'", "'constexpr'", null, null, "'return'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", null, null, null, "';'", "','", "'='", 
			null, "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Long", "Const", "Constexpr", "Sign", "TypeID", "Return", "LParent", 
			"RParent", "OpenBlock", "CloseBlock", "LSParent", "RSParent", "ID", "String", 
			"Integer", "EndExpr", "Comma", "Assign", "Digit", "PlusPlus", "MinusMinus", 
			"Plus", "Minus", "Mul", "Div", "Rem", "TernIf", "TernIfSep", "WS", "COMMENT"
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				func();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Long) | (1L << Const) | (1L << Constexpr) | (1L << Sign) | (1L << TypeID))) != 0) );
			setState(35);
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Long) | (1L << Const) | (1L << Constexpr) | (1L << Sign) | (1L << TypeID))) != 0)) {
				{
				setState(37);
				var();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(38);
					match(Comma);
					setState(39);
					var();
					}
					}
					setState(44);
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
			setState(47);
			type();
			setState(48);
			match(ID);
			setState(49);
			match(LParent);
			setState(50);
			args();
			setState(51);
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
		public TerminalNode OpenBlock() { return getToken(CppParser.OpenBlock, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public TerminalNode CloseBlock() { return getToken(CppParser.CloseBlock, 0); }
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
			setState(53);
			funcSignature();
			setState(54);
			match(OpenBlock);
			setState(55);
			funcBody();
			setState(56);
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
		enterRule(_localctx, 8, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Long) | (1L << Const) | (1L << Constexpr) | (1L << Sign) | (1L << TypeID) | (1L << Return) | (1L << LParent) | (1L << ID) | (1L << String) | (1L << Integer))) != 0)) {
				{
				{
				setState(58);
				line();
				}
				}
				setState(63);
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
		enterRule(_localctx, 10, RULE_return_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(Return);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LParent) | (1L << ID) | (1L << String) | (1L << Integer))) != 0)) {
				{
				setState(65);
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
		enterRule(_localctx, 12, RULE_argsExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LParent) | (1L << ID) | (1L << String) | (1L << Integer))) != 0)) {
				{
				setState(68);
				expr();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(69);
					match(Comma);
					setState(70);
					expr();
					}
					}
					setState(75);
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
		enterRule(_localctx, 14, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(LParent);
			setState(80);
			argsExpr();
			setState(81);
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
		enterRule(_localctx, 16, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Long:
			case Const:
			case Constexpr:
			case Sign:
			case TypeID:
				{
				setState(83);
				var_definition();
				}
				break;
			case LParent:
			case ID:
			case String:
			case Integer:
				{
				setState(84);
				expr();
				}
				break;
			case Return:
				{
				setState(85);
				return_rule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(88);
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
		enterRule(_localctx, 18, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
		enterRule(_localctx, 20, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			type();
			setState(93);
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
		enterRule(_localctx, 22, RULE_var_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			var();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(96);
				match(Assign);
				setState(97);
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
		public TerminalNode TypeID() { return getToken(CppParser.TypeID, 0); }
		public TerminalNode Sign() { return getToken(CppParser.Sign, 0); }
		public TerminalNode Long() { return getToken(CppParser.Long, 0); }
		public TerminalNode LSParent() { return getToken(CppParser.LSParent, 0); }
		public TerminalNode RSParent() { return getToken(CppParser.RSParent, 0); }
		public TerminalNode Const() { return getToken(CppParser.Const, 0); }
		public TerminalNode Constexpr() { return getToken(CppParser.Constexpr, 0); }
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
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const || _la==Constexpr) {
				{
				setState(100);
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

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sign) {
				{
				setState(103);
				match(Sign);
				}
			}

			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Long) {
				{
				setState(106);
				match(Long);
				}
			}

			setState(109);
			match(TypeID);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSParent) {
				{
				setState(110);
				match(LSParent);
				setState(111);
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
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(String);
				}
				break;
			case LParent:
			case ID:
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
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
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode Plus() { return getToken(CppParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CppParser.Minus, 0); }
		public Op_level_2Context(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitOp_level_2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op_level_1Context extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode Mul() { return getToken(CppParser.Mul, 0); }
		public TerminalNode Div() { return getToken(CppParser.Div, 0); }
		public TerminalNode Rem() { return getToken(CppParser.Rem, 0); }
		public Op_level_1Context(EContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CppParserVisitor ) return ((CppParserVisitor<? extends T>)visitor).visitOp_level_1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RvalueContext extends EContext {
		public TerminalNode Integer() { return getToken(CppParser.Integer, 0); }
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_e, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				match(ID);
				setState(120);
				match(Assign);
				setState(121);
				expr();
				}
				break;
			case 2:
				{
				_localctx = new BracesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(LParent);
				setState(123);
				e(0);
				setState(124);
				match(RParent);
				}
				break;
			case 3:
				{
				_localctx = new RvalueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(126);
					match(Integer);
					}
					break;
				case 2:
					{
					setState(127);
					funcCall();
					}
					break;
				case 3:
					{
					setState(128);
					var_name();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Op_level_1Context(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(133);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(134);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mul) | (1L << Div) | (1L << Rem))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						e(7);
						}
						break;
					case 2:
						{
						_localctx = new Op_level_2Context(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(136);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(137);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(138);
						e(6);
						}
						break;
					case 3:
						{
						_localctx = new Ternar_opContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(139);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(140);
						match(TernIf);
						setState(141);
						expr();
						setState(142);
						match(TernIfSep);
						setState(143);
						expr();
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		case 14:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0099\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\2\3\2\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\5\3\60\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\7\6>\n\6\f\6\16\6A\13\6\3\7\3\7\5"+
		"\7E\n\7\3\b\3\b\3\b\7\bJ\n\b\f\b\16\bM\13\b\5\bO\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\5\nY\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r"+
		"e\n\r\3\16\5\16h\n\16\3\16\5\16k\n\16\3\16\5\16n\n\16\3\16\3\16\3\16\5"+
		"\16s\n\16\3\17\3\17\5\17w\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0084\n\20\5\20\u0086\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0094\n\20\f\20\16\20\u0097"+
		"\13\20\3\20\2\3\36\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\3\2\4"+
		"\5\3\2\32\34\3\2\30\31\2\u009f\2!\3\2\2\2\4/\3\2\2\2\6\61\3\2\2\2\b\67"+
		"\3\2\2\2\n?\3\2\2\2\fB\3\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22X\3\2\2\2\24"+
		"\\\3\2\2\2\26^\3\2\2\2\30a\3\2\2\2\32g\3\2\2\2\34v\3\2\2\2\36\u0085\3"+
		"\2\2\2 \"\5\b\5\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%"+
		"&\7\2\2\3&\3\3\2\2\2\',\5\26\f\2()\7\23\2\2)+\5\26\f\2*(\3\2\2\2+.\3\2"+
		"\2\2,*\3\2\2\2,-\3\2\2\2-\60\3\2\2\2.,\3\2\2\2/\'\3\2\2\2/\60\3\2\2\2"+
		"\60\5\3\2\2\2\61\62\5\32\16\2\62\63\7\17\2\2\63\64\7\t\2\2\64\65\5\4\3"+
		"\2\65\66\7\n\2\2\66\7\3\2\2\2\678\5\6\4\289\7\13\2\29:\5\n\6\2:;\7\f\2"+
		"\2;\t\3\2\2\2<>\5\22\n\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\13\3"+
		"\2\2\2A?\3\2\2\2BD\7\b\2\2CE\5\34\17\2DC\3\2\2\2DE\3\2\2\2E\r\3\2\2\2"+
		"FK\5\34\17\2GH\7\23\2\2HJ\5\34\17\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3"+
		"\2\2\2LO\3\2\2\2MK\3\2\2\2NF\3\2\2\2NO\3\2\2\2O\17\3\2\2\2PQ\7\17\2\2"+
		"QR\7\t\2\2RS\5\16\b\2ST\7\n\2\2T\21\3\2\2\2UY\5\30\r\2VY\5\34\17\2WY\5"+
		"\f\7\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2Z[\7\22\2\2[\23\3\2\2\2"+
		"\\]\7\17\2\2]\25\3\2\2\2^_\5\32\16\2_`\5\24\13\2`\27\3\2\2\2ad\5\26\f"+
		"\2bc\7\24\2\2ce\5\34\17\2db\3\2\2\2de\3\2\2\2e\31\3\2\2\2fh\t\2\2\2gf"+
		"\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\7\6\2\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2l"+
		"n\7\3\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2or\7\7\2\2pq\7\r\2\2qs\7\16\2\2"+
		"rp\3\2\2\2rs\3\2\2\2s\33\3\2\2\2tw\7\20\2\2uw\5\36\20\2vt\3\2\2\2vu\3"+
		"\2\2\2w\35\3\2\2\2xy\b\20\1\2yz\7\17\2\2z{\7\24\2\2{\u0086\5\34\17\2|"+
		"}\7\t\2\2}~\5\36\20\2~\177\7\n\2\2\177\u0086\3\2\2\2\u0080\u0084\7\21"+
		"\2\2\u0081\u0084\5\20\t\2\u0082\u0084\5\24\13\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0086\3\2\2\2\u0085x\3\2\2\2"+
		"\u0085|\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0095\3\2\2\2\u0087\u0088\f"+
		"\b\2\2\u0088\u0089\t\3\2\2\u0089\u0094\5\36\20\t\u008a\u008b\f\7\2\2\u008b"+
		"\u008c\t\4\2\2\u008c\u0094\5\36\20\b\u008d\u008e\f\6\2\2\u008e\u008f\7"+
		"\35\2\2\u008f\u0090\5\34\17\2\u0090\u0091\7\36\2\2\u0091\u0092\5\34\17"+
		"\2\u0092\u0094\3\2\2\2\u0093\u0087\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008d"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\37\3\2\2\2\u0097\u0095\3\2\2\2\24#,/?DKNXdgjmrv\u0083\u0085\u0093\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}