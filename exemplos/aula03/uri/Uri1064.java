package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero, media = 0;

        double positivo = 0;
        int positivo_contador = 0;

        for (int i = 1; i < 7; i++) {
            numero = entrada.nextDouble();

            if (numero >= 0) {
                positivo = positivo + numero;
                positivo_contador++;
                media = positivo / positivo_contador;
            }

        }
        System.out.printf("%d valores positivos\n", positivo_contador);
        System.out.printf("%.1f\n", media);

        entrada.close();
    }
}
