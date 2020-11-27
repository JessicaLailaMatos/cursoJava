package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMin, consumo;
        double valorPorKW, valorTotal, valorComDesconto;

        //entrada de dados
        //salário mínimo e qtde Kw
        System.out.println("Informe o valor do salário mínimo:");
        salarioMin = entrada.nextDouble();
        
        System.out.println("Informe a quantidade de KW consumido:");
        consumo = entrada.nextDouble();

        //processamento
        //valor por KW, valor total, valor com desconto
        valorPorKW = salarioMin / 500; //( 1 / 500)
        valorTotal = valorPorKW * consumo;
        valorComDesconto = valorTotal * 0.85;

        //saída
        System.out.println("Valor do KW: R$ " + valorPorKW);
        System.out.println("Valor da conta: R$ " + valorTotal);
        System.out.println("Valor com desconto: R$ " + valorComDesconto);

        System.out.printf("Valor do KW: R$ %.2f \n" , valorPorKW);
        System.out.printf("Valor da conta: R$ %.2f \n" , valorTotal);
        System.out.printf("Valor com desconto: R$ %.2f \n" , valorComDesconto);

        entrada.close();
    }
}