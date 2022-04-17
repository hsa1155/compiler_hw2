grammar myparser;

options
{
    language=Java;
    backtrack=true;
    memoize=true;
}
@members {
    boolean TRACEON = true;
    boolean SUPER_TRACEON = false;
}

global_decelaration
    	:( var_decelartion {if (TRACEON) System.out.println("global_decelaration : var_decelartion\n ");}
    	|func_decelartion{if (TRACEON) System.out.println("global_decelaration : func_decelartion\n");})+
   	 ;
   
func_decelartion
  	:decelartion'(' parameter_decelartion? ')' '{' statments'}' {if (TRACEON) System.out.println("func_decelartion : decelartion'(' parameter_decelartion? ')' '{' statments'}' ");}
  	;

parameter_decelartion
	:(decelartion)(','decelartion)* {if (TRACEON) System.out.println("parameter_decelartion : (decelartion)(','decelartion)*");}
	;  

//var_decelartion_prefix*  BASIC_TYPE '*'* arith_expr      ';'
var_decelartion
	:var_decelartion_prefix*  decelartion (('=' (arith_expr))?| ('['arith_expr ']' )+        )';'{if (TRACEON) System.out.println("var_decelartion:var_decelartion_prefix* decelartion (('='(arith_expr))?|('['arith_expr ']')+)';'");}
	;


var_decelartion_prefix
	:(STORAGE_CLASS_SPECIFIER |TYPE_MODIFIER| SIGN) {if (TRACEON) System.out.println("var_decelartion_prefix : (STORAGE_CLASS_SPECIFIER |TYPE_MODIFIER| SIGN)");}
	;
	
decelartion
	:BASIC_TYPE '*'* ID {if (TRACEON) System.out.println("decelartion : BASIC_TYPE '*'* ID;");}
	;

constant
	:LITERAL_STRING {if (TRACEON) System.out.println("constant : LITERAL_STRING");}
	|LITERAL_CHAR   {if (TRACEON) System.out.println("constant : LITERAL_CHAR");}
	|DECIMAL_INT    {if (TRACEON) System.out.println("constant : DECIMAL_INT ");}
	|HEX_INT        {if (TRACEON) System.out.println("constant : HEX_INT");}
	|OCTAL_INT      {if (TRACEON) System.out.println("constant : OCTAL_INT");}
	|FLOAT          {if (TRACEON) System.out.println("constant : FLOAT ");}
	;

constant_num
    :DECIMAL_INT    {if (TRACEON) System.out.println("constant_num : DECIMAL_INT ");}
	|HEX_INT        {if (TRACEON) System.out.println("constant_num : HEX_INT");}
	|OCTAL_INT      {if (TRACEON) System.out.println("constant_num : OCTAL_INT");}
	|FLOAT          {if (TRACEON) System.out.println("constant_num : FLOAT ");}
	;
	
statments
	:statment*{if (TRACEON) System.out.println("statments:statment*");}
	;
	
statment
	:
	arith_expr';'{if (TRACEON) System.out.println("statment:arith_expr';'\n");}
	|var_decelartion  {if (TRACEON) System.out.println("statment:var_decelartion\n");}
	|loop_statment {if (TRACEON) System.out.println("statment:loop_statment\n");}
	|LOOP_CTRL ';' {if (TRACEON) System.out.println("statment:LOOP_CTRL ';'\n");}
	|'return' arith_expr? ';' {if (TRACEON) System.out.println("statment:'return' arith_expr? ';'\n");}
	|if_statment {if (TRACEON) System.out.println("statment:if_statment\n");}
	|';' {if (TRACEON) System.out.println("statment:';'\n");}
	;

