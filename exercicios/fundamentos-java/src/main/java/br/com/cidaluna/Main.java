package main.java.br.com.cidaluna;

import main.java.br.com.cidaluna.estruturascontrole.ExemploCondicional;
import main.java.br.com.cidaluna.estruturascontrole.ExemploLacoFor;
import main.java.br.com.cidaluna.estruturascontrole.ExemploLacoWhile;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, Cida! Projeto fundamentos-java iniciado.");

        System.out.println("### Estruturas de Controle ###");
        ExemploCondicional.executar();
        ExemploLacoWhile.executar();
        ExemploLacoFor.executar();
    }
}
