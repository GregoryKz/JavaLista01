package dev_klaus.lista01;

import java.util.Scanner;

public class Exercicio010_PerimetroCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio;
        double perimetro;
        String desejaContinuar;

        do {
            System.out.println("\n=== Cálculo do Perímetro de um Círculo ===");

            System.out.print("Digite o raio do círculo: ");
            raio = scanner.nextDouble();

            perimetro = 2 * Math.PI * raio;

            System.out.printf("O perímetro do círculo de raio %.2f é: %.2f%n", raio, perimetro);

            System.out.print("Deseja calcular outro perímetro? (Sim/Não): ");
            desejaContinuar = scanner.next();

        } while (desejaContinuar.equalsIgnoreCase("Sim"));

        System.out.println("Encerrando o programa. Obrigado por utilizar!");
        scanner.close();
    }
}
