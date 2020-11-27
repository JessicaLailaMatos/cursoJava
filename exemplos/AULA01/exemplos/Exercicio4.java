package exemplos;
    
    import java.util.Scanner;

    public class Exercicio4 {
    
        public static void main(String[] args) {
    
            Scanner entrada = new Scanner(System.in);
            double salarioMinimo, qtd_quilowatts, valor_quilowatts, valor_pago, valor_desconto;

                        
            System.out.println("Digite o valor do salario minimo: ");
            salarioMinimo = entrada.nextDouble();

            System.out.println("Digite o valor da quantidade de quilowatts: ");
            qtd_quilowatts = entrada.nextDouble();
            
            entrada.close(); // encerra a conexão com o teclado
             
            valor_quilowatts = salarioMinimo/500;
            valor_pago = valor_quilowatts*qtd_quilowatts;
            valor_desconto = valor_pago*0.15;

            System.out.println("o valor em reais de cada quilowatt é  "+ valor_quilowatts);
            System.out.println("o valor em reais a ser pago por essa residência é  "+ valor_pago);
            System.out.println("o valor em reais a ser pago com desconto de 15% é  "+ (valor_pago-valor_desconto));



            
    
            
        }
        
    }