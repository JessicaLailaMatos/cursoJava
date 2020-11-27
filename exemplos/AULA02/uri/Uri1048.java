package uri;
import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, reajuste, novo_salario;

        salario = entrada.nextDouble();

        if ((salario >= 0) && (salario <= 400)) {
            reajuste = salario * 0.15;
            novo_salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 15 %%");

        } else if ((salario >= 400.01) && (salario <= 800)) {
            reajuste = salario * 0.12;
            novo_salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 12 %%");

        } else if ((salario >= 800.01) && (salario <= 1200)) {
            reajuste = salario * 0.10;
            novo_salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 10 %%");

        } else if ((salario >= 1200.01) && (salario <= 2000)) {
            reajuste = salario * 0.07;
            novo_salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 7 %%");

        } else {
            reajuste = salario * 0.04;
            novo_salario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novo_salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 4 %%");

        }

        entrada.close();
    }
}

