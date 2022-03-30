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

CmdIf: IF Expr THEN Cmd | IF Expr THEN Cmd ELSE Cmd;

CmdWhile: WHILE Expr DO Cmd;

CmdRead: READ ABPAR ListId FPAR;
CmdWrite: WRITE ABPAR ListW FPAR;
ListW: ElemW | ElemW VIG ListW;
ElemW: Expr | STRING;

CmdAtrib: IDENTIFIER ATRIB Expr;

// trecho com erro, opneg deveria ser aplicado apenas aos terminais da linha 31
// Expru: Expr OPREL Expr | Expr OPAD Expr | Expr OPMULT Expr;
Expr: Exprl | Exprl OPREL Expr
    | Exprl OPAD Expr
    | Exprl OPMULT Expr
    ;

Exprl: IDENTIFIER | CTE | ABPAR Expr FPAR | TRUE | FALSE 
    | OPNEG IDENTIFIER | OPNEG CTE | OPNEG ABPAR Expr FPAR | OPNEG TRUE 
    | OPNEG FALSE
    ;

