parser grammar CppParser;
options {
	tokenVocab = CppLexer;
}

s : func+ EOF ;
args : (var (Comma var)*)? ;
funcSignature :  type ID LParent args RParent ;
func : funcSignature codeBlock ;
codeBlock : OpenBlock funcBody CloseBlock ;
funcBody : (if_rule | while_rule | line)* ;
if_rule : If LParent expr RParent codeBlock ;
while_rule : While LParent expr RParent codeBlock ;
return_rule : Return expr?;

argsExpr : (expr (Comma expr)*)? ;
funcCall : ID LParent argsExpr RParent ;
line : (var_definition | expr | return_rule) EndExpr ;
var_name : ID ;
var : type var_name ;
var_definition : var (Assign expr)? ;
type : array_type | not_array_type ;
not_array_type : (Const | Constexpr)? Sign? Long? TypeID ;
array_type : not_array_type (LSParent RSParent)? ;
expr : String | e ;
e : e (PlusPlus | MinusMinus)                           # op_level_1
  | (PlusPlus | MinusMinus) e                           # op_level_2
  | e (Mul | Div | Rem) e                               # op_level_3
  | e (Plus | Minus) e                                  # op_level_4
  | e (Less | Greater | LessOrEqual | GreaterOrEqual) e # op_level_5
  | e (Equals | NotEquals) e                            # op_level_6
  |<assoc=right> e TernIf expr TernIfSep expr           # ternar_op
  | ID Assign expr                                      # assign
  | LParent e RParent                                   # braces
  | (Integer | Bool | funcCall | var_name)                     # rvalue
  ;
