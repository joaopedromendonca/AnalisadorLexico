package lexico;

public class Token {

    //program, integer, boolean, begin, end, while, do, read, var, false, true, write.
    public final static int TK_PROGRAM = 0;
    public final static int TK_INTEGER = 1;
    public final static int TK_BOOLEAN = 2;
    public final static int TK_BEGIN = 3;
    public final static int TK_END = 4;
    public final static int TK_WHILE = 5;
    public final static int TK_DO = 6;
    public final static int TK_READ = 7;
    public final static int TK_VAR = 8;
    public final static int TK_FALSE = 9;
    public final static int TK_TRUE = 10;
    public final static int TK_WRITE = 11;
    public final static int TK_NUMEROS = 12;
    public final static int TK_OP_AD = 14;
    public final static int TK_OP_MULT = 15;
    public final static int TK_OP_LOG = 16;
    public final static int TK_OP_NEG = 17;
    public final static int TK_OP_REL = 18;
    public final static int TK_PVIG = 19;
    public final static int TK_PONTO = 20;
    public final static int TK_DPONTOS = 21;
    public final static int TK_VIG = 22;
    public final static int TK_ABPAR = 23;
    public final static int TK_FPAR = 24;
    public final static int TK_ATRIB = 25;
    public final static int TK_COMENT = 26;
    public final static int TK_CADEIA = 27;
    public final static int TK_IDENT = 28;
    public final static int TK_CONST_INT = 29;

    private int tipo;
    private String atributo;

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    @Override
    public String toString() {
        return "Token [type=" + tipo + ", attribute=" + atributo + "]";
    }

}
