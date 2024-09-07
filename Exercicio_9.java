package TRABALHO_01;
import java.util.Scanner;
import java.lang.Math;
public class Exercicio_9 {
   public static void main(String[] args) {
       int numero;
       double potencia, raizQuadrada;
       Scanner s = new Scanner(System.in);
       
       System.out.print("Digite um número inteiro: ");
       numero = s.nextInt();
       
       if (numero > 10 && numero < 100) {
           
            potencia = Math.pow(numero, 2);
            System.out.printf("A potência de %d elevado a 2 é: %.5f%n", numero, potencia);
        } else {
            
            raizQuadrada = Math.sqrt(numero);
            System.out.printf("A raiz quadrada de %d é: %.5f%n", numero, raizQuadrada);
        }
       
       
       
   } 
    
}
