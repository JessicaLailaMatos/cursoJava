package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int cont, tabuada, result;

        tabuada = entrada.nextInt();
    

        cont = 0;
        while (cont <= 10) {
            result = (tabuada * cont);
            System.out.printf("%d X %d = %d\n", tabuada , cont, result);
            cont++; // cont = cont + 1;

        }


        entrada.close();
    
    }
}
