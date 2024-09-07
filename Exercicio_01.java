package TRABALHO_01;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua Nota Final: ");
        double nota = s.nextDouble();

        if (nota > 6) {
            System.out.println("Aprovado");
        } else if (nota > 4 && nota <= 6) {

        } else {
            System.out.println("Reprovado");

        }
    }
}
