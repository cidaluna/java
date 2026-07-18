package main.java.br.com.cidaluna.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExemploNioBuffer {

    public static void executar() throws IOException {
        System.out.println("----> java.nio (Buffer + Channel)");

        Path caminho = Paths.get(GeradorDeArquivo.getNomeArquivo());
        long t2_ini = System.currentTimeMillis();
        long totalBytes = 0;

        try (FileChannel canal = FileChannel.open(caminho, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(8192); // qto maior bloco buffer, melhor desempenho

            int bytesLidos = canal.read(buffer);
            while (bytesLidos != -1) {
                buffer.flip();          // vira o buffer de "escrita" pra "leitura"
                totalBytes += buffer.remaining();
                buffer.clear();         // reseta pra próxima rodada
                bytesLidos = canal.read(buffer);
            }
        }

        long t2_fim = System.currentTimeMillis() - t2_ini;
        System.out.println("Bytes lidos: " + totalBytes);
        System.out.println("Tempo: " + t2_fim + "ms");
    }
}
