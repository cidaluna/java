package main.java.br.com.cidaluna.estruturascontrole;

public class ExemploLacoFor {
    public static void executar() {
        System.out.println("----> for");

        // for tradicional: quando você sabe quantas iterações vai ter
        for (int i = 1; i <= 5; i++) {
            System.out.println("Repetição: " + i);
        }

        // for-each: quando você quer percorrer uma coleção/array sem se importar com índice
        String[] frutas = {"maçã", "banana", "uva"};
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
    }
}
