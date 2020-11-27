package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;
        double par, impar;

        par = 0;
        impar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número:  ", i + 1);
            n = entrada.nextInt();

            if (n % 2 == 0) {
                par = par + n;
            } else {
                impar = impar + n;
            }

        }
        System.out.printf("O total de par é:  %.1f \n", par);
        System.out.printf("O total de impares é:  %.1f \n", impar);

        entrada.close();
    }
}
