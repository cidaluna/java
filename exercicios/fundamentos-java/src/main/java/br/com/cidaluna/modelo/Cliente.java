package main.java.br.com.cidaluna.modelo;

import main.java.br.com.cidaluna.annotation.Visible;

public class Cliente {
    @Visible(false) // simula um dado interno, não deveria aparecer pro usuário final
    private int id;

    private String nome;

    @Visible(false) // dado sensível, faz sentido ocultar por padrão
    private String cpf;

    private String email;

    public Cliente(int id, String nome, String cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nome='" + nome + "', cpf='" + cpf + "', email='" + email + "'}";
    }
}
