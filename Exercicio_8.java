package TRABALHO_01;
import java.util.Scanner;
public class Exercicio_8 {
     public static void main(String[] args) {
         
         int valorDia1, valorDia30, consumoTotal, diasNoMes;
         double mediaDiaria;
         
         Scanner s = new Scanner(System.in);
          System.out.print("Digite o valor do medidor de água no dia 1º do mês (em litros): ");
          valorDia1 = s.nextInt();
          
          System.out.print("Digite o valor do medidor de água no dia 30º do mês (em litros): ");
          valorDia30 = s.nextInt(); 
          
          consumoTotal = valorDia30 - valorDia1;
          
          diasNoMes = 30;
          mediaDiaria = (double) consumoTotal / diasNoMes;
          
          System.out.println("Consumo total de água no mês: " + consumoTotal + " litros");
        System.out.println("Média diária de consumo: " + mediaDiaria + " litros por dia");
          
          
          
     }
    
    
    
}
