package exercicios.exercicio01;

public class Animal {
    private String nomeAnimal;
    private String raca;
    private String cor;
    private int anoNascimento;
    private Proprietario proprietario;

    public  Animal (String nomeAnimal, String raca, String cor, int anoNascimento){
        this.nomeAnimal = nomeAnimal;
        this.raca = raca;
        this.cor = cor;
        this.anoNascimento = anoNascimento;
        this.proprietario = new Proprietario(); //associação entre classes
    }

    public  Animal (String nomeAnimal, String raca, String cor, int anoNascimento, String nome, String telefone){
        this.nomeAnimal = nomeAnimal;
        this.raca = raca;
        this.cor = cor;
        this.anoNascimento = anoNascimento;
        this.proprietario = new Proprietario(nome, telefone); //associação entre classes
    }

    public Proprietario getProprietario

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString(){
        return "Nome: " + nomeAnimal + " raça: " + raca + " cor: " +cor + " nascimento: " +anoNascimento + " " +proprietario;
    }


    
}
