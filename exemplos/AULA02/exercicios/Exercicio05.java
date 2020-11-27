package exercicios;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;

        System.out.println("Digite a senha:" );
        senha = entrada.next();

        if (senha.equals("R10p5")){
           System.out.printf("Acesso concedido \n");
        }else{
          System.out.printf("Acesso negado \n");
        }

        entrada.close();  
    }
}
