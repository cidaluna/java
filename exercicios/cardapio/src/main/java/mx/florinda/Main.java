package mx.florinda;

import mx.florinda.cardapio.ItemCardapio;
import mx.florinda.enums.CategoriaCardapio;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();
        List<ItemCardapio> itens = database.listaDeItensCardapio();

        // Saber quais as categorias realmente tenho no cardapio
        Set<CategoriaCardapio> categorias = new HashSet<>();
        for(ItemCardapio item: itens){
            CategoriaCardapio categoria = item.categoria();
            categorias.add(categoria);
        }
        for(CategoriaCardapio categoria : categorias){
            System.out.println(categoria);
        }

        System.out.println("----> Stream");
        itens.stream()
                .map(ItemCardapio::categoria)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}