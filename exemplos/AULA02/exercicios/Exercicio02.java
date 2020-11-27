package exercicios;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
       
        nota1 = nota1 * 4;
        nota2 = nota2 * 6;
  
        media = (nota1 + nota2 )/10;

        if (media>= 6){
            System.out.println("O aluno foi APROVADO com a nota : " +media);
        }else{
            System.out.println("O aluno foi REPROVADO com a nota : " +media);

        }

        entrada.close();
    
} 
}
