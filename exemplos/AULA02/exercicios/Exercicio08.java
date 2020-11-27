package exercicios;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado_A, lado_B, lado_C;

        System.out.println("Digite o valor do lado A do triangulo: ");
        lado_A = entrada.nextDouble();

        System.out.println("Digite o valor do lado B do triangulo: ");
        lado_B = entrada.nextDouble();

        System.out.println("Digite o valor do lado C do triangulo: ");
        lado_C = entrada.nextDouble();
        

        if (lado_A > (lado_B+lado_C)) {
            System.out.println("Não formam Triangulo algum");

        } else if ((lado_A == lado_B) && (lado_A == lado_C) && (lado_B == lado_C)) {
            System.out.println("Triangulo Equilatero");

        } else if ((lado_A == lado_B) || (lado_A == lado_C) || (lado_B == lado_C)) {
            System.out.println("Triangulo Isósceles");

        } else  {
            System.out.println("Triangulo escaleno");
        }


        entrada.close();
    }
}
