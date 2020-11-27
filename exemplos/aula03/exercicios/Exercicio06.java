package exercicios;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n , cont_par, par;


        par = 0;
        cont_par = 0;
 


        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número:  ", i + 1);
            n = entrada.nextInt();

            if (n % 2 == 0) {
                par = par + n;
                cont_par++;
            } 

        }
        System.out.printf("A média dos valores pares é :  %d \n", par/cont_par);
        System.out.printf("A porcentagem de numeros impares entre todos os digitados é :  %d %% \n", (10-cont_par)*10);

        entrada.close(); 
    }
}
