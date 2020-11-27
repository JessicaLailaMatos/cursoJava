package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n, cont, soma;


        cont = 1;
        soma = 0;

        System.out.printf("Digite o %dº número:  ", cont);
        n = entrada.nextInt();

        while (n != 0) {
            
            soma = soma + n;
            cont++;

            System.out.printf("Digite o %dº número:  ", cont);
            n = entrada.nextInt();

            if (n == 0) {
                System.out.printf("A soma dos numeros digitado é:  %d ", soma);
            }
        }

        entrada.close();
    }
}
