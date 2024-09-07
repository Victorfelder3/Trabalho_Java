
package TRABALHO_01;
import java.util.Scanner;
public class Exercicio_4 {
     public static void main(String[] args){
         int numero1, numero2;
         Scanner s = new Scanner(System.in);
         System.out.print("Digite o primeiro número inteiro: ");
         numero1 = s.nextInt();
        
       System.out.print("Digite o segundo número inteiro: ");
       numero2 = s.nextInt();
       
       if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else if (numero1 < numero2) {
            System.out.println("O primeiro número é menor que o segundo.");
        } else {
            System.out.println("O primeiro número é igual ao segundo.");
        }
     }
}
