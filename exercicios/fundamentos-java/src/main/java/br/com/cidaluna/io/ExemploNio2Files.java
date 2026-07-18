package main.java.br.com.cidaluna.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExemploNio2Files {

    public static void executar() throws IOException {
        System.out.println("----> java.nio.file / NIO.2 (Files.lines)");

        Path caminho = Paths.get(GeradorDeArquivo.getNomeArquivo());
        long t3_ini = System.currentTimeMillis();
        long linhas;

        // Files.lines() retorna um Stream preguiçoso (lazy) — não carrega tudo na memória de uma vez
        try (Stream<String> stream = Files.lines(caminho)) {
            linhas = stream.count();
        }

        long t3_fim = System.currentTimeMillis() - t3_ini;
        System.out.println("Linhas lidas: " + linhas);
        System.out.println("Tempo: " + t3_fim + "ms");
    }
}