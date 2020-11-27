package exercicios;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;

        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
    

        if (n1>=n2){
            System.out.printf("Valores digitados em ordem não crescente são:  %.1f , %.1f \n" , n1,n2);
        }else{
            System.out.printf("Valores digitados em ordem não crescente são: %.1f , %.1f \n" , n2,n1);

        }

        entrada.close();  
    }
}
