lexer grammar CppLexer;

If : 'if' ;
While : 'while' ;
Return  : 'return' ;

Long : 'long' ;
Const : 'const' ;
Constexpr : 'constexpr' ;
Sign : 'unsigned'
           | 'signed' ;
TypeID  : 'int'
        | 'float'
        | 'char'
        | 'bool'
        | 'auto'
        | 'string'
        ;

LParent : '(' ;
RParent : ')' ;
OpenBlock : '{' ;
CloseBlock : '}' ;
LSParent : '[' ;
RSParent : ']' ;

String : '"'('\\"' | ~["])*'"' ;
Integer : [0-9]+;
Bool : 'true' | 'false' ;

EndExpr : ';' ;
Comma : ',' ;

PlusPlus : '++' ;
MinusMinus : '--' ;

Plus : '+' ;
Minus : '-' ;
Mul : '*' ;
Div : '/' ;
Rem : '%' ;

Less : '<' ;
Greater : '>' ;
LessOrEqual : '<=' ;
GreaterOrEqual : '>=' ;
Equals : '==' ;
NotEquals : '!=' ;

Assign : '=' ;

TernIf : '?' ;
TernIfSep : ':' ;

ID : [a-zA-Z][a-zA-Z0-9_]* ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
COMMENT : '//' ~[\r\n]* '\r'? '\n' -> skip ; //skip comments
