parser grammar CppParser;
options {
	tokenVocab = CppLexer;
}

s : func+ EOF ;
args : (var (Comma var)*)? ;
funcSignature :  type ID LParent args RParent ;
func : funcSignature OpenBlock funcBody CloseBlock ;
funcBody : line* ;
return_rule : Return expr?;

argsExpr : (expr (Comma expr)*)? ;
funcCall : ID LParent argsExpr RParent ;
line : (var_definition | expr | return_rule) EndExpr ;
var_name : ID ;
var : type var_name ;
var_definition : var (Assign expr)? ;
type : (Const | Constexpr)? Sign? Long? TypeID (LSParent RSParent)? ;
expr : String | e ;
e : e (Mul | Div | Rem) e # op_level_1
  | e (Plus | Minus) e # op_level_2
  |<assoc=right> e TernIf expr TernIfSep expr # ternar_op
  | ID Assign expr # assign
  | LParent e RParent # braces
  | (Integer | funcCall | var_name) # rvalue
  ;
