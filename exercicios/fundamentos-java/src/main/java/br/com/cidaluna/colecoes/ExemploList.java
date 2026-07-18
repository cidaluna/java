package main.java.br.com.cidaluna.colecoes;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void executar() {
        System.out.println("----> List");

        // List: permite duplicados e mantém ordem de inserção
        List<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("TypeScript");
        linguagens.add("Java"); // duplicado permitido

        System.out.println("Lista completa: " + linguagens);
        System.out.println("Elemento no índice 1: " + linguagens.get(1));
        System.out.println("Tamanho: " + linguagens.size());

        linguagens.remove("Java"); // remove a PRIMEIRA ocorrência
        System.out.println("Após remover 'Java' uma vez: " + linguagens);
    }
}
