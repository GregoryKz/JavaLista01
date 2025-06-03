package dev_klaus.lista01;

import java.util.Scanner;

public class Exercicio007_MediaTresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        double media;
        String desejaContinuar;

        do {
            System.out.println("\n=== Cálculo da Média de Três Números ===");

            System.out.print("Digite o primeiro número inteiro: ");
            numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            numero2 = scanner.nextInt();

            System.out.print("Digite o terceiro número inteiro: ");
            numero3 = scanner.nextInt();

            media = (numero1 + numero2 + numero3) / 3.0;

            System.out.println("A média aritmética dos números " + numero1 + ", " + numero2 + " e " + numero3 + " é: " + media);

            System.out.print("Deseja calcular outra média? (Sim/Não): ");
            desejaContinuar = scanner.next();
        } while (desejaContinuar.equalsIgnoreCase("Sim"));

        System.out.println("Encerrando o programa. Obrigado por utilizar!");
        scanner.close();
    }
}
