package dev_klaus.lista01;

import java.util.Scanner;

public class Exercicio002_SubtracaoDoisNumeros {

    public static void main(String[] args) {

        /*Faça um programa que solicite dois valores a usuario e retorne a subtração*/
        /*Feito por Klaus*/
        Scanner sc = new Scanner(System.in);

        float numero1;
        float numero2;
        float resultado;
        String resposta;



        while (true){

            System.out.println("Olá seja bem vindo! Ao programa de soma");
            System.out.println("Para começar digite o primeiro numero da subtração:");
            numero1 = sc.nextFloat();
            System.out.println("Digite o segundo numero para  subtração:");
            numero2 = sc.nextFloat();

            if (numero1==0 && numero2 ==0){
                System.out.println("Opa você digitou numeros 0");
                System.out.println("Tente novamente...");
                continue;

            }

            resultado = numero1 - numero2;
            System.out.println("O resultado dos numeros:  "+ numero1 + " - " + numero2 + " = " + resultado);
            System.out.println("Obrigado por usar o programa!");

            System.out.println("Desaja fazer outra subtração? (Sim/Não)");
            resposta = sc.next();

            if (!resposta.equalsIgnoreCase("Sim")){
                System.out.println("Encerrando o programa. Obrigado por utilizar!");
                break;
            }




        }
        sc.close();

    }

}