loop_statment
	:WHILE'('arith_expr ')' (statment|('{' statments '}' )  ) {if (TRACEON) System.out.println("loop_statment:WHILE'('arith_expr ')' (statment|('{' statments '}' )  )");}
	|DO (statment|('{' statments '}' )  )WHILE  '('arith_expr ')' ';' {if (TRACEON) System.out.println("loop_statment:DO (statment|('{' statments '}' )  )WHILE  '('arith_expr ')' ';'");}
	|FOR '('  ( (BASIC_TYPE arith_expr)|arith_expr?) ';'arith_expr? ';' arith_expr? ')' (statment|('{' statments '}' )  ) {if (TRACEON) System.out.println("loop_statment:FOR '('  ( (BASIC_TYPE arith_expr)|arith_expr?) ';'arith_expr? ';' arith_expr? ')' (statment|('{' statments '}' )  )");}
	;
	
if_statment
	:'if' '(' arith_expr ')' (  statment| ('{' statments )  '}' ) ('else'   (  statment| ('{' statments )  '}' ) )? {if (TRACEON) System.out.println("if_statment:'if' '(' arith_expr ')' (  statment| ('{' statments )  '}' ) ('else'   (  statment| ('{' statments )  '}' ) )? ");}
	;
/*
優先權 t小較優先 越優先放越底層 
t15 ,  ==>x,y,a+b,a=5
t14 =  ==>x=y x=5
t13 ?: a?b:c
t12 || a||b
t11 && a&&b
t10 |  a|b
t9  ^  a^b
t8  &  a&b
t7  == a==b a!=b
t6  <  a<b a<=b 
t5  << a<<b a>>2
t4  +  a+b a-2
t3  *  a*b a%b
t2  單元前綴 ++a --b -c sizeof(a) (int)a !a *a &a ~a
t1  後綴 a() a++ a-- a[] a->a a.b
t0  (a) (1)
*/

arith_expr
	:assign_expr (',' assign_expr )* {if (SUPER_TRACEON) System.out.println("arith_expr :assign_expr (',' assign_expr )*");}
	;

assign_expr
	:prefix_expr ('='|ASSIGN_OPERATOR )assign_expr{if (SUPER_TRACEON) System.out.println("assign_expr :condition_expr ASSIGN_OPERATOR assign_expr");}
	|condition_expr {if (SUPER_TRACEON) System.out.println("assign_expr :condition_expr");}
	;
	
	
condition_expr
	:logical_or_expr('?'assign_expr ':'condition_expr)? {if (SUPER_TRACEON) System.out.println("condition_expr :logical_or_expr('?'assign_expr ':'condition_expr)?") ;}
	;
	
logical_or_expr
	:logical_and_expr('||'logical_and_expr)*  {if (SUPER_TRACEON) System.out.println("logical_or_expr :logical_and_expr('||'logical_and_expr)*");}
	;

logical_and_expr
	:bit_or_expr('&&'bit_or_expr)*  {if (SUPER_TRACEON) System.out.println("logical_and_expr :bit_or_expr('&&'bit_or_expr)*");}
	;

bit_or_expr
	:bit_xor_expr('|'bit_xor_expr)*  {if (SUPER_TRACEON) System.out.println("bit_or_expr :bit_xor_expr('|'bit_xor_expr)*");}
	;
	
bit_xor_expr
	:bit_and_expr('^'bit_and_expr)*  {if (SUPER_TRACEON) System.out.println("bit_xor_expr :bit_and_expr('^'bit_and_expr)*");}
	;

bit_and_expr
	:logical_equal_expr('&' logical_equal_expr)*  {if (SUPER_TRACEON) System.out.println("bit_and_expr :logical_equal_expr('&' logical_equal_expr)*");}
	;
logical_equal_expr
	:comparism_expr(LOGICAL_EQUALITY_OPERATOR comparism_expr)*  {if (SUPER_TRACEON) System.out.println("logical_equal_expr :comparism_expr(LOGICAL_EQUALITY_OPERATOR comparism_expr)*");}
	;

comparism_expr 
	:shift_expr(COMPARISON_OPERATOR shift_expr)*  {if (SUPER_TRACEON) System.out.println("comparism_expr:shift_expr(COMPARISON_OPERATOR shift_expr)*");}
	; 

