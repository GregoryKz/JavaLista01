package dev_klaus.lista01;

import java.util.Scanner;

public class Exercicio005_RestoDivisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividendo;
        int divisor;
        int resto;
        String desejaContinuar;

        do {
            System.out.println("\n=== Cálculo do Resto da Divisão ===");
            System.out.print("Digite o número dividendo (inteiro): ");
            dividendo = scanner.nextInt();

            // Loop para garantir que o divisor não seja zero
            do {
                System.out.print("Digite o número divisor (inteiro diferente de zero): ");
                divisor = scanner.nextInt();
                if (divisor == 0) {
                    System.out.println("Erro: o divisor não pode ser zero. Tente novamente.");
                }
            } while (divisor == 0);

            resto = dividendo % divisor;
            System.out.println("O resto da divisão de " + dividendo + " por " + divisor + " é: " + resto);

            System.out.print("Deseja realizar outro cálculo? (Sim/Não): ");
            desejaContinuar = scanner.next();
        } while (desejaContinuar.equalsIgnoreCase("Sim"));

        System.out.println("Encerrando o programa. Obrigado por utilizar!");
        scanner.close();
    }
}
