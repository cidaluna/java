package mx.florinda;

import java.net.URL;
import java.util.Scanner;

public class ClienteViaCEP {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://viacep.com.br/ws/01001000/json/");

        try (Scanner scanner = new Scanner(url.openStream())) { // nesse caso ele mesmo fecha o scanner
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }

    }
}
