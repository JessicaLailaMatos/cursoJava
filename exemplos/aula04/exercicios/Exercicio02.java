package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, resposta;

        System.out.println("Digite 3 numeros: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();


        resposta = menorNumero (n1,n2,n3);
        System.out.println("O menor numero é: "+ resposta);

        entrada.close();

    }

    static int menorNumero (int a, int b, int c){
        int resultado;
       
        if (a<= b && a<=c){
            resultado = a;
        }else if (b<= c && b <= a){
            resultado = b;
        } else{
            resultado = c;
        }

        return resultado;


    }
}
