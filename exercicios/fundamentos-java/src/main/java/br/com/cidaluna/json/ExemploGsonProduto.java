package br.com.cidaluna.json;
import main.java.br.com.cidaluna.modelo.Produto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExemploGsonProduto {

    public static void executar() {
        System.out.println("----> Gson (Produto -> JSON) ==");

        Produto produto = new Produto(1, "Notebook", 4500.00);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(produto);
        System.out.println(json);
    }
}