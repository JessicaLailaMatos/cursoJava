package exemplos.exemplo05;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();

        lista.add(new Carro());
        lista.add(new Moto());

        for (Veiculo veiculo : lista){
            veiculo.acelerar(10);
        }
        System.out.println(lista);
    }
}
