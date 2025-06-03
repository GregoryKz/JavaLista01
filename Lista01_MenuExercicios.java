package dev_klaus.lista01;

import java.util.Scanner;

public class Lista01_MenuExercicios {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String opcao;

        do {
            mostrarMenu();

            System.out.print("Escolha o número do exercício (1 a 10) ou 0 para sair: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> exercicio01_SomaDoisNumeros();
                case "2" -> exercicio02_SubtracaoDoisNumeros();
                case "3" -> exercicio03_MultiplicacaoDoisNumeros();
                case "4" -> exercicio04_DivisaoDoisNumeros();
                case "5" -> exercicio05_RestoDivisao();
                case "6" -> exercicio06_QuadradoNumero();
                case "7" -> exercicio07_MediaTresNumeros();
                case "8" -> exercicio08_ConversaoTemperatura();
                case "9" -> exercicio09_AreaRetangulo();
                case "10" -> exercicio10_PerimetroCirculo();
                case "0" -> System.out.println("Saindo do programa. Obrigado!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (!opcao.equals("0"));

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n===== Menu de Exercícios Lista 01 =====");
        System.out.println("1 - Soma de Dois Números");
        System.out.println("2 - Subtração de Dois Números");
        System.out.println("3 - Multiplicação de Dois Números");
        System.out.println("4 - Divisão de Dois Números");
        System.out.println("5 - Resto da Divisão");
        System.out.println("6 - Quadrado de um Número");
        System.out.println("7 - Cálculo da Média de Três Números");
        System.out.println("8 - Conversão de Temperatura (Celsius para Fahrenheit)");
        System.out.println("9 - Cálculo de Área de um Retângulo");
        System.out.println("10 - Cálculo de Perímetro de um Círculo");
        System.out.println("0 - Sair");
        System.out.println("======================================");
    }

    // Exercício 1
    private static void exercicio01_SomaDoisNumeros() {
        System.out.println("\n-- Exercício 1: Soma de Dois Números --");
        int n1 = lerInteiro("Digite o primeiro número inteiro: ");
        int n2 = lerInteiro("Digite o segundo número inteiro: ");
        int soma = n1 + n2;
        System.out.println("Resultado: " + n1 + " + " + n2 + " = " + soma);
    }

    // Exercício 2
    private static void exercicio02_SubtracaoDoisNumeros() {
        System.out.println("\n-- Exercício 2: Subtração de Dois Números --");
        int n1 = lerInteiro("Digite o primeiro número inteiro: ");
        int n2 = lerInteiro("Digite o segundo número inteiro: ");
        int diferenca = n1 - n2;
        System.out.println("Resultado: " + n1 + " - " + n2 + " = " + diferenca);
    }

    // Exercício 3
    private static void exercicio03_MultiplicacaoDoisNumeros() {
        System.out.println("\n-- Exercício 3: Multiplicação de Dois Números --");
        int n1 = lerInteiro("Digite o primeiro número inteiro: ");
        int n2 = lerInteiro("Digite o segundo número inteiro: ");
        int produto = n1 * n2;
        System.out.println("Resultado: " + n1 + " * " + n2 + " = " + produto);
    }

    // Exercício 4
    private static void exercicio04_DivisaoDoisNumeros() {
        System.out.println("\n-- Exercício 4: Divisão de Dois Números --");
        int dividendo = lerInteiro("Digite o dividendo (inteiro): ");
        int divisor;
        do {
            divisor = lerInteiro("Digite o divisor (inteiro diferente de zero): ");
            if (divisor == 0) {
                System.out.println("Erro: divisor não pode ser zero. Tente novamente.");
            }
        } while (divisor == 0);
        double quociente = (double) dividendo / divisor;
        System.out.printf("Resultado: %d / %d = %.2f%n", dividendo, divisor, quociente);
    }

    // Exercício 5
    private static void exercicio05_RestoDivisao() {
        System.out.println("\n-- Exercício 5: Resto da Divisão --");
        int dividendo = lerInteiro("Digite o dividendo (inteiro): ");
        int divisor;
        do {
            divisor = lerInteiro("Digite o divisor (inteiro diferente de zero): ");
            if (divisor == 0) {
                System.out.println("Erro: divisor não pode ser zero. Tente novamente.");
            }
        } while (divisor == 0);
        int resto = dividendo % divisor;
        System.out.println("Resto da divisão: " + resto);
    }

    // Exercício 6
    private static void exercicio06_QuadradoNumero() {
        System.out.println("\n-- Exercício 6: Quadrado de um Número --");
        int numero = lerInteiro("Digite um número inteiro: ");
        int quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " é " + quadrado);
    }

    // Exercício 7
    private static void exercicio07_MediaTresNumeros() {
        System.out.println("\n-- Exercício 7: Cálculo da Média de Três Números --");
        int n1 = lerInteiro("Digite o primeiro número inteiro: ");
        int n2 = lerInteiro("Digite o segundo número inteiro: ");
        int n3 = lerInteiro("Digite o terceiro número inteiro: ");
        double media = (n1 + n2 + n3) / 3.0;
        System.out.printf("A média dos números %d, %d e %d é %.2f%n", n1, n2, n3, media);
    }

    // Exercício 8
    private static void exercicio08_ConversaoTemperatura() {
        System.out.println("\n-- Exercício 8: Conversão Celsius para Fahrenheit --");
        double celsius = lerDouble("Digite a temperatura em Celsius: ");
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        System.out.printf("%.2f°C equivale a %.2f°F%n", celsius, fahrenheit);
    }

    // Exercício 9
    private static void exercicio09_AreaRetangulo() {
        System.out.println("\n-- Exercício 9: Cálculo da Área de um Retângulo --");
        double largura = lerDouble("Digite a largura do retângulo: ");
        double altura = lerDouble("Digite a altura do retângulo: ");
        double area = largura * altura;
        System.out.printf("A área do retângulo é %.2f%n", area);
    }

    // Exercício 10
    private static void exercicio10_PerimetroCirculo() {
        System.out.println("\n-- Exercício 10: Cálculo do Perímetro de um Círculo --");
        double raio = lerDouble("Digite o raio do círculo: ");
        double perimetro = 2 * Math.PI * raio;
        System.out.printf("O perímetro do círculo é %.2f%n", perimetro);
    }

    // Método para ler inteiro com mensagem
    private static int lerInteiro(String mensagem) {
        int numero;
        while (true) {
            try {
                System.out.print(mensagem);
                String entrada = scanner.nextLine();
                numero = Integer.parseInt(entrada);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        }
        return numero;
    }

    // Método para ler double com mensagem
    private static double lerDouble(String mensagem) {
        double numero;
        while (true) {
            try {
                System.out.print(mensagem);
                String entrada = scanner.nextLine();
                numero = Double.parseDouble(entrada);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número decimal válido.");
            }
        }
        return numero;
    }
}
