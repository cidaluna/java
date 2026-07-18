package main.java.br.com.cidaluna;

import main.java.br.com.cidaluna.annotation.ExemploAnnotationProduto;
import main.java.br.com.cidaluna.annotation.ExemploVisibleCliente;
import main.java.br.com.cidaluna.annotation.ExemploVisibleProduto;
import main.java.br.com.cidaluna.colecoes.ExemploList;
import main.java.br.com.cidaluna.colecoes.ExemploListProduto;
import main.java.br.com.cidaluna.colecoes.ExemploMap;
import main.java.br.com.cidaluna.colecoes.ExemploSet;
import main.java.br.com.cidaluna.datahora.ExemploDataHora;
import main.java.br.com.cidaluna.estruturascontrole.ExemploCondicional;
import main.java.br.com.cidaluna.estruturascontrole.ExemploLacoFor;
import main.java.br.com.cidaluna.estruturascontrole.ExemploLacoWhile;
import main.java.br.com.cidaluna.optional.ExemploOptionalProduto;
import main.java.br.com.cidaluna.reflection.ExemploReflectionProduto;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Cida! Projeto fundamentos-java iniciado.");

        System.out.println("### Estruturas de Controle ###");
        ExemploCondicional.executar();
        ExemploLacoWhile.executar();
        ExemploLacoFor.executar();

        System.out.println("\n### Coleções ###");
        ExemploList.executar();
        ExemploSet.executar();
        ExemploMap.executar();
        ExemploListProduto.executar();

        System.out.println("\n### Optional ###");
        ExemploOptionalProduto.executar();

        System.out.println("\n### Date and Time ###");
        ExemploDataHora.executar();

        System.out.println("\n### Reflection ###");
        ExemploReflectionProduto.executar();

        System.out.println("\n### Annotation @CampoObrigatorio ###");
        ExemploAnnotationProduto.executar();

        System.out.println("\n### Annotation @Visible - Produto ###");
        ExemploVisibleProduto.executar();

        System.out.println("\n### Annotation @Visible - Cliente ###");
        ExemploVisibleCliente.executar();
    }
}
