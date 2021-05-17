lexer grammar CalculatorLexer;

options {
    language = Java;
}


LF       : '\n' ;
WS       : [ \t\r]+ ->skip ;
POLYNOM  : 'polynom';
NUMBER   : 'number';
SHOW     : 'show';
X        : 'x';


SZAM     : [0-9]+('.' [0-9]+)? ;
OPASSIGN : '=' ;
OPADD    : '+' | '-' ;
OPMUL    : '*' | '/' ;
OPPWR    : '^' ;
LPAR     : '(' ;
RPAR     : ')' ;
LBRACKET : '[';
RBRACKET : ']';
OPLST    : ',' ;
ID       : [A-Za-z][_0-9A-Za-z]* ;
ENDL     : ';';


