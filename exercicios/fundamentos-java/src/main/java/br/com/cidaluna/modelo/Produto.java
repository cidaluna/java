package main.java.br.com.cidaluna.modelo;

import java.util.Objects;

public class Produto {
    private int id;
    private String descricao;
    private double preco;

    public Produto(int id, String descricao, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    // toString sobrescrito para facilitar a exibição no console (println chama isso automaticamente)
    @Override
    public String toString() {
        return "Produto{id=" + id + ", descricao='" + descricao + "', preco=" + preco + "}";
    }
}
