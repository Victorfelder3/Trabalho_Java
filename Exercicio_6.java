package TRABALHO_01;

import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {
        int numero;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        numero = s.nextInt();

        System.out.println("O número " + numero + " elevado a 2 é: " + Math.pow(numero, 2));
        System.out.println("O número " + numero + " elevado a 4 é: " + Math.pow(numero, 4));
        System.out.println("O número " + numero + " elevado a 6 é: " + Math.pow(numero, 6));
        System.out.println("O número " + numero + " elevado a 8 é: " + Math.pow(numero, 8));
        System.out.println("O número " + numero + " elevado a 10 é: " + Math.pow(numero, 10));

    }
}
