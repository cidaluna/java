package main.java.br.com.cidaluna.reflection;

import main.java.br.com.cidaluna.modelo.Produto;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ExemploReflectionProduto {
    public static void executar() throws Exception {
        System.out.println("----> Reflection ");

        Produto produto = new Produto(1, "Notebook", 4500.00);
        Class<?> classe = produto.getClass();

        // nome da classe em tempo de execução
        System.out.println("Classe: " + classe.getName());

        // listando todos os campos (atributos), mesmo os privados
        System.out.println("\n--- Campos ---");
        for (Field campo : classe.getDeclaredFields()) {
            System.out.println("Campo: " + campo.getName() + " | Tipo: " + campo.getType().getSimpleName());
        }

        // listando todos os métodos declarados
        System.out.println("\n--- Métodos ---");
        for (Method metodo : classe.getDeclaredMethods()) {
            System.out.println("Método: " + metodo.getName());
        }

        // acessando um campo PRIVADO diretamente, ignorando o encapsulamento
        System.out.println("\n--- Acesso direto a campo privado ---");
        Field campoDescricao = classe.getDeclaredField("descricao");
        campoDescricao.setAccessible(true); // "destrava" o campo private
        System.out.println("Valor de 'descricao' via reflection: " + campoDescricao.get(produto));

        // invocando um método dinamicamente, pelo nome
        System.out.println("\n--- Invocação dinâmica de método ---");
        Method metodoGetPreco = classe.getMethod("getPreco");
        Object resultado = metodoGetPreco.invoke(produto);
        System.out.println("Resultado de getPreco() via reflection: " + resultado);
    }
}
