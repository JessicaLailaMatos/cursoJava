package uri;

import java.util.Scanner;


public class Uri1006 {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, media;

        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        a = a * 2;
        b = b * 3;
        c = c * 5;

        media = (a + b + c )/10;

        System.out.printf("MEDIA = %.1f\n" , media);

        entrada.close();
    }
}
