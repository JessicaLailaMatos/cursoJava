package exercicios;

import java.util.Scanner;

public class Exercicio01 {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, resposta;

        System.out.println("Digite um numero: ");
        n = entrada.nextInt();

        resposta = par(n);
        System.out.println("Resultado = "+ resposta);

        entrada.close();

    }
       static int par (int n1){
        int resultado;
       
        if (n1 % 2 == 0){
            resultado = n1;
            System.out.println("O numero é par");
        }else{
            resultado = n1;
            System.out.println("O numero é impar");
        }

        return resultado;
}

}
