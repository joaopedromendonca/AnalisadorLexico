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
    public final static int TK_OP_ART = 13;
    public final static int TK_OP_REL = 14;
    public final static int TK_OP_LOG = 15;
    public final static int TK_OP_NEG = 16;
    public final static int TK_SIMBOL = 17;
    public final static int TK_COMENT = 18;
    public final static int TK_CADEIA = 19;
    public final static int TK_IDENT = 20;
    public final static int TK_CONST_INT = 21;

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
