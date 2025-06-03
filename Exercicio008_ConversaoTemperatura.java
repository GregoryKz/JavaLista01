package dev_klaus.lista01;

import java.util.Scanner;

public class Exercicio008_ConversaoTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        String desejaContinuar;

        do {
            System.out.println("\n=== Conversão de Temperatura: Celsius para Fahrenheit ===");
            System.out.print("Digite a temperatura em graus Celsius: ");
            celsius = scanner.nextDouble();

            fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

            System.out.printf("A temperatura %.2f°C corresponde a %.2f°F%n", celsius, fahrenheit);

            System.out.print("Deseja fazer outra conversão? (Sim/Não): ");
            desejaContinuar = scanner.next();
        } while (desejaContinuar.equalsIgnoreCase("Sim"));

        System.out.println("Encerrando o programa. Obrigado por utilizar!");
        scanner.close();
    }
}
