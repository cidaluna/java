package mx.florinda;

import mx.florinda.cardapio.ItemCardapio;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();
        List<ItemCardapio> itens = database.listaDeItensCardapio();

        for(ItemCardapio item: itens){
            System.out.println(item);
        }
    }
}