package main.java.br.com.cidaluna.criptografia;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class ExemploCriptografia {
    private static final String ALGORITMO = "AES";

    public static void executar() throws Exception {
        System.out.println("----> Criptografia (AES)");

        String textoOriginal = "Hello World";
        System.out.println("Texto original: " + textoOriginal);

        // gera uma chave simétrica (mesma chave criptografa e descriptografa)
        SecretKey chave = gerarChave();

        // criptografa
        String textoCriptografado = criptografar(textoOriginal, chave);
        System.out.println("Texto criptografado (Base64): " + textoCriptografado);

        // descriptografa usando a MESMA chave
        String textoDescriptografado = descriptografar(textoCriptografado, chave);
        System.out.println("Texto descriptografado: " + textoDescriptografado);
    }

    // KeyGenerator cria uma chave aleatória e segura, do tamanho adequado ao algoritmo
    private static SecretKey gerarChave() throws Exception {
        KeyGenerator geradorDeChave = KeyGenerator.getInstance(ALGORITMO);
        geradorDeChave.init(128); // tamanho da chave em bits
        return geradorDeChave.generateKey();
    }

    private static String criptografar(String texto, SecretKey chave) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITMO);
        cipher.init(Cipher.ENCRYPT_MODE, chave);

        byte[] bytesCriptografados = cipher.doFinal(texto.getBytes());

        // Base64 transforma os bytes criptografados (ilegíveis) em texto imprimível
        return Base64.getEncoder().encodeToString(bytesCriptografados);
    }

    private static String descriptografar(String textoBase64, SecretKey chave) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITMO);
        cipher.init(Cipher.DECRYPT_MODE, chave);

        byte[] bytesCriptografados = Base64.getDecoder().decode(textoBase64);
        byte[] bytesOriginais = cipher.doFinal(bytesCriptografados);

        return new String(bytesOriginais);
    }
}