shift_expr
    :add_expr(SHIFT_OPERATOR add_expr)*  {if (SUPER_TRACEON) System.out.println("shift_expr :add_expr(SHIFT_OPERATOR add_expr)* ");}
    ;

add_expr
    :mult_expr ( ('+'|'-')mult_expr )*  {if (SUPER_TRACEON) System.out.println("add_expr :mult_expr ( ('+'|'-')mult_expr )*");}
    ;

mult_expr
    :prefix_expr  ( ('*'|'/'|'%')prefix_expr )*   {if (SUPER_TRACEON) System.out.println("mult_expr :prefix_expr  ( ('*'|'/'|'\%')prefix_expr )* ");}
    ;

prefix_expr
    :'++'prefix_expr {if (TRACEON) System.out.println("prefix_expr :'++'prefix_expr ");}
    |'--'prefix_expr {if (TRACEON) System.out.println("prefix_expr :'--'prefix_expr ");}
    |'!'prefix_expr  {if (TRACEON) System.out.println("prefix_expr :'!'prefix_expr");}
    |'~'prefix_expr  {if (TRACEON) System.out.println("prefix_expr :'~'prefix_expr ");}
    |'*'prefix_expr  {if (TRACEON) System.out.println("prefix_expr :'*'prefix_expr");}
    |'&'prefix_expr  {if (TRACEON) System.out.println("prefix_expr :'&'prefix_expr ");}
    |'(' var_decelartion_prefix* BASIC_TYPE ')' prefix_expr  {if (TRACEON) System.out.println("prefix_expr :'(' var_decelartion_prefix* BASIC_TYPE ')'");}
    |'-'constant_num {if (TRACEON) System.out.println("prefix_expr :'-'constant_num");}
    |'sizeof' '(' (( ID (('.'|'->')ID)*   )|( var_decelartion_prefix* BASIC_TYPE  )) ')' {if (TRACEON) System.out.println("prefix_expr :'sizeof' '(' (( ID (('.'|'->')ID)*   )|( var_decelartion_prefix* BASIC_TYPE  )) ')'");}
    |suffix_expr {if (SUPER_TRACEON) System.out.println("prefix_expr :suffix_expr");}
    ;

suffix_expr
    :primary_expr '(' arith_expr? ')' {if (TRACEON) System.out.println("suffix_expr :primary_expr '(' arith_expr? ')'");}
    |primary_expr '[' assign_expr ']' {if (TRACEON) System.out.println("suffix_expr :primary_expr '[' assign_expr ']'");}
    |primary_expr ('++'|'--')         {if (TRACEON) System.out.println("suffix_expr :primary_expr ('++'|'--') ");}
    |primary_expr ('.'|'->') ID       {if (TRACEON) System.out.println("suffix_expr :primary_expr ('.'|'->') ID ");}
    |primary_expr  {if (SUPER_TRACEON) System.out.println("suffix_expr :primary_expr");}
    ;

primary_expr
    :ID {if (TRACEON) System.out.println("primary_expr :ID");}
    |constant {if (TRACEON) System.out.println("primary_expr :constant");}
    |'(' arith_expr ')' {if (TRACEON) System.out.println("primary_expr :'(' arith_expr ')'");}
    ;


BASIC_TYPE
    :'short'
    |'int'
    |'long'
    |'double'
    |'float'
    |'char'
    |'void'
    ;

SIGN
    :'signed'
    |'unsigned'
    ;

EXTEND_TYPE
    :'struct'
    |'enum'
    |'union'
    ;

TYPEDEF
    :'typedef'
    ;

TYPE_MODIFIER
    :'const'
    |'restrict'
    |'volatile'
    ;

NULL_PTR
    :'NULL'
    ;

STORAGE_CLASS_SPECIFIER
    : 'extern'
	| 'static'
	| 'auto'
	| 'register'
	;

