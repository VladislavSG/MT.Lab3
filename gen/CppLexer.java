// Generated from C:/prog/ITMO/5 term/MT.Lab3\CppLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CppLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"If", "While", "Return", "Long", "Const", "Constexpr", "Sign", "TypeID", 
			"LParent", "RParent", "OpenBlock", "CloseBlock", "LSParent", "RSParent", 
			"String", "Integer", "Bool", "EndExpr", "Comma", "PlusPlus", "MinusMinus", 
			"Plus", "Minus", "Mul", "Div", "Rem", "Less", "Greater", "LessOrEqual", 
			"GreaterOrEqual", "Equals", "NotEquals", "Assign", "TernIf", "TernIfSep", 
			"ID", "WS", "COMMENT"
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


	public CppLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CppLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u010f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u009f\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00b1\n\20\f\20\16\20\u00b4\13"+
		"\20\3\20\3\20\3\21\6\21\u00b9\n\21\r\21\16\21\u00ba\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00c6\n\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\7%\u00f4\n%\f%\16%\u00f7\13%\3&\6&\u00fa\n&\r"+
		"&\16&\u00fb\3&\3&\3\'\3\'\3\'\3\'\7\'\u0104\n\'\f\'\16\'\u0107\13\'\3"+
		"\'\5\'\u010a\n\'\3\'\3\'\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\b\3\2$$\3"+
		"\2\62;\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u011c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5R\3\2\2\2\7X\3\2\2\2\t"+
		"_\3\2\2\2\13d\3\2\2\2\rj\3\2\2\2\17\u0082\3\2\2\2\21\u009e\3\2\2\2\23"+
		"\u00a0\3\2\2\2\25\u00a2\3\2\2\2\27\u00a4\3\2\2\2\31\u00a6\3\2\2\2\33\u00a8"+
		"\3\2\2\2\35\u00aa\3\2\2\2\37\u00ac\3\2\2\2!\u00b8\3\2\2\2#\u00c5\3\2\2"+
		"\2%\u00c7\3\2\2\2\'\u00c9\3\2\2\2)\u00cb\3\2\2\2+\u00ce\3\2\2\2-\u00d1"+
		"\3\2\2\2/\u00d3\3\2\2\2\61\u00d5\3\2\2\2\63\u00d7\3\2\2\2\65\u00d9\3\2"+
		"\2\2\67\u00db\3\2\2\29\u00dd\3\2\2\2;\u00df\3\2\2\2=\u00e2\3\2\2\2?\u00e5"+
		"\3\2\2\2A\u00e8\3\2\2\2C\u00eb\3\2\2\2E\u00ed\3\2\2\2G\u00ef\3\2\2\2I"+
		"\u00f1\3\2\2\2K\u00f9\3\2\2\2M\u00ff\3\2\2\2OP\7k\2\2PQ\7h\2\2Q\4\3\2"+
		"\2\2RS\7y\2\2ST\7j\2\2TU\7k\2\2UV\7n\2\2VW\7g\2\2W\6\3\2\2\2XY\7t\2\2"+
		"YZ\7g\2\2Z[\7v\2\2[\\\7w\2\2\\]\7t\2\2]^\7p\2\2^\b\3\2\2\2_`\7n\2\2`a"+
		"\7q\2\2ab\7p\2\2bc\7i\2\2c\n\3\2\2\2de\7e\2\2ef\7q\2\2fg\7p\2\2gh\7u\2"+
		"\2hi\7v\2\2i\f\3\2\2\2jk\7e\2\2kl\7q\2\2lm\7p\2\2mn\7u\2\2no\7v\2\2op"+
		"\7g\2\2pq\7z\2\2qr\7r\2\2rs\7t\2\2s\16\3\2\2\2tu\7w\2\2uv\7p\2\2vw\7u"+
		"\2\2wx\7k\2\2xy\7i\2\2yz\7p\2\2z{\7g\2\2{\u0083\7f\2\2|}\7u\2\2}~\7k\2"+
		"\2~\177\7i\2\2\177\u0080\7p\2\2\u0080\u0081\7g\2\2\u0081\u0083\7f\2\2"+
		"\u0082t\3\2\2\2\u0082|\3\2\2\2\u0083\20\3\2\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7p\2\2\u0086\u009f\7v\2\2\u0087\u0088\7h\2\2\u0088\u0089\7n\2\2"+
		"\u0089\u008a\7q\2\2\u008a\u008b\7c\2\2\u008b\u009f\7v\2\2\u008c\u008d"+
		"\7e\2\2\u008d\u008e\7j\2\2\u008e\u008f\7c\2\2\u008f\u009f\7t\2\2\u0090"+
		"\u0091\7d\2\2\u0091\u0092\7q\2\2\u0092\u0093\7q\2\2\u0093\u009f\7n\2\2"+
		"\u0094\u0095\7c\2\2\u0095\u0096\7w\2\2\u0096\u0097\7v\2\2\u0097\u009f"+
		"\7q\2\2\u0098\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b\7t\2\2\u009b"+
		"\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009f\7i\2\2\u009e\u0084\3\2\2"+
		"\2\u009e\u0087\3\2\2\2\u009e\u008c\3\2\2\2\u009e\u0090\3\2\2\2\u009e\u0094"+
		"\3\2\2\2\u009e\u0098\3\2\2\2\u009f\22\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1"+
		"\24\3\2\2\2\u00a2\u00a3\7+\2\2\u00a3\26\3\2\2\2\u00a4\u00a5\7}\2\2\u00a5"+
		"\30\3\2\2\2\u00a6\u00a7\7\177\2\2\u00a7\32\3\2\2\2\u00a8\u00a9\7]\2\2"+
		"\u00a9\34\3\2\2\2\u00aa\u00ab\7_\2\2\u00ab\36\3\2\2\2\u00ac\u00b2\7$\2"+
		"\2\u00ad\u00ae\7^\2\2\u00ae\u00b1\7$\2\2\u00af\u00b1\n\2\2\2\u00b0\u00ad"+
		"\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7$"+
		"\2\2\u00b6 \3\2\2\2\u00b7\u00b9\t\3\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\"\3\2\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7w\2\2\u00bf\u00c6\7g\2\2"+
		"\u00c0\u00c1\7h\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4"+
		"\7u\2\2\u00c4\u00c6\7g\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c6"+
		"$\3\2\2\2\u00c7\u00c8\7=\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7.\2\2\u00ca("+
		"\3\2\2\2\u00cb\u00cc\7-\2\2\u00cc\u00cd\7-\2\2\u00cd*\3\2\2\2\u00ce\u00cf"+
		"\7/\2\2\u00cf\u00d0\7/\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2.\3"+
		"\2\2\2\u00d3\u00d4\7/\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6\62"+
		"\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7\'\2\2\u00da"+
		"\66\3\2\2\2\u00db\u00dc\7>\2\2\u00dc8\3\2\2\2\u00dd\u00de\7@\2\2\u00de"+
		":\3\2\2\2\u00df\u00e0\7>\2\2\u00e0\u00e1\7?\2\2\u00e1<\3\2\2\2\u00e2\u00e3"+
		"\7@\2\2\u00e3\u00e4\7?\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7?\2\2\u00e6\u00e7"+
		"\7?\2\2\u00e7@\3\2\2\2\u00e8\u00e9\7#\2\2\u00e9\u00ea\7?\2\2\u00eaB\3"+
		"\2\2\2\u00eb\u00ec\7?\2\2\u00ecD\3\2\2\2\u00ed\u00ee\7A\2\2\u00eeF\3\2"+
		"\2\2\u00ef\u00f0\7<\2\2\u00f0H\3\2\2\2\u00f1\u00f5\t\4\2\2\u00f2\u00f4"+
		"\t\5\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6J\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\t\6\2\2"+
		"\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b&\2\2\u00feL\3\2\2\2\u00ff\u0100"+
		"\7\61\2\2\u0100\u0101\7\61\2\2\u0101\u0105\3\2\2\2\u0102\u0104\n\7\2\2"+
		"\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a\7\17\2\2"+
		"\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c"+
		"\7\f\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b\'\2\2\u010eN\3\2\2\2\r\2\u0082"+
		"\u009e\u00b0\u00b2\u00ba\u00c5\u00f5\u00fb\u0105\u0109\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}