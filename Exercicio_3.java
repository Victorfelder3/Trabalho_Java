package TRABALHO_01;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        double num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número (num1): ");
        num1 = s.nextDouble();

        System.out.print("Digite o segundo número (num2): ");
        num2 = s.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = 0;

        if (num2 != 0) {
            divisao = num1 / num2;
        } else {
            System.out.println("Divisão por zero não é permitida.");
        }
        System.out.println("\nResultados das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        if (num2 != 0) {
            System.out.println("Divisão: " + divisao);
        }
    }
}
