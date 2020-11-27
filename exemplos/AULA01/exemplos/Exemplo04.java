package exemplos;

import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {

        System.out.println("Digite um numero inteiro: ");
        Scanner entrada = new Scanner(System.in);
        int numero;

        numero = entrada.nextInt();
        System.out.println("você digitou "+ numero);
        

        entrada.close(); // encerra a conexão com o teclado
    }
    
}
