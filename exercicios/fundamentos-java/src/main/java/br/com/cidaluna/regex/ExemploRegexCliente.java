package main.java.br.com.cidaluna.regex;

import main.java.br.com.cidaluna.modelo.Cliente;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExemploRegexCliente {
    // padrão simples de e-mail: texto@texto.dominio
    private static final Pattern PADRAO_EMAIL =
            Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");

    // padrão de CEP brasileiro: 00000-000 ou 00000000
    private static final Pattern PADRAO_CEP =
            Pattern.compile("^\\d{5}-?\\d{3}$");

    public static void executar() {
        System.out.println("----> Regex (Pattern / Matcher)");

        Cliente clienteValido = new Cliente(1, "Cida", "123.456.789-00", "cida@email.com", "13560-000");
        Cliente clienteInvalido = new Cliente(2, "Isidro", "987.654.321-00", "isidro@isidro", "13798000abc");

        validar(clienteValido);
        validar(clienteInvalido);
    }

    private static void validar(Cliente cliente) {
        System.out.println("\nValidando cliente id=" + cliente.getId());

        boolean emailValido = corresponde(PADRAO_EMAIL, cliente.getEmail());
        boolean cepValido = corresponde(PADRAO_CEP, cliente.getCep());

        System.out.println("Email '" + cliente.getEmail() + "' válido? " + emailValido);
        System.out.println("CEP '" + cliente.getCep() + "' válido? " + cepValido);
    }

    // método utilitário: encapsula o uso de Matcher pra não repetir código
    private static boolean corresponde(Pattern padrao, String valor) {
        Matcher matcher = padrao.matcher(valor);
        return matcher.matches(); // matches() exige que a string INTEIRA corresponda ao padrão
    }
}
