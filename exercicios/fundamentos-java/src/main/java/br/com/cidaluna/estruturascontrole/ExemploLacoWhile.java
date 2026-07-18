package main.java.br.com.cidaluna.estruturascontrole;

public class ExemploLacoWhile {
    public static void executar() {
        System.out.println("----> while");

        // while: verifica a condição ANTES de executar
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador (while): " + contador);
            contador++;
        }

        // do-while: executa PELO MENOS UMA VEZ, verifica depois
        int tentativas = 0;
        do {
            System.out.println("Tentativa (do-while): " + tentativas);
            tentativas++;
        } while (tentativas < 3);
    }
}
