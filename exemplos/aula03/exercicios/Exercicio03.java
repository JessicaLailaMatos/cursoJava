package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n, cont;

        n = entrada.nextInt();
        cont = 1;

        while (cont<= n){
            if (cont <=n/2){
                System.out.printf(cont +", ");

            }else {
                System.out.printf("" + cont);
            }

            cont = cont * 2;

        }
        

        entrada.close();
    }
}
