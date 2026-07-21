package mx.florinda;

import mx.florinda.cardapio.ItemCardapio;
import mx.florinda.enums.CategoriaCardapio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<ItemCardapio> listaDeItensCardapio() {
        List<ItemCardapio> itens = new ArrayList<>();

        ItemCardapio refrescoDoChaves = new ItemCardapio(1L, "Refresco do Chaves", """
                Suco de limao, que parece tamarindo mas tem gosto de groselha
                """, CategoriaCardapio.BEBIDAS, null, null);
        itens.add(refrescoDoChaves);

        ItemCardapio sopaDeLetra = new ItemCardapio(2L, "Sopa de Letra", """
                Sopa com macarrao em formato de letras do alfabeto
                """, CategoriaCardapio.ENTRADAS, null, null);
        itens.add(sopaDeLetra);

        ItemCardapio pizzaDeQueijo = new ItemCardapio(3L, "Pizza de Queijo", """
                Pizza com muito queijo derretido e borda recheada
                """, CategoriaCardapio.PRATOS_PRINCIPAIS, null, null);
        itens.add(pizzaDeQueijo);

        ItemCardapio pudimDeLeite = new ItemCardapio(4L, "Pudim de Leite", """
                Pudim cremoso com calda de caramelo
                """, CategoriaCardapio.SOBREMESA, null, null);
        itens.add(pudimDeLeite);

        ItemCardapio aguaMineral = new ItemCardapio(5L, "Agua Mineral", """
                Agua Mineral sem gás
                """, CategoriaCardapio.BEBIDAS, null, null);
        itens.add(aguaMineral);

        ItemCardapio saladaCaesar = new ItemCardapio(6L, "Salada Caesar", """
                Salada com alface, croutons, queijo parmesao e molho Caesar
                """, CategoriaCardapio.ENTRADAS, null, null);
        itens.add(saladaCaesar);

        ItemCardapio bifeAcebolado = new ItemCardapio(7L, "Bife Acebolado", """
                Bife grelhado com cebolas caramelizadas
                """, CategoriaCardapio.PRATOS_PRINCIPAIS, null, null);
        itens.add(bifeAcebolado);

        ItemCardapio mousseDeChocolate = new ItemCardapio(8L, "Mousse de Chocolate", """
                Mousse leve e aerado de chocolate meio amargo
                """, CategoriaCardapio.SOBREMESA, null, null);
        itens.add(mousseDeChocolate);

        ItemCardapio refrigeranteLaranja = new ItemCardapio(9L, "Refrigerante de Laranja", """
                Refrigerante sabor laranja geladinho
                """, CategoriaCardapio.BEBIDAS, null, null);
        itens.add(refrigeranteLaranja);

        ItemCardapio bruschetta = new ItemCardapio(10L, "Bruschetta", """
                Pão italiano tostado com tomate, manjericão e azeite
                """, CategoriaCardapio.ENTRADAS, null, null);
        itens.add(bruschetta);

        ItemCardapio lasanhaBolonhesa = new ItemCardapio(11L, "Lasanha a Bolonhesa", """
                Camadas de massa, molho bolonhesa, queijo e molho bechamel
                """, CategoriaCardapio.PRATOS_PRINCIPAIS, null, null);
        itens.add(lasanhaBolonhesa);

        ItemCardapio sorveteBaunilha = new ItemCardapio(12L, "Sorvete de Baunilha", """
                Sorvete cremoso sabor baunilha com calda de chocolate
                """, CategoriaCardapio.SOBREMESA, null, null);
        itens.add(sorveteBaunilha);

        ItemCardapio chaGelado = new ItemCardapio(13L, "Cha Gelado", """
                Cha preto gelado com limão e hortelã
                """, CategoriaCardapio.BEBIDAS, null, null);
        itens.add(chaGelado);

        return itens;
    }
}
