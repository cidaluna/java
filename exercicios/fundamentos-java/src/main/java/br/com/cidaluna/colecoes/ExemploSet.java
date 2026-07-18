package main.java.br.com.cidaluna.colecoes;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void executar() {
        System.out.println("----> Set");

        // Set: NÃO permite duplicados, não garante ordem (HashSet)
        Set<String> tecnologias = new HashSet<>();
        tecnologias.add("Java 24");
        tecnologias.add("TypeScript 22");
        tecnologias.add("Java 24"); // ignorado silenciosamente, sem erro

        System.out.println("Set (sem duplicados): " + tecnologias);
        System.out.println("Contém 'Angular'? " + tecnologias.contains("TypeScript 22"));
        System.out.println("Tamanho: " + tecnologias.size());
    }
}
