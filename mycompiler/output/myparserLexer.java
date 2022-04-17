// $ANTLR 3.5.1 /home/hsa1155/compiler/hw2/mycompiler/myparser.g 2022-04-17 19:33:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myparserLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int ARROW=4;
	public static final int ASSIGN_OPERATOR=5;
	public static final int BASIC_TYPE=6;
	public static final int COLON=7;
	public static final int COMMA=8;
	public static final int COMMENT=9;
	public static final int COMPARISON_OPERATOR=10;
	public static final int CURLY_BRACKETS_LEFT=11;
	public static final int CURLY_BRACKETS_RIGHT=12;
	public static final int DECIMAL_INT=13;
	public static final int DIGIT=14;
	public static final int DO=15;
	public static final int DOT=16;
	public static final int EXTEND_TYPE=17;
	public static final int EscapeSequence=18;
	public static final int FLOAT=19;
	public static final int FLOW_CONTROL=20;
	public static final int FOR=21;
	public static final int HEX_INT=22;
	public static final int ID=23;
	public static final int INLINE=24;
	public static final int JUMP=25;
	public static final int LETTER=26;
	public static final int LINE_COMMAND=27;
	public static final int LINE_COMMENT=28;
	public static final int LITERAL_CHAR=29;
	public static final int LITERAL_STRING=30;
	public static final int LOGICAL_EQUALITY_OPERATOR=31;
	public static final int LOOP_CTRL=32;
	public static final int NEW_LINE=33;
	public static final int NULL_PTR=34;
	public static final int OCTAL_INT=35;
	public static final int OctalEscape=36;
	public static final int PARENTHESES_LEFT=37;
	public static final int PARENTHESES_RIGHT=38;
	public static final int QUESTION=39;
	public static final int SEMI_COLON=40;
	public static final int SHIFT_OPERATOR=41;
	public static final int SIGN=42;
	public static final int SIZEOF=43;
	public static final int SQUARE_BRACKETS_LEFT=44;
	public static final int SQUARE_BRACKETS_RIGHT=45;
	public static final int STORAGE_CLASS_SPECIFIER=46;
	public static final int TYPEDEF=47;
	public static final int TYPE_MODIFIER=48;
	public static final int WHILE=49;
	public static final int WS=50;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myparserLexer() {} 
	public myparserLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myparserLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/hsa1155/compiler/hw2/mycompiler/myparser.g"; }

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:7:7: ( '!' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:7:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:8:7: ( '%' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:8:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:9:7: ( '&&' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:9:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:10:7: ( '&' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:10:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:11:7: ( '*' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:11:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:12:7: ( '+' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:12:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:13:7: ( '++' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:13:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:14:7: ( '-' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:14:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:15:7: ( '--' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:15:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:16:7: ( '/' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:16:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:17:7: ( '=' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:17:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:18:7: ( '^' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:18:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:19:7: ( 'else' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:19:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:20:7: ( 'if' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:20:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:21:7: ( 'return' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:21:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:22:7: ( '|' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:22:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:23:7: ( '||' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:23:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:24:7: ( '~' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:24:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "BASIC_TYPE"
	public final void mBASIC_TYPE() throws RecognitionException {
		try {
			int _type = BASIC_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:183:5: ( 'short' | 'int' | 'long' | 'double' | 'float' | 'char' | 'void' )
			int alt1=7;
			switch ( input.LA(1) ) {
			case 's':
				{
				alt1=1;
				}
				break;
			case 'i':
				{
				alt1=2;
				}
				break;
			case 'l':
				{
				alt1=3;
				}
				break;
			case 'd':
				{
				alt1=4;
				}
				break;
			case 'f':
				{
				alt1=5;
				}
				break;
			case 'c':
				{
				alt1=6;
				}
				break;
			case 'v':
				{
				alt1=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:183:6: 'short'
					{
					match("short"); 

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:184:6: 'int'
					{
					match("int"); 

					}
					break;
				case 3 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:185:6: 'long'
					{
					match("long"); 

					}
					break;
				case 4 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:186:6: 'double'
					{
					match("double"); 

					}
					break;
				case 5 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:187:6: 'float'
					{
					match("float"); 

					}
					break;
				case 6 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:188:6: 'char'
					{
					match("char"); 

					}
					break;
				case 7 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:189:6: 'void'
					{
					match("void"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BASIC_TYPE"

	// $ANTLR start "SIGN"
	public final void mSIGN() throws RecognitionException {
		try {
			int _type = SIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:193:5: ( 'signed' | 'unsigned' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='s') ) {
				alt2=1;
			}
			else if ( (LA2_0=='u') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:193:6: 'signed'
					{
					match("signed"); 

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:194:6: 'unsigned'
					{
					match("unsigned"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGN"

	// $ANTLR start "EXTEND_TYPE"
	public final void mEXTEND_TYPE() throws RecognitionException {
		try {
			int _type = EXTEND_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:198:5: ( 'struct' | 'enum' | 'union' )
			int alt3=3;
			switch ( input.LA(1) ) {
			case 's':
				{
				alt3=1;
				}
				break;
			case 'e':
				{
				alt3=2;
				}
				break;
			case 'u':
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:198:6: 'struct'
					{
					match("struct"); 

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:199:6: 'enum'
					{
					match("enum"); 

					}
					break;
				case 3 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:200:6: 'union'
					{
					match("union"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTEND_TYPE"

	// $ANTLR start "TYPEDEF"
	public final void mTYPEDEF() throws RecognitionException {
		try {
			int _type = TYPEDEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:204:5: ( 'typedef' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:204:6: 'typedef'
			{
			match("typedef"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPEDEF"

	// $ANTLR start "TYPE_MODIFIER"
	public final void mTYPE_MODIFIER() throws RecognitionException {
		try {
			int _type = TYPE_MODIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:208:5: ( 'const' | 'restrict' | 'volatile' )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 'c':
				{
				alt4=1;
				}
				break;
			case 'r':
				{
				alt4=2;
				}
				break;
			case 'v':
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:208:6: 'const'
					{
					match("const"); 

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:209:6: 'restrict'
					{
					match("restrict"); 

					}
					break;
				case 3 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:210:6: 'volatile'
					{
					match("volatile"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_MODIFIER"

	// $ANTLR start "NULL_PTR"
	public final void mNULL_PTR() throws RecognitionException {
		try {
			int _type = NULL_PTR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:214:5: ( 'NULL' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:214:6: 'NULL'
			{
			match("NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL_PTR"

	// $ANTLR start "STORAGE_CLASS_SPECIFIER"
	public final void mSTORAGE_CLASS_SPECIFIER() throws RecognitionException {
		try {
			int _type = STORAGE_CLASS_SPECIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:218:5: ( 'extern' | 'static' | 'auto' | 'register' )
			int alt5=4;
			switch ( input.LA(1) ) {
			case 'e':
				{
				alt5=1;
				}
				break;
			case 's':
				{
				alt5=2;
				}
				break;
			case 'a':
				{
				alt5=3;
				}
				break;
			case 'r':
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:218:7: 'extern'
					{
					match("extern"); 

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:219:4: 'static'
					{
					match("static"); 

					}
					break;
				case 3 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:220:4: 'auto'
					{
					match("auto"); 

					}
					break;
				case 4 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:221:4: 'register'
					{
					match("register"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STORAGE_CLASS_SPECIFIER"

	// $ANTLR start "INLINE"
	public final void mINLINE() throws RecognitionException {
		try {
			int _type = INLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:225:5: ( 'inline' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:225:6: 'inline'
			{
			match("inline"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INLINE"

	// $ANTLR start "FLOW_CONTROL"
	public final void mFLOW_CONTROL() throws RecognitionException {
		try {
			int _type = FLOW_CONTROL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:229:5: ( 'if' | 'else' | 'switch' | 'case' | 'default' )
			int alt6=5;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt6=1;
				}
				break;
			case 'e':
				{
				alt6=2;
				}
				break;
			case 's':
				{
				alt6=3;
				}
				break;
			case 'c':
				{
				alt6=4;
				}
				break;
			case 'd':
				{
				alt6=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:229:6: 'if'
					{
					match("if"); 

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:230:6: 'else'
					{
					match("else"); 

					}
					break;
				case 3 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:231:6: 'switch'
					{
					match("switch"); 

					}
					break;
				case 4 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:232:6: 'case'
					{
					match("case"); 

					}
					break;
				case 5 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:233:6: 'default'
					{
					match("default"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOW_CONTROL"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:239:2: ( 'for' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:239:3: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:243:2: ( 'while' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:243:3: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:247:2: ( 'do' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:247:3: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "LOOP_CTRL"
	public final void mLOOP_CTRL() throws RecognitionException {
		try {
			int _type = LOOP_CTRL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:251:2: ( 'break' | 'continue' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='b') ) {
				alt7=1;
			}
			else if ( (LA7_0=='c') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:251:3: 'break'
					{
					match("break"); 

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:252:4: 'continue'
					{
					match("continue"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOOP_CTRL"

	// $ANTLR start "JUMP"
	public final void mJUMP() throws RecognitionException {
		try {
			int _type = JUMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:256:5: ( 'goto' | 'return' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='g') ) {
				alt8=1;
			}
			else if ( (LA8_0=='r') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:256:6: 'goto'
					{
					match("goto"); 

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:257:6: 'return'
					{
					match("return"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JUMP"

	// $ANTLR start "SIZEOF"
	public final void mSIZEOF() throws RecognitionException {
		try {
			int _type = SIZEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:261:5: ( 'sizeof' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:261:6: 'sizeof'
			{
			match("sizeof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIZEOF"

	// $ANTLR start "LITERAL_STRING"
	public final void mLITERAL_STRING() throws RecognitionException {
		try {
			int _type = LITERAL_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:266:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:266:6: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:266:10: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\\') ) {
					alt9=1;
				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:266:12: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:266:29: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LITERAL_STRING"

	// $ANTLR start "LITERAL_CHAR"
	public final void mLITERAL_CHAR() throws RecognitionException {
		try {
			int _type = LITERAL_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:270:5: ( '\\'' (~ ( '\\'' ) | EscapeSequence ) '\\'' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:270:6: '\\'' (~ ( '\\'' ) | EscapeSequence ) '\\''
			{
			match('\''); 
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:270:11: (~ ( '\\'' ) | EscapeSequence )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\\') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='\'') ) {
					int LA10_3 = input.LA(3);
					if ( (LA10_3=='\'') ) {
						alt10=2;
					}

					else {
						alt10=1;
					}

				}
				else if ( (LA10_1=='\"'||(LA10_1 >= '0' && LA10_1 <= '7')||LA10_1=='\\'||LA10_1=='b'||LA10_1=='f'||LA10_1=='n'||LA10_1=='r'||LA10_1=='t') ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '&')||(LA10_0 >= '(' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\uFFFF')) ) {
				alt10=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:270:12: ~ ( '\\'' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:270:20: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LITERAL_CHAR"

	// $ANTLR start "DECIMAL_INT"
	public final void mDECIMAL_INT() throws RecognitionException {
		try {
			int _type = DECIMAL_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:274:5: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:274:7: ( '0' | '1' .. '9' ( '0' .. '9' )* )
			{
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:274:7: ( '0' | '1' .. '9' ( '0' .. '9' )* )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='0') ) {
				alt12=1;
			}
			else if ( ((LA12_0 >= '1' && LA12_0 <= '9')) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:274:8: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:274:14: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); 
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:274:23: ( '0' .. '9' )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop11;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECIMAL_INT"

	// $ANTLR start "HEX_INT"
	public final void mHEX_INT() throws RecognitionException {
		try {
			int _type = HEX_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:278:5: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:278:7: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
			{
			match('0'); 
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:278:21: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'F')||(LA13_0 >= 'a' && LA13_0 <= 'f')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_INT"

	// $ANTLR start "OCTAL_INT"
	public final void mOCTAL_INT() throws RecognitionException {
		try {
			int _type = OCTAL_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:282:5: ( '0' ( '0' .. '7' )+ )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:282:6: '0' ( '0' .. '7' )+
			{
			match('0'); 
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:282:10: ( '0' .. '7' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '7')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:286:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' | 'F' | 'd' | 'D' )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' | 'F' | 'd' | 'D' )? | ( '0' .. '9' )+ ( ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) | ( 'f' | 'F' | 'd' | 'D' ) | ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) ( 'f' | 'F' | 'd' | 'D' ) ) )
			int alt32=3;
			alt32 = dfa32.predict(input);
			switch (alt32) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:286:6: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' | 'F' | 'd' | 'D' )?
					{
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:286:6: ( '0' .. '9' )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					match('.'); 
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:286:22: ( '0' .. '9' )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop16;
						}
					}

					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:286:34: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0=='E'||LA19_0=='e') ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:286:35: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
							{
							if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:286:45: ( '+' | '-' )?
							int alt17=2;
							int LA17_0 = input.LA(1);
							if ( (LA17_0=='+'||LA17_0=='-') ) {
								alt17=1;
							}
							switch (alt17) {
								case 1 :
									// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
									{
									if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

							}

							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:286:56: ( '0' .. '9' )+
							int cnt18=0;
							loop18:
							while (true) {
								int alt18=2;
								int LA18_0 = input.LA(1);
								if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
									alt18=1;
								}

								switch (alt18) {
								case 1 :
									// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									if ( cnt18 >= 1 ) break loop18;
									EarlyExitException eee = new EarlyExitException(18, input);
									throw eee;
								}
								cnt18++;
							}

							}
							break;

					}

					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:286:71: ( 'f' | 'F' | 'd' | 'D' )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0=='D'||LA20_0=='F'||LA20_0=='d'||LA20_0=='f') ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:287:6: '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' | 'F' | 'd' | 'D' )?
					{
					match('.'); 
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:287:10: ( '0' .. '9' )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:287:22: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0=='E'||LA24_0=='e') ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:287:23: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
							{
							if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:287:33: ( '+' | '-' )?
							int alt22=2;
							int LA22_0 = input.LA(1);
							if ( (LA22_0=='+'||LA22_0=='-') ) {
								alt22=1;
							}
							switch (alt22) {
								case 1 :
									// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
									{
									if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

							}

							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:287:44: ( '0' .. '9' )+
							int cnt23=0;
							loop23:
							while (true) {
								int alt23=2;
								int LA23_0 = input.LA(1);
								if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
									alt23=1;
								}

								switch (alt23) {
								case 1 :
									// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									if ( cnt23 >= 1 ) break loop23;
									EarlyExitException eee = new EarlyExitException(23, input);
									throw eee;
								}
								cnt23++;
							}

							}
							break;

					}

					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:287:59: ( 'f' | 'F' | 'd' | 'D' )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0=='D'||LA25_0=='F'||LA25_0=='d'||LA25_0=='f') ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:6: ( '0' .. '9' )+ ( ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) | ( 'f' | 'F' | 'd' | 'D' ) | ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) ( 'f' | 'F' | 'd' | 'D' ) )
					{
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:6: ( '0' .. '9' )+
					int cnt26=0;
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( ((LA26_0 >= '0' && LA26_0 <= '9')) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt26 >= 1 ) break loop26;
							EarlyExitException eee = new EarlyExitException(26, input);
							throw eee;
						}
						cnt26++;
					}

					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:18: ( ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) | ( 'f' | 'F' | 'd' | 'D' ) | ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) ( 'f' | 'F' | 'd' | 'D' ) )
					int alt31=3;
					alt31 = dfa31.predict(input);
					switch (alt31) {
						case 1 :
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:21: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
							{
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:21: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:22: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
							{
							if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:32: ( '+' | '-' )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0=='+'||LA27_0=='-') ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
									{
									if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

							}

							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:43: ( '0' .. '9' )+
							int cnt28=0;
							loop28:
							while (true) {
								int alt28=2;
								int LA28_0 = input.LA(1);
								if ( ((LA28_0 >= '0' && LA28_0 <= '9')) ) {
									alt28=1;
								}

								switch (alt28) {
								case 1 :
									// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									if ( cnt28 >= 1 ) break loop28;
									EarlyExitException eee = new EarlyExitException(28, input);
									throw eee;
								}
								cnt28++;
							}

							}

							}
							break;
						case 2 :
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:59: ( 'f' | 'F' | 'd' | 'D' )
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 3 :
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:78: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) ( 'f' | 'F' | 'd' | 'D' )
							{
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:78: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:79: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
							{
							if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:89: ( '+' | '-' )?
							int alt29=2;
							int LA29_0 = input.LA(1);
							if ( (LA29_0=='+'||LA29_0=='-') ) {
								alt29=1;
							}
							switch (alt29) {
								case 1 :
									// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
									{
									if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

							}

							// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:288:100: ( '0' .. '9' )+
							int cnt30=0;
							loop30:
							while (true) {
								int alt30=2;
								int LA30_0 = input.LA(1);
								if ( ((LA30_0 >= '0' && LA30_0 <= '9')) ) {
									alt30=1;
								}

								switch (alt30) {
								case 1 :
									// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									if ( cnt30 >= 1 ) break loop30;
									EarlyExitException eee = new EarlyExitException(30, input);
									throw eee;
								}
								cnt30++;
							}

							}

							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "PARENTHESES_LEFT"
	public final void mPARENTHESES_LEFT() throws RecognitionException {
		try {
			int _type = PARENTHESES_LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:292:5: ( '(' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:292:6: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARENTHESES_LEFT"

	// $ANTLR start "PARENTHESES_RIGHT"
	public final void mPARENTHESES_RIGHT() throws RecognitionException {
		try {
			int _type = PARENTHESES_RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:296:5: ( ')' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:296:6: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARENTHESES_RIGHT"

	// $ANTLR start "SQUARE_BRACKETS_LEFT"
	public final void mSQUARE_BRACKETS_LEFT() throws RecognitionException {
		try {
			int _type = SQUARE_BRACKETS_LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:300:5: ( '[' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:300:6: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQUARE_BRACKETS_LEFT"

	// $ANTLR start "SQUARE_BRACKETS_RIGHT"
	public final void mSQUARE_BRACKETS_RIGHT() throws RecognitionException {
		try {
			int _type = SQUARE_BRACKETS_RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:304:5: ( ']' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:304:6: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQUARE_BRACKETS_RIGHT"

	// $ANTLR start "CURLY_BRACKETS_LEFT"
	public final void mCURLY_BRACKETS_LEFT() throws RecognitionException {
		try {
			int _type = CURLY_BRACKETS_LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:308:5: ( '{' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:308:6: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CURLY_BRACKETS_LEFT"

	// $ANTLR start "CURLY_BRACKETS_RIGHT"
	public final void mCURLY_BRACKETS_RIGHT() throws RecognitionException {
		try {
			int _type = CURLY_BRACKETS_RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:312:5: ( '}' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:312:6: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CURLY_BRACKETS_RIGHT"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:316:5: ( ':' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:316:6: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SEMI_COLON"
	public final void mSEMI_COLON() throws RecognitionException {
		try {
			int _type = SEMI_COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:320:5: ( ';' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:320:6: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI_COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:324:5: ( ',' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:324:6: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:328:5: ( '.' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:328:6: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "ARROW"
	public final void mARROW() throws RecognitionException {
		try {
			int _type = ARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:332:5: ( '->' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:332:6: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARROW"

	// $ANTLR start "QUESTION"
	public final void mQUESTION() throws RecognitionException {
		try {
			int _type = QUESTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:336:5: ( '?' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:336:6: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION"

	// $ANTLR start "LOGICAL_EQUALITY_OPERATOR"
	public final void mLOGICAL_EQUALITY_OPERATOR() throws RecognitionException {
		try {
			int _type = LOGICAL_EQUALITY_OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:340:4: ( '==' | '!=' )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0=='=') ) {
				alt33=1;
			}
			else if ( (LA33_0=='!') ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:340:5: '=='
					{
					match("=="); 

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:341:5: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICAL_EQUALITY_OPERATOR"

	// $ANTLR start "SHIFT_OPERATOR"
	public final void mSHIFT_OPERATOR() throws RecognitionException {
		try {
			int _type = SHIFT_OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:373:5: ( '<<' | '>>' )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0=='<') ) {
				alt34=1;
			}
			else if ( (LA34_0=='>') ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:373:6: '<<'
					{
					match("<<"); 

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:374:6: '>>'
					{
					match(">>"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHIFT_OPERATOR"

	// $ANTLR start "COMPARISON_OPERATOR"
	public final void mCOMPARISON_OPERATOR() throws RecognitionException {
		try {
			int _type = COMPARISON_OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:378:5: ( '<' | '<=' | '>' | '>=' )
			int alt35=4;
			int LA35_0 = input.LA(1);
			if ( (LA35_0=='<') ) {
				int LA35_1 = input.LA(2);
				if ( (LA35_1=='=') ) {
					alt35=2;
				}

				else {
					alt35=1;
				}

			}
			else if ( (LA35_0=='>') ) {
				int LA35_2 = input.LA(2);
				if ( (LA35_2=='=') ) {
					alt35=4;
				}

				else {
					alt35=3;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:378:6: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:379:6: '<='
					{
					match("<="); 

					}
					break;
				case 3 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:380:6: '>'
					{
					match('>'); 
					}
					break;
				case 4 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:381:6: '>='
					{
					match(">="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPARISON_OPERATOR"

	// $ANTLR start "ASSIGN_OPERATOR"
	public final void mASSIGN_OPERATOR() throws RecognitionException {
		try {
			int _type = ASSIGN_OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:386:5: ( '+=' | '-=' | '*=' | '/=' | '%=' | '|=' | '&=' | '^=' | '<<=' | '=' | '>>=' )
			int alt36=11;
			switch ( input.LA(1) ) {
			case '+':
				{
				alt36=1;
				}
				break;
			case '-':
				{
				alt36=2;
				}
				break;
			case '*':
				{
				alt36=3;
				}
				break;
			case '/':
				{
				alt36=4;
				}
				break;
			case '%':
				{
				alt36=5;
				}
				break;
			case '|':
				{
				alt36=6;
				}
				break;
			case '&':
				{
				alt36=7;
				}
				break;
			case '^':
				{
				alt36=8;
				}
				break;
			case '<':
				{
				alt36=9;
				}
				break;
			case '=':
				{
				alt36=10;
				}
				break;
			case '>':
				{
				alt36=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:387:5: '+='
					{
					match("+="); 

					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:388:6: '-='
					{
					match("-="); 

					}
					break;
				case 3 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:389:6: '*='
					{
					match("*="); 

					}
					break;
				case 4 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:390:6: '/='
					{
					match("/="); 

					}
					break;
				case 5 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:391:6: '%='
					{
					match("%="); 

					}
					break;
				case 6 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:392:6: '|='
					{
					match("|="); 

					}
					break;
				case 7 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:393:6: '&='
					{
					match("&="); 

					}
					break;
				case 8 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:394:6: '^='
					{
					match("^="); 

					}
					break;
				case 9 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:395:6: '<<='
					{
					match("<<="); 

					}
					break;
				case 10 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:396:6: '='
					{
					match('='); 
					}
					break;
				case 11 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:397:6: '>>='
					{
					match(">>="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN_OPERATOR"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:403:2: ( LETTER ( LETTER | DIGIT )* )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:403:4: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:403:11: ( LETTER | DIGIT )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( ((LA37_0 >= '0' && LA37_0 <= '9')||(LA37_0 >= 'A' && LA37_0 <= 'Z')||LA37_0=='_'||(LA37_0 >= 'a' && LA37_0 <= 'z')) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop37;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:407:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' ) )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:407:6: ( ' ' | '\\r' | '\\t' | '\\u000C' )
			{
			if ( input.LA(1)=='\t'||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:410:9: ( '\\n' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:410:11: '\\n'
			{
			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:413:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:413:9: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:413:14: ( options {greedy=false; } : . )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0=='*') ) {
					int LA38_1 = input.LA(2);
					if ( (LA38_1=='/') ) {
						alt38=2;
					}
					else if ( ((LA38_1 >= '\u0000' && LA38_1 <= '.')||(LA38_1 >= '0' && LA38_1 <= '\uFFFF')) ) {
						alt38=1;
					}

				}
				else if ( ((LA38_0 >= '\u0000' && LA38_0 <= ')')||(LA38_0 >= '+' && LA38_0 <= '\uFFFF')) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:413:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop38;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:417:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? ( '\\n' )? )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:417:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? ( '\\n' )?
			{
			match("//"); 

			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:417:12: (~ ( '\\n' | '\\r' ) )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( ((LA39_0 >= '\u0000' && LA39_0 <= '\t')||(LA39_0 >= '\u000B' && LA39_0 <= '\f')||(LA39_0 >= '\u000E' && LA39_0 <= '\uFFFF')) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop39;
				}
			}

			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:417:26: ( '\\r' )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0=='\r') ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:417:26: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:417:32: ( '\\n' )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0=='\n') ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:417:32: '\\n'
					{
					match('\n'); 
					}
					break;

			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	// $ANTLR start "LINE_COMMAND"
	public final void mLINE_COMMAND() throws RecognitionException {
		try {
			int _type = LINE_COMMAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:421:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? ( '\\n' )? )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:421:6: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? ( '\\n' )?
			{
			match('#'); 
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:421:10: (~ ( '\\n' | '\\r' ) )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( ((LA42_0 >= '\u0000' && LA42_0 <= '\t')||(LA42_0 >= '\u000B' && LA42_0 <= '\f')||(LA42_0 >= '\u000E' && LA42_0 <= '\uFFFF')) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop42;
				}
			}

			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:421:24: ( '\\r' )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0=='\r') ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:421:24: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:421:30: ( '\\n' )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0=='\n') ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:421:30: '\\n'
					{
					match('\n'); 
					}
					break;

			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMAND"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:424:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:425:16: ( '0' .. '9' )
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:429:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0=='\\') ) {
				int LA45_1 = input.LA(2);
				if ( (LA45_1=='\"'||LA45_1=='\''||LA45_1=='\\'||LA45_1=='b'||LA45_1=='f'||LA45_1=='n'||LA45_1=='r'||LA45_1=='t') ) {
					alt45=1;
				}
				else if ( ((LA45_1 >= '0' && LA45_1 <= '7')) ) {
					alt45=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:429:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:430:9: OctalEscape
					{
					mOctalEscape(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "OctalEscape"
	public final void mOctalEscape() throws RecognitionException {
		try {
			// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:435:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt46=3;
			int LA46_0 = input.LA(1);
			if ( (LA46_0=='\\') ) {
				int LA46_1 = input.LA(2);
				if ( ((LA46_1 >= '0' && LA46_1 <= '3')) ) {
					int LA46_2 = input.LA(3);
					if ( ((LA46_2 >= '0' && LA46_2 <= '7')) ) {
						int LA46_4 = input.LA(4);
						if ( ((LA46_4 >= '0' && LA46_4 <= '7')) ) {
							alt46=1;
						}

						else {
							alt46=2;
						}

					}

					else {
						alt46=3;
					}

				}
				else if ( ((LA46_1 >= '4' && LA46_1 <= '7')) ) {
					int LA46_3 = input.LA(3);
					if ( ((LA46_3 >= '0' && LA46_3 <= '7')) ) {
						alt46=2;
					}

					else {
						alt46=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:435:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:436:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:437:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OctalEscape"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:8: ( T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | BASIC_TYPE | SIGN | EXTEND_TYPE | TYPEDEF | TYPE_MODIFIER | NULL_PTR | STORAGE_CLASS_SPECIFIER | INLINE | FLOW_CONTROL | FOR | WHILE | DO | LOOP_CTRL | JUMP | SIZEOF | LITERAL_STRING | LITERAL_CHAR | DECIMAL_INT | HEX_INT | OCTAL_INT | FLOAT | PARENTHESES_LEFT | PARENTHESES_RIGHT | SQUARE_BRACKETS_LEFT | SQUARE_BRACKETS_RIGHT | CURLY_BRACKETS_LEFT | CURLY_BRACKETS_RIGHT | COLON | SEMI_COLON | COMMA | DOT | ARROW | QUESTION | LOGICAL_EQUALITY_OPERATOR | SHIFT_OPERATOR | COMPARISON_OPERATOR | ASSIGN_OPERATOR | ID | WS | NEW_LINE | COMMENT | LINE_COMMENT | LINE_COMMAND )
		int alt47=61;
		alt47 = dfa47.predict(input);
		switch (alt47) {
			case 1 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:10: T__51
				{
				mT__51(); 

				}
				break;
			case 2 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:16: T__52
				{
				mT__52(); 

				}
				break;
			case 3 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:22: T__53
				{
				mT__53(); 

				}
				break;
			case 4 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:28: T__54
				{
				mT__54(); 

				}
				break;
			case 5 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:34: T__55
				{
				mT__55(); 

				}
				break;
			case 6 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:40: T__56
				{
				mT__56(); 

				}
				break;
			case 7 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:46: T__57
				{
				mT__57(); 

				}
				break;
			case 8 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:52: T__58
				{
				mT__58(); 

				}
				break;
			case 9 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:58: T__59
				{
				mT__59(); 

				}
				break;
			case 10 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:64: T__60
				{
				mT__60(); 

				}
				break;
			case 11 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:70: T__61
				{
				mT__61(); 

				}
				break;
			case 12 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:76: T__62
				{
				mT__62(); 

				}
				break;
			case 13 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:82: T__63
				{
				mT__63(); 

				}
				break;
			case 14 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:88: T__64
				{
				mT__64(); 

				}
				break;
			case 15 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:94: T__65
				{
				mT__65(); 

				}
				break;
			case 16 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:100: T__66
				{
				mT__66(); 

				}
				break;
			case 17 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:106: T__67
				{
				mT__67(); 

				}
				break;
			case 18 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:112: T__68
				{
				mT__68(); 

				}
				break;
			case 19 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:118: BASIC_TYPE
				{
				mBASIC_TYPE(); 

				}
				break;
			case 20 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:129: SIGN
				{
				mSIGN(); 

				}
				break;
			case 21 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:134: EXTEND_TYPE
				{
				mEXTEND_TYPE(); 

				}
				break;
			case 22 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:146: TYPEDEF
				{
				mTYPEDEF(); 

				}
				break;
			case 23 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:154: TYPE_MODIFIER
				{
				mTYPE_MODIFIER(); 

				}
				break;
			case 24 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:168: NULL_PTR
				{
				mNULL_PTR(); 

				}
				break;
			case 25 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:177: STORAGE_CLASS_SPECIFIER
				{
				mSTORAGE_CLASS_SPECIFIER(); 

				}
				break;
			case 26 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:201: INLINE
				{
				mINLINE(); 

				}
				break;
			case 27 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:208: FLOW_CONTROL
				{
				mFLOW_CONTROL(); 

				}
				break;
			case 28 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:221: FOR
				{
				mFOR(); 

				}
				break;
			case 29 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:225: WHILE
				{
				mWHILE(); 

				}
				break;
			case 30 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:231: DO
				{
				mDO(); 

				}
				break;
			case 31 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:234: LOOP_CTRL
				{
				mLOOP_CTRL(); 

				}
				break;
			case 32 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:244: JUMP
				{
				mJUMP(); 

				}
				break;
			case 33 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:249: SIZEOF
				{
				mSIZEOF(); 

				}
				break;
			case 34 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:256: LITERAL_STRING
				{
				mLITERAL_STRING(); 

				}
				break;
			case 35 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:271: LITERAL_CHAR
				{
				mLITERAL_CHAR(); 

				}
				break;
			case 36 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:284: DECIMAL_INT
				{
				mDECIMAL_INT(); 

				}
				break;
			case 37 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:296: HEX_INT
				{
				mHEX_INT(); 

				}
				break;
			case 38 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:304: OCTAL_INT
				{
				mOCTAL_INT(); 

				}
				break;
			case 39 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:314: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 40 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:320: PARENTHESES_LEFT
				{
				mPARENTHESES_LEFT(); 

				}
				break;
			case 41 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:337: PARENTHESES_RIGHT
				{
				mPARENTHESES_RIGHT(); 

				}
				break;
			case 42 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:355: SQUARE_BRACKETS_LEFT
				{
				mSQUARE_BRACKETS_LEFT(); 

				}
				break;
			case 43 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:376: SQUARE_BRACKETS_RIGHT
				{
				mSQUARE_BRACKETS_RIGHT(); 

				}
				break;
			case 44 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:398: CURLY_BRACKETS_LEFT
				{
				mCURLY_BRACKETS_LEFT(); 

				}
				break;
			case 45 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:418: CURLY_BRACKETS_RIGHT
				{
				mCURLY_BRACKETS_RIGHT(); 

				}
				break;
			case 46 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:439: COLON
				{
				mCOLON(); 

				}
				break;
			case 47 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:445: SEMI_COLON
				{
				mSEMI_COLON(); 

				}
				break;
			case 48 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:456: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 49 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:462: DOT
				{
				mDOT(); 

				}
				break;
			case 50 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:466: ARROW
				{
				mARROW(); 

				}
				break;
			case 51 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:472: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 52 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:481: LOGICAL_EQUALITY_OPERATOR
				{
				mLOGICAL_EQUALITY_OPERATOR(); 

				}
				break;
			case 53 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:507: SHIFT_OPERATOR
				{
				mSHIFT_OPERATOR(); 

				}
				break;
			case 54 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:522: COMPARISON_OPERATOR
				{
				mCOMPARISON_OPERATOR(); 

				}
				break;
			case 55 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:542: ASSIGN_OPERATOR
				{
				mASSIGN_OPERATOR(); 

				}
				break;
			case 56 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:558: ID
				{
				mID(); 

				}
				break;
			case 57 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:561: WS
				{
				mWS(); 

				}
				break;
			case 58 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:564: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 59 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:573: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 60 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:581: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 61 :
				// /home/hsa1155/compiler/hw2/mycompiler/myparser.g:1:594: LINE_COMMAND
				{
				mLINE_COMMAND(); 

				}
				break;

		}
	}


	protected DFA32 dfa32 = new DFA32(this);
	protected DFA31 dfa31 = new DFA31(this);
	protected DFA47 dfa47 = new DFA47(this);
	static final String DFA32_eotS =
		"\5\uffff";
	static final String DFA32_eofS =
		"\5\uffff";
	static final String DFA32_minS =
		"\2\56\3\uffff";
	static final String DFA32_maxS =
		"\1\71\1\146\3\uffff";
	static final String DFA32_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA32_specialS =
		"\5\uffff}>";
	static final String[] DFA32_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\12\uffff\3\4\35\uffff\3\4",
			"",
			"",
			""
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "285:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' | 'F' | 'd' | 'D' )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' | 'F' | 'd' | 'D' )? | ( '0' .. '9' )+ ( ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) | ( 'f' | 'F' | 'd' | 'D' ) | ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) ( 'f' | 'F' | 'd' | 'D' ) ) );";
		}
	}

	static final String DFA31_eotS =
		"\4\uffff\1\5\2\uffff";
	static final String DFA31_eofS =
		"\7\uffff";
	static final String DFA31_minS =
		"\1\104\1\53\1\uffff\2\60\2\uffff";
	static final String DFA31_maxS =
		"\1\146\1\71\1\uffff\1\71\1\146\2\uffff";
	static final String DFA31_acceptS =
		"\2\uffff\1\2\2\uffff\1\1\1\3";
	static final String DFA31_specialS =
		"\7\uffff}>";
	static final String[] DFA31_transitionS = {
			"\1\2\1\1\1\2\35\uffff\1\2\1\1\1\2",
			"\1\3\1\uffff\1\3\2\uffff\12\4",
			"",
			"\12\4",
			"\12\4\12\uffff\1\6\1\uffff\1\6\35\uffff\1\6\1\uffff\1\6",
			"",
			""
	};

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "288:18: ( ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) | ( 'f' | 'F' | 'd' | 'D' ) | ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) ( 'f' | 'F' | 'd' | 'D' ) )";
		}
	}

	static final String DFA47_eotS =
		"\1\uffff\1\62\1\64\1\66\1\67\1\71\1\74\1\77\1\100\1\101\3\55\1\111\1\uffff"+
		"\15\55\2\uffff\2\137\1\143\12\uffff\2\145\25\uffff\3\55\1\152\2\55\2\uffff"+
		"\5\55\1\170\16\55\2\uffff\1\u0089\1\uffff\1\137\1\uffff\1\u008a\1\uffff"+
		"\1\u008a\3\55\1\uffff\1\u008e\14\55\1\uffff\2\55\1\u009d\15\55\2\uffff"+
		"\1\u00ac\1\u00ad\1\55\1\uffff\12\55\1\u008e\3\55\1\uffff\1\u008e\2\55"+
		"\1\u00be\1\u008e\4\55\1\u00c3\1\u00c4\2\55\1\u00c7\2\uffff\5\55\1\u008e"+
		"\7\55\1\u008e\1\u00d4\1\55\1\uffff\2\55\1\u00ad\1\55\2\uffff\1\u00d9\1"+
		"\u00da\1\uffff\1\u00c4\1\u00db\1\u00dc\2\55\1\u00df\1\u00e0\1\u00ad\1"+
		"\u00c4\1\u00be\1\u008e\1\55\1\uffff\4\55\4\uffff\2\55\2\uffff\1\u00be"+
		"\3\55\1\u00eb\1\u00d4\1\u00c4\1\u00da\1\u00d4\1\u00df\1\uffff";
	static final String DFA47_eofS =
		"\u00ec\uffff";
	static final String DFA47_minS =
		"\1\11\2\75\1\46\1\75\1\53\1\55\1\52\2\75\1\154\1\146\1\145\1\75\1\uffff"+
		"\1\150\1\157\1\145\1\154\1\141\1\157\1\156\1\171\1\125\1\165\1\150\1\162"+
		"\1\157\2\uffff\2\56\1\60\12\uffff\1\74\1\76\25\uffff\1\163\1\165\1\164"+
		"\1\60\1\154\1\147\2\uffff\1\157\1\147\1\141\1\151\1\156\1\60\1\146\1\157"+
		"\1\162\1\141\1\156\1\163\2\151\1\160\1\114\1\164\1\151\1\145\1\164\2\uffff"+
		"\1\56\1\uffff\1\56\1\uffff\1\75\1\uffff\1\75\1\145\1\155\1\145\1\uffff"+
		"\1\60\1\151\1\165\1\164\1\151\1\162\1\156\1\145\1\165\2\164\1\147\1\142"+
		"\1\uffff\2\141\1\60\1\162\1\163\1\145\1\144\1\141\1\151\1\157\1\145\1"+
		"\114\1\157\1\154\1\141\1\157\2\uffff\2\60\1\162\1\uffff\1\156\2\162\1"+
		"\163\1\164\1\145\1\157\1\143\1\151\1\143\1\60\1\154\1\165\1\164\1\uffff"+
		"\1\60\1\164\1\151\2\60\1\164\1\147\1\156\1\144\2\60\1\145\1\153\1\60\2"+
		"\uffff\1\156\1\145\1\156\1\151\1\164\1\60\1\144\1\146\1\164\1\143\1\150"+
		"\1\145\1\154\2\60\1\156\1\uffff\1\151\1\156\1\60\1\145\2\uffff\2\60\1"+
		"\uffff\3\60\1\143\1\145\6\60\1\164\1\uffff\1\165\1\154\1\145\1\146\4\uffff"+
		"\1\164\1\162\2\uffff\1\60\2\145\1\144\6\60\1\uffff";
	static final String DFA47_maxS =
		"\1\176\5\75\1\76\3\75\1\170\1\156\1\145\1\174\1\uffff\1\167\5\157\1\156"+
		"\1\171\1\125\1\165\1\150\1\162\1\157\2\uffff\1\170\1\146\1\71\12\uffff"+
		"\1\74\1\76\25\uffff\1\163\1\165\1\164\1\172\2\164\2\uffff\1\157\1\172"+
		"\1\162\1\151\1\156\1\172\1\146\1\157\1\162\1\141\1\156\1\163\1\154\1\163"+
		"\1\160\1\114\1\164\1\151\1\145\1\164\2\uffff\1\146\1\uffff\1\146\1\uffff"+
		"\1\75\1\uffff\1\75\1\145\1\155\1\145\1\uffff\1\172\1\151\1\165\1\164\1"+
		"\151\1\162\1\156\1\145\1\165\2\164\1\147\1\142\1\uffff\2\141\1\172\1\162"+
		"\1\164\1\145\1\144\1\141\1\151\1\157\1\145\1\114\1\157\1\154\1\141\1\157"+
		"\2\uffff\2\172\1\162\1\uffff\1\156\2\162\1\163\1\164\1\145\1\157\1\143"+
		"\1\151\1\143\1\172\1\154\1\165\1\164\1\uffff\1\172\1\164\1\151\2\172\1"+
		"\164\1\147\1\156\1\144\2\172\1\145\1\153\1\172\2\uffff\1\156\1\145\1\156"+
		"\1\151\1\164\1\172\1\144\1\146\1\164\1\143\1\150\1\145\1\154\2\172\1\156"+
		"\1\uffff\1\151\1\156\1\172\1\145\2\uffff\2\172\1\uffff\3\172\1\143\1\145"+
		"\6\172\1\164\1\uffff\1\165\1\154\1\145\1\146\4\uffff\1\164\1\162\2\uffff"+
		"\1\172\2\145\1\144\6\172\1\uffff";
	static final String DFA47_acceptS =
		"\16\uffff\1\22\15\uffff\1\42\1\43\3\uffff\1\50\1\51\1\52\1\53\1\54\1\55"+
		"\1\56\1\57\1\60\1\63\2\uffff\1\70\1\71\1\72\1\75\1\64\1\1\1\67\1\2\1\3"+
		"\1\4\1\5\1\7\1\6\1\11\1\62\1\10\1\73\1\74\1\12\1\13\1\14\6\uffff\1\21"+
		"\1\20\24\uffff\1\45\1\44\1\uffff\1\47\1\uffff\1\61\1\uffff\1\66\4\uffff"+
		"\1\16\15\uffff\1\36\20\uffff\1\46\1\65\3\uffff\1\23\16\uffff\1\34\16\uffff"+
		"\1\15\1\25\20\uffff\1\33\4\uffff\1\30\1\31\2\uffff\1\40\14\uffff\1\27"+
		"\4\uffff\1\35\1\37\1\32\1\17\2\uffff\1\24\1\41\12\uffff\1\26";
	static final String DFA47_specialS =
		"\u00ec\uffff}>";
	static final String[] DFA47_transitionS = {
			"\1\56\1\57\1\uffff\2\56\22\uffff\1\56\1\1\1\34\1\60\1\uffff\1\2\1\3\1"+
			"\35\1\41\1\42\1\4\1\5\1\51\1\6\1\40\1\7\1\36\11\37\1\47\1\50\1\53\1\10"+
			"\1\54\1\52\1\uffff\15\55\1\27\14\55\1\43\1\uffff\1\44\1\11\1\55\1\uffff"+
			"\1\30\1\32\1\23\1\21\1\12\1\22\1\33\1\55\1\13\2\55\1\20\5\55\1\14\1\17"+
			"\1\26\1\25\1\24\1\31\3\55\1\45\1\15\1\46\1\16",
			"\1\61",
			"\1\63",
			"\1\65\26\uffff\1\63",
			"\1\63",
			"\1\70\21\uffff\1\63",
			"\1\72\17\uffff\1\63\1\73",
			"\1\75\4\uffff\1\76\15\uffff\1\63",
			"\1\61",
			"\1\63",
			"\1\102\1\uffff\1\103\11\uffff\1\104",
			"\1\105\7\uffff\1\106",
			"\1\107",
			"\1\63\76\uffff\1\110",
			"",
			"\1\112\1\113\12\uffff\1\114\2\uffff\1\115",
			"\1\116",
			"\1\120\11\uffff\1\117",
			"\1\121\2\uffff\1\122",
			"\1\125\6\uffff\1\123\6\uffff\1\124",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"",
			"",
			"\1\141\1\uffff\10\140\2\141\12\uffff\3\141\21\uffff\1\136\13\uffff\3"+
			"\141\21\uffff\1\136",
			"\1\141\1\uffff\12\142\12\uffff\3\141\35\uffff\3\141",
			"\12\141",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\144",
			"\1\146",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\147",
			"\1\150",
			"\1\151",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\154\7\uffff\1\153",
			"\1\157\13\uffff\1\156\1\155",
			"",
			"",
			"\1\160",
			"\1\161\22\uffff\1\162",
			"\1\164\20\uffff\1\163",
			"\1\165",
			"\1\166",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\167\5\55",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177\2\uffff\1\u0080",
			"\1\u0082\11\uffff\1\u0081",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"",
			"",
			"\1\141\1\uffff\10\140\2\141\12\uffff\3\141\35\uffff\3\141",
			"",
			"\1\141\1\uffff\12\142\12\uffff\3\141\35\uffff\3\141",
			"",
			"\1\63",
			"",
			"\1\63",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"",
			"\1\u009b",
			"\1\u009c",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u009e",
			"\1\u009f\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"",
			"",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u00ae",
			"",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u00bc",
			"\1\u00bd",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u00c5",
			"\1\u00c6",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"",
			"",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u00d5",
			"",
			"\1\u00d6",
			"\1\u00d7",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u00d8",
			"",
			"",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u00dd",
			"\1\u00de",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u00e1",
			"",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"",
			"",
			"",
			"",
			"\1\u00e6",
			"\1\u00e7",
			"",
			"",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			"\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
			""
	};

	static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
	static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
	static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
	static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
	static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
	static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
	static final short[][] DFA47_transition;

	static {
		int numStates = DFA47_transitionS.length;
		DFA47_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
		}
	}

	protected class DFA47 extends DFA {

		public DFA47(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 47;
			this.eot = DFA47_eot;
			this.eof = DFA47_eof;
			this.min = DFA47_min;
			this.max = DFA47_max;
			this.accept = DFA47_accept;
			this.special = DFA47_special;
			this.transition = DFA47_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | BASIC_TYPE | SIGN | EXTEND_TYPE | TYPEDEF | TYPE_MODIFIER | NULL_PTR | STORAGE_CLASS_SPECIFIER | INLINE | FLOW_CONTROL | FOR | WHILE | DO | LOOP_CTRL | JUMP | SIZEOF | LITERAL_STRING | LITERAL_CHAR | DECIMAL_INT | HEX_INT | OCTAL_INT | FLOAT | PARENTHESES_LEFT | PARENTHESES_RIGHT | SQUARE_BRACKETS_LEFT | SQUARE_BRACKETS_RIGHT | CURLY_BRACKETS_LEFT | CURLY_BRACKETS_RIGHT | COLON | SEMI_COLON | COMMA | DOT | ARROW | QUESTION | LOGICAL_EQUALITY_OPERATOR | SHIFT_OPERATOR | COMPARISON_OPERATOR | ASSIGN_OPERATOR | ID | WS | NEW_LINE | COMMENT | LINE_COMMENT | LINE_COMMAND );";
		}
	}

}
