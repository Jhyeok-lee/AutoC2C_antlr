/* Auto mini C */

grammar AutoC;

program
: incList? declList? funcList?
;

incList
: directiveDefinition+
;

directiveDefinition
: IncludeDirective+
;

declList
: declaration
| declList declaration
;

funcList
: function+
;

declaration
: Type identList ';'
;

identList
: identifier
| identList ',' identifier
;

identifier
: Id
| Id '[' Intnum ']'
| identifier '=' initializer
;

initializer
: expr
;

function
: Type Id '(' paramList? ')' compoundStmt
;

paramList
: Type identifier
| paramList ',' Type identifier
;

Type
: 'int'
| 'float'
| 'void'
| 'char'
| 'auto'
;

compoundStmt
: '{' declList? funcList? stmtList '}'
;

stmtList
: stmt*
;

stmt
: assignStmt
| callStmt
| retStmt
| whileStmt
| forStmt
| ifStmt
| switchStmt
| compoundStmt
| ';'
;

assignStmt
: assign ';'
;

assign
: Id '=' expr
| Id '[' expr ']' '=' expr
;

callStmt
: call ';'
;

call
: Id '(' argList? ')'
;

retStmt
: 'return' expr? ';'
;

whileStmt
: 'while' '(' expr ')' stmt
| 'do' stmt 'while' '(' expr ')' ';'
;

forStmt
: 'for' '(' assign ';' expr ';' assign ')' stmt
;

ifStmt
: 'if' '(' expr ')' stmt ('else' stmt)? 
;

switchStmt
: 'switch' '(' identifier ')' '{' caseList '}'
;

caseList
: ('case' Intnum ':' stmtList 'break;'?)* ('default' ':' stmtList 'break;'?)?
;

expr
: Unop expr
| expr Unop expr
| expr Addiop expr
| expr Multop expr
| expr Relaop expr
| expr Eqltop expr
| call
| Intnum
| Floatnum
| Id
| Id '[' expr ']'
| '(' expr ')'
| StringLiteral
| '&' expr
;

argList
: expr
| argList ',' expr
;

StringLiteral
: '"' SCharSequence? '"'
;

fragment
SCharSequence
: SChar+
;

fragment
SChar
: ~["\\\r\n]
| EscapeSequence
;

fragment
EscapeSequence
: '\\' ['"?abfnrtv\\]
;

Unop : '-';
Addiop : '+';
Multop : '*' | '/' |'%';
Relaop : '<' | '>' | '<=' | '>=';
Eqltop : '==' | '!=';
Id : [A-Za-z][A-Za-z0-9_.]*;
Intnum : [0-9]+;
Floatnum : [0-9]* '.' [0-9]+;
WhiteSpace : [ \t]+ -> skip;
Newline : ( '\r' '\n'? | '\n' ) -> skip;

IncludeDirective
: '#' WhiteSpace? 'include ' ~[\r\n]*
;

