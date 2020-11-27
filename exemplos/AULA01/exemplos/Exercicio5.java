package exemplos;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double custo_de_fabrica, percentual_distribuidor , impostos , valor_carro_total, total_imposto;

            System.out.println("Digite o valor do custo de fabrica: ");
            custo_de_fabrica = entrada.nextDouble();
            
            entrada.close(); // encerra a conexão com o teclado

            percentual_distribuidor = custo_de_fabrica*0.28;
            impostos = custo_de_fabrica*0.45;
            total_imposto = impostos+percentual_distribuidor;
            valor_carro_total = custo_de_fabrica+total_imposto;

            System.out.printf( "O custo total do carro é de R$  %.2f, sendo o valor de impostos a ser pago no total de R$ %.2f " , valor_carro_total ,total_imposto );
    }
}
