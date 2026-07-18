package main.java.br.com.cidaluna.optional;

import main.java.br.com.cidaluna.modelo.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExemploOptionalProduto {
    public static void executar() {
        System.out.println("\n ----> Optional (orElse)");

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Notebook", 4500.00));
        produtos.add(new Produto(2, "Mouse", 50.00));

        // busca simulando que pode ou não encontrar o produto
        Produto encontrado = buscarPorId(produtos, 1);
        Produto naoEncontrado = buscarPorId(produtos, 99);

        System.out.println("Busca id=1: " + encontrado);
        System.out.println("Busca id=99 (inexistente): " + naoEncontrado);
    }

    // Optional<Produto> como retorno: deixa explícito pra quem chama que o produto PODE não existir
    private static Optional<Produto> buscarProdutoOptional(List<Produto> produtos, int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return Optional.of(produto); // encontrou, envolve o valor
            }
        }
        return Optional.empty(); // não encontrou, Optional vazio (em vez de null)
    }

    // método auxiliar que já resolve o valor padrão com orElse
    private static Produto buscarPorId(List<Produto> produtos, int id) {
        Optional<Produto> resultado = buscarProdutoOptional(produtos, id);

        // orElse: se o Optional estiver vazio, retorna o valor padrão informado
        return resultado.orElse(new Produto(-1, "Produto inexistente", 0.0));
    }
}
