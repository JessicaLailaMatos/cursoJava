package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtd_peca1, qtd_peca2;
        double valor_peca1, valor_peca2;
        double valor_pago1 , valor_pago2, valor_final;

        entrada.nextInt();
        qtd_peca1 = entrada.nextInt();
        valor_peca1 = entrada.nextDouble();

        entrada.nextInt();
        qtd_peca2 = entrada.nextInt();
        valor_peca2 = entrada.nextDouble();

        valor_pago1 = qtd_peca1*valor_peca1;
        valor_pago2 = qtd_peca2*valor_peca2;

        valor_final = valor_pago1+valor_pago2;


        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , valor_final);

        entrada.close();
    }
    
}
