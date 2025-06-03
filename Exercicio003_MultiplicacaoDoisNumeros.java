package dev_klaus.lista01;

import java.util.Scanner;

public class Exercicio003_MultiplicacaoDoisNumeros {

    public static void main(String[] args) {

        /*Escreva um programa que solicite ao usuário dois números inteiros e exiba o produto deles.
         */
        /*Feito por Klaus*/
        Scanner sc = new Scanner(System.in);

        float numero1;
        float numero2;
        float resultado;
        String resposta;



        while (true){

            System.out.println("Olá seja bem vindo! Ao programa de multiplicação");
            System.out.println("Para começar digite o primeiro numero da multiplicação:");
            numero1 = sc.nextFloat();
            System.out.println("Digite o segundo numero para multiplicação:");
            numero2 = sc.nextFloat();

            if (numero1==0 && numero2 ==0){
                System.out.println("Opa você digitou dois numeros 0");
                System.out.println("Tente novamente...");
                continue;

            }

            resultado = numero1 * numero2;
            System.out.println("O resultado dos numeros:  "+ numero1 + " * " + numero2 + " = " + resultado);
            System.out.println("Obrigado por usar o programa!");

            System.out.println("Desaja fazer outra multiplicação? (Sim/Não)");
            resposta = sc.next();

            if (!resposta.equalsIgnoreCase("Sim")){
                System.out.println("Encerrando o programa. Obrigado por utilizar!");
                break;
            }




        }
        sc.close();

    }
}
