package exercicios;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao;

        salario = entrada.nextDouble();
        prestacao = entrada.nextDouble();
    
        salario = salario*0.3;

        if (salario<prestacao){
           System.out.printf("A linha de credito NÃO pode ser concedida \n");
        }else{
          System.out.printf("A linha de credito PODE ser concedida \n");

       }

        entrada.close();  
}
}
