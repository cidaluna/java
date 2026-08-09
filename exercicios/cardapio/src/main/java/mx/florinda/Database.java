package mx.florinda;

import mx.florinda.cardapio.ItemCardapio;
import mx.florinda.enums.CategoriaCardapio;

import java.util.*;

public class Database {

    private Map<Long, ItemCardapio> itensPorId = new HashMap<>();

    public Database() {
        ItemCardapio refrescoDoChaves = new ItemCardapio(1L, "Refresco do Chaves", """
                Suco de limao, que parece tamarindo mas tem gosto de groselha
                """, CategoriaCardapio.BEBIDAS, null, null);
        itensPorId.put(1L, refrescoDoChaves);

        ItemCardapio sopaDeLetra = new ItemCardapio(2L, "Sopa de Letra", """
                Sopa com macarrao em formato de letras do alfabeto
                """, CategoriaCardapio.ENTRADAS, null, null);
        itensPorId.put(2L, sopaDeLetra);

        ItemCardapio pizzaDeQueijo = new ItemCardapio(3L, "Pizza de Queijo", """
                Pizza com muito queijo derretido e borda recheada
                """, CategoriaCardapio.PRATOS_PRINCIPAIS, null, null);
        itensPorId.put(3L, pizzaDeQueijo);

        ItemCardapio pudimDeLeite = new ItemCardapio(4L, "Pudim de Leite", """
                Pudim cremoso com calda de caramelo
                """, CategoriaCardapio.SOBREMESA, null, null);
        itensPorId.put(4L, pudimDeLeite);

        ItemCardapio aguaMineral = new ItemCardapio(5L, "Agua Mineral", """
                Agua Mineral sem gás
                """, CategoriaCardapio.BEBIDAS, null, null);
        itensPorId.put(5L, aguaMineral);

        ItemCardapio saladaCaesar = new ItemCardapio(6L, "Salada Caesar", """
                Salada com alface, croutons, queijo parmesao e molho Caesar
                """, CategoriaCardapio.ENTRADAS, null, null);
        itensPorId.put(6L, saladaCaesar);

        ItemCardapio bifeAcebolado = new ItemCardapio(7L, "Bife Acebolado", """
                Bife grelhado com cebolas caramelizadas
                """, CategoriaCardapio.PRATOS_PRINCIPAIS, null, null);
        itensPorId.put(7L, bifeAcebolado);

        ItemCardapio mousseDeChocolate = new ItemCardapio(8L, "Mousse de Chocolate", """
                Mousse leve e aerado de chocolate meio amargo
                """, CategoriaCardapio.SOBREMESA, null, null);
        itensPorId.put(8L, mousseDeChocolate);

        ItemCardapio refrigeranteLaranja = new ItemCardapio(9L, "Refrigerante de Laranja", """
                Refrigerante sabor laranja geladinho
                """, CategoriaCardapio.BEBIDAS, null, null);
        itensPorId.put(9L, refrigeranteLaranja);

        ItemCardapio bruschetta = new ItemCardapio(10L, "Bruschetta", """
                Pão italiano tostado com tomate, manjericão e azeite
                """, CategoriaCardapio.ENTRADAS, null, null);
        itensPorId.put(10L, bruschetta);

        ItemCardapio lasanhaBolonhesa = new ItemCardapio(11L, "Lasanha a Bolonhesa", """
                Camadas de massa, molho bolonhesa, queijo e molho bechamel
                """, CategoriaCardapio.PRATOS_PRINCIPAIS, null, null);
        itensPorId.put(11L, lasanhaBolonhesa);

        ItemCardapio sorveteBaunilha = new ItemCardapio(12L, "Sorvete de Baunilha", """
                Sorvete cremoso sabor baunilha com calda de chocolate
                """, CategoriaCardapio.SOBREMESA, null, null);
        itensPorId.put(12L, sorveteBaunilha);

        ItemCardapio chaGelado = new ItemCardapio(13L, "Cha Gelado", """
                Cha preto gelado com limão e hortelã
                """, CategoriaCardapio.BEBIDAS, null, null);
        itensPorId.put(13L, chaGelado);

    }

    public List<ItemCardapio> listaDeItensCardapio() {
        return new ArrayList<>(itensPorId.values());
    }

    public Optional<ItemCardapio> itemCardapioPorId(Long itemId) {
        ItemCardapio itemCardapio = itensPorId.get(itemId);
        return Optional.ofNullable(itemCardapio);
    }
}
