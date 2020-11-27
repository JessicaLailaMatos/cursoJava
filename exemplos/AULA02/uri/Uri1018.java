package uri;
import java.util.Scanner;

public class Uri1018 {
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int n , resto, cinquenta, vinte, dez, cinco, dois, um ;
        
        n = entrada.nextInt();  

        System.out.println (n);
                
        resto = n / 100;
        System.out.printf ("%d nota(s) de R$ 100,00\n", resto);
        resto = n % 100; // aqui pega o resto de 100
        

        cinquenta = resto / 50;
        System.out.printf ("%d nota(s) de R$ 50,00\n", cinquenta);
        resto = resto % 50; // aqui pega o resto de 50
       
        vinte = resto / 20;
        System.out.printf ("%d nota(s) de R$ 20,00\n", vinte);
        resto = resto % 20; // aqui pega o resto de 20
        //System.out.println(resto);

        dez = resto / 10;
        System.out.printf ("%d nota(s) de R$ 10,00\n", dez);
        resto = resto % 10; // aqui pega o resto de 10

        cinco = resto / 5;
        System.out.printf ("%d nota(s) de R$ 5,00\n", cinco);
        resto = resto % 5; // aqui pega o resto de 5

        dois = resto / 2;
        System.out.printf ("%d nota(s) de R$ 2,00\n", dois);
        resto = resto % 2; // aqui pega o resto de 2

        um = resto / 1;
        System.out.printf ("%d nota(s) de R$ 1,00\n", um);
        resto = resto % 1; // aqui pega o resto de 1
        
   
        entrada.close();


   } 
}
