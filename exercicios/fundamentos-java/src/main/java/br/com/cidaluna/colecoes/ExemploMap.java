package main.java.br.com.cidaluna.colecoes;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void executar() {
        System.out.println("----> Map");

        // Map: pares chave-valor, chave é única
        Map<String, Integer> idadePorPessoa = new HashMap<>();
        idadePorPessoa.put("Camila", 30);
        idadePorPessoa.put("Pedro", 25);
        idadePorPessoa.put("Camila", 31); // sobrescreve o valor da chave existente

        System.out.println("Mapa completo: " + idadePorPessoa);
        System.out.println("Idade da Camila: " + idadePorPessoa.get("Camila"));

        // percorrendo chave e valor juntos
        for (Map.Entry<String, Integer> entrada : idadePorPessoa.entrySet()) {
            System.out.println(entrada.getKey() + " tem " + entrada.getValue() + " anos");
        }
    }
}
