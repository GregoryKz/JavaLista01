package dev_klaus.lista01;

import java.util.Scanner;

public class Exercicio006_QuadradoNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int quadrado;
        String desejaContinuar;

        do {
            System.out.println("\n=== Cálculo do Quadrado de um Número ===");
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();

            quadrado = numero * numero;

            System.out.println("O quadrado do número " + numero + " é: " + quadrado);

            System.out.print("Deseja calcular o quadrado de outro número? (Sim/Não): ");
            desejaContinuar = scanner.next();
        } while (desejaContinuar.equalsIgnoreCase("Sim"));

        System.out.println("Encerrando o programa. Obrigado por utilizar!");
        scanner.close();
    }
}
