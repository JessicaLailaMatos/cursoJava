package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int numero;
    String valor;

    System.out.println("Digite o valor: ");
    valor = entrada.nextLine();

    try{
        numero = Integer.parseInt(valor);
        System.out.println(numero % 2 == 0);
    }catch (InputMismatchException e){
        System.out.println("Entrada invalida.");
     }catch (NumberFormatException e){
         System.out.println("Erro de conversão");
     }catch (Exception e){
         System.out.println(e.getMessage());
     } finally {

     }

    System.out.println("Final do programa.");
    entrada.close();

}
}
