package br.com.cidaluna;

import br.com.cidaluna.json.ExemploGsonProduto;
import main.java.br.com.cidaluna.annotation.ExemploAnnotationProduto;
import main.java.br.com.cidaluna.annotation.ExemploVisibleCliente;
import main.java.br.com.cidaluna.annotation.ExemploVisibleProduto;
import main.java.br.com.cidaluna.colecoes.ExemploList;
import main.java.br.com.cidaluna.colecoes.ExemploListProduto;
import main.java.br.com.cidaluna.colecoes.ExemploMap;
import main.java.br.com.cidaluna.colecoes.ExemploSet;
import main.java.br.com.cidaluna.criptografia.ExemploCriptografia;
import main.java.br.com.cidaluna.datahora.ExemploDataHora;
import main.java.br.com.cidaluna.estruturascontrole.ExemploCondicional;
import main.java.br.com.cidaluna.estruturascontrole.ExemploLacoFor;
import main.java.br.com.cidaluna.estruturascontrole.ExemploLacoWhile;
import main.java.br.com.cidaluna.excecoes.ExemploExceptionDivisaoInteiros;
import main.java.br.com.cidaluna.io.ExemploIoTradicional;
import main.java.br.com.cidaluna.io.ExemploNio2Files;
import main.java.br.com.cidaluna.io.ExemploNioBuffer;
import main.java.br.com.cidaluna.io.GeradorDeArquivo;
import main.java.br.com.cidaluna.optional.ExemploOptionalProduto;
import main.java.br.com.cidaluna.reflection.ExemploReflectionProduto;
import main.java.br.com.cidaluna.regex.ExemploRegexCliente;
import main.java.br.com.cidaluna.streams.ExemploStreamVeiculo;

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

        System.out.println("\n### Regex - Cliente ###");
        ExemploRegexCliente.executar();

        System.out.println("\n### Criptografia ###");
        ExemploCriptografia.executar();

        System.out.println("\n### Geração do arquivo de benchmark IO ###");
        GeradorDeArquivo.executar();

        System.out.println("\n### java.io ###");
        ExemploIoTradicional.executar();

        System.out.println("\n### java.nio ###");
        ExemploNioBuffer.executar();

        System.out.println("\n### java.nio.file (NIO.2) ###");
        ExemploNio2Files.executar();

        System.out.println("\n### Exceptions ###");
        ExemploExceptionDivisaoInteiros.executar();

        System.out.println("\n### Streams ###");
        ExemploStreamVeiculo.executar();

        System.out.println("\n### JSON ###");
        ExemploGsonProduto.executar();
    }
}
