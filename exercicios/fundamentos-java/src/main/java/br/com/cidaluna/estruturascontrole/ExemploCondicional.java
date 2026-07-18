package main.java.br.com.cidaluna.estruturascontrole;

public class ExemploCondicional {
    public static void executar() {
        System.out.println("----> if/else");
        int idade = 10;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // if/else if/else: múltiplas condições, ordem importa
        int nota = 75;
        if (nota >= 90) {
            System.out.println("Conceito A");
        } else if (nota >= 70) {
            System.out.println("Conceito B");
        } else if (nota >= 50) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Reprovado");
        }
    }
}
