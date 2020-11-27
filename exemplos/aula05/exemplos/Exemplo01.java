package exemplos;

import java.util.ArrayList;

public class Exemplo01 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(7);
        lista.add(2);
        lista.add(90);

        for (int i = 0; i < lista.size(); i++) { //para cada indice
            System.out.println(lista.get(i) + " ");
        }

        System.out.println();
        
        for (Integer item : lista){ // para cada item Inte da lista
            System.out.println(item + " ");

        }

        System.out.println();

        System.out.println(lista);
    }
}