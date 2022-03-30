// Generated from /home/joao/unit/compiladores/AnalisadorLexico/src/antlr4Grammar/LabeledExpr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Decls=1, ListDecl=2, DeclTip=3, ListId=4, Tip=5, CmdComp=6, ListCmd=7, 
		Cmd=8, CmdIf=9, CmdWhile=10, CmdRead=11, CmdWrite=12, ListW=13, ElemW=14, 
		CmdAtrib=15, Expr=16, Exprl=17, PROGRAM=18, INTEGER=19, BOOLEAN=20, BEGIN=21, 
		END=22, WHILE=23, IF=24, THEN=25, ELSE=26, DO=27, READ=28, VAR=29, FALSE=30, 
		TRUE=31, WRITE=32, IDENTIFIER=33, CTE=34, STRING=35, OPAD=36, OPMULT=37, 
		OPLOG=38, OPNEG=39, OPREL=40, PVIG=41, PONTO=42, DPONTOS=43, VIG=44, ABPAR=45, 
		FPAR=46, ATRIB=47, WS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Decls", "ListDecl", "DeclTip", "ListId", "Tip", "CmdComp", "ListCmd", 
			"Cmd", "CmdIf", "CmdWhile", "CmdRead", "CmdWrite", "ListW", "ElemW", 
			"CmdAtrib", "Expr", "Exprl", "PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", 
			"END", "WHILE", "IF", "THEN", "ELSE", "DO", "READ", "VAR", "FALSE", "TRUE", 
			"WRITE", "IDENTIFIER", "CTE", "STRING", "OPAD", "OPMULT", "OPLOG", "OPNEG", 
			"OPREL", "PVIG", "PONTO", "DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'PROGRAM'", "'INTEGER'", "'BOOLEAN'", 
			"'BEGIN'", "'END'", "'WHILE'", "'IF'", "'THEN'", "'ELSE'", "'DO'", "'READ'", 
			"'VAR'", "'FALSE'", "'TRUE'", "'WRITE'", null, null, null, null, null, 
			null, "'~'", null, "';'", "'.'", "':'", "','", "'('", "')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Decls", "ListDecl", "DeclTip", "ListId", "Tip", "CmdComp", "ListCmd", 
			"Cmd", "CmdIf", "CmdWhile", "CmdRead", "CmdWrite", "ListW", "ElemW", 
			"CmdAtrib", "Expr", "Exprl", "PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", 
			"END", "WHILE", "IF", "THEN", "ELSE", "DO", "READ", "VAR", "FALSE", "TRUE", 
			"WRITE", "IDENTIFIER", "CTE", "STRING", "OPAD", "OPMULT", "OPLOG", "OPNEG", 
			"OPREL", "PVIG", "PONTO", "DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", 
			"WS"
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


	public LabeledExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0182\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\5\3k\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5w\n\5\3\6\3\6"+
		"\3\6\5\6|\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u0087\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u009d\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00b3\n\16\3\17\3\17"+
		"\5\17\u00b7\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ca\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e5\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\7\"\u013b\n\"\f\"\16\"\u013e\13\"\3#\6#\u0141\n"+
		"#\r#\16#\u0142\3#\3#\6#\u0147\n#\r#\16#\u0148\3$\3$\7$\u014d\n$\f$\16"+
		"$\u0150\13$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u015d\n\'\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u016b\n)\3*\3*\3+\3+\3,\3,\3-\3-\3."+
		"\3.\3/\3/\3\60\3\60\3\60\3\61\6\61\u017d\n\61\r\61\16\61\u017e\3\61\3"+
		"\61\3\u0142\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\b"+
		"\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2--//\4\2,,\61\61\5\2\13\f\17\17\"\""+
		"\2\u01a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\3c\3\2\2\2\5j\3\2\2\2\7l\3\2\2\2\tv\3\2\2\2\13{\3\2\2"+
		"\2\r}\3\2\2\2\17\u0086\3\2\2\2\21\u008e\3\2\2\2\23\u009c\3\2\2\2\25\u009e"+
		"\3\2\2\2\27\u00a3\3\2\2\2\31\u00a8\3\2\2\2\33\u00b2\3\2\2\2\35\u00b6\3"+
		"\2\2\2\37\u00b8\3\2\2\2!\u00c9\3\2\2\2#\u00e4\3\2\2\2%\u00e6\3\2\2\2\'"+
		"\u00ee\3\2\2\2)\u00f6\3\2\2\2+\u00fe\3\2\2\2-\u0104\3\2\2\2/\u0108\3\2"+
		"\2\2\61\u010e\3\2\2\2\63\u0111\3\2\2\2\65\u0116\3\2\2\2\67\u011b\3\2\2"+
		"\29\u011e\3\2\2\2;\u0123\3\2\2\2=\u0127\3\2\2\2?\u012d\3\2\2\2A\u0132"+
		"\3\2\2\2C\u0138\3\2\2\2E\u0140\3\2\2\2G\u014a\3\2\2\2I\u0153\3\2\2\2K"+
		"\u0155\3\2\2\2M\u015c\3\2\2\2O\u015e\3\2\2\2Q\u016a\3\2\2\2S\u016c\3\2"+
		"\2\2U\u016e\3\2\2\2W\u0170\3\2\2\2Y\u0172\3\2\2\2[\u0174\3\2\2\2]\u0176"+
		"\3\2\2\2_\u0178\3\2\2\2a\u017c\3\2\2\2cd\5;\36\2de\5\5\3\2e\4\3\2\2\2"+
		"fk\5\7\4\2gh\5\7\4\2hi\5\5\3\2ik\3\2\2\2jf\3\2\2\2jg\3\2\2\2k\6\3\2\2"+
		"\2lm\5\t\5\2mn\5W,\2no\5\13\6\2op\5S*\2p\b\3\2\2\2qw\5C\"\2rs\5C\"\2s"+
		"t\5Y-\2tu\5\t\5\2uw\3\2\2\2vq\3\2\2\2vr\3\2\2\2w\n\3\2\2\2x|\5\'\24\2"+
		"y|\5)\25\2z|\5G$\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\f\3\2\2\2}~\5+\26\2"+
		"~\177\5\17\b\2\177\u0080\5-\27\2\u0080\16\3\2\2\2\u0081\u0087\5\21\t\2"+
		"\u0082\u0083\5\21\t\2\u0083\u0084\5S*\2\u0084\u0085\5\17\b\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0087\20\3\2\2\2\u0088"+
		"\u008f\5\23\n\2\u0089\u008f\5\25\13\2\u008a\u008f\5\27\f\2\u008b\u008f"+
		"\5\31\r\2\u008c\u008f\5\37\20\2\u008d\u008f\5\r\7\2\u008e\u0088\3\2\2"+
		"\2\u008e\u0089\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008d\3\2\2\2\u008f\22\3\2\2\2\u0090\u0091\5\61\31\2\u0091"+
		"\u0092\5!\21\2\u0092\u0093\5\63\32\2\u0093\u0094\5\21\t\2\u0094\u009d"+
		"\3\2\2\2\u0095\u0096\5\61\31\2\u0096\u0097\5!\21\2\u0097\u0098\5\63\32"+
		"\2\u0098\u0099\5\21\t\2\u0099\u009a\5\65\33\2\u009a\u009b\5\21\t\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0090\3\2\2\2\u009c\u0095\3\2\2\2\u009d\24\3\2\2"+
		"\2\u009e\u009f\5/\30\2\u009f\u00a0\5!\21\2\u00a0\u00a1\5\67\34\2\u00a1"+
		"\u00a2\5\21\t\2\u00a2\26\3\2\2\2\u00a3\u00a4\59\35\2\u00a4\u00a5\5[.\2"+
		"\u00a5\u00a6\5\t\5\2\u00a6\u00a7\5]/\2\u00a7\30\3\2\2\2\u00a8\u00a9\5"+
		"A!\2\u00a9\u00aa\5[.\2\u00aa\u00ab\5\33\16\2\u00ab\u00ac\5]/\2\u00ac\32"+
		"\3\2\2\2\u00ad\u00b3\5\35\17\2\u00ae\u00af\5\35\17\2\u00af\u00b0\5Y-\2"+
		"\u00b0\u00b1\5\33\16\2\u00b1\u00b3\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae"+
		"\3\2\2\2\u00b3\34\3\2\2\2\u00b4\u00b7\5!\21\2\u00b5\u00b7\5G$\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\36\3\2\2\2\u00b8\u00b9\5C\"\2"+
		"\u00b9\u00ba\5_\60\2\u00ba\u00bb\5!\21\2\u00bb \3\2\2\2\u00bc\u00ca\5"+
		"#\22\2\u00bd\u00be\5#\22\2\u00be\u00bf\5Q)\2\u00bf\u00c0\5!\21\2\u00c0"+
		"\u00ca\3\2\2\2\u00c1\u00c2\5#\22\2\u00c2\u00c3\5I%\2\u00c3\u00c4\5!\21"+
		"\2\u00c4\u00ca\3\2\2\2\u00c5\u00c6\5#\22\2\u00c6\u00c7\5K&\2\u00c7\u00c8"+
		"\5!\21\2\u00c8\u00ca\3\2\2\2\u00c9\u00bc\3\2\2\2\u00c9\u00bd\3\2\2\2\u00c9"+
		"\u00c1\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\"\3\2\2\2\u00cb\u00e5\5C\"\2"+
		"\u00cc\u00e5\5E#\2\u00cd\u00ce\5[.\2\u00ce\u00cf\5!\21\2\u00cf\u00d0\5"+
		"]/\2\u00d0\u00e5\3\2\2\2\u00d1\u00e5\5? \2\u00d2\u00e5\5=\37\2\u00d3\u00d4"+
		"\5O(\2\u00d4\u00d5\5C\"\2\u00d5\u00e5\3\2\2\2\u00d6\u00d7\5O(\2\u00d7"+
		"\u00d8\5E#\2\u00d8\u00e5\3\2\2\2\u00d9\u00da\5O(\2\u00da\u00db\5[.\2\u00db"+
		"\u00dc\5!\21\2\u00dc\u00dd\5]/\2\u00dd\u00e5\3\2\2\2\u00de\u00df\5O(\2"+
		"\u00df\u00e0\5? \2\u00e0\u00e5\3\2\2\2\u00e1\u00e2\5O(\2\u00e2\u00e3\5"+
		"=\37\2\u00e3\u00e5\3\2\2\2\u00e4\u00cb\3\2\2\2\u00e4\u00cc\3\2\2\2\u00e4"+
		"\u00cd\3\2\2\2\u00e4\u00d1\3\2\2\2\u00e4\u00d2\3\2\2\2\u00e4\u00d3\3\2"+
		"\2\2\u00e4\u00d6\3\2\2\2\u00e4\u00d9\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4"+
		"\u00e1\3\2\2\2\u00e5$\3\2\2\2\u00e6\u00e7\7R\2\2\u00e7\u00e8\7T\2\2\u00e8"+
		"\u00e9\7Q\2\2\u00e9\u00ea\7I\2\2\u00ea\u00eb\7T\2\2\u00eb\u00ec\7C\2\2"+
		"\u00ec\u00ed\7O\2\2\u00ed&\3\2\2\2\u00ee\u00ef\7K\2\2\u00ef\u00f0\7P\2"+
		"\2\u00f0\u00f1\7V\2\2\u00f1\u00f2\7G\2\2\u00f2\u00f3\7I\2\2\u00f3\u00f4"+
		"\7G\2\2\u00f4\u00f5\7T\2\2\u00f5(\3\2\2\2\u00f6\u00f7\7D\2\2\u00f7\u00f8"+
		"\7Q\2\2\u00f8\u00f9\7Q\2\2\u00f9\u00fa\7N\2\2\u00fa\u00fb\7G\2\2\u00fb"+
		"\u00fc\7C\2\2\u00fc\u00fd\7P\2\2\u00fd*\3\2\2\2\u00fe\u00ff\7D\2\2\u00ff"+
		"\u0100\7G\2\2\u0100\u0101\7I\2\2\u0101\u0102\7K\2\2\u0102\u0103\7P\2\2"+
		"\u0103,\3\2\2\2\u0104\u0105\7G\2\2\u0105\u0106\7P\2\2\u0106\u0107\7F\2"+
		"\2\u0107.\3\2\2\2\u0108\u0109\7Y\2\2\u0109\u010a\7J\2\2\u010a\u010b\7"+
		"K\2\2\u010b\u010c\7N\2\2\u010c\u010d\7G\2\2\u010d\60\3\2\2\2\u010e\u010f"+
		"\7K\2\2\u010f\u0110\7H\2\2\u0110\62\3\2\2\2\u0111\u0112\7V\2\2\u0112\u0113"+
		"\7J\2\2\u0113\u0114\7G\2\2\u0114\u0115\7P\2\2\u0115\64\3\2\2\2\u0116\u0117"+
		"\7G\2\2\u0117\u0118\7N\2\2\u0118\u0119\7U\2\2\u0119\u011a\7G\2\2\u011a"+
		"\66\3\2\2\2\u011b\u011c\7F\2\2\u011c\u011d\7Q\2\2\u011d8\3\2\2\2\u011e"+
		"\u011f\7T\2\2\u011f\u0120\7G\2\2\u0120\u0121\7C\2\2\u0121\u0122\7F\2\2"+
		"\u0122:\3\2\2\2\u0123\u0124\7X\2\2\u0124\u0125\7C\2\2\u0125\u0126\7T\2"+
		"\2\u0126<\3\2\2\2\u0127\u0128\7H\2\2\u0128\u0129\7C\2\2\u0129\u012a\7"+
		"N\2\2\u012a\u012b\7U\2\2\u012b\u012c\7G\2\2\u012c>\3\2\2\2\u012d\u012e"+
		"\7V\2\2\u012e\u012f\7T\2\2\u012f\u0130\7W\2\2\u0130\u0131\7G\2\2\u0131"+
		"@\3\2\2\2\u0132\u0133\7Y\2\2\u0133\u0134\7T\2\2\u0134\u0135\7K\2\2\u0135"+
		"\u0136\7V\2\2\u0136\u0137\7G\2\2\u0137B\3\2\2\2\u0138\u013c\t\2\2\2\u0139"+
		"\u013b\t\3\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013dD\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141"+
		"\t\4\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\7/\2\2\u0145\u0147\t\4"+
		"\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149F\3\2\2\2\u014a\u014e\7$\2\2\u014b\u014d\t\3\2\2\u014c"+
		"\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7$\2\2\u0152"+
		"H\3\2\2\2\u0153\u0154\t\5\2\2\u0154J\3\2\2\2\u0155\u0156\t\6\2\2\u0156"+
		"L\3\2\2\2\u0157\u0158\7Q\2\2\u0158\u015d\7T\2\2\u0159\u015a\7C\2\2\u015a"+
		"\u015b\7P\2\2\u015b\u015d\7F\2\2\u015c\u0157\3\2\2\2\u015c\u0159\3\2\2"+
		"\2\u015dN\3\2\2\2\u015e\u015f\7\u0080\2\2\u015fP\3\2\2\2\u0160\u016b\7"+
		">\2\2\u0161\u0162\7>\2\2\u0162\u016b\7?\2\2\u0163\u016b\7@\2\2\u0164\u0165"+
		"\7@\2\2\u0165\u016b\7?\2\2\u0166\u0167\7?\2\2\u0167\u016b\7?\2\2\u0168"+
		"\u0169\7>\2\2\u0169\u016b\7@\2\2\u016a\u0160\3\2\2\2\u016a\u0161\3\2\2"+
		"\2\u016a\u0163\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016bR\3\2\2\2\u016c\u016d\7=\2\2\u016dT\3\2\2\2\u016e\u016f"+
		"\7\60\2\2\u016fV\3\2\2\2\u0170\u0171\7<\2\2\u0171X\3\2\2\2\u0172\u0173"+
		"\7.\2\2\u0173Z\3\2\2\2\u0174\u0175\7*\2\2\u0175\\\3\2\2\2\u0176\u0177"+
		"\7+\2\2\u0177^\3\2\2\2\u0178\u0179\7<\2\2\u0179\u017a\7?\2\2\u017a`\3"+
		"\2\2\2\u017b\u017d\t\7\2\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b\61"+
		"\2\2\u0181b\3\2\2\2\24\2jv{\u0086\u008e\u009c\u00b2\u00b6\u00c9\u00e4"+
		"\u013c\u0142\u0148\u014e\u015c\u016a\u017e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}