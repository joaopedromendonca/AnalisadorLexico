PROGRAM : 'PROGRAM';
INTEGER : 'INTEGER';
BOOLEAN : 'BOOLEAN';
BEGIN : 'BEGIN';
END : 'END';
WHILE : 'WHILE';
DO : 'DO';
READ : 'READ';
VAR : 'VAR';
FALSE : 'FALSE';
TRUE : 'TRUE';
WRITE : 'WRITE';
IDENTIFIER : [a..zA..Z][a..z|A..Z|0..9]*
CTE : (próprio numero) : [0..9]+ ? -[0..9]+
OPAD : '+';
OPAD : '-';
OPMULT : '*';
OPMULT : '/';
OPLOG : 'OR';
OPLOG : 'AND';
OPNEG : '~';
OPREL : '<';
OPREL : '<=';
OPREL : '>';
OPREL : '>=';
OPREL : '==';
OPREL : '<>';
PVIG : ';';
PONTO : '.';
DPONTOS : ':';
VIG : ',';
ABPAR : '(';
FPAR : ')';
ATRIB : ':=';
WS : [ \t\n\r]+ -> skip;
