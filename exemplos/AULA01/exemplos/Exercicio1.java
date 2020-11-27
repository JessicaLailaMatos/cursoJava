package exemplos;
    
    import java.util.Scanner;

    public class Exercicio1 {
    
        public static void main(String[] args) {
    
            Scanner entrada = new Scanner(System.in);
            int nota1, nota2;

                        
            System.out.println("Digite a nota 1 do aluno: ");
            nota1 = entrada.nextInt();
            

            System.out.println("Digite a nota 2 do aluno: ");
            nota2 = entrada.nextInt();


            entrada.close(); // encerra a conexão com o teclado
                 

            System.out.println("A media do aluno é "+ ((nota1+nota2)/2));

            
    
            
        }
        
    }