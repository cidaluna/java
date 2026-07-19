package main.java.br.com.cidaluna.streams;

import main.java.br.com.cidaluna.modelo.Veiculo;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamVeiculo {

    public static void executar() {
        System.out.println("----> Stream - Veículo");

        List<Veiculo> veiculos = List.of(
                new Veiculo("Civic", "Honda", "Preto", 145000.00, 2023, 210),
                new Veiculo("Corolla", "Toyota", "Branco", 150000.00, 2022, 220),
                new Veiculo("Corolla", "Toyota", "Prata", 140000.00, 2020, 210),
                new Veiculo("Gol", "Volks", "Azul", 20000.00, 2020, 170),
                new Veiculo("Golf", "Volks", "Preto", 200000.00, 2020, 220),
                new Veiculo("X1", "BMW", "Branco", 300000.00, 2023, 250),
                new Veiculo("HB20", "Hyundai", "Vermelho", 78000.00, 2021, 170),
                new Veiculo("Model 3", "Tesla", "Branco", 250000.00, 2024, 260)
        );

        // filter + forEach: veículos acima de R$100.000
        System.out.println("\n--- Veículos acima de R$100.000 ---");
        veiculos.stream()
                .filter(veiculo -> veiculo.getPreco() > 100_000)
                .forEach(System.out::println);

        // map: extrai só os nomes, transformando Stream<Veiculo> em Stream<String>
        System.out.println("\n--- Apenas os nomes ---");
        List<String> nomes = veiculos.stream()
                .map(Veiculo::getNome)
                .collect(Collectors.toList());
        System.out.println(nomes);

        // sorted: ordena por velocidade máxima, do mais rápido pro mais lento
        System.out.println("\n--- Ordenados por velocidade máxima (decrescente) ---");
        veiculos.stream()
                .sorted((v1, v2) -> v2.getVelocidadeMaxima() - v1.getVelocidadeMaxima())
                .forEach(System.out::println);

        // anyMatch: verifica se existe pelo menos um veículo branco
        boolean existeBranco = veiculos.stream()
                .anyMatch(veiculo -> veiculo.getCor().equalsIgnoreCase("Branco"));
        System.out.println("\nExiste algum veículo branco? " + existeBranco);

        // average: média de preço (precisa de mapToDouble pra virar Stream numérico)
        double precoMedio = veiculos.stream()
                .mapToDouble(Veiculo::getPreco)
                .average()
                .orElse(0);
        System.out.println("Preço médio: R$" + String.format("%.2f", precoMedio));

        // carro mais caro
        Veiculo carroMaisCaro = veiculos.stream()
                .max(Comparator.comparingDouble(Veiculo::getPreco))
                .orElse(null); // ou um Veiculo "vazio" padrão, se preferir não lidar com null depois

        if (carroMaisCaro != null) {
            System.out.println("Carro mais caro custa: R$"
                    + String.format("%.2f", carroMaisCaro.getPreco())
                    + " é " + carroMaisCaro.getNome());
        }

        // media dos Corollas
        double mediaCorollas = veiculos
                .stream()
                .filter(v -> v.getNome().equalsIgnoreCase("corolla"))
                .mapToDouble(Veiculo::getPreco)
                .average()
                .orElse(0);

        System.out.println("Média de preço dos Corollas: R$" + String.format("%.2f", mediaCorollas));


        // groupingBy: agrupa os veículos por marca
        System.out.println("\n--- Agrupados por marca ---");
        var porMarca = veiculos.stream()
                .collect(Collectors.groupingBy(Veiculo::getMarca));
        porMarca.forEach((marca, listaVeiculos) ->
                System.out.println(marca + ": " + listaVeiculos.size() + " veículo(s)"));
    }
}