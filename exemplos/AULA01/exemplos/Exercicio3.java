package exemplos;
    
    import java.util.Scanner;

    public class Exercicio3 {
    
        public static void main(String[] args) {
    
            Scanner entrada = new Scanner(System.in);
            double salario;

                        
            System.out.println("Digite o salario: ");
            salario = entrada.nextDouble();
            
            entrada.close(); // encerra a conexão com o teclado
                 

            System.out.println("o salario com aumento de 25% é  "+ ((salario*0.25)+salario));

            
    
            
        }
        
    }