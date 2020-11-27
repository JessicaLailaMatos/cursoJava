package exercicios.exercicio01;

import java.util.ArrayList;

public class Gerenciar {
    private ArrayList<Animal> listaAnimais;

    public Gerenciar(){
        listaAnimais = new ArrayList<>();
    }

    public void novoAnimal(String nomeAnimal, String raca, String cor, int anoNascimento, String nome, String telefone){
        listaAnimais.add(new Animal(nomeAnimal, raca, cor, anoNascimento, nome, telefone));
    }
    public String buscaPorRaca(String raca){
        String saida = "";

        for (Animal animal : listaAnimais){
            if (animal.getRaca().equalsIgnoreCase(raca)){
                saida += animal.getProprietario() + "\n";
            }
        }
        return saida;
    }
    
    @Override
    public String toString(){
        String saida = "";

        for (Animal animal : listaAnimais){
            saida += animal + "\n";
            }
            return saida;

    }
}
