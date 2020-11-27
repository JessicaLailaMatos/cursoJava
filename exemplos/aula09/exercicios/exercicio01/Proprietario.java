package exercicios.exercicio01;

public class Proprietario {
    private String nome;
    private String telefone;

    //Contrutor
    public Proprietario(){
        this.nome = "Não cadastrado";
        this.telefone = "-";
    }

    public Proprietario(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }


    @Override
    public String toString(){
        return ("Proprietario: " + nome + " " + telefone );
    }

    
}
