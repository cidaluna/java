package mx.florinda.cardapio;

import mx.florinda.enums.CategoriaCardapio;

import java.math.BigDecimal;

public record ItemCardapio(Long id, String nome, String descricao, CategoriaCardapio categoria, BigDecimal preco,
                           BigDecimal precoComDesconto) {
}
