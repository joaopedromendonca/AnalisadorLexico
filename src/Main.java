import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import antlr4Grammar.LabeledExprLexer;
import antlr4Grammar.LabeledExprParser;


public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        String inputFile = "input.in";

        if(args.length > 0)
            inputFile = args[0];

        InputStream is = System.in;
        
        if(inputFile != null)
        {
            is = new FileInputStream(inputFile);
        }
        
        CharStream input = CharStreams.fromFileName(inputFile);
        LabeledExprLexer lexer = new LabeledExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);
        
        // descomentar para imprimir os tokens lidos, porém não imprime a árvore pois o itetator foi limpo
        System.out.println("Imprimindo tokens");
        Object[] tokens_string = lexer.getAllTokens().toArray();
        for (Object string : tokens_string) {
            System.out.println(string);
        }

        System.out.println(parser.getNumberOfSyntaxErrors());


        // System.out.println("Imprimindo árvore");
        // ParseTree tree = parser.prog();
        // parser.setBuildParseTree(true);
        
        // System.out.println(tree.toStringTree(parser));
        
        is.close();

        System.out.println("Acabou.");


    }
}