INLINE
    :'inline'
    ;

FLOW_CONTROL
    :'if'
    |'else'
    |'switch'
    |'case'
    |'default'
    ;



FOR
	:'for'
	;

WHILE
	:'while'
	;

DO
	:'do'
	;

LOOP_CTRL
	:'break'
	| 'continue'
	;

JUMP
    :'goto'
    |'return'
    ;

SIZEOF
    :'sizeof'
    ;


LITERAL_STRING
    :'"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

LITERAL_CHAR
    :'\'' (~('\'')|EscapeSequence) '\''
    ;

DECIMAL_INT
    : ('0' | '1'..'9' '0'..'9'*)
    ;

HEX_INT
    : '0' ('x'|'X') ('0'..'9'|'A'..'F'|'a'..'f')+
    ;

OCTAL_INT
    :'0' ('0'..'7')+
    ;
    
FLOAT
    :('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+ )? ('f'|'F'|'d'|'D')?
    |'.' ('0'..'9')+ (('e'|'E') ('+'|'-')? ('0'..'9')+ )? ('f'|'F'|'d'|'D')?
    |('0'..'9')+ (  (('e'|'E') ('+'|'-')? ('0'..'9')+ )|  ('f'|'F'|'d'|'D') |(('e'|'E') ('+'|'-')? ('0'..'9')+ ) ('f'|'F'|'d'|'D'))
    ;

PARENTHESES_LEFT
    :'('
    ;

PARENTHESES_RIGHT
    :')'
    ;

SQUARE_BRACKETS_LEFT
    :'['
    ;

SQUARE_BRACKETS_RIGHT
    :']'
    ;

CURLY_BRACKETS_LEFT
    :'{'
    ;

CURLY_BRACKETS_RIGHT
    :'}'
    ;

COLON
    :':'
    ;


SEMI_COLON
    :';'
    ;

COMMA
    :','
    ;

DOT
    :'.'
    ;

ARROW
    :'->'
    ;

QUESTION
    :'?'
    ;

  LOGICAL_EQUALITY_OPERATOR
  	:'=='
  	|'!='
  	;

SHIFT_OPERATOR
    :'<<'
    |'>>'
    ;

COMPARISON_OPERATOR
    :'<'
    |'<='
    |'>'
    |'>='
    ;
  

ASSIGN_OPERATOR
    :
    '+='
    |'-='
    |'*='
    |'/='
    |'%='
    |'|='
    |'&='
    |'^='
    |'<<='
    |'='
    |'>>='
    ;
    
 PLUSPLUS
    :'++'
    ;

PLUS
    :'+'
    ;

MINUSMINUS
    :'--'
    ;

MINUS
    :'-'
    ;

DIVIDE
    :'/'
    ;

MOD
    :'%'
    ;

MULT
    :'*'
    ;

OROR
    :'||'
    ;

OR
    :'|'
    ;

ANDAND
    :'&&'
    ;

AND
    :'&'
    ;

NOT
    :'~'
    ;

XOR
    :'^'
    ;

WOW
    :'!'
    ;

ID
	:	LETTER (LETTER|DIGIT)*
	;

WS
    :(' '|'\r'|'\t'|'\u000C') {$channel=HIDDEN;}
    ;

NEW_LINE: '\n'{$channel=HIDDEN;};

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/'
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n'?{$channel=HIDDEN;}
    ;

LINE_COMMAND 
    :'#' ~('\n'|'\r')* '\r'? '\n'?{$channel=HIDDEN;}
    ;

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;
 
 


/*
LOGICAL_OPERATOR
    :'!'
    |'||'
    |'&&'
    ;


    INDECREASE
  	:'++'
  	|'--'	
  	;
  	
 BITWISE_OPERATOR
    :'|'
    |'&'
    |'~'
    |'^'
    ;

MATH_OPERATOR
    :'+'
    |'-'
    |'/'
    |'*'
    |'%'
    ;

*/