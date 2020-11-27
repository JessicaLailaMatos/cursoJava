package exercicios.exercicio05;

import exercicios.exercicio04.Ebook;

public class App {
    public static void main(String[] args) {
        Ebook livro1 = new Ebook("Java", "Jessica", 400, 100);
        livro1.dadosOriginais();


        livro1.setPaginaAtual(150);
        System.out.println("Avanço de pagina: "+ livro1.getPaginaAtual());
        
        
    }
    
}
