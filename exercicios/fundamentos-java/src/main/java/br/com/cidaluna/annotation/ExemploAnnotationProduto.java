package main.java.br.com.cidaluna.annotation;

import main.java.br.com.cidaluna.modelo.Produto;

import java.lang.reflect.Field;

public class ExemploAnnotationProduto {

    public static void executar() throws IllegalAccessException {
        System.out.println("----> Annotation customizada (@CampoObrigatorio) ");

        Produto produtoValido = new Produto(1, "Notebook", 4500.00);
        Produto produtoInvalido = new Produto(2, "", 50.00); // descricao vazia, simula erro

        validar(produtoValido);
        validar(produtoInvalido);
    }

    // varre os campos da classe procurando quem tem @CampoObrigatorio, e valida se está vazio
    private static void validar(Produto produto) throws IllegalAccessException {
        System.out.println("\nValidando produto id=" + produto.getId());

        for (Field campo : produto.getClass().getDeclaredFields()) {
            if (campo.isAnnotationPresent(CampoObrigatorio.class)) {
                campo.setAccessible(true);
                Object valor = campo.get(produto);

                CampoObrigatorio anotacao = campo.getAnnotation(CampoObrigatorio.class);

                if (valor == null || valor.toString().isBlank()) {
                    System.out.println("INVÁLIDO -> " + anotacao.mensagem());
                } else {
                    System.out.println("OK -> " + campo.getName() + " = " + valor);
                }
            }
        }
    }
}