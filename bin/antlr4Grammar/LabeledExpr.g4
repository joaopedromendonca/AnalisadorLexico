grammar LabeledExpr;

import CommonLexerRules;

// trecho ambíguo removido, Decls podia ser vazio, causando ambiguidade, solução: na regra que chama Decls criar alternativa sem ele e remover epsilon.
prog : PROGRAM IDENTIFIER PVIG decls cmdComp PONTO | PROGRAM IDENTIFIER PVIG cmdComp PONTO ;

decls: VAR listDecl;
listDecl: declTip | declTip listDecl;
declTip: listId DPONTOS tip PVIG;
listId: IDENTIFIER | IDENTIFIER VIG listId;
tip: INTEGER | BOOLEAN | STRING;

cmdComp: BEGIN listCmd END;
listCmd: cmd | cmd PVIG listCmd;
cmd: cmdIf | cmdWhile | cmdRead | cmdWrite | cmdAtrib | cmdComp;

// modificado para aceitar apenas expressões relacionais e não aritiméticas
cmdIf: IF exprr THEN cmd | IF exprr THEN cmd ELSE cmd;

// modificado para aceitar apenas expressões relacionais e não aritiméticas
cmdWhile: WHILE exprr DO cmd;

// Aceita ambas expressões relacionais e aritiméticas
cmdRead: READ ABPAR listId FPAR;
cmdWrite: WRITE ABPAR listW FPAR;
listW: elemW | elemW VIG listW;
elemW: expr | CADEIA;

// Aceita ambas expressões relacionais e aritiméticas
cmdAtrib: IDENTIFIER ATRIB expr PVIG;

// Expressão genérica que pode ser avaliada em OPREL OU OPAD/OPMUL
expr: expra
    | exprr
    ;

// Expressão de operador relacional, sempre retorna booleano mas avalia aritiméticos também
exprr: exprrf 
    | expra OPREL expr
    ;

// Expressões de adição e multiplicação respeitando associatividade
expra: exprm 
    | exprm OPAD expr
    ;

exprm: expraf 
    | expraf OPMULT expr
    ;

// Expressão final para operadores de adição e multiplicação, avalia em termos aritiméticos e booleanos
expraf: IDENTIFIER
    | CTE
    | ABPAR expr FPAR
    | TRUE
    | FALSE
    | OPNEG IDENTIFIER 
    | OPNEG CTE 
    | OPNEG ABPAR expr FPAR 
    | OPNEG TRUE 
    | OPNEG FALSE
    ;

// Expressão final para operador de relação, avalia somente em termos de booleano
exprrf: IDENTIFIER
    | CTE
    | ABPAR exprr FPAR
    | TRUE
    | FALSE
    | OPNEG IDENTIFIER 
    | OPNEG CTE 
    | OPNEG ABPAR exprr FPAR 
    | OPNEG TRUE 
    | OPNEG FALSE
    ;


