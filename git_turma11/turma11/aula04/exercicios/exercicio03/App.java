package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("VW", "Gol", 12.5);
        Veiculo carro2 = new Veiculo("Chevrolet", "Cruze", 7.5);

        carro1.exibir();
        System.out.println("O consumo do carro 1 é " + carro1.consumo() + " km/l");
        
        carro2.exibir();
        System.out.println("O consumo do carro 2 é " + carro2.consumo() + " km/l");
    }
}