package main.java.br.com.cidaluna.annotation;
import java.lang.reflect.Field;

import main.java.br.com.cidaluna.modelo.Cliente;

public class ExemploVisibleCliente {
    public static void executar() throws IllegalAccessException {
        System.out.println("----> Annotation customizada (@Visible) Cliente");

        Cliente cliente = new Cliente(1, "Isidro", "123.456.789-00", "isidro@email.com");

        exibirCamposVisiveis(cliente);
    }

    // mesma lógica usada em ExemploVisibleProduto: reaproveitando o comportamento da annotation
    private static void exibirCamposVisiveis(Cliente cliente) throws IllegalAccessException {
        for (Field campo : cliente.getClass().getDeclaredFields()) {
            campo.setAccessible(true);

            boolean oculto = campo.isAnnotationPresent(Visible.class)
                    && !campo.getAnnotation(Visible.class).value();

            if (oculto) {
                System.out.println("[Atributo não visível]: "+ campo.getName());
            } else {
                System.out.println("Atributo visível: "+ campo.getName() + " com valor " + campo.get(cliente));
            }
        }
    }
}
