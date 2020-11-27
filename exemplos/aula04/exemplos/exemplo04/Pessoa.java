package exemplos.exemplo04;

public class Pessoa {
    // atributos - caracteristicas
    String nome;


    //método construtor
    Pessoa(String nomePessoa){
        nome = nomePessoa;

    }

        // metodos - ações
        void apresentar(){
            System.out.println("Olá eu sou "+nome);
        }
}
