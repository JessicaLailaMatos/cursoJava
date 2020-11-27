package exercicios.exercicio04;

public class Ebook {
  private  String titulo, autor;
  private  int totalPaginas , paginaAtual;


  public Ebook (String titulo, String autor, int totalPaginas, int paginaAtual) {
      this.titulo = titulo;
      this.autor = autor;
      this.totalPaginas = totalPaginas;
      setPaginaAtual(paginaAtual);


}

// valida avançar paginas
public void setPaginaAtual(int novoPaginaAtual) {
    if (novoPaginaAtual > paginaAtual && novoPaginaAtual <= totalPaginas) {
        paginaAtual = novoPaginaAtual;
    }
}

public int getPaginaAtual() {
    return paginaAtual;
}

// -----------------------------------------



public void dadosOriginais() {
    System.out.println("Titulo do livro: "+ titulo);
    System.out.println("Autor do livro: "+ autor);
    System.out.println("Total de Paginas: "+ totalPaginas);
    System.out.println("Pagina Atual: "+ paginaAtual);


}
    
}
