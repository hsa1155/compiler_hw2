// $ANTLR 3.5.2 myparser.g 2022-04-17 18:35:13

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myparserParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "ASSIGN_OPERATOR", "BASIC_TYPE", 
		"COLON", "COMMA", "COMMENT", "COMPARISON_OPERATOR", "CURLY_BRACKETS_LEFT", 
		"CURLY_BRACKETS_RIGHT", "DECIMAL_INT", "DIGIT", "DO", "DOT", "EXTEND_TYPE", 
		"EscapeSequence", "FLOAT", "FLOW_CONTROL", "FOR", "HEX_INT", "ID", "INLINE", 
		"JUMP", "LETTER", "LINE_COMMAND", "LINE_COMMENT", "LITERAL_CHAR", "LITERAL_STRING", 
		"LOGICAL_EQUALITY_OPERATOR", "LOOP_CTRL", "NEW_LINE", "NULL_PTR", "OCTAL_INT", 
		"OctalEscape", "PARENTHESES_LEFT", "PARENTHESES_RIGHT", "QUESTION", "SEMI_COLON", 
		"SHIFT_OPERATOR", "SIGN", "SIZEOF", "SQUARE_BRACKETS_LEFT", "SQUARE_BRACKETS_RIGHT", 
		"STORAGE_CLASS_SPECIFIER", "TYPEDEF", "TYPE_MODIFIER", "WHILE", "WS", 
		"'!'", "'%'", "'&&'", "'&'", "'*'", "'+'", "'++'", "'-'", "'--'", "'/'", 
		"'='", "'^'", "'else'", "'if'", "'return'", "'|'", "'||'", "'~'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myparserParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myparserParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[105+1];


	}

	@Override public String[] getTokenNames() { return myparserParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myparser.g"; }


	    boolean TRACEON = true;
	    boolean SUPER_TRACEON = false;



	// $ANTLR start "global_decelaration"
	// myparser.g:14:1: global_decelaration : ( var_decelartion | func_decelartion )+ ;
	public final void global_decelaration() throws RecognitionException {
		int global_decelaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// myparser.g:15:6: ( ( var_decelartion | func_decelartion )+ )
			// myparser.g:15:7: ( var_decelartion | func_decelartion )+
			{
			// myparser.g:15:7: ( var_decelartion | func_decelartion )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==SIGN||LA1_0==STORAGE_CLASS_SPECIFIER||LA1_0==TYPE_MODIFIER) ) {
					alt1=1;
				}
				else if ( (LA1_0==BASIC_TYPE) ) {
					switch ( input.LA(2) ) {
					case 55:
						{
						switch ( input.LA(3) ) {
						case DECIMAL_INT:
						case FLOAT:
						case HEX_INT:
						case LITERAL_CHAR:
						case LITERAL_STRING:
						case OCTAL_INT:
						case PARENTHESES_LEFT:
						case SIZEOF:
						case 51:
						case 54:
						case 57:
						case 58:
						case 59:
						case 68:
							{
							alt1=1;
							}
							break;
						case 55:
							{
							switch ( input.LA(4) ) {
							case DECIMAL_INT:
							case FLOAT:
							case HEX_INT:
							case LITERAL_CHAR:
							case LITERAL_STRING:
							case OCTAL_INT:
							case PARENTHESES_LEFT:
							case SIZEOF:
							case 51:
							case 54:
							case 57:
							case 58:
							case 59:
							case 68:
								{
								alt1=1;
								}
								break;
							case 55:
								{
								switch ( input.LA(5) ) {
								case DECIMAL_INT:
								case FLOAT:
								case HEX_INT:
								case LITERAL_CHAR:
								case LITERAL_STRING:
								case OCTAL_INT:
								case PARENTHESES_LEFT:
								case SIZEOF:
								case 51:
								case 54:
								case 57:
								case 58:
								case 59:
								case 68:
									{
									alt1=1;
									}
									break;
								case 55:
									{
									switch ( input.LA(6) ) {
									case DECIMAL_INT:
									case FLOAT:
									case HEX_INT:
									case LITERAL_CHAR:
									case LITERAL_STRING:
									case OCTAL_INT:
									case PARENTHESES_LEFT:
									case SIZEOF:
									case 51:
									case 54:
									case 57:
									case 58:
									case 59:
									case 68:
										{
										alt1=1;
										}
										break;
									case 55:
										{
										int LA1_18 = input.LA(7);
										if ( (synpred1_myparser()) ) {
											alt1=1;
										}
										else if ( (synpred2_myparser()) ) {
											alt1=2;
										}

										}
										break;
									case ID:
										{
										int LA1_19 = input.LA(7);
										if ( (LA1_19==PARENTHESES_LEFT) ) {
											switch ( input.LA(8) ) {
											case DECIMAL_INT:
											case FLOAT:
											case HEX_INT:
											case ID:
											case LITERAL_CHAR:
											case LITERAL_STRING:
											case OCTAL_INT:
											case PARENTHESES_LEFT:
											case SIZEOF:
											case 51:
											case 54:
											case 55:
											case 57:
											case 58:
											case 59:
											case 68:
												{
												alt1=1;
												}
												break;
											case PARENTHESES_RIGHT:
												{
												int LA1_24 = input.LA(9);
												if ( (LA1_24==CURLY_BRACKETS_LEFT) ) {
													alt1=2;
												}
												else if ( (LA1_24==ASSIGN_OPERATOR||LA1_24==COMMA||LA1_24==COMPARISON_OPERATOR||LA1_24==LOGICAL_EQUALITY_OPERATOR||(LA1_24 >= QUESTION && LA1_24 <= SHIFT_OPERATOR)||(LA1_24 >= 52 && LA1_24 <= 56)||LA1_24==58||(LA1_24 >= 60 && LA1_24 <= 62)||(LA1_24 >= 66 && LA1_24 <= 67)) ) {
													alt1=1;
												}

												}
												break;
											case BASIC_TYPE:
												{
												alt1=2;
												}
												break;
											}
										}
										else if ( ((LA1_19 >= ARROW && LA1_19 <= ASSIGN_OPERATOR)||LA1_19==COMMA||LA1_19==COMPARISON_OPERATOR||LA1_19==DOT||LA1_19==LOGICAL_EQUALITY_OPERATOR||(LA1_19 >= QUESTION && LA1_19 <= SHIFT_OPERATOR)||LA1_19==SQUARE_BRACKETS_LEFT||(LA1_19 >= 52 && LA1_19 <= 62)||(LA1_19 >= 66 && LA1_19 <= 67)) ) {
											alt1=1;
										}

										}
										break;
									}
									}
									break;
								case ID:
									{
									int LA1_15 = input.LA(6);
									if ( (LA1_15==PARENTHESES_LEFT) ) {
										switch ( input.LA(7) ) {
										case DECIMAL_INT:
										case FLOAT:
										case HEX_INT:
										case ID:
										case LITERAL_CHAR:
										case LITERAL_STRING:
										case OCTAL_INT:
										case PARENTHESES_LEFT:
										case SIZEOF:
										case 51:
										case 54:
										case 55:
										case 57:
										case 58:
										case 59:
										case 68:
											{
											alt1=1;
											}
											break;
										case PARENTHESES_RIGHT:
											{
											int LA1_23 = input.LA(8);
											if ( (LA1_23==CURLY_BRACKETS_LEFT) ) {
												alt1=2;
											}
											else if ( (LA1_23==ASSIGN_OPERATOR||LA1_23==COMMA||LA1_23==COMPARISON_OPERATOR||LA1_23==LOGICAL_EQUALITY_OPERATOR||(LA1_23 >= QUESTION && LA1_23 <= SHIFT_OPERATOR)||(LA1_23 >= 52 && LA1_23 <= 56)||LA1_23==58||(LA1_23 >= 60 && LA1_23 <= 62)||(LA1_23 >= 66 && LA1_23 <= 67)) ) {
												alt1=1;
											}

											}
											break;
										case BASIC_TYPE:
											{
											alt1=2;
											}
											break;
										}
									}
									else if ( ((LA1_15 >= ARROW && LA1_15 <= ASSIGN_OPERATOR)||LA1_15==COMMA||LA1_15==COMPARISON_OPERATOR||LA1_15==DOT||LA1_15==LOGICAL_EQUALITY_OPERATOR||(LA1_15 >= QUESTION && LA1_15 <= SHIFT_OPERATOR)||LA1_15==SQUARE_BRACKETS_LEFT||(LA1_15 >= 52 && LA1_15 <= 62)||(LA1_15 >= 66 && LA1_15 <= 67)) ) {
										alt1=1;
									}

									}
									break;
								}
								}
								break;
							case ID:
								{
								int LA1_10 = input.LA(5);
								if ( (LA1_10==PARENTHESES_LEFT) ) {
									switch ( input.LA(6) ) {
									case DECIMAL_INT:
									case FLOAT:
									case HEX_INT:
									case ID:
									case LITERAL_CHAR:
									case LITERAL_STRING:
									case OCTAL_INT:
									case PARENTHESES_LEFT:
									case SIZEOF:
									case 51:
									case 54:
									case 55:
									case 57:
									case 58:
									case 59:
									case 68:
										{
										alt1=1;
										}
										break;
									case PARENTHESES_RIGHT:
										{
										int LA1_21 = input.LA(7);
										if ( (LA1_21==CURLY_BRACKETS_LEFT) ) {
											alt1=2;
										}
										else if ( (LA1_21==ASSIGN_OPERATOR||LA1_21==COMMA||LA1_21==COMPARISON_OPERATOR||LA1_21==LOGICAL_EQUALITY_OPERATOR||(LA1_21 >= QUESTION && LA1_21 <= SHIFT_OPERATOR)||(LA1_21 >= 52 && LA1_21 <= 56)||LA1_21==58||(LA1_21 >= 60 && LA1_21 <= 62)||(LA1_21 >= 66 && LA1_21 <= 67)) ) {
											alt1=1;
										}

										}
										break;
									case BASIC_TYPE:
										{
										alt1=2;
										}
										break;
									}
								}
								else if ( ((LA1_10 >= ARROW && LA1_10 <= ASSIGN_OPERATOR)||LA1_10==COMMA||LA1_10==COMPARISON_OPERATOR||LA1_10==DOT||LA1_10==LOGICAL_EQUALITY_OPERATOR||(LA1_10 >= QUESTION && LA1_10 <= SHIFT_OPERATOR)||LA1_10==SQUARE_BRACKETS_LEFT||(LA1_10 >= 52 && LA1_10 <= 62)||(LA1_10 >= 66 && LA1_10 <= 67)) ) {
									alt1=1;
								}

								}
								break;
							}
							}
							break;
						case ID:
							{
							int LA1_7 = input.LA(4);
							if ( (LA1_7==PARENTHESES_LEFT) ) {
								switch ( input.LA(5) ) {
								case DECIMAL_INT:
								case FLOAT:
								case HEX_INT:
								case ID:
								case LITERAL_CHAR:
								case LITERAL_STRING:
								case OCTAL_INT:
								case PARENTHESES_LEFT:
								case SIZEOF:
								case 51:
								case 54:
								case 55:
								case 57:
								case 58:
								case 59:
								case 68:
									{
									alt1=1;
									}
									break;
								case PARENTHESES_RIGHT:
									{
									int LA1_17 = input.LA(6);
									if ( (LA1_17==CURLY_BRACKETS_LEFT) ) {
										alt1=2;
									}
									else if ( (LA1_17==ASSIGN_OPERATOR||LA1_17==COMMA||LA1_17==COMPARISON_OPERATOR||LA1_17==LOGICAL_EQUALITY_OPERATOR||(LA1_17 >= QUESTION && LA1_17 <= SHIFT_OPERATOR)||(LA1_17 >= 52 && LA1_17 <= 56)||LA1_17==58||(LA1_17 >= 60 && LA1_17 <= 62)||(LA1_17 >= 66 && LA1_17 <= 67)) ) {
										alt1=1;
									}

									}
									break;
								case BASIC_TYPE:
									{
									alt1=2;
									}
									break;
								}
							}
							else if ( ((LA1_7 >= ARROW && LA1_7 <= ASSIGN_OPERATOR)||LA1_7==COMMA||LA1_7==COMPARISON_OPERATOR||LA1_7==DOT||LA1_7==LOGICAL_EQUALITY_OPERATOR||(LA1_7 >= QUESTION && LA1_7 <= SHIFT_OPERATOR)||LA1_7==SQUARE_BRACKETS_LEFT||(LA1_7 >= 52 && LA1_7 <= 62)||(LA1_7 >= 66 && LA1_7 <= 67)) ) {
								alt1=1;
							}

							}
							break;
						}
						}
						break;
					case DECIMAL_INT:
					case FLOAT:
					case HEX_INT:
					case LITERAL_CHAR:
					case LITERAL_STRING:
					case OCTAL_INT:
					case PARENTHESES_LEFT:
					case SIZEOF:
					case 51:
					case 54:
					case 57:
					case 58:
					case 59:
					case 68:
						{
						alt1=1;
						}
						break;
					case ID:
						{
						int LA1_5 = input.LA(3);
						if ( (LA1_5==PARENTHESES_LEFT) ) {
							switch ( input.LA(4) ) {
							case DECIMAL_INT:
							case FLOAT:
							case HEX_INT:
							case ID:
							case LITERAL_CHAR:
							case LITERAL_STRING:
							case OCTAL_INT:
							case PARENTHESES_LEFT:
							case SIZEOF:
							case 51:
							case 54:
							case 55:
							case 57:
							case 58:
							case 59:
							case 68:
								{
								alt1=1;
								}
								break;
							case PARENTHESES_RIGHT:
								{
								int LA1_12 = input.LA(5);
								if ( (LA1_12==CURLY_BRACKETS_LEFT) ) {
									alt1=2;
								}
								else if ( (LA1_12==ASSIGN_OPERATOR||LA1_12==COMMA||LA1_12==COMPARISON_OPERATOR||LA1_12==LOGICAL_EQUALITY_OPERATOR||(LA1_12 >= QUESTION && LA1_12 <= SHIFT_OPERATOR)||(LA1_12 >= 52 && LA1_12 <= 56)||LA1_12==58||(LA1_12 >= 60 && LA1_12 <= 62)||(LA1_12 >= 66 && LA1_12 <= 67)) ) {
									alt1=1;
								}

								}
								break;
							case BASIC_TYPE:
								{
								alt1=2;
								}
								break;
							}
						}
						else if ( ((LA1_5 >= ARROW && LA1_5 <= ASSIGN_OPERATOR)||LA1_5==COMMA||LA1_5==COMPARISON_OPERATOR||LA1_5==DOT||LA1_5==LOGICAL_EQUALITY_OPERATOR||(LA1_5 >= QUESTION && LA1_5 <= SHIFT_OPERATOR)||LA1_5==SQUARE_BRACKETS_LEFT||(LA1_5 >= 52 && LA1_5 <= 62)||(LA1_5 >= 66 && LA1_5 <= 67)) ) {
							alt1=1;
						}

						}
						break;
					}
				}

				switch (alt1) {
				case 1 :
					// myparser.g:15:9: var_decelartion
					{
					pushFollow(FOLLOW_var_decelartion_in_global_decelaration53);
					var_decelartion();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("global_decelaration : var_decelartion\n ");}
					}
					break;
				case 2 :
					// myparser.g:16:7: func_decelartion
					{
					pushFollow(FOLLOW_func_decelartion_in_global_decelaration63);
					func_decelartion();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("global_decelaration : func_decelartion\n");}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, global_decelaration_StartIndex); }

		}
	}
	// $ANTLR end "global_decelaration"



	// $ANTLR start "func_decelartion"
	// myparser.g:19:1: func_decelartion : decelartion '(' ( parameter_decelartion )? ')' '{' statments '}' ;
	public final void func_decelartion() throws RecognitionException {
		int func_decelartion_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// myparser.g:20:4: ( decelartion '(' ( parameter_decelartion )? ')' '{' statments '}' )
			// myparser.g:20:5: decelartion '(' ( parameter_decelartion )? ')' '{' statments '}'
			{
			pushFollow(FOLLOW_decelartion_in_func_decelartion85);
			decelartion();
			state._fsp--;
			if (state.failed) return;
			match(input,PARENTHESES_LEFT,FOLLOW_PARENTHESES_LEFT_in_func_decelartion86); if (state.failed) return;
			// myparser.g:20:20: ( parameter_decelartion )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==BASIC_TYPE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// myparser.g:20:20: parameter_decelartion
					{
					pushFollow(FOLLOW_parameter_decelartion_in_func_decelartion88);
					parameter_decelartion();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,PARENTHESES_RIGHT,FOLLOW_PARENTHESES_RIGHT_in_func_decelartion91); if (state.failed) return;
			match(input,CURLY_BRACKETS_LEFT,FOLLOW_CURLY_BRACKETS_LEFT_in_func_decelartion93); if (state.failed) return;
			pushFollow(FOLLOW_statments_in_func_decelartion95);
			statments();
			state._fsp--;
			if (state.failed) return;
			match(input,CURLY_BRACKETS_RIGHT,FOLLOW_CURLY_BRACKETS_RIGHT_in_func_decelartion96); if (state.failed) return;
			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("func_decelartion : decelartion'(' parameter_decelartion? ')' '{' statments'}' ");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, func_decelartion_StartIndex); }

		}
	}
	// $ANTLR end "func_decelartion"



	// $ANTLR start "parameter_decelartion"
	// myparser.g:23:1: parameter_decelartion : ( decelartion ) ( ',' decelartion )* ;
	public final void parameter_decelartion() throws RecognitionException {
		int parameter_decelartion_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// myparser.g:24:2: ( ( decelartion ) ( ',' decelartion )* )
			// myparser.g:24:3: ( decelartion ) ( ',' decelartion )*
			{
			// myparser.g:24:3: ( decelartion )
			// myparser.g:24:4: decelartion
			{
			pushFollow(FOLLOW_decelartion_in_parameter_decelartion111);
			decelartion();
			state._fsp--;
			if (state.failed) return;
			}

			// myparser.g:24:16: ( ',' decelartion )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myparser.g:24:17: ',' decelartion
					{
					match(input,COMMA,FOLLOW_COMMA_in_parameter_decelartion114); if (state.failed) return;
					pushFollow(FOLLOW_decelartion_in_parameter_decelartion115);
					decelartion();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("parameter_decelartion : (decelartion)(','decelartion)*");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, parameter_decelartion_StartIndex); }

		}
	}
	// $ANTLR end "parameter_decelartion"



	// $ANTLR start "var_decelartion"
	// myparser.g:28:1: var_decelartion : ( var_decelartion_prefix )* BASIC_TYPE ( '*' )* arith_expr ';' ;
	public final void var_decelartion() throws RecognitionException {
		int var_decelartion_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// myparser.g:29:2: ( ( var_decelartion_prefix )* BASIC_TYPE ( '*' )* arith_expr ';' )
			// myparser.g:29:3: ( var_decelartion_prefix )* BASIC_TYPE ( '*' )* arith_expr ';'
			{
			// myparser.g:29:3: ( var_decelartion_prefix )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==SIGN||LA4_0==STORAGE_CLASS_SPECIFIER||LA4_0==TYPE_MODIFIER) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myparser.g:29:3: var_decelartion_prefix
					{
					pushFollow(FOLLOW_var_decelartion_prefix_in_var_decelartion132);
					var_decelartion_prefix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,BASIC_TYPE,FOLLOW_BASIC_TYPE_in_var_decelartion136); if (state.failed) return;
			// myparser.g:29:39: ( '*' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==55) ) {
					int LA5_5 = input.LA(2);
					if ( (synpred6_myparser()) ) {
						alt5=1;
					}

				}

				switch (alt5) {
				case 1 :
					// myparser.g:29:39: '*'
					{
					match(input,55,FOLLOW_55_in_var_decelartion138); if (state.failed) return;
					}
					break;

				default :
					break loop5;
				}
			}

			pushFollow(FOLLOW_arith_expr_in_var_decelartion141);
			arith_expr();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_var_decelartion148); if (state.failed) return;
			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("var_decelartion_prefix* decelartion (('='(arith_expr))?|('['arith_expr ']')+)';'");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, var_decelartion_StartIndex); }

		}
	}
	// $ANTLR end "var_decelartion"



	// $ANTLR start "var_decelartion_prefix"
	// myparser.g:33:1: var_decelartion_prefix : ( STORAGE_CLASS_SPECIFIER | TYPE_MODIFIER | SIGN ) ;
	public final void var_decelartion_prefix() throws RecognitionException {
		int var_decelartion_prefix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// myparser.g:34:2: ( ( STORAGE_CLASS_SPECIFIER | TYPE_MODIFIER | SIGN ) )
			// myparser.g:34:3: ( STORAGE_CLASS_SPECIFIER | TYPE_MODIFIER | SIGN )
			{
			if ( input.LA(1)==SIGN||input.LA(1)==STORAGE_CLASS_SPECIFIER||input.LA(1)==TYPE_MODIFIER ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("var_decelartion_prefix : (STORAGE_CLASS_SPECIFIER |TYPE_MODIFIER| SIGN)");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, var_decelartion_prefix_StartIndex); }

		}
	}
	// $ANTLR end "var_decelartion_prefix"



	// $ANTLR start "decelartion"
	// myparser.g:37:1: decelartion : BASIC_TYPE ( '*' )* ID ;
	public final void decelartion() throws RecognitionException {
		int decelartion_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// myparser.g:38:2: ( BASIC_TYPE ( '*' )* ID )
			// myparser.g:38:3: BASIC_TYPE ( '*' )* ID
			{
			match(input,BASIC_TYPE,FOLLOW_BASIC_TYPE_in_decelartion181); if (state.failed) return;
			// myparser.g:38:14: ( '*' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==55) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myparser.g:38:14: '*'
					{
					match(input,55,FOLLOW_55_in_decelartion183); if (state.failed) return;
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,ID,FOLLOW_ID_in_decelartion186); if (state.failed) return;
			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("decelartion : BASIC_TYPE '*'* ID;");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, decelartion_StartIndex); }

		}
	}
	// $ANTLR end "decelartion"



	// $ANTLR start "constant"
	// myparser.g:41:1: constant : ( LITERAL_STRING | LITERAL_CHAR | DECIMAL_INT | HEX_INT | OCTAL_INT | FLOAT );
	public final void constant() throws RecognitionException {
		int constant_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// myparser.g:42:2: ( LITERAL_STRING | LITERAL_CHAR | DECIMAL_INT | HEX_INT | OCTAL_INT | FLOAT )
			int alt7=6;
			switch ( input.LA(1) ) {
			case LITERAL_STRING:
				{
				alt7=1;
				}
				break;
			case LITERAL_CHAR:
				{
				alt7=2;
				}
				break;
			case DECIMAL_INT:
				{
				alt7=3;
				}
				break;
			case HEX_INT:
				{
				alt7=4;
				}
				break;
			case OCTAL_INT:
				{
				alt7=5;
				}
				break;
			case FLOAT:
				{
				alt7=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// myparser.g:42:3: LITERAL_STRING
					{
					match(input,LITERAL_STRING,FOLLOW_LITERAL_STRING_in_constant198); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("constant : LITERAL_STRING");}
					}
					break;
				case 2 :
					// myparser.g:43:3: LITERAL_CHAR
					{
					match(input,LITERAL_CHAR,FOLLOW_LITERAL_CHAR_in_constant204); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("constant : LITERAL_CHAR");}
					}
					break;
				case 3 :
					// myparser.g:44:3: DECIMAL_INT
					{
					match(input,DECIMAL_INT,FOLLOW_DECIMAL_INT_in_constant212); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("constant : DECIMAL_INT ");}
					}
					break;
				case 4 :
					// myparser.g:45:3: HEX_INT
					{
					match(input,HEX_INT,FOLLOW_HEX_INT_in_constant221); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("constant : HEX_INT");}
					}
					break;
				case 5 :
					// myparser.g:46:3: OCTAL_INT
					{
					match(input,OCTAL_INT,FOLLOW_OCTAL_INT_in_constant234); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("constant : OCTAL_INT");}
					}
					break;
				case 6 :
					// myparser.g:47:3: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_constant245); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("constant : FLOAT ");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, constant_StartIndex); }

		}
	}
	// $ANTLR end "constant"



	// $ANTLR start "constant_num"
	// myparser.g:50:1: constant_num : ( DECIMAL_INT | HEX_INT | OCTAL_INT | FLOAT );
	public final void constant_num() throws RecognitionException {
		int constant_num_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// myparser.g:51:5: ( DECIMAL_INT | HEX_INT | OCTAL_INT | FLOAT )
			int alt8=4;
			switch ( input.LA(1) ) {
			case DECIMAL_INT:
				{
				alt8=1;
				}
				break;
			case HEX_INT:
				{
				alt8=2;
				}
				break;
			case OCTAL_INT:
				{
				alt8=3;
				}
				break;
			case FLOAT:
				{
				alt8=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// myparser.g:51:6: DECIMAL_INT
					{
					match(input,DECIMAL_INT,FOLLOW_DECIMAL_INT_in_constant_num269); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("constant_num : DECIMAL_INT ");}
					}
					break;
				case 2 :
					// myparser.g:52:3: HEX_INT
					{
					match(input,HEX_INT,FOLLOW_HEX_INT_in_constant_num278); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("constant_num : HEX_INT");}
					}
					break;
				case 3 :
					// myparser.g:53:3: OCTAL_INT
					{
					match(input,OCTAL_INT,FOLLOW_OCTAL_INT_in_constant_num291); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("constant_num : OCTAL_INT");}
					}
					break;
				case 4 :
					// myparser.g:54:3: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_constant_num302); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("constant_num : FLOAT ");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, constant_num_StartIndex); }

		}
	}
	// $ANTLR end "constant_num"



	// $ANTLR start "statments"
	// myparser.g:57:1: statments : ( statment )* ;
	public final void statments() throws RecognitionException {
		int statments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// myparser.g:58:2: ( ( statment )* )
			// myparser.g:58:3: ( statment )*
			{
			// myparser.g:58:3: ( statment )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==BASIC_TYPE||LA9_0==DECIMAL_INT||LA9_0==DO||LA9_0==FLOAT||(LA9_0 >= FOR && LA9_0 <= ID)||(LA9_0 >= LITERAL_CHAR && LA9_0 <= LITERAL_STRING)||LA9_0==LOOP_CTRL||LA9_0==OCTAL_INT||LA9_0==PARENTHESES_LEFT||LA9_0==SEMI_COLON||(LA9_0 >= SIGN && LA9_0 <= SIZEOF)||LA9_0==STORAGE_CLASS_SPECIFIER||(LA9_0 >= TYPE_MODIFIER && LA9_0 <= WHILE)||LA9_0==51||(LA9_0 >= 54 && LA9_0 <= 55)||(LA9_0 >= 57 && LA9_0 <= 59)||(LA9_0 >= 64 && LA9_0 <= 65)||LA9_0==68) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myparser.g:58:3: statment
					{
					pushFollow(FOLLOW_statment_in_statments324);
					statment();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop9;
				}
			}

			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statments:statment*");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, statments_StartIndex); }

		}
	}
	// $ANTLR end "statments"



	// $ANTLR start "statment"
	// myparser.g:61:1: statment : ( arith_expr ';' | var_decelartion | loop_statment | LOOP_CTRL ';' | 'return' ( arith_expr )? ';' | if_statment | ';' );
	public final void statment() throws RecognitionException {
		int statment_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// myparser.g:62:2: ( arith_expr ';' | var_decelartion | loop_statment | LOOP_CTRL ';' | 'return' ( arith_expr )? ';' | if_statment | ';' )
			int alt11=7;
			switch ( input.LA(1) ) {
			case DECIMAL_INT:
			case FLOAT:
			case HEX_INT:
			case ID:
			case LITERAL_CHAR:
			case LITERAL_STRING:
			case OCTAL_INT:
			case PARENTHESES_LEFT:
			case SIZEOF:
			case 51:
			case 54:
			case 55:
			case 57:
			case 58:
			case 59:
			case 68:
				{
				alt11=1;
				}
				break;
			case BASIC_TYPE:
			case SIGN:
			case STORAGE_CLASS_SPECIFIER:
			case TYPE_MODIFIER:
				{
				alt11=2;
				}
				break;
			case DO:
			case FOR:
			case WHILE:
				{
				alt11=3;
				}
				break;
			case LOOP_CTRL:
				{
				alt11=4;
				}
				break;
			case 65:
				{
				alt11=5;
				}
				break;
			case 64:
				{
				alt11=6;
				}
				break;
			case SEMI_COLON:
				{
				alt11=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// myparser.g:63:2: arith_expr ';'
					{
					pushFollow(FOLLOW_arith_expr_in_statment339);
					arith_expr();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_statment340); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statment:arith_expr';'\n");}
					}
					break;
				case 2 :
					// myparser.g:64:3: var_decelartion
					{
					pushFollow(FOLLOW_var_decelartion_in_statment345);
					var_decelartion();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statment:var_decelartion\n");}
					}
					break;
				case 3 :
					// myparser.g:65:3: loop_statment
					{
					pushFollow(FOLLOW_loop_statment_in_statment352);
					loop_statment();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statment:loop_statment\n");}
					}
					break;
				case 4 :
					// myparser.g:66:3: LOOP_CTRL ';'
					{
					match(input,LOOP_CTRL,FOLLOW_LOOP_CTRL_in_statment358); if (state.failed) return;
					match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_statment360); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statment:LOOP_CTRL ';'\n");}
					}
					break;
				case 5 :
					// myparser.g:67:3: 'return' ( arith_expr )? ';'
					{
					match(input,65,FOLLOW_65_in_statment366); if (state.failed) return;
					// myparser.g:67:12: ( arith_expr )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==DECIMAL_INT||LA10_0==FLOAT||(LA10_0 >= HEX_INT && LA10_0 <= ID)||(LA10_0 >= LITERAL_CHAR && LA10_0 <= LITERAL_STRING)||LA10_0==OCTAL_INT||LA10_0==PARENTHESES_LEFT||LA10_0==SIZEOF||LA10_0==51||(LA10_0 >= 54 && LA10_0 <= 55)||(LA10_0 >= 57 && LA10_0 <= 59)||LA10_0==68) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// myparser.g:67:12: arith_expr
							{
							pushFollow(FOLLOW_arith_expr_in_statment368);
							arith_expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_statment371); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statment:'return' arith_expr? ';'\n");}
					}
					break;
				case 6 :
					// myparser.g:68:3: if_statment
					{
					pushFollow(FOLLOW_if_statment_in_statment377);
					if_statment();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statment:if_statment\n");}
					}
					break;
				case 7 :
					// myparser.g:69:3: ';'
					{
					match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_statment383); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statment:';'\n");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, statment_StartIndex); }

		}
	}
	// $ANTLR end "statment"



	// $ANTLR start "loop_statment"
	// myparser.g:72:1: loop_statment : ( WHILE '(' arith_expr ')' ( statment | ( '{' statments '}' ) ) | DO ( statment | ( '{' statments '}' ) ) WHILE '(' arith_expr ')' ';' | FOR '(' ( ( BASIC_TYPE arith_expr ) | ( arith_expr )? ) ';' ( arith_expr )? ';' ( arith_expr )? ')' ( statment | ( '{' statments '}' ) ) );
	public final void loop_statment() throws RecognitionException {
		int loop_statment_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// myparser.g:73:2: ( WHILE '(' arith_expr ')' ( statment | ( '{' statments '}' ) ) | DO ( statment | ( '{' statments '}' ) ) WHILE '(' arith_expr ')' ';' | FOR '(' ( ( BASIC_TYPE arith_expr ) | ( arith_expr )? ) ';' ( arith_expr )? ';' ( arith_expr )? ')' ( statment | ( '{' statments '}' ) ) )
			int alt19=3;
			switch ( input.LA(1) ) {
			case WHILE:
				{
				alt19=1;
				}
				break;
			case DO:
				{
				alt19=2;
				}
				break;
			case FOR:
				{
				alt19=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// myparser.g:73:3: WHILE '(' arith_expr ')' ( statment | ( '{' statments '}' ) )
					{
					match(input,WHILE,FOLLOW_WHILE_in_loop_statment395); if (state.failed) return;
					match(input,PARENTHESES_LEFT,FOLLOW_PARENTHESES_LEFT_in_loop_statment396); if (state.failed) return;
					pushFollow(FOLLOW_arith_expr_in_loop_statment397);
					arith_expr();
					state._fsp--;
					if (state.failed) return;
					match(input,PARENTHESES_RIGHT,FOLLOW_PARENTHESES_RIGHT_in_loop_statment399); if (state.failed) return;
					// myparser.g:73:26: ( statment | ( '{' statments '}' ) )
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==BASIC_TYPE||LA12_0==DECIMAL_INT||LA12_0==DO||LA12_0==FLOAT||(LA12_0 >= FOR && LA12_0 <= ID)||(LA12_0 >= LITERAL_CHAR && LA12_0 <= LITERAL_STRING)||LA12_0==LOOP_CTRL||LA12_0==OCTAL_INT||LA12_0==PARENTHESES_LEFT||LA12_0==SEMI_COLON||(LA12_0 >= SIGN && LA12_0 <= SIZEOF)||LA12_0==STORAGE_CLASS_SPECIFIER||(LA12_0 >= TYPE_MODIFIER && LA12_0 <= WHILE)||LA12_0==51||(LA12_0 >= 54 && LA12_0 <= 55)||(LA12_0 >= 57 && LA12_0 <= 59)||(LA12_0 >= 64 && LA12_0 <= 65)||LA12_0==68) ) {
						alt12=1;
					}
					else if ( (LA12_0==CURLY_BRACKETS_LEFT) ) {
						alt12=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}

					switch (alt12) {
						case 1 :
							// myparser.g:73:27: statment
							{
							pushFollow(FOLLOW_statment_in_loop_statment402);
							statment();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// myparser.g:73:36: ( '{' statments '}' )
							{
							// myparser.g:73:36: ( '{' statments '}' )
							// myparser.g:73:37: '{' statments '}'
							{
							match(input,CURLY_BRACKETS_LEFT,FOLLOW_CURLY_BRACKETS_LEFT_in_loop_statment405); if (state.failed) return;
							pushFollow(FOLLOW_statments_in_loop_statment407);
							statments();
							state._fsp--;
							if (state.failed) return;
							match(input,CURLY_BRACKETS_RIGHT,FOLLOW_CURLY_BRACKETS_RIGHT_in_loop_statment409); if (state.failed) return;
							}

							}
							break;

					}

					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("loop_statment:WHILE'('arith_expr ')' (statment|('{' statments '}' )  )");}
					}
					break;
				case 2 :
					// myparser.g:74:3: DO ( statment | ( '{' statments '}' ) ) WHILE '(' arith_expr ')' ';'
					{
					match(input,DO,FOLLOW_DO_in_loop_statment420); if (state.failed) return;
					// myparser.g:74:6: ( statment | ( '{' statments '}' ) )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==BASIC_TYPE||LA13_0==DECIMAL_INT||LA13_0==DO||LA13_0==FLOAT||(LA13_0 >= FOR && LA13_0 <= ID)||(LA13_0 >= LITERAL_CHAR && LA13_0 <= LITERAL_STRING)||LA13_0==LOOP_CTRL||LA13_0==OCTAL_INT||LA13_0==PARENTHESES_LEFT||LA13_0==SEMI_COLON||(LA13_0 >= SIGN && LA13_0 <= SIZEOF)||LA13_0==STORAGE_CLASS_SPECIFIER||(LA13_0 >= TYPE_MODIFIER && LA13_0 <= WHILE)||LA13_0==51||(LA13_0 >= 54 && LA13_0 <= 55)||(LA13_0 >= 57 && LA13_0 <= 59)||(LA13_0 >= 64 && LA13_0 <= 65)||LA13_0==68) ) {
						alt13=1;
					}
					else if ( (LA13_0==CURLY_BRACKETS_LEFT) ) {
						alt13=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// myparser.g:74:7: statment
							{
							pushFollow(FOLLOW_statment_in_loop_statment423);
							statment();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// myparser.g:74:16: ( '{' statments '}' )
							{
							// myparser.g:74:16: ( '{' statments '}' )
							// myparser.g:74:17: '{' statments '}'
							{
							match(input,CURLY_BRACKETS_LEFT,FOLLOW_CURLY_BRACKETS_LEFT_in_loop_statment426); if (state.failed) return;
							pushFollow(FOLLOW_statments_in_loop_statment428);
							statments();
							state._fsp--;
							if (state.failed) return;
							match(input,CURLY_BRACKETS_RIGHT,FOLLOW_CURLY_BRACKETS_RIGHT_in_loop_statment430); if (state.failed) return;
							}

							}
							break;

					}

					match(input,WHILE,FOLLOW_WHILE_in_loop_statment436); if (state.failed) return;
					match(input,PARENTHESES_LEFT,FOLLOW_PARENTHESES_LEFT_in_loop_statment439); if (state.failed) return;
					pushFollow(FOLLOW_arith_expr_in_loop_statment440);
					arith_expr();
					state._fsp--;
					if (state.failed) return;
					match(input,PARENTHESES_RIGHT,FOLLOW_PARENTHESES_RIGHT_in_loop_statment442); if (state.failed) return;
					match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_loop_statment444); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("loop_statment:DO (statment|('{' statments '}' )  )WHILE  '('arith_expr ')' ';'");}
					}
					break;
				case 3 :
					// myparser.g:75:3: FOR '(' ( ( BASIC_TYPE arith_expr ) | ( arith_expr )? ) ';' ( arith_expr )? ';' ( arith_expr )? ')' ( statment | ( '{' statments '}' ) )
					{
					match(input,FOR,FOLLOW_FOR_in_loop_statment450); if (state.failed) return;
					match(input,PARENTHESES_LEFT,FOLLOW_PARENTHESES_LEFT_in_loop_statment452); if (state.failed) return;
					// myparser.g:75:12: ( ( BASIC_TYPE arith_expr ) | ( arith_expr )? )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==BASIC_TYPE) ) {
						alt15=1;
					}
					else if ( (LA15_0==DECIMAL_INT||LA15_0==FLOAT||(LA15_0 >= HEX_INT && LA15_0 <= ID)||(LA15_0 >= LITERAL_CHAR && LA15_0 <= LITERAL_STRING)||LA15_0==OCTAL_INT||LA15_0==PARENTHESES_LEFT||LA15_0==SEMI_COLON||LA15_0==SIZEOF||LA15_0==51||(LA15_0 >= 54 && LA15_0 <= 55)||(LA15_0 >= 57 && LA15_0 <= 59)||LA15_0==68) ) {
						alt15=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// myparser.g:75:14: ( BASIC_TYPE arith_expr )
							{
							// myparser.g:75:14: ( BASIC_TYPE arith_expr )
							// myparser.g:75:15: BASIC_TYPE arith_expr
							{
							match(input,BASIC_TYPE,FOLLOW_BASIC_TYPE_in_loop_statment458); if (state.failed) return;
							pushFollow(FOLLOW_arith_expr_in_loop_statment460);
							arith_expr();
							state._fsp--;
							if (state.failed) return;
							}

							}
							break;
						case 2 :
							// myparser.g:75:38: ( arith_expr )?
							{
							// myparser.g:75:38: ( arith_expr )?
							int alt14=2;
							int LA14_0 = input.LA(1);
							if ( (LA14_0==DECIMAL_INT||LA14_0==FLOAT||(LA14_0 >= HEX_INT && LA14_0 <= ID)||(LA14_0 >= LITERAL_CHAR && LA14_0 <= LITERAL_STRING)||LA14_0==OCTAL_INT||LA14_0==PARENTHESES_LEFT||LA14_0==SIZEOF||LA14_0==51||(LA14_0 >= 54 && LA14_0 <= 55)||(LA14_0 >= 57 && LA14_0 <= 59)||LA14_0==68) ) {
								alt14=1;
							}
							switch (alt14) {
								case 1 :
									// myparser.g:75:38: arith_expr
									{
									pushFollow(FOLLOW_arith_expr_in_loop_statment463);
									arith_expr();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							}
							break;

					}

					match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_loop_statment467); if (state.failed) return;
					// myparser.g:75:54: ( arith_expr )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==DECIMAL_INT||LA16_0==FLOAT||(LA16_0 >= HEX_INT && LA16_0 <= ID)||(LA16_0 >= LITERAL_CHAR && LA16_0 <= LITERAL_STRING)||LA16_0==OCTAL_INT||LA16_0==PARENTHESES_LEFT||LA16_0==SIZEOF||LA16_0==51||(LA16_0 >= 54 && LA16_0 <= 55)||(LA16_0 >= 57 && LA16_0 <= 59)||LA16_0==68) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// myparser.g:75:54: arith_expr
							{
							pushFollow(FOLLOW_arith_expr_in_loop_statment468);
							arith_expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_loop_statment471); if (state.failed) return;
					// myparser.g:75:70: ( arith_expr )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==DECIMAL_INT||LA17_0==FLOAT||(LA17_0 >= HEX_INT && LA17_0 <= ID)||(LA17_0 >= LITERAL_CHAR && LA17_0 <= LITERAL_STRING)||LA17_0==OCTAL_INT||LA17_0==PARENTHESES_LEFT||LA17_0==SIZEOF||LA17_0==51||(LA17_0 >= 54 && LA17_0 <= 55)||(LA17_0 >= 57 && LA17_0 <= 59)||LA17_0==68) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// myparser.g:75:70: arith_expr
							{
							pushFollow(FOLLOW_arith_expr_in_loop_statment473);
							arith_expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,PARENTHESES_RIGHT,FOLLOW_PARENTHESES_RIGHT_in_loop_statment476); if (state.failed) return;
					// myparser.g:75:86: ( statment | ( '{' statments '}' ) )
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==BASIC_TYPE||LA18_0==DECIMAL_INT||LA18_0==DO||LA18_0==FLOAT||(LA18_0 >= FOR && LA18_0 <= ID)||(LA18_0 >= LITERAL_CHAR && LA18_0 <= LITERAL_STRING)||LA18_0==LOOP_CTRL||LA18_0==OCTAL_INT||LA18_0==PARENTHESES_LEFT||LA18_0==SEMI_COLON||(LA18_0 >= SIGN && LA18_0 <= SIZEOF)||LA18_0==STORAGE_CLASS_SPECIFIER||(LA18_0 >= TYPE_MODIFIER && LA18_0 <= WHILE)||LA18_0==51||(LA18_0 >= 54 && LA18_0 <= 55)||(LA18_0 >= 57 && LA18_0 <= 59)||(LA18_0 >= 64 && LA18_0 <= 65)||LA18_0==68) ) {
						alt18=1;
					}
					else if ( (LA18_0==CURLY_BRACKETS_LEFT) ) {
						alt18=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// myparser.g:75:87: statment
							{
							pushFollow(FOLLOW_statment_in_loop_statment479);
							statment();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// myparser.g:75:96: ( '{' statments '}' )
							{
							// myparser.g:75:96: ( '{' statments '}' )
							// myparser.g:75:97: '{' statments '}'
							{
							match(input,CURLY_BRACKETS_LEFT,FOLLOW_CURLY_BRACKETS_LEFT_in_loop_statment482); if (state.failed) return;
							pushFollow(FOLLOW_statments_in_loop_statment484);
							statments();
							state._fsp--;
							if (state.failed) return;
							match(input,CURLY_BRACKETS_RIGHT,FOLLOW_CURLY_BRACKETS_RIGHT_in_loop_statment486); if (state.failed) return;
							}

							}
							break;

					}

					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("loop_statment:FOR '('  ( (BASIC_TYPE arith_expr)|arith_expr?) ';'arith_expr? ';' arith_expr? ')' (statment|('{' statments '}' )  )");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, loop_statment_StartIndex); }

		}
	}
	// $ANTLR end "loop_statment"



	// $ANTLR start "if_statment"
	// myparser.g:78:1: if_statment : 'if' '(' arith_expr ')' ( statment | ( '{' statments ) '}' ) ( 'else' ( statment | ( '{' statments ) '}' ) )? ;
	public final void if_statment() throws RecognitionException {
		int if_statment_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// myparser.g:79:2: ( 'if' '(' arith_expr ')' ( statment | ( '{' statments ) '}' ) ( 'else' ( statment | ( '{' statments ) '}' ) )? )
			// myparser.g:79:3: 'if' '(' arith_expr ')' ( statment | ( '{' statments ) '}' ) ( 'else' ( statment | ( '{' statments ) '}' ) )?
			{
			match(input,64,FOLLOW_64_in_if_statment504); if (state.failed) return;
			match(input,PARENTHESES_LEFT,FOLLOW_PARENTHESES_LEFT_in_if_statment506); if (state.failed) return;
			pushFollow(FOLLOW_arith_expr_in_if_statment508);
			arith_expr();
			state._fsp--;
			if (state.failed) return;
			match(input,PARENTHESES_RIGHT,FOLLOW_PARENTHESES_RIGHT_in_if_statment510); if (state.failed) return;
			// myparser.g:79:27: ( statment | ( '{' statments ) '}' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==BASIC_TYPE||LA20_0==DECIMAL_INT||LA20_0==DO||LA20_0==FLOAT||(LA20_0 >= FOR && LA20_0 <= ID)||(LA20_0 >= LITERAL_CHAR && LA20_0 <= LITERAL_STRING)||LA20_0==LOOP_CTRL||LA20_0==OCTAL_INT||LA20_0==PARENTHESES_LEFT||LA20_0==SEMI_COLON||(LA20_0 >= SIGN && LA20_0 <= SIZEOF)||LA20_0==STORAGE_CLASS_SPECIFIER||(LA20_0 >= TYPE_MODIFIER && LA20_0 <= WHILE)||LA20_0==51||(LA20_0 >= 54 && LA20_0 <= 55)||(LA20_0 >= 57 && LA20_0 <= 59)||(LA20_0 >= 64 && LA20_0 <= 65)||LA20_0==68) ) {
				alt20=1;
			}
			else if ( (LA20_0==CURLY_BRACKETS_LEFT) ) {
				alt20=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// myparser.g:79:30: statment
					{
					pushFollow(FOLLOW_statment_in_if_statment515);
					statment();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:79:40: ( '{' statments ) '}'
					{
					// myparser.g:79:40: ( '{' statments )
					// myparser.g:79:41: '{' statments
					{
					match(input,CURLY_BRACKETS_LEFT,FOLLOW_CURLY_BRACKETS_LEFT_in_if_statment519); if (state.failed) return;
					pushFollow(FOLLOW_statments_in_if_statment521);
					statments();
					state._fsp--;
					if (state.failed) return;
					}

					match(input,CURLY_BRACKETS_RIGHT,FOLLOW_CURLY_BRACKETS_RIGHT_in_if_statment526); if (state.failed) return;
					}
					break;

			}

			// myparser.g:79:64: ( 'else' ( statment | ( '{' statments ) '}' ) )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==63) ) {
				int LA22_1 = input.LA(2);
				if ( (synpred37_myparser()) ) {
					alt22=1;
				}
			}
			switch (alt22) {
				case 1 :
					// myparser.g:79:65: 'else' ( statment | ( '{' statments ) '}' )
					{
					match(input,63,FOLLOW_63_in_if_statment531); if (state.failed) return;
					// myparser.g:79:74: ( statment | ( '{' statments ) '}' )
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==BASIC_TYPE||LA21_0==DECIMAL_INT||LA21_0==DO||LA21_0==FLOAT||(LA21_0 >= FOR && LA21_0 <= ID)||(LA21_0 >= LITERAL_CHAR && LA21_0 <= LITERAL_STRING)||LA21_0==LOOP_CTRL||LA21_0==OCTAL_INT||LA21_0==PARENTHESES_LEFT||LA21_0==SEMI_COLON||(LA21_0 >= SIGN && LA21_0 <= SIZEOF)||LA21_0==STORAGE_CLASS_SPECIFIER||(LA21_0 >= TYPE_MODIFIER && LA21_0 <= WHILE)||LA21_0==51||(LA21_0 >= 54 && LA21_0 <= 55)||(LA21_0 >= 57 && LA21_0 <= 59)||(LA21_0 >= 64 && LA21_0 <= 65)||LA21_0==68) ) {
						alt21=1;
					}
					else if ( (LA21_0==CURLY_BRACKETS_LEFT) ) {
						alt21=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}

					switch (alt21) {
						case 1 :
							// myparser.g:79:77: statment
							{
							pushFollow(FOLLOW_statment_in_if_statment538);
							statment();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// myparser.g:79:87: ( '{' statments ) '}'
							{
							// myparser.g:79:87: ( '{' statments )
							// myparser.g:79:88: '{' statments
							{
							match(input,CURLY_BRACKETS_LEFT,FOLLOW_CURLY_BRACKETS_LEFT_in_if_statment542); if (state.failed) return;
							pushFollow(FOLLOW_statments_in_if_statment544);
							statments();
							state._fsp--;
							if (state.failed) return;
							}

							match(input,CURLY_BRACKETS_RIGHT,FOLLOW_CURLY_BRACKETS_RIGHT_in_if_statment549); if (state.failed) return;
							}
							break;

					}

					}
					break;

			}

			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("if_statment:'if' '(' arith_expr ')' (  statment| ('{' statments )  '}' ) ('else'   (  statment| ('{' statments )  '}' ) )? ");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, if_statment_StartIndex); }

		}
	}
	// $ANTLR end "if_statment"



	// $ANTLR start "arith_expr"
	// myparser.g:101:1: arith_expr : assign_expr ( ',' assign_expr )* ;
	public final void arith_expr() throws RecognitionException {
		int arith_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// myparser.g:102:2: ( assign_expr ( ',' assign_expr )* )
			// myparser.g:102:3: assign_expr ( ',' assign_expr )*
			{
			pushFollow(FOLLOW_assign_expr_in_arith_expr568);
			assign_expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:102:15: ( ',' assign_expr )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COMMA) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// myparser.g:102:16: ',' assign_expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_arith_expr571); if (state.failed) return;
					pushFollow(FOLLOW_assign_expr_in_arith_expr573);
					assign_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}

			if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("arith_expr :assign_expr (',' assign_expr )*");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, arith_expr_StartIndex); }

		}
	}
	// $ANTLR end "arith_expr"



	// $ANTLR start "assign_expr"
	// myparser.g:105:1: assign_expr : ( prefix_expr ( '=' | ASSIGN_OPERATOR ) assign_expr | condition_expr );
	public final void assign_expr() throws RecognitionException {
		int assign_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// myparser.g:106:2: ( prefix_expr ( '=' | ASSIGN_OPERATOR ) assign_expr | condition_expr )
			int alt24=2;
			switch ( input.LA(1) ) {
			case 57:
				{
				int LA24_1 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case 59:
				{
				int LA24_2 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case 51:
				{
				int LA24_3 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case 68:
				{
				int LA24_4 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case 55:
				{
				int LA24_5 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case 54:
				{
				int LA24_6 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case PARENTHESES_LEFT:
				{
				int LA24_7 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case 58:
				{
				int LA24_8 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case SIZEOF:
				{
				int LA24_9 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case ID:
				{
				int LA24_10 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case LITERAL_STRING:
				{
				int LA24_11 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case LITERAL_CHAR:
				{
				int LA24_12 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case DECIMAL_INT:
				{
				int LA24_13 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case HEX_INT:
				{
				int LA24_14 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case OCTAL_INT:
				{
				int LA24_15 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case FLOAT:
				{
				int LA24_16 = input.LA(2);
				if ( (synpred40_myparser()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// myparser.g:106:3: prefix_expr ( '=' | ASSIGN_OPERATOR ) assign_expr
					{
					pushFollow(FOLLOW_prefix_expr_in_assign_expr588);
					prefix_expr();
					state._fsp--;
					if (state.failed) return;
					if ( input.LA(1)==ASSIGN_OPERATOR||input.LA(1)==61 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_assign_expr_in_assign_expr596);
					assign_expr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("assign_expr :condition_expr ASSIGN_OPERATOR assign_expr");}
					}
					break;
				case 2 :
					// myparser.g:107:3: condition_expr
					{
					pushFollow(FOLLOW_condition_expr_in_assign_expr601);
					condition_expr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("assign_expr :condition_expr");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, assign_expr_StartIndex); }

		}
	}
	// $ANTLR end "assign_expr"



	// $ANTLR start "condition_expr"
	// myparser.g:111:1: condition_expr : logical_or_expr ( '?' assign_expr ':' condition_expr )? ;
	public final void condition_expr() throws RecognitionException {
		int condition_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// myparser.g:112:2: ( logical_or_expr ( '?' assign_expr ':' condition_expr )? )
			// myparser.g:112:3: logical_or_expr ( '?' assign_expr ':' condition_expr )?
			{
			pushFollow(FOLLOW_logical_or_expr_in_condition_expr616);
			logical_or_expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:112:18: ( '?' assign_expr ':' condition_expr )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==QUESTION) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// myparser.g:112:19: '?' assign_expr ':' condition_expr
					{
					match(input,QUESTION,FOLLOW_QUESTION_in_condition_expr618); if (state.failed) return;
					pushFollow(FOLLOW_assign_expr_in_condition_expr619);
					assign_expr();
					state._fsp--;
					if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_condition_expr621); if (state.failed) return;
					pushFollow(FOLLOW_condition_expr_in_condition_expr622);
					condition_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("condition_expr :logical_or_expr('?'assign_expr ':'condition_expr)?") ;}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, condition_expr_StartIndex); }

		}
	}
	// $ANTLR end "condition_expr"



	// $ANTLR start "logical_or_expr"
	// myparser.g:115:1: logical_or_expr : logical_and_expr ( '||' logical_and_expr )* ;
	public final void logical_or_expr() throws RecognitionException {
		int logical_or_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// myparser.g:116:2: ( logical_and_expr ( '||' logical_and_expr )* )
			// myparser.g:116:3: logical_and_expr ( '||' logical_and_expr )*
			{
			pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr637);
			logical_and_expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:116:19: ( '||' logical_and_expr )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==67) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// myparser.g:116:20: '||' logical_and_expr
					{
					match(input,67,FOLLOW_67_in_logical_or_expr639); if (state.failed) return;
					pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr640);
					logical_and_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop26;
				}
			}

			if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("logical_or_expr :logical_and_expr('||'logical_and_expr)*");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, logical_or_expr_StartIndex); }

		}
	}
	// $ANTLR end "logical_or_expr"



	// $ANTLR start "logical_and_expr"
	// myparser.g:119:1: logical_and_expr : bit_or_expr ( '&&' bit_or_expr )* ;
	public final void logical_and_expr() throws RecognitionException {
		int logical_and_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// myparser.g:120:2: ( bit_or_expr ( '&&' bit_or_expr )* )
			// myparser.g:120:3: bit_or_expr ( '&&' bit_or_expr )*
			{
			pushFollow(FOLLOW_bit_or_expr_in_logical_and_expr655);
			bit_or_expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:120:14: ( '&&' bit_or_expr )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==53) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// myparser.g:120:15: '&&' bit_or_expr
					{
					match(input,53,FOLLOW_53_in_logical_and_expr657); if (state.failed) return;
					pushFollow(FOLLOW_bit_or_expr_in_logical_and_expr658);
					bit_or_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop27;
				}
			}

			if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("logical_and_expr :bit_or_expr('&&'bit_or_expr)*");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, logical_and_expr_StartIndex); }

		}
	}
	// $ANTLR end "logical_and_expr"



	// $ANTLR start "bit_or_expr"
	// myparser.g:123:1: bit_or_expr : bit_xor_expr ( '|' bit_xor_expr )* ;
	public final void bit_or_expr() throws RecognitionException {
		int bit_or_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// myparser.g:124:2: ( bit_xor_expr ( '|' bit_xor_expr )* )
			// myparser.g:124:3: bit_xor_expr ( '|' bit_xor_expr )*
			{
			pushFollow(FOLLOW_bit_xor_expr_in_bit_or_expr673);
			bit_xor_expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:124:15: ( '|' bit_xor_expr )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==66) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// myparser.g:124:16: '|' bit_xor_expr
					{
					match(input,66,FOLLOW_66_in_bit_or_expr675); if (state.failed) return;
					pushFollow(FOLLOW_bit_xor_expr_in_bit_or_expr676);
					bit_xor_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop28;
				}
			}

			if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("bit_or_expr :bit_xor_expr('|'bit_xor_expr)*");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, bit_or_expr_StartIndex); }

		}
	}
	// $ANTLR end "bit_or_expr"



	// $ANTLR start "bit_xor_expr"
	// myparser.g:127:1: bit_xor_expr : bit_and_expr ( '^' bit_and_expr )* ;
	public final void bit_xor_expr() throws RecognitionException {
		int bit_xor_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// myparser.g:128:2: ( bit_and_expr ( '^' bit_and_expr )* )
			// myparser.g:128:3: bit_and_expr ( '^' bit_and_expr )*
			{
			pushFollow(FOLLOW_bit_and_expr_in_bit_xor_expr692);
			bit_and_expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:128:15: ( '^' bit_and_expr )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==62) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// myparser.g:128:16: '^' bit_and_expr
					{
					match(input,62,FOLLOW_62_in_bit_xor_expr694); if (state.failed) return;
					pushFollow(FOLLOW_bit_and_expr_in_bit_xor_expr695);
					bit_and_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop29;
				}
			}

			if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("bit_xor_expr :bit_and_expr('^'bit_and_expr)*");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, bit_xor_expr_StartIndex); }

		}
	}
	// $ANTLR end "bit_xor_expr"



	// $ANTLR start "bit_and_expr"
	// myparser.g:131:1: bit_and_expr : logical_equal_expr ( '&' logical_equal_expr )* ;
	public final void bit_and_expr() throws RecognitionException {
		int bit_and_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// myparser.g:132:2: ( logical_equal_expr ( '&' logical_equal_expr )* )
			// myparser.g:132:3: logical_equal_expr ( '&' logical_equal_expr )*
			{
			pushFollow(FOLLOW_logical_equal_expr_in_bit_and_expr710);
			logical_equal_expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:132:21: ( '&' logical_equal_expr )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==54) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// myparser.g:132:22: '&' logical_equal_expr
					{
					match(input,54,FOLLOW_54_in_bit_and_expr712); if (state.failed) return;
					pushFollow(FOLLOW_logical_equal_expr_in_bit_and_expr714);
					logical_equal_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop30;
				}
			}

			if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("bit_and_expr :logical_equal_expr('&' logical_equal_expr)*");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, bit_and_expr_StartIndex); }

		}
	}
	// $ANTLR end "bit_and_expr"



	// $ANTLR start "logical_equal_expr"
	// myparser.g:134:1: logical_equal_expr : comparism_expr ( LOGICAL_EQUALITY_OPERATOR comparism_expr )* ;
	public final void logical_equal_expr() throws RecognitionException {
		int logical_equal_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// myparser.g:135:2: ( comparism_expr ( LOGICAL_EQUALITY_OPERATOR comparism_expr )* )
			// myparser.g:135:3: comparism_expr ( LOGICAL_EQUALITY_OPERATOR comparism_expr )*
			{
			pushFollow(FOLLOW_comparism_expr_in_logical_equal_expr728);
			comparism_expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:135:17: ( LOGICAL_EQUALITY_OPERATOR comparism_expr )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==LOGICAL_EQUALITY_OPERATOR) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// myparser.g:135:18: LOGICAL_EQUALITY_OPERATOR comparism_expr
					{
					match(input,LOGICAL_EQUALITY_OPERATOR,FOLLOW_LOGICAL_EQUALITY_OPERATOR_in_logical_equal_expr730); if (state.failed) return;
					pushFollow(FOLLOW_comparism_expr_in_logical_equal_expr732);
					comparism_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop31;
				}
			}

			if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("logical_equal_expr :comparism_expr(LOGICAL_EQUALITY_OPERATOR comparism_expr)*");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, logical_equal_expr_StartIndex); }

		}
	}
	// $ANTLR end "logical_equal_expr"



	// $ANTLR start "comparism_expr"
	// myparser.g:138:1: comparism_expr : shift_expr ( COMPARISON_OPERATOR shift_expr )* ;
	public final void comparism_expr() throws RecognitionException {
		int comparism_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// myparser.g:139:2: ( shift_expr ( COMPARISON_OPERATOR shift_expr )* )
			// myparser.g:139:3: shift_expr ( COMPARISON_OPERATOR shift_expr )*
			{
			pushFollow(FOLLOW_shift_expr_in_comparism_expr748);
			shift_expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:139:13: ( COMPARISON_OPERATOR shift_expr )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==COMPARISON_OPERATOR) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// myparser.g:139:14: COMPARISON_OPERATOR shift_expr
					{
					match(input,COMPARISON_OPERATOR,FOLLOW_COMPARISON_OPERATOR_in_comparism_expr750); if (state.failed) return;
					pushFollow(FOLLOW_shift_expr_in_comparism_expr752);
					shift_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop32;
				}
			}

			if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("comparism_expr:shift_expr(COMPARISON_OPERATOR shift_expr)*");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, comparism_expr_StartIndex); }

		}
	}
	// $ANTLR end "comparism_expr"



	// $ANTLR start "shift_expr"
	// myparser.g:142:1: shift_expr : add_expr ( SHIFT_OPERATOR add_expr )* ;
	public final void shift_expr() throws RecognitionException {
		int shift_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// myparser.g:143:5: ( add_expr ( SHIFT_OPERATOR add_expr )* )
			// myparser.g:143:6: add_expr ( SHIFT_OPERATOR add_expr )*
			{
			pushFollow(FOLLOW_add_expr_in_shift_expr771);
			add_expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:143:14: ( SHIFT_OPERATOR add_expr )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==SHIFT_OPERATOR) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// myparser.g:143:15: SHIFT_OPERATOR add_expr
					{
					match(input,SHIFT_OPERATOR,FOLLOW_SHIFT_OPERATOR_in_shift_expr773); if (state.failed) return;
					pushFollow(FOLLOW_add_expr_in_shift_expr775);
					add_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop33;
				}
			}

			if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("shift_expr :add_expr(SHIFT_OPERATOR add_expr)* ");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, shift_expr_StartIndex); }

		}
	}
	// $ANTLR end "shift_expr"



	// $ANTLR start "add_expr"
	// myparser.g:146:1: add_expr : mult_expr ( ( '+' | '-' ) mult_expr )* ;
	public final void add_expr() throws RecognitionException {
		int add_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// myparser.g:147:5: ( mult_expr ( ( '+' | '-' ) mult_expr )* )
			// myparser.g:147:6: mult_expr ( ( '+' | '-' ) mult_expr )*
			{
			pushFollow(FOLLOW_mult_expr_in_add_expr796);
			mult_expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:147:16: ( ( '+' | '-' ) mult_expr )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==56||LA34_0==58) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// myparser.g:147:18: ( '+' | '-' ) mult_expr
					{
					if ( input.LA(1)==56||input.LA(1)==58 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mult_expr_in_add_expr805);
					mult_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop34;
				}
			}

			if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("add_expr :mult_expr ( ('+'|'-')mult_expr )*");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, add_expr_StartIndex); }

		}
	}
	// $ANTLR end "add_expr"



	// $ANTLR start "mult_expr"
	// myparser.g:150:1: mult_expr : prefix_expr ( ( '*' | '/' | '%' ) prefix_expr )* ;
	public final void mult_expr() throws RecognitionException {
		int mult_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// myparser.g:151:5: ( prefix_expr ( ( '*' | '/' | '%' ) prefix_expr )* )
			// myparser.g:151:6: prefix_expr ( ( '*' | '/' | '%' ) prefix_expr )*
			{
			pushFollow(FOLLOW_prefix_expr_in_mult_expr827);
			prefix_expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:151:19: ( ( '*' | '/' | '%' ) prefix_expr )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==52||LA35_0==55||LA35_0==60) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// myparser.g:151:21: ( '*' | '/' | '%' ) prefix_expr
					{
					if ( input.LA(1)==52||input.LA(1)==55||input.LA(1)==60 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_prefix_expr_in_mult_expr839);
					prefix_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop35;
				}
			}

			if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("mult_expr :prefix_expr  ( ('*'|'/'|'%')prefix_expr )* ");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, mult_expr_StartIndex); }

		}
	}
	// $ANTLR end "mult_expr"



	// $ANTLR start "prefix_expr"
	// myparser.g:154:1: prefix_expr : ( '++' prefix_expr | '--' prefix_expr | '!' prefix_expr | '~' prefix_expr | '*' prefix_expr | '&' prefix_expr | '(' ( var_decelartion_prefix )* BASIC_TYPE ')' prefix_expr | '-' constant_num | 'sizeof' '(' ( ( ID ( ( '.' | '->' ) ID )* ) | ( ( var_decelartion_prefix )* BASIC_TYPE ) ) ')' | suffix_expr );
	public final void prefix_expr() throws RecognitionException {
		int prefix_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// myparser.g:155:5: ( '++' prefix_expr | '--' prefix_expr | '!' prefix_expr | '~' prefix_expr | '*' prefix_expr | '&' prefix_expr | '(' ( var_decelartion_prefix )* BASIC_TYPE ')' prefix_expr | '-' constant_num | 'sizeof' '(' ( ( ID ( ( '.' | '->' ) ID )* ) | ( ( var_decelartion_prefix )* BASIC_TYPE ) ) ')' | suffix_expr )
			int alt40=10;
			switch ( input.LA(1) ) {
			case 57:
				{
				alt40=1;
				}
				break;
			case 59:
				{
				alt40=2;
				}
				break;
			case 51:
				{
				alt40=3;
				}
				break;
			case 68:
				{
				alt40=4;
				}
				break;
			case 55:
				{
				alt40=5;
				}
				break;
			case 54:
				{
				alt40=6;
				}
				break;
			case PARENTHESES_LEFT:
				{
				int LA40_7 = input.LA(2);
				if ( (LA40_7==BASIC_TYPE||LA40_7==SIGN||LA40_7==STORAGE_CLASS_SPECIFIER||LA40_7==TYPE_MODIFIER) ) {
					alt40=7;
				}
				else if ( (LA40_7==DECIMAL_INT||LA40_7==FLOAT||(LA40_7 >= HEX_INT && LA40_7 <= ID)||(LA40_7 >= LITERAL_CHAR && LA40_7 <= LITERAL_STRING)||LA40_7==OCTAL_INT||LA40_7==PARENTHESES_LEFT||LA40_7==SIZEOF||LA40_7==51||(LA40_7 >= 54 && LA40_7 <= 55)||(LA40_7 >= 57 && LA40_7 <= 59)||LA40_7==68) ) {
					alt40=10;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 58:
				{
				alt40=8;
				}
				break;
			case SIZEOF:
				{
				alt40=9;
				}
				break;
			case DECIMAL_INT:
			case FLOAT:
			case HEX_INT:
			case ID:
			case LITERAL_CHAR:
			case LITERAL_STRING:
			case OCTAL_INT:
				{
				alt40=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// myparser.g:155:6: '++' prefix_expr
					{
					match(input,57,FOLLOW_57_in_prefix_expr862); if (state.failed) return;
					pushFollow(FOLLOW_prefix_expr_in_prefix_expr863);
					prefix_expr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("prefix_expr :'++'prefix_expr ");}
					}
					break;
				case 2 :
					// myparser.g:156:6: '--' prefix_expr
					{
					match(input,59,FOLLOW_59_in_prefix_expr872); if (state.failed) return;
					pushFollow(FOLLOW_prefix_expr_in_prefix_expr873);
					prefix_expr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("prefix_expr :'--'prefix_expr ");}
					}
					break;
				case 3 :
					// myparser.g:157:6: '!' prefix_expr
					{
					match(input,51,FOLLOW_51_in_prefix_expr882); if (state.failed) return;
					pushFollow(FOLLOW_prefix_expr_in_prefix_expr883);
					prefix_expr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("prefix_expr :'!'prefix_expr");}
					}
					break;
				case 4 :
					// myparser.g:158:6: '~' prefix_expr
					{
					match(input,68,FOLLOW_68_in_prefix_expr893); if (state.failed) return;
					pushFollow(FOLLOW_prefix_expr_in_prefix_expr894);
					prefix_expr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("prefix_expr :'~'prefix_expr ");}
					}
					break;
				case 5 :
					// myparser.g:159:6: '*' prefix_expr
					{
					match(input,55,FOLLOW_55_in_prefix_expr904); if (state.failed) return;
					pushFollow(FOLLOW_prefix_expr_in_prefix_expr905);
					prefix_expr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("prefix_expr :'*'prefix_expr");}
					}
					break;
				case 6 :
					// myparser.g:160:6: '&' prefix_expr
					{
					match(input,54,FOLLOW_54_in_prefix_expr915); if (state.failed) return;
					pushFollow(FOLLOW_prefix_expr_in_prefix_expr916);
					prefix_expr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("prefix_expr :'&'prefix_expr ");}
					}
					break;
				case 7 :
					// myparser.g:161:6: '(' ( var_decelartion_prefix )* BASIC_TYPE ')' prefix_expr
					{
					match(input,PARENTHESES_LEFT,FOLLOW_PARENTHESES_LEFT_in_prefix_expr926); if (state.failed) return;
					// myparser.g:161:10: ( var_decelartion_prefix )*
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==SIGN||LA36_0==STORAGE_CLASS_SPECIFIER||LA36_0==TYPE_MODIFIER) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// myparser.g:161:10: var_decelartion_prefix
							{
							pushFollow(FOLLOW_var_decelartion_prefix_in_prefix_expr928);
							var_decelartion_prefix();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop36;
						}
					}

					match(input,BASIC_TYPE,FOLLOW_BASIC_TYPE_in_prefix_expr931); if (state.failed) return;
					match(input,PARENTHESES_RIGHT,FOLLOW_PARENTHESES_RIGHT_in_prefix_expr933); if (state.failed) return;
					pushFollow(FOLLOW_prefix_expr_in_prefix_expr935);
					prefix_expr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("prefix_expr :'(' var_decelartion_prefix* BASIC_TYPE ')'");}
					}
					break;
				case 8 :
					// myparser.g:162:6: '-' constant_num
					{
					match(input,58,FOLLOW_58_in_prefix_expr945); if (state.failed) return;
					pushFollow(FOLLOW_constant_num_in_prefix_expr946);
					constant_num();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("prefix_expr :'-'constant_num");}
					}
					break;
				case 9 :
					// myparser.g:163:6: 'sizeof' '(' ( ( ID ( ( '.' | '->' ) ID )* ) | ( ( var_decelartion_prefix )* BASIC_TYPE ) ) ')'
					{
					match(input,SIZEOF,FOLLOW_SIZEOF_in_prefix_expr955); if (state.failed) return;
					match(input,PARENTHESES_LEFT,FOLLOW_PARENTHESES_LEFT_in_prefix_expr957); if (state.failed) return;
					// myparser.g:163:19: ( ( ID ( ( '.' | '->' ) ID )* ) | ( ( var_decelartion_prefix )* BASIC_TYPE ) )
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==ID) ) {
						alt39=1;
					}
					else if ( (LA39_0==BASIC_TYPE||LA39_0==SIGN||LA39_0==STORAGE_CLASS_SPECIFIER||LA39_0==TYPE_MODIFIER) ) {
						alt39=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 39, 0, input);
						throw nvae;
					}

					switch (alt39) {
						case 1 :
							// myparser.g:163:20: ( ID ( ( '.' | '->' ) ID )* )
							{
							// myparser.g:163:20: ( ID ( ( '.' | '->' ) ID )* )
							// myparser.g:163:22: ID ( ( '.' | '->' ) ID )*
							{
							match(input,ID,FOLLOW_ID_in_prefix_expr962); if (state.failed) return;
							// myparser.g:163:25: ( ( '.' | '->' ) ID )*
							loop37:
							while (true) {
								int alt37=2;
								int LA37_0 = input.LA(1);
								if ( (LA37_0==ARROW||LA37_0==DOT) ) {
									alt37=1;
								}

								switch (alt37) {
								case 1 :
									// myparser.g:163:26: ( '.' | '->' ) ID
									{
									if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
										input.consume();
										state.errorRecovery=false;
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									match(input,ID,FOLLOW_ID_in_prefix_expr970); if (state.failed) return;
									}
									break;

								default :
									break loop37;
								}
							}

							}

							}
							break;
						case 2 :
							// myparser.g:163:45: ( ( var_decelartion_prefix )* BASIC_TYPE )
							{
							// myparser.g:163:45: ( ( var_decelartion_prefix )* BASIC_TYPE )
							// myparser.g:163:47: ( var_decelartion_prefix )* BASIC_TYPE
							{
							// myparser.g:163:47: ( var_decelartion_prefix )*
							loop38:
							while (true) {
								int alt38=2;
								int LA38_0 = input.LA(1);
								if ( (LA38_0==SIGN||LA38_0==STORAGE_CLASS_SPECIFIER||LA38_0==TYPE_MODIFIER) ) {
									alt38=1;
								}

								switch (alt38) {
								case 1 :
									// myparser.g:163:47: var_decelartion_prefix
									{
									pushFollow(FOLLOW_var_decelartion_prefix_in_prefix_expr980);
									var_decelartion_prefix();
									state._fsp--;
									if (state.failed) return;
									}
									break;

								default :
									break loop38;
								}
							}

							match(input,BASIC_TYPE,FOLLOW_BASIC_TYPE_in_prefix_expr983); if (state.failed) return;
							}

							}
							break;

					}

					match(input,PARENTHESES_RIGHT,FOLLOW_PARENTHESES_RIGHT_in_prefix_expr989); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("prefix_expr :'sizeof' '(' (( ID (('.'|'->')ID)*   )|( var_decelartion_prefix* BASIC_TYPE  )) ')'");}
					}
					break;
				case 10 :
					// myparser.g:164:6: suffix_expr
					{
					pushFollow(FOLLOW_suffix_expr_in_prefix_expr998);
					suffix_expr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("prefix_expr :suffix_expr");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, prefix_expr_StartIndex); }

		}
	}
	// $ANTLR end "prefix_expr"



	// $ANTLR start "suffix_expr"
	// myparser.g:167:1: suffix_expr : ( primary_expr '(' ( arith_expr )? ')' | primary_expr '[' assign_expr ']' | primary_expr ( '++' | '--' ) | primary_expr ( '.' | '->' ) ID | primary_expr );
	public final void suffix_expr() throws RecognitionException {
		int suffix_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return; }

			// myparser.g:168:5: ( primary_expr '(' ( arith_expr )? ')' | primary_expr '[' assign_expr ']' | primary_expr ( '++' | '--' ) | primary_expr ( '.' | '->' ) ID | primary_expr )
			int alt42=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA42_1 = input.LA(2);
				if ( (synpred70_myparser()) ) {
					alt42=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt42=2;
				}
				else if ( (synpred73_myparser()) ) {
					alt42=3;
				}
				else if ( (synpred75_myparser()) ) {
					alt42=4;
				}
				else if ( (true) ) {
					alt42=5;
				}

				}
				break;
			case LITERAL_STRING:
				{
				int LA42_2 = input.LA(2);
				if ( (synpred70_myparser()) ) {
					alt42=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt42=2;
				}
				else if ( (synpred73_myparser()) ) {
					alt42=3;
				}
				else if ( (synpred75_myparser()) ) {
					alt42=4;
				}
				else if ( (true) ) {
					alt42=5;
				}

				}
				break;
			case LITERAL_CHAR:
				{
				int LA42_3 = input.LA(2);
				if ( (synpred70_myparser()) ) {
					alt42=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt42=2;
				}
				else if ( (synpred73_myparser()) ) {
					alt42=3;
				}
				else if ( (synpred75_myparser()) ) {
					alt42=4;
				}
				else if ( (true) ) {
					alt42=5;
				}

				}
				break;
			case DECIMAL_INT:
				{
				int LA42_4 = input.LA(2);
				if ( (synpred70_myparser()) ) {
					alt42=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt42=2;
				}
				else if ( (synpred73_myparser()) ) {
					alt42=3;
				}
				else if ( (synpred75_myparser()) ) {
					alt42=4;
				}
				else if ( (true) ) {
					alt42=5;
				}

				}
				break;
			case HEX_INT:
				{
				int LA42_5 = input.LA(2);
				if ( (synpred70_myparser()) ) {
					alt42=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt42=2;
				}
				else if ( (synpred73_myparser()) ) {
					alt42=3;
				}
				else if ( (synpred75_myparser()) ) {
					alt42=4;
				}
				else if ( (true) ) {
					alt42=5;
				}

				}
				break;
			case OCTAL_INT:
				{
				int LA42_6 = input.LA(2);
				if ( (synpred70_myparser()) ) {
					alt42=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt42=2;
				}
				else if ( (synpred73_myparser()) ) {
					alt42=3;
				}
				else if ( (synpred75_myparser()) ) {
					alt42=4;
				}
				else if ( (true) ) {
					alt42=5;
				}

				}
				break;
			case FLOAT:
				{
				int LA42_7 = input.LA(2);
				if ( (synpred70_myparser()) ) {
					alt42=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt42=2;
				}
				else if ( (synpred73_myparser()) ) {
					alt42=3;
				}
				else if ( (synpred75_myparser()) ) {
					alt42=4;
				}
				else if ( (true) ) {
					alt42=5;
				}

				}
				break;
			case PARENTHESES_LEFT:
				{
				int LA42_8 = input.LA(2);
				if ( (synpred70_myparser()) ) {
					alt42=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt42=2;
				}
				else if ( (synpred73_myparser()) ) {
					alt42=3;
				}
				else if ( (synpred75_myparser()) ) {
					alt42=4;
				}
				else if ( (true) ) {
					alt42=5;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// myparser.g:168:6: primary_expr '(' ( arith_expr )? ')'
					{
					pushFollow(FOLLOW_primary_expr_in_suffix_expr1016);
					primary_expr();
					state._fsp--;
					if (state.failed) return;
					match(input,PARENTHESES_LEFT,FOLLOW_PARENTHESES_LEFT_in_suffix_expr1018); if (state.failed) return;
					// myparser.g:168:23: ( arith_expr )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==DECIMAL_INT||LA41_0==FLOAT||(LA41_0 >= HEX_INT && LA41_0 <= ID)||(LA41_0 >= LITERAL_CHAR && LA41_0 <= LITERAL_STRING)||LA41_0==OCTAL_INT||LA41_0==PARENTHESES_LEFT||LA41_0==SIZEOF||LA41_0==51||(LA41_0 >= 54 && LA41_0 <= 55)||(LA41_0 >= 57 && LA41_0 <= 59)||LA41_0==68) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// myparser.g:168:23: arith_expr
							{
							pushFollow(FOLLOW_arith_expr_in_suffix_expr1020);
							arith_expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,PARENTHESES_RIGHT,FOLLOW_PARENTHESES_RIGHT_in_suffix_expr1023); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("suffix_expr :primary_expr '(' arith_expr? ')'");}
					}
					break;
				case 2 :
					// myparser.g:169:6: primary_expr '[' assign_expr ']'
					{
					pushFollow(FOLLOW_primary_expr_in_suffix_expr1032);
					primary_expr();
					state._fsp--;
					if (state.failed) return;
					match(input,SQUARE_BRACKETS_LEFT,FOLLOW_SQUARE_BRACKETS_LEFT_in_suffix_expr1034); if (state.failed) return;
					pushFollow(FOLLOW_assign_expr_in_suffix_expr1036);
					assign_expr();
					state._fsp--;
					if (state.failed) return;
					match(input,SQUARE_BRACKETS_RIGHT,FOLLOW_SQUARE_BRACKETS_RIGHT_in_suffix_expr1038); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("suffix_expr :primary_expr '[' assign_expr ']'");}
					}
					break;
				case 3 :
					// myparser.g:170:6: primary_expr ( '++' | '--' )
					{
					pushFollow(FOLLOW_primary_expr_in_suffix_expr1047);
					primary_expr();
					state._fsp--;
					if (state.failed) return;
					if ( input.LA(1)==57||input.LA(1)==59 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("suffix_expr :primary_expr ('++'|'--') ");}
					}
					break;
				case 4 :
					// myparser.g:171:6: primary_expr ( '.' | '->' ) ID
					{
					pushFollow(FOLLOW_primary_expr_in_suffix_expr1070);
					primary_expr();
					state._fsp--;
					if (state.failed) return;
					if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,ID,FOLLOW_ID_in_suffix_expr1078); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("suffix_expr :primary_expr ('.'|'->') ID ");}
					}
					break;
				case 5 :
					// myparser.g:172:6: primary_expr
					{
					pushFollow(FOLLOW_primary_expr_in_suffix_expr1093);
					primary_expr();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (SUPER_TRACEON) System.out.println("suffix_expr :primary_expr");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, suffix_expr_StartIndex); }

		}
	}
	// $ANTLR end "suffix_expr"



	// $ANTLR start "primary_expr"
	// myparser.g:175:1: primary_expr : ( ID | constant | '(' arith_expr ')' );
	public final void primary_expr() throws RecognitionException {
		int primary_expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return; }

			// myparser.g:176:5: ( ID | constant | '(' arith_expr ')' )
			int alt43=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt43=1;
				}
				break;
			case DECIMAL_INT:
			case FLOAT:
			case HEX_INT:
			case LITERAL_CHAR:
			case LITERAL_STRING:
			case OCTAL_INT:
				{
				alt43=2;
				}
				break;
			case PARENTHESES_LEFT:
				{
				alt43=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// myparser.g:176:6: ID
					{
					match(input,ID,FOLLOW_ID_in_primary_expr1112); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("primary_expr :ID");}
					}
					break;
				case 2 :
					// myparser.g:177:6: constant
					{
					pushFollow(FOLLOW_constant_in_primary_expr1121);
					constant();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("primary_expr :constant");}
					}
					break;
				case 3 :
					// myparser.g:178:6: '(' arith_expr ')'
					{
					match(input,PARENTHESES_LEFT,FOLLOW_PARENTHESES_LEFT_in_primary_expr1130); if (state.failed) return;
					pushFollow(FOLLOW_arith_expr_in_primary_expr1132);
					arith_expr();
					state._fsp--;
					if (state.failed) return;
					match(input,PARENTHESES_RIGHT,FOLLOW_PARENTHESES_RIGHT_in_primary_expr1134); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("primary_expr :'(' arith_expr ')'");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, primary_expr_StartIndex); }

		}
	}
	// $ANTLR end "primary_expr"

	// $ANTLR start synpred1_myparser
	public final void synpred1_myparser_fragment() throws RecognitionException {
		// myparser.g:15:9: ( var_decelartion )
		// myparser.g:15:9: var_decelartion
		{
		pushFollow(FOLLOW_var_decelartion_in_synpred1_myparser53);
		var_decelartion();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_myparser

	// $ANTLR start synpred2_myparser
	public final void synpred2_myparser_fragment() throws RecognitionException {
		// myparser.g:16:7: ( func_decelartion )
		// myparser.g:16:7: func_decelartion
		{
		pushFollow(FOLLOW_func_decelartion_in_synpred2_myparser63);
		func_decelartion();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_myparser

	// $ANTLR start synpred6_myparser
	public final void synpred6_myparser_fragment() throws RecognitionException {
		// myparser.g:29:39: ( '*' )
		// myparser.g:29:39: '*'
		{
		match(input,55,FOLLOW_55_in_synpred6_myparser138); if (state.failed) return;
		}

	}
	// $ANTLR end synpred6_myparser

	// $ANTLR start synpred37_myparser
	public final void synpred37_myparser_fragment() throws RecognitionException {
		// myparser.g:79:65: ( 'else' ( statment | ( '{' statments ) '}' ) )
		// myparser.g:79:65: 'else' ( statment | ( '{' statments ) '}' )
		{
		match(input,63,FOLLOW_63_in_synpred37_myparser531); if (state.failed) return;
		// myparser.g:79:74: ( statment | ( '{' statments ) '}' )
		int alt47=2;
		int LA47_0 = input.LA(1);
		if ( (LA47_0==BASIC_TYPE||LA47_0==DECIMAL_INT||LA47_0==DO||LA47_0==FLOAT||(LA47_0 >= FOR && LA47_0 <= ID)||(LA47_0 >= LITERAL_CHAR && LA47_0 <= LITERAL_STRING)||LA47_0==LOOP_CTRL||LA47_0==OCTAL_INT||LA47_0==PARENTHESES_LEFT||LA47_0==SEMI_COLON||(LA47_0 >= SIGN && LA47_0 <= SIZEOF)||LA47_0==STORAGE_CLASS_SPECIFIER||(LA47_0 >= TYPE_MODIFIER && LA47_0 <= WHILE)||LA47_0==51||(LA47_0 >= 54 && LA47_0 <= 55)||(LA47_0 >= 57 && LA47_0 <= 59)||(LA47_0 >= 64 && LA47_0 <= 65)||LA47_0==68) ) {
			alt47=1;
		}
		else if ( (LA47_0==CURLY_BRACKETS_LEFT) ) {
			alt47=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 47, 0, input);
			throw nvae;
		}

		switch (alt47) {
			case 1 :
				// myparser.g:79:77: statment
				{
				pushFollow(FOLLOW_statment_in_synpred37_myparser538);
				statment();
				state._fsp--;
				if (state.failed) return;
				}
				break;
			case 2 :
				// myparser.g:79:87: ( '{' statments ) '}'
				{
				// myparser.g:79:87: ( '{' statments )
				// myparser.g:79:88: '{' statments
				{
				match(input,CURLY_BRACKETS_LEFT,FOLLOW_CURLY_BRACKETS_LEFT_in_synpred37_myparser542); if (state.failed) return;
				pushFollow(FOLLOW_statments_in_synpred37_myparser544);
				statments();
				state._fsp--;
				if (state.failed) return;
				}

				match(input,CURLY_BRACKETS_RIGHT,FOLLOW_CURLY_BRACKETS_RIGHT_in_synpred37_myparser549); if (state.failed) return;
				}
				break;

		}

		}

	}
	// $ANTLR end synpred37_myparser

	// $ANTLR start synpred40_myparser
	public final void synpred40_myparser_fragment() throws RecognitionException {
		// myparser.g:106:3: ( prefix_expr ( '=' | ASSIGN_OPERATOR ) assign_expr )
		// myparser.g:106:3: prefix_expr ( '=' | ASSIGN_OPERATOR ) assign_expr
		{
		pushFollow(FOLLOW_prefix_expr_in_synpred40_myparser588);
		prefix_expr();
		state._fsp--;
		if (state.failed) return;
		if ( input.LA(1)==ASSIGN_OPERATOR||input.LA(1)==61 ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_assign_expr_in_synpred40_myparser596);
		assign_expr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred40_myparser

	// $ANTLR start synpred70_myparser
	public final void synpred70_myparser_fragment() throws RecognitionException {
		// myparser.g:168:6: ( primary_expr '(' ( arith_expr )? ')' )
		// myparser.g:168:6: primary_expr '(' ( arith_expr )? ')'
		{
		pushFollow(FOLLOW_primary_expr_in_synpred70_myparser1016);
		primary_expr();
		state._fsp--;
		if (state.failed) return;
		match(input,PARENTHESES_LEFT,FOLLOW_PARENTHESES_LEFT_in_synpred70_myparser1018); if (state.failed) return;
		// myparser.g:168:23: ( arith_expr )?
		int alt53=2;
		int LA53_0 = input.LA(1);
		if ( (LA53_0==DECIMAL_INT||LA53_0==FLOAT||(LA53_0 >= HEX_INT && LA53_0 <= ID)||(LA53_0 >= LITERAL_CHAR && LA53_0 <= LITERAL_STRING)||LA53_0==OCTAL_INT||LA53_0==PARENTHESES_LEFT||LA53_0==SIZEOF||LA53_0==51||(LA53_0 >= 54 && LA53_0 <= 55)||(LA53_0 >= 57 && LA53_0 <= 59)||LA53_0==68) ) {
			alt53=1;
		}
		switch (alt53) {
			case 1 :
				// myparser.g:168:23: arith_expr
				{
				pushFollow(FOLLOW_arith_expr_in_synpred70_myparser1020);
				arith_expr();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,PARENTHESES_RIGHT,FOLLOW_PARENTHESES_RIGHT_in_synpred70_myparser1023); if (state.failed) return;
		}

	}
	// $ANTLR end synpred70_myparser

	// $ANTLR start synpred71_myparser
	public final void synpred71_myparser_fragment() throws RecognitionException {
		// myparser.g:169:6: ( primary_expr '[' assign_expr ']' )
		// myparser.g:169:6: primary_expr '[' assign_expr ']'
		{
		pushFollow(FOLLOW_primary_expr_in_synpred71_myparser1032);
		primary_expr();
		state._fsp--;
		if (state.failed) return;
		match(input,SQUARE_BRACKETS_LEFT,FOLLOW_SQUARE_BRACKETS_LEFT_in_synpred71_myparser1034); if (state.failed) return;
		pushFollow(FOLLOW_assign_expr_in_synpred71_myparser1036);
		assign_expr();
		state._fsp--;
		if (state.failed) return;
		match(input,SQUARE_BRACKETS_RIGHT,FOLLOW_SQUARE_BRACKETS_RIGHT_in_synpred71_myparser1038); if (state.failed) return;
		}

	}
	// $ANTLR end synpred71_myparser

	// $ANTLR start synpred73_myparser
	public final void synpred73_myparser_fragment() throws RecognitionException {
		// myparser.g:170:6: ( primary_expr ( '++' | '--' ) )
		// myparser.g:170:6: primary_expr ( '++' | '--' )
		{
		pushFollow(FOLLOW_primary_expr_in_synpred73_myparser1047);
		primary_expr();
		state._fsp--;
		if (state.failed) return;
		if ( input.LA(1)==57||input.LA(1)==59 ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred73_myparser

	// $ANTLR start synpred75_myparser
	public final void synpred75_myparser_fragment() throws RecognitionException {
		// myparser.g:171:6: ( primary_expr ( '.' | '->' ) ID )
		// myparser.g:171:6: primary_expr ( '.' | '->' ) ID
		{
		pushFollow(FOLLOW_primary_expr_in_synpred75_myparser1070);
		primary_expr();
		state._fsp--;
		if (state.failed) return;
		if ( input.LA(1)==ARROW||input.LA(1)==DOT ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,ID,FOLLOW_ID_in_synpred75_myparser1078); if (state.failed) return;
		}

	}
	// $ANTLR end synpred75_myparser

	// Delegated rules

	public final boolean synpred2_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred40_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred40_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred75_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred75_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred70_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred70_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred73_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred73_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred37_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred37_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_var_decelartion_in_global_decelaration53 = new BitSet(new long[]{0x0001440000000042L});
	public static final BitSet FOLLOW_func_decelartion_in_global_decelaration63 = new BitSet(new long[]{0x0001440000000042L});
	public static final BitSet FOLLOW_decelartion_in_func_decelartion85 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_PARENTHESES_LEFT_in_func_decelartion86 = new BitSet(new long[]{0x0000004000000040L});
	public static final BitSet FOLLOW_parameter_decelartion_in_func_decelartion88 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_PARENTHESES_RIGHT_in_func_decelartion91 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_LEFT_in_func_decelartion93 = new BitSet(new long[]{0x0ECB4D2960E8B040L,0x0000000000000013L});
	public static final BitSet FOLLOW_statments_in_func_decelartion95 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_RIGHT_in_func_decelartion96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decelartion_in_parameter_decelartion111 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COMMA_in_parameter_decelartion114 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decelartion_in_parameter_decelartion115 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_var_decelartion_prefix_in_var_decelartion132 = new BitSet(new long[]{0x0001440000000040L});
	public static final BitSet FOLLOW_BASIC_TYPE_in_var_decelartion136 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_55_in_var_decelartion138 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_arith_expr_in_var_decelartion141 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_var_decelartion148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_var_decelartion_prefix160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BASIC_TYPE_in_decelartion181 = new BitSet(new long[]{0x0080000000800000L});
	public static final BitSet FOLLOW_55_in_decelartion183 = new BitSet(new long[]{0x0080000000800000L});
	public static final BitSet FOLLOW_ID_in_decelartion186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_STRING_in_constant198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_CHAR_in_constant204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_INT_in_constant212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEX_INT_in_constant221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTAL_INT_in_constant234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_INT_in_constant_num269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEX_INT_in_constant_num278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTAL_INT_in_constant_num291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant_num302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statment_in_statments324 = new BitSet(new long[]{0x0ECB4D2960E8A042L,0x0000000000000013L});
	public static final BitSet FOLLOW_arith_expr_in_statment339 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_statment340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_decelartion_in_statment345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_statment_in_statment352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOP_CTRL_in_statment358 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_statment360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_statment366 = new BitSet(new long[]{0x0EC8092860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_arith_expr_in_statment368 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_statment371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statment_in_statment377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLON_in_statment383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_loop_statment395 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_PARENTHESES_LEFT_in_loop_statment396 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_arith_expr_in_loop_statment397 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_PARENTHESES_RIGHT_in_loop_statment399 = new BitSet(new long[]{0x0ECB4D2960E8A840L,0x0000000000000013L});
	public static final BitSet FOLLOW_statment_in_loop_statment402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_LEFT_in_loop_statment405 = new BitSet(new long[]{0x0ECB4D2960E8B040L,0x0000000000000013L});
	public static final BitSet FOLLOW_statments_in_loop_statment407 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_RIGHT_in_loop_statment409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_loop_statment420 = new BitSet(new long[]{0x0ECB4D2960E8A840L,0x0000000000000013L});
	public static final BitSet FOLLOW_statment_in_loop_statment423 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_LEFT_in_loop_statment426 = new BitSet(new long[]{0x0ECB4D2960E8B040L,0x0000000000000013L});
	public static final BitSet FOLLOW_statments_in_loop_statment428 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_RIGHT_in_loop_statment430 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_WHILE_in_loop_statment436 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_PARENTHESES_LEFT_in_loop_statment439 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_arith_expr_in_loop_statment440 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_PARENTHESES_RIGHT_in_loop_statment442 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_loop_statment444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_loop_statment450 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_PARENTHESES_LEFT_in_loop_statment452 = new BitSet(new long[]{0x0EC8092860C82040L,0x0000000000000010L});
	public static final BitSet FOLLOW_BASIC_TYPE_in_loop_statment458 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_arith_expr_in_loop_statment460 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_arith_expr_in_loop_statment463 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_loop_statment467 = new BitSet(new long[]{0x0EC8092860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_arith_expr_in_loop_statment468 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_loop_statment471 = new BitSet(new long[]{0x0EC8086860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_arith_expr_in_loop_statment473 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_PARENTHESES_RIGHT_in_loop_statment476 = new BitSet(new long[]{0x0ECB4D2960E8A840L,0x0000000000000013L});
	public static final BitSet FOLLOW_statment_in_loop_statment479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_LEFT_in_loop_statment482 = new BitSet(new long[]{0x0ECB4D2960E8B040L,0x0000000000000013L});
	public static final BitSet FOLLOW_statments_in_loop_statment484 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_RIGHT_in_loop_statment486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_if_statment504 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_PARENTHESES_LEFT_in_if_statment506 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_arith_expr_in_if_statment508 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_PARENTHESES_RIGHT_in_if_statment510 = new BitSet(new long[]{0x0ECB4D2960E8A840L,0x0000000000000013L});
	public static final BitSet FOLLOW_statment_in_if_statment515 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_LEFT_in_if_statment519 = new BitSet(new long[]{0x0ECB4D2960E8B040L,0x0000000000000013L});
	public static final BitSet FOLLOW_statments_in_if_statment521 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_RIGHT_in_if_statment526 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_63_in_if_statment531 = new BitSet(new long[]{0x0ECB4D2960E8A840L,0x0000000000000013L});
	public static final BitSet FOLLOW_statment_in_if_statment538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_LEFT_in_if_statment542 = new BitSet(new long[]{0x0ECB4D2960E8B040L,0x0000000000000013L});
	public static final BitSet FOLLOW_statments_in_if_statment544 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_RIGHT_in_if_statment549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_expr_in_arith_expr568 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COMMA_in_arith_expr571 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assign_expr_in_arith_expr573 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_prefix_expr_in_assign_expr588 = new BitSet(new long[]{0x2000000000000020L});
	public static final BitSet FOLLOW_set_in_assign_expr590 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assign_expr_in_assign_expr596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_expr_in_assign_expr601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expr_in_condition_expr616 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_QUESTION_in_condition_expr618 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assign_expr_in_condition_expr619 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_condition_expr621 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_condition_expr_in_condition_expr622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr637 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_logical_or_expr639 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr640 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_bit_or_expr_in_logical_and_expr655 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_logical_and_expr657 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_bit_or_expr_in_logical_and_expr658 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_bit_xor_expr_in_bit_or_expr673 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_bit_or_expr675 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_bit_xor_expr_in_bit_or_expr676 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_bit_and_expr_in_bit_xor_expr692 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_62_in_bit_xor_expr694 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_bit_and_expr_in_bit_xor_expr695 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_logical_equal_expr_in_bit_and_expr710 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_54_in_bit_and_expr712 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_logical_equal_expr_in_bit_and_expr714 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_comparism_expr_in_logical_equal_expr728 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_LOGICAL_EQUALITY_OPERATOR_in_logical_equal_expr730 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_comparism_expr_in_logical_equal_expr732 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_shift_expr_in_comparism_expr748 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMPARISON_OPERATOR_in_comparism_expr750 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_shift_expr_in_comparism_expr752 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_add_expr_in_shift_expr771 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_SHIFT_OPERATOR_in_shift_expr773 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_add_expr_in_shift_expr775 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_mult_expr_in_add_expr796 = new BitSet(new long[]{0x0500000000000002L});
	public static final BitSet FOLLOW_set_in_add_expr800 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_mult_expr_in_add_expr805 = new BitSet(new long[]{0x0500000000000002L});
	public static final BitSet FOLLOW_prefix_expr_in_mult_expr827 = new BitSet(new long[]{0x1090000000000002L});
	public static final BitSet FOLLOW_set_in_mult_expr832 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_prefix_expr_in_mult_expr839 = new BitSet(new long[]{0x1090000000000002L});
	public static final BitSet FOLLOW_57_in_prefix_expr862 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_prefix_expr_in_prefix_expr863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_prefix_expr872 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_prefix_expr_in_prefix_expr873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_prefix_expr882 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_prefix_expr_in_prefix_expr883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_prefix_expr893 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_prefix_expr_in_prefix_expr894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_prefix_expr904 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_prefix_expr_in_prefix_expr905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_prefix_expr915 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_prefix_expr_in_prefix_expr916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHESES_LEFT_in_prefix_expr926 = new BitSet(new long[]{0x0001440000000040L});
	public static final BitSet FOLLOW_var_decelartion_prefix_in_prefix_expr928 = new BitSet(new long[]{0x0001440000000040L});
	public static final BitSet FOLLOW_BASIC_TYPE_in_prefix_expr931 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_PARENTHESES_RIGHT_in_prefix_expr933 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_prefix_expr_in_prefix_expr935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_prefix_expr945 = new BitSet(new long[]{0x0000000800482000L});
	public static final BitSet FOLLOW_constant_num_in_prefix_expr946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_prefix_expr955 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_PARENTHESES_LEFT_in_prefix_expr957 = new BitSet(new long[]{0x0001440000800040L});
	public static final BitSet FOLLOW_ID_in_prefix_expr962 = new BitSet(new long[]{0x0000004000010010L});
	public static final BitSet FOLLOW_set_in_prefix_expr965 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_prefix_expr970 = new BitSet(new long[]{0x0000004000010010L});
	public static final BitSet FOLLOW_var_decelartion_prefix_in_prefix_expr980 = new BitSet(new long[]{0x0001440000000040L});
	public static final BitSet FOLLOW_BASIC_TYPE_in_prefix_expr983 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_PARENTHESES_RIGHT_in_prefix_expr989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_suffix_expr_in_prefix_expr998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_in_suffix_expr1016 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_PARENTHESES_LEFT_in_suffix_expr1018 = new BitSet(new long[]{0x0EC8086860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_arith_expr_in_suffix_expr1020 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_PARENTHESES_RIGHT_in_suffix_expr1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_in_suffix_expr1032 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SQUARE_BRACKETS_LEFT_in_suffix_expr1034 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assign_expr_in_suffix_expr1036 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SQUARE_BRACKETS_RIGHT_in_suffix_expr1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_in_suffix_expr1047 = new BitSet(new long[]{0x0A00000000000000L});
	public static final BitSet FOLLOW_set_in_suffix_expr1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_in_suffix_expr1070 = new BitSet(new long[]{0x0000000000010010L});
	public static final BitSet FOLLOW_set_in_suffix_expr1072 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_suffix_expr1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_in_suffix_expr1093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_primary_expr1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expr1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHESES_LEFT_in_primary_expr1130 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_arith_expr_in_primary_expr1132 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_PARENTHESES_RIGHT_in_primary_expr1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_decelartion_in_synpred1_myparser53 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_decelartion_in_synpred2_myparser63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_synpred6_myparser138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_synpred37_myparser531 = new BitSet(new long[]{0x0ECB4D2960E8A840L,0x0000000000000013L});
	public static final BitSet FOLLOW_statment_in_synpred37_myparser538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_LEFT_in_synpred37_myparser542 = new BitSet(new long[]{0x0ECB4D2960E8B040L,0x0000000000000013L});
	public static final BitSet FOLLOW_statments_in_synpred37_myparser544 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CURLY_BRACKETS_RIGHT_in_synpred37_myparser549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prefix_expr_in_synpred40_myparser588 = new BitSet(new long[]{0x2000000000000020L});
	public static final BitSet FOLLOW_set_in_synpred40_myparser590 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assign_expr_in_synpred40_myparser596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_in_synpred70_myparser1016 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_PARENTHESES_LEFT_in_synpred70_myparser1018 = new BitSet(new long[]{0x0EC8086860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_arith_expr_in_synpred70_myparser1020 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_PARENTHESES_RIGHT_in_synpred70_myparser1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_in_synpred71_myparser1032 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_SQUARE_BRACKETS_LEFT_in_synpred71_myparser1034 = new BitSet(new long[]{0x0EC8082860C82000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assign_expr_in_synpred71_myparser1036 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_SQUARE_BRACKETS_RIGHT_in_synpred71_myparser1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_in_synpred73_myparser1047 = new BitSet(new long[]{0x0A00000000000000L});
	public static final BitSet FOLLOW_set_in_synpred73_myparser1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expr_in_synpred75_myparser1070 = new BitSet(new long[]{0x0000000000010010L});
	public static final BitSet FOLLOW_set_in_synpred75_myparser1072 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_synpred75_myparser1078 = new BitSet(new long[]{0x0000000000000002L});
}
