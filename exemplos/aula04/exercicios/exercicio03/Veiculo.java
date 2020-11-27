package exercicios.exercicio03;

public class Veiculo {
    String modelo, marca;
    double consumo; 


// contrutor para inicializar os atributos da classe
    Veiculo(String modelo, String marca, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    // metodos para exibir modelo e marca
    void exibir(){
        System.out.println("o modelo do carro é "+modelo);
        System.out.println("A marca do carro é "+marca);
       
    }
// metodos para retornar consumo
    double obterConsumo(){
        return consumo;

    }

    public void alterarConsumo(double novoConsumo){
        if(novoConsumo >0 && novoConsumo <=30){
            consumo = novoConsumo;
        }
                

    }
    
}
