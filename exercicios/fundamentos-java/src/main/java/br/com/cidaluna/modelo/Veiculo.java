package main.java.br.com.cidaluna.modelo;

public class Veiculo {

    private String nome;
    private String marca;
    private String cor;
    private double preco;
    private int ano;
    private int velocidadeMaxima;

    public Veiculo(String nome, String marca, String cor, double preco, int ano, int velocidadeMaxima) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Veiculo{nome='" + nome + "', marca='" + marca + "', cor='" + cor
                + "', preco=" + preco + ", ano=" + ano + ", velocidadeMaxima=" + velocidadeMaxima + "}";
    }
}