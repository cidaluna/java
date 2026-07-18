package main.java.br.com.cidaluna.io;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GeradorDeArquivo {
    private static final String NOME_ARQUIVO = "benchmarck.txt";
    private static final String LINHA_BASE =
            "Esta eh uma linha de exemplo para benchmarck de leitura de arquivo.";
    private static final long TAMANHO_ALVO = 2L * 1024 * 1024; // 2 MB

    public static void executar() throws IOException {
        Path caminho = Paths.get(NOME_ARQUIVO);

        // evita regerar um arquivo de 2MB toda vez que a MainClass rodar
        /*
        if (Files.exists(caminho)) {
            System.out.println("Arquivo '" + NOME_ARQUIVO + "' já existe, geração ignorada 2MB.");
            return;
        }
         */

        System.out.println("Gerando arquivo de benchmark... isso pode levar alguns segundos.");

        try (BufferedWriter escritor = Files.newBufferedWriter(caminho)) {
            String linhaComQuebra = LINHA_BASE + System.lineSeparator();
            long bytesEscritos = 0;

            while (bytesEscritos < TAMANHO_ALVO) {
                escritor.write(linhaComQuebra);
                bytesEscritos += linhaComQuebra.getBytes().length;
            }
        }

        System.out.println("Arquivo gerado com sucesso: " + NOME_ARQUIVO);
    }

    // expõe o nome do arquivo pra quem for LER, sem duplicar a string em cada classe
    public static String getNomeArquivo() {
        return NOME_ARQUIVO;
    }
}
