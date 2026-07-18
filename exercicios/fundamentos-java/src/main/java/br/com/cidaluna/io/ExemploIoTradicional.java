package main.java.br.com.cidaluna.io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploIoTradicional {
    public static void executar() throws IOException {
        System.out.println("----> java.io (BufferedReader)");

        long t1_ini = System.currentTimeMillis();
        long linhas = 0;

        try (BufferedReader leitor = new BufferedReader(new FileReader(GeradorDeArquivo.getNomeArquivo()))) {
            while (leitor.readLine() != null) {
                linhas++;
            }
        }

        long t1_fim = System.currentTimeMillis() - t1_ini;
        System.out.println("Linhas lidas: " + linhas);
        System.out.println("Tempo: " + t1_fim + "ms");
    }
}
