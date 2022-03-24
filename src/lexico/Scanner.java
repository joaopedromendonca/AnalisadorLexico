package lexico;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Scanner {
    
    private char[] conteudo;

    public Scanner(String nome_arquivo){
        try {
            String entrada;
            entrada = new String(Files.readAllBytes(Paths.get(nome_arquivo)),StandardCharsets.UTF_8);
            conteudo = entrada.toCharArray();
            System.out.println(conteudo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}