package main.java.br.com.cidaluna.annotation;

import main.java.br.com.cidaluna.modelo.Produto;

import java.lang.reflect.Field;

public class ExemploVisibleProduto {

    public static void executar() throws IllegalAccessException {
        System.out.println("----> Annotation customizada (@Visible)");

        Produto produto = new Produto(1, "Notebook", 4500.00);

        exibirCamposVisiveis(produto);
    }

    // percorre os campos e só imprime os que NÃO foram marcados como @Visible(false)
    private static void exibirCamposVisiveis(Produto produto) throws IllegalAccessException {
        for (Field campo : produto.getClass().getDeclaredFields()) {
            campo.setAccessible(true);

            boolean oculto = campo.isAnnotationPresent(Visible.class)
                    && !campo.getAnnotation(Visible.class).value();

            if (oculto) {
                System.out.println(campo.getName() + " -> [oculto]");
            } else {
                System.out.println(campo.getName() + " = " + campo.get(produto));
            }
        }
    }
}