package main.java.br.com.cidaluna.excecoes;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExemploExceptionDivisaoInteiros {
    public static void executar() {
        System.out.println("----> Exceção Divisão Números Inteiros");
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Primeiro número: ");
            int primeiro = scanner.nextInt();
            // Para simular erro de scanner fechado, habilitar aqui: scanner.close();

            System.out.print("Segundo número: ");
            int segundo = scanner.nextInt();

            if (segundo == 1) {
                throw new RuntimeException("Teste forçado do catch genérico"); // linha temporária
            }

            int resultado = primeiro / segundo;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            // O token digitado não é um inteiro válido (ex.: letras).
            System.err.println("Erro - Entrada inválida: digite apenas números inteiros.");

        } catch (NoSuchElementException e) {
            // Não há mais nada para ler (ex.: entrada terminou / EOF). Ctrl+D no termial ou (Ctrl+Z  + enter)
            System.err.println("Erro - Nenhuma entrada foi fornecida.");

        } catch (ArithmeticException e) {
            // Divisao por zero
            System.err.println("Erro - Divisão por zero.");

        } catch (IllegalStateException e) {
            // O Scanner foi fechado antes desta chamada.
            System.err.println("Erro - O Scanner já estava fechado.");

        } catch (Exception e) {
            // Rede de segurança: qualquer outra exceção não prevista acima
            System.err.println("Erro - " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
