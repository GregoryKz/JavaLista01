package dev_klaus.lista01;

import java.util.Scanner;

public class Exercicio004_DivisaoDoisNumeros {

    public static void main(String[] args) {

        /*Escreva um programa que solicite ao usuário dois números e exiba o produto (multiplicação) entre eles.*/

        /*Feito por Klaus*/
        Scanner sc = new Scanner(System.in);

        float numero1;
        float numero2;
        float resultado;
        String resposta;

        while (true) {

            System.out.println("Olá! Seja bem-vindo ao programa de multiplicação.");
            System.out.print("Digite o primeiro número: ");
            numero1 = sc.nextFloat();
            System.out.print("Digite o segundo número: ");
            numero2 = sc.nextFloat();

            if (numero1 == 0 && numero2 == 0) {
                System.out.println("Você digitou dois números 0. Isso não é permitido.");
                System.out.println("Tente novamente...");
                continue;
            }

            resultado = numero1 * numero2;
            System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + resultado);

            System.out.print("Deseja fazer outra multiplicação? (Sim/Não): ");
            resposta = sc.next();

            if (!resposta.equalsIgnoreCase("Sim")) {
                System.out.println("Encerrando o programa. Obrigado por utilizar!");
                break;
            }
        }

        sc.close();
    }
}

