package exercicios;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        n = entrada.nextInt();

        if (n>= 20){
            n = n/2;
            System.out.println("a metade do numero digitado é: " +n);
        }
        
        entrada.close();
    }
}
