package TRABALHO_01;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {
        String nome;
        String genero;
        String corFavorita;
        String praticaEsporte;
        int idade;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        nome = s.nextLine();

        System.out.print("Digite sua Idade: ");
        idade = s.nextInt();

        System.out.print("Digite seu Genero (Masculino/Feminino/Outro): ");
        genero = s.nextLine();

        System.out.print("Digite sua Cor Favorita: ");
        corFavorita = s.nextLine();

        System.out.print("Você pratica Esporte? (Sim/Nao): ");
        praticaEsporte = s.nextLine();

        System.out.println("\nInformações digitadas:");
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("genero: " + genero);
        System.out.println("corFavorita: " + corFavorita);
        System.out.println("praticaEsporte: " + praticaEsporte);
    }
}
