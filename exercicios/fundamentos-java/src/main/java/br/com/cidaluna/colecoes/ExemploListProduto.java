package main.java.br.com.cidaluna.colecoes;

import main.java.br.com.cidaluna.modelo.Produto;

import java.util.ArrayList;
import java.util.List;

public class ExemploListProduto {
    public static void executar() {
        System.out.println("\n----> List<Produto>");

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Notebook", 4500.00));
        produtos.add(new Produto(2, "Mouse", 50.00));
        produtos.add(new Produto(3, "Teclado", 150.00));

        // percorrendo com for-each (mais usado no dia a dia)
        System.out.println("\n--- Lista completa ---");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        // acessando por índice
        System.out.println("\n--- Acesso por índice ---");
        System.out.println("Primeiro produto: " + produtos.get(0));

        // filtrando com lógica simples (sem Stream, pra fixar o básico primeiro)
        System.out.println("\n--- Produtos acima de R$100 ---");
        for (Produto produto : produtos) {
            if (produto.getPreco() > 100) {
                System.out.println(produto.getDescricao() + " - R$" + produto.getPreco());
            }
        }

        // somando o total com base nos getters
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        System.out.println("\nTotal da lista: R$" + total);
    }
}
