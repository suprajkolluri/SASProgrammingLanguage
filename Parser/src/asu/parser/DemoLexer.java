// Generated from Demo.g4 by ANTLR 4.5.3
package asu.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, IF=11, WHILE=12, ELSE=13, NEWLINE=14, INT=15, BOOL=16, STRING=17, 
		BSTART=18, BEND=19, ADDSUB=20, MULDIV=21, AND=22, OR=23, NOT=24, EQUAL=25, 
		COMPARE=26, DATATYPE=27, STACKI=28, STACKB=29, STACKSTR=30, IDENTIFIER=31, 
		WS=32, ASSIGNMENT=33, PSTART=34, PEND=35, MSTART=36, MEND=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "IF", "WHILE", "ELSE", "NEWLINE", "INT", "BOOL", "STRING", "BSTART", 
		"BEND", "ADDSUB", "MULDIV", "AND", "OR", "NOT", "EQUAL", "COMPARE", "DATATYPE", 
		"STACKI", "STACKB", "STACKSTR", "IDENTIFIER", "WS", "ASSIGNMENT", "PSTART", 
		"PEND", "MSTART", "MEND"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'PRINT'", "'PRINTLN'", "','", "'FUNCTION'", "'RETURN'", 
		"'PUSH'", "'POP'", "'READ'", "'IF'", "'WHILE'", "'ELSE'", "'\n'", null, 
		null, null, "'{'", "'}'", null, null, "'AND'", "'OR'", "'NOT'", null, 
		null, null, "'STACKI'", "'STACKB'", "'STACKSTR'", null, null, "'='", "'['", 
		"']'", "'--'", "'!!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "IF", 
		"WHILE", "ELSE", "NEWLINE", "INT", "BOOL", "STRING", "BSTART", "BEND", 
		"ADDSUB", "MULDIV", "AND", "OR", "NOT", "EQUAL", "COMPARE", "DATATYPE", 
		"STACKI", "STACKB", "STACKSTR", "IDENTIFIER", "WS", "ASSIGNMENT", "PSTART", 
		"PEND", "MSTART", "MEND"
	};
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


	public DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0100\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\6\20\u0091\n\20\r\20\16\20\u0092"+
		"\3\21\3\21\3\22\3\22\7\22\u0099\n\22\f\22\16\22\u009c\13\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u00b7\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00be\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00d2\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \6 \u00ec\n \r \16 \u00ed\3"+
		"!\6!\u00f1\n!\r!\16!\u00f2\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\u009a"+
		"\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'\3\2\b\3\2\62;\4\2HHVV\4\2--//\5\2\'\',,\61\61\4"+
		"\2>>@@\4\2C\\c|\u0108\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7"+
		"Q\3\2\2\2\tW\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17j\3\2\2\2\21q\3\2\2\2\23"+
		"v\3\2\2\2\25z\3\2\2\2\27\177\3\2\2\2\31\u0082\3\2\2\2\33\u0088\3\2\2\2"+
		"\35\u008d\3\2\2\2\37\u0090\3\2\2\2!\u0094\3\2\2\2#\u0096\3\2\2\2%\u009f"+
		"\3\2\2\2\'\u00a1\3\2\2\2)\u00a3\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2"+
		"/\u00ab\3\2\2\2\61\u00ae\3\2\2\2\63\u00b6\3\2\2\2\65\u00bd\3\2\2\2\67"+
		"\u00d1\3\2\2\29\u00d3\3\2\2\2;\u00da\3\2\2\2=\u00e1\3\2\2\2?\u00eb\3\2"+
		"\2\2A\u00f0\3\2\2\2C\u00f4\3\2\2\2E\u00f6\3\2\2\2G\u00f8\3\2\2\2I\u00fa"+
		"\3\2\2\2K\u00fd\3\2\2\2MN\7*\2\2N\4\3\2\2\2OP\7+\2\2P\6\3\2\2\2QR\7R\2"+
		"\2RS\7T\2\2ST\7K\2\2TU\7P\2\2UV\7V\2\2V\b\3\2\2\2WX\7R\2\2XY\7T\2\2YZ"+
		"\7K\2\2Z[\7P\2\2[\\\7V\2\2\\]\7N\2\2]^\7P\2\2^\n\3\2\2\2_`\7.\2\2`\f\3"+
		"\2\2\2ab\7H\2\2bc\7W\2\2cd\7P\2\2de\7E\2\2ef\7V\2\2fg\7K\2\2gh\7Q\2\2"+
		"hi\7P\2\2i\16\3\2\2\2jk\7T\2\2kl\7G\2\2lm\7V\2\2mn\7W\2\2no\7T\2\2op\7"+
		"P\2\2p\20\3\2\2\2qr\7R\2\2rs\7W\2\2st\7U\2\2tu\7J\2\2u\22\3\2\2\2vw\7"+
		"R\2\2wx\7Q\2\2xy\7R\2\2y\24\3\2\2\2z{\7T\2\2{|\7G\2\2|}\7C\2\2}~\7F\2"+
		"\2~\26\3\2\2\2\177\u0080\7K\2\2\u0080\u0081\7H\2\2\u0081\30\3\2\2\2\u0082"+
		"\u0083\7Y\2\2\u0083\u0084\7J\2\2\u0084\u0085\7K\2\2\u0085\u0086\7N\2\2"+
		"\u0086\u0087\7G\2\2\u0087\32\3\2\2\2\u0088\u0089\7G\2\2\u0089\u008a\7"+
		"N\2\2\u008a\u008b\7U\2\2\u008b\u008c\7G\2\2\u008c\34\3\2\2\2\u008d\u008e"+
		"\7\f\2\2\u008e\36\3\2\2\2\u008f\u0091\t\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093 \3\2\2\2"+
		"\u0094\u0095\t\3\2\2\u0095\"\3\2\2\2\u0096\u009a\7$\2\2\u0097\u0099\13"+
		"\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009b\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7$"+
		"\2\2\u009e$\3\2\2\2\u009f\u00a0\7}\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7\177"+
		"\2\2\u00a2(\3\2\2\2\u00a3\u00a4\t\4\2\2\u00a4*\3\2\2\2\u00a5\u00a6\t\5"+
		"\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9\7P\2\2\u00a9\u00aa"+
		"\7F\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7T\2\2\u00ad\60"+
		"\3\2\2\2\u00ae\u00af\7P\2\2\u00af\u00b0\7Q\2\2\u00b0\u00b1\7V\2\2\u00b1"+
		"\62\3\2\2\2\u00b2\u00b3\7?\2\2\u00b3\u00b7\7?\2\2\u00b4\u00b5\7#\2\2\u00b5"+
		"\u00b7\7?\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\64\3\2\2\2"+
		"\u00b8\u00be\t\6\2\2\u00b9\u00ba\7>\2\2\u00ba\u00be\7?\2\2\u00bb\u00bc"+
		"\7@\2\2\u00bc\u00be\7?\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\66\3\2\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1\7P\2\2"+
		"\u00c1\u00c2\7V\2\2\u00c2\u00c3\7G\2\2\u00c3\u00c4\7I\2\2\u00c4\u00c5"+
		"\7G\2\2\u00c5\u00d2\7T\2\2\u00c6\u00c7\7D\2\2\u00c7\u00c8\7Q\2\2\u00c8"+
		"\u00c9\7Q\2\2\u00c9\u00ca\7N\2\2\u00ca\u00cb\7G\2\2\u00cb\u00cc\7C\2\2"+
		"\u00cc\u00d2\7P\2\2\u00cd\u00ce\7X\2\2\u00ce\u00cf\7Q\2\2\u00cf\u00d0"+
		"\7K\2\2\u00d0\u00d2\7F\2\2\u00d1\u00bf\3\2\2\2\u00d1\u00c6\3\2\2\2\u00d1"+
		"\u00cd\3\2\2\2\u00d28\3\2\2\2\u00d3\u00d4\7U\2\2\u00d4\u00d5\7V\2\2\u00d5"+
		"\u00d6\7C\2\2\u00d6\u00d7\7E\2\2\u00d7\u00d8\7M\2\2\u00d8\u00d9\7K\2\2"+
		"\u00d9:\3\2\2\2\u00da\u00db\7U\2\2\u00db\u00dc\7V\2\2\u00dc\u00dd\7C\2"+
		"\2\u00dd\u00de\7E\2\2\u00de\u00df\7M\2\2\u00df\u00e0\7D\2\2\u00e0<\3\2"+
		"\2\2\u00e1\u00e2\7U\2\2\u00e2\u00e3\7V\2\2\u00e3\u00e4\7C\2\2\u00e4\u00e5"+
		"\7E\2\2\u00e5\u00e6\7M\2\2\u00e6\u00e7\7U\2\2\u00e7\u00e8\7V\2\2\u00e8"+
		"\u00e9\7T\2\2\u00e9>\3\2\2\2\u00ea\u00ec\t\7\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee@\3\2\2\2"+
		"\u00ef\u00f1\7\"\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3B\3\2\2\2\u00f4\u00f5\7?\2\2\u00f5D"+
		"\3\2\2\2\u00f6\u00f7\7]\2\2\u00f7F\3\2\2\2\u00f8\u00f9\7_\2\2\u00f9H\3"+
		"\2\2\2\u00fa\u00fb\7/\2\2\u00fb\u00fc\7/\2\2\u00fcJ\3\2\2\2\u00fd\u00fe"+
		"\7#\2\2\u00fe\u00ff\7#\2\2\u00ffL\3\2\2\2\n\2\u0092\u009a\u00b6\u00bd"+
		"\u00d1\u00ed\u00f2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}