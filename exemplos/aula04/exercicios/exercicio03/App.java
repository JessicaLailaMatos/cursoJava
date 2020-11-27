package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        Veiculo m1 = new Veiculo ("Fit", "Honda", 14);
        m1.exibir();
        double consumo =  m1.obterConsumo();
        System.out.println("Consumo = "+consumo);

        Veiculo m2 = new Veiculo ("civic", "Honda", 10);
        m2.exibir();
        m2.alterarConsumo(20);
        
    }
    
}
