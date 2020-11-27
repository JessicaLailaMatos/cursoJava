package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.println("Digite o seu nome: ");
        // nome = entrada.next(); // até encontrarr o espaço
        nome = entrada.nextLine(); // até encontrar enter

        System.out.println(nome);

        entrada.close();  
    }

}
