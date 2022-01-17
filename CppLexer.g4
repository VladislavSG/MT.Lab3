lexer grammar CppLexer;

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
        | 'String'
        ;

Return  : 'return' ;

LParent : '(' ;
RParent : ')' ;
OpenBlock : '{' ;
CloseBlock : '}' ;
LSParent : '[' ;
RSParent : ']' ;

ID    : [a-zA-Z][a-zA-Z0-9_]* ;
String : '"'('\\"' | ~["])*'"' ;
Integer : Digit+;
EndExpr : ';' ;
Comma : ',' ;

Assign : '=' ;

Digit : [0-9] ;

PlusPlus : '++' ;
MinusMinus : '--' ;

Plus : '+' ;
Minus : '-' ;
Mul : '*' ;
Div : '/' ;
Rem : '%' ;

TernIf : '?' ;
TernIfSep : ':' ;


WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
COMMENT : '#' ~[\r\n]* '\r'? '\n' -> skip ; //skip comments
