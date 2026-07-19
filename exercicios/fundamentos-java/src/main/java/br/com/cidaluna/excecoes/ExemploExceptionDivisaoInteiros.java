package main.java.br.com.cidaluna.excecoes;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExemploExceptionDivisaoInteiros {
    public static void executar() {
        System.out.println("----> Exceção Divisão Números Inteiros");

        try (Scanner scanner = new Scanner(System.in)) {
            int primeiro, segundo, resultado;

            System.out.print("Primeiro número: ");
            primeiro = Integer.parseInt(scanner.nextLine());

            System.out.print("Segundo número: ");
            segundo = scanner.nextInt();

            resultado = primeiro / segundo;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException | NumberFormatException e) {
            // O token digitado não é um inteiro válido (ex.: letras).
            System.err.println("Erro - Entrada inválida: digite apenas números inteiros.");

        } catch (NoSuchElementException e) {
            // Não há mais nada para ler (ex.: entrada terminou / EOF). Ctrl+D no termial ou (Ctrl+Z  + enter)
            System.err.println("Erro - Nenhuma entrada foi fornecida.");

        } catch (ArithmeticException e) {
            // Divisao por zero
            System.err.println("Erro - Divisão por zero.");

        } catch (Exception e) {
            // Rede de segurança: qualquer outra exceção não prevista acima
            System.err.println("Erro! " + e.getClass().getName());
            System.err.println("Erro ----> " + e.getMessage());
        }
    }
}
