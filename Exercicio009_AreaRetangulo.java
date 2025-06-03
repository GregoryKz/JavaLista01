package dev_klaus.lista01;

import java.util.Scanner;

public class Exercicio009_AreaRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largura;
        double altura;
        double area;
        String desejaContinuar;

        do {
            System.out.println("\n=== Cálculo da Área de um Retângulo ===");

            System.out.print("Digite a largura do retângulo: ");
            largura = scanner.nextDouble();

            System.out.print("Digite a altura do retângulo: ");
            altura = scanner.nextDouble();

            area = largura * altura;

            System.out.printf("A área do retângulo com largura %.2f e altura %.2f é: %.2f%n", largura, altura, area);

            System.out.print("Deseja calcular outra área? (Sim/Não): ");
            desejaContinuar = scanner.next();

        } while (desejaContinuar.equalsIgnoreCase("Sim"));

        System.out.println("Encerrando o programa. Obrigado por utilizar!");
        scanner.close();
    }
}
