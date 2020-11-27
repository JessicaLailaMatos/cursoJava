package exemplos;

public class Exemplo02{

    public static void main(String[] args) {
        linha(20); // chamada de metodo com 2 parametros
        System.out.println("Sistema de cadastro. ");
        linha(20);
        System.out.println("Bem vindo! Escolha a opção ao menu abaixo");
        linha(42);
    }

  static void linha(int tamanho) {

    for (int i = 0; i < tamanho; i++){
      System.out.print("-");
        
    }
    System.out.println();

}




}