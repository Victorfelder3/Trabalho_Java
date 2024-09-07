package TRABALHO_01;
import java.util.Scanner;
public class Exercicio_5 {
     public static void main(String[] args){
         int numero;
         Scanner s = new Scanner(System.in);
         System.out.print("Digite um número inteiro: ");
         numero = s.nextInt();
         
         if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é Par.");
        } else {
            System.out.println("O número " + numero + " é Ímpar.");
        }

     }
    
}
