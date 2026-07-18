package main.java.br.com.cidaluna.modelo;

import main.java.br.com.cidaluna.annotation.CampoObrigatorio;
import main.java.br.com.cidaluna.annotation.Visible;

public class Produto {
    @Visible(false) // simula um campo "interno", que não deveria aparecer pro usuário final
    private int id;

    @CampoObrigatorio(mensagem = "A descrição do produto é obrigatória")
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
