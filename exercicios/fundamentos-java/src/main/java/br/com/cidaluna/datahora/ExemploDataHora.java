package main.java.br.com.cidaluna.datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploDataHora {

    public static void executar() {
        System.out.println("\n ----> java.time (Date and Time API)");

        // LocalDate: só a data, sem hora nem fuso
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        // LocalTime: só a hora, sem data nem fuso
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual);

        // LocalDateTime: data + hora juntas, ainda sem fuso
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora atual: " + dataHoraAtual);

        // formatando para exibição mais amigável
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String dataUsuario = "01/05/2025";
        LocalDate data = LocalDate.parse(dataUsuario, formatoData);
        DateTimeFormatter outroFormato = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(data.format(outroFormato));

        System.out.println("\n--- Formatado ---");
        System.out.println("Data formatada: " + dataAtual.format(formatoData));
        System.out.println("Data e hora formatada: " + dataHoraAtual.format(formatoDataHora));
    }
}
