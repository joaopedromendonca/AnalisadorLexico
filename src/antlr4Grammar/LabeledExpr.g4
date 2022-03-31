grammar LabeledExpr;

import CommonLexerRules;

// trecho ambíguo removido, Decls podia ser vazio, causando ambiguidade, solução: na regra que chama Decls criar alternativa sem ele e remover epsilon.
prog : PROGRAM IDENTIFIER PVIG Decls CmdComp PONTO | PROGRAM IDENTIFIER PVIG CmdComp PONTO;

Decls: VAR ListDecl;
ListDecl: DeclTip | DeclTip ListDecl;
DeclTip: ListId DPONTOS Tip PVIG;
ListId: IDENTIFIER | IDENTIFIER VIG ListId;
Tip: INTEGER | BOOLEAN | STRING;

CmdComp: BEGIN ListCmd END;
ListCmd: Cmd | Cmd PVIG ListCmd;
Cmd: CmdIf | CmdWhile | CmdRead | CmdWrite | CmdAtrib | CmdComp;

// modificado para aceitar apenas expressões relacionais e não aritiméticas
CmdIf: IF Exprr THEN Cmd | IF Exprr THEN Cmd ELSE Cmd;

// modificado para aceitar apenas expressões relacionais e não aritiméticas
CmdWhile: WHILE Exprr DO Cmd;

// Aceita ambas expressões relacionais e aritiméticas
CmdRead: READ ABPAR ListId FPAR;
CmdWrite: WRITE ABPAR ListW FPAR;
ListW: ElemW | ElemW VIG ListW;
ElemW: Expr | STRING;

// Aceita ambas expressões relacionais e aritiméticas
CmdAtrib: IDENTIFIER ATRIB Expr;

// Expressão genérica que pode ser avaliada em OPREL OU OPAD/OPMUL
Expr: Exprr
    | Expra
    ;

// Expressão de operador relacional, sempre retorna booleano mas avalia aritiméticos também
Exprr: Exprrf 
    | Expra OPREL Expr
    ;

// Expressões de adição e multiplicação respeitando associatividade
Expra: Exprm 
    | Exprm OPAD Expr
    ;

Exprm: Expraf 
    | Expraf OPMULT Expr
    ;

// Expressão final para operadores de adição e multiplicação, avalia em termos aritiméticos e booleanos
Expraf: IDENTIFIER
    | CTE
    | ABPAR Expr FPAR
    | TRUE
    | FALSE
    | OPNEG IDENTIFIER 
    | OPNEG CTE 
    | OPNEG ABPAR Expr FPAR 
    | OPNEG TRUE 
    | OPNEG FALSE
    ;

// Expressão final para operador de relação, avalia somente em termos de booleano
Exprrf: IDENTIFIER
    | CTE
    | ABPAR Exprr FPAR
    | TRUE
    | FALSE
    | OPNEG IDENTIFIER 
    | OPNEG CTE 
    | OPNEG ABPAR Exprr FPAR 
    | OPNEG TRUE 
    | OPNEG FALSE
    ;


