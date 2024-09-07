package TRABALHO_01;
import java.util.Scanner;
public class Exercicio_7 {
  public static void main(String[] args) {
      
      int num1, num2;
      Scanner s = new Scanner(System.in);
      
       System.out.print("Digite o primeiro número inteiro (num1): ");
       num1 = s.nextInt();
      
       System.out.print("Digite o segundo número inteiro (num2): ");
       num2 = s.nextInt();
       
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
      
      
  }  
    
}
