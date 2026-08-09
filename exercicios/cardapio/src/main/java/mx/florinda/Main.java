package mx.florinda;

import mx.florinda.cardapio.ItemCardapio;
import mx.florinda.enums.CategoriaCardapio;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();
        List<ItemCardapio> itens = database.listaDeItensCardapio();

       itens.forEach(System.out::println);

       System.out.println("----------");

        Optional<ItemCardapio> optionalItem = database.itemCardapioPorId(31L);
        if (optionalItem.isPresent()) {
            System.out.println(optionalItem);
        } else {
            System.out.println("Item não encontrado!");
        }

    }
}