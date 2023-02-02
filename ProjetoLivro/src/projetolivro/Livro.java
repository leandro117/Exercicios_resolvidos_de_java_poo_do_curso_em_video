
package projetolivro;

public class Livro implements Publicacao{
  
  //atributos
  private String titulo;
  private String autor;
  private int totalPag;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;
  
  //construtor
  public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
   this.titulo = titulo;
   this.autor = autor;
   this.totalPag = totalPag;
   this.pagAtual = 0;
   this.aberto = false;
   this.leitor = leitor;
  }
  
  //metodos da classe
  public String detalhes() {
   return "Livro{" + "\n titulo=" + titulo + "\n autor="
   + autor + "\n totalPag=" + totalPag
   + "\n pagAtual=" + pagAtual + "\n aberto=" 
   + aberto + "\n leitor=" + leitor.getNome() + '}';
  }

  //metodos interface
  @Override
  public void abrir() {
   this.setAberto(true);
  }
  
  @Override
  public void fechar() {
   this.setAberto(false);
  }

  @Override
  public void folhear(int p) {
   if (p <= this.getTotalPag()) {
    this.setPagAtual(p); 
   } else {
    System.out.println("Não é possivel folhear até essa pagina");
   }
  }

  @Override
  public void avancarPag() {
   this.setPagAtual(this.getPagAtual() + 1);
  }

  @Override
  public void voltaPag() {
   this.setPagAtual(this.getPagAtual() - 1);    
  }
  
  //metodos especiais

  public String getTitulo() {
   return titulo;
  }

  public void setTitulo(String titulo) {
   this.titulo = titulo;
  }

  public String getAutor() {
   return autor;
  }

  public void setAutor(String autor) {
   this.autor = autor;
  }

  public int getTotalPag() {
   return totalPag;
  }

  public void setTotalPag(int totalPag) {
   this.totalPag = totalPag;
  }

  public int getPagAtual() {
   return pagAtual;
  }

  public void setPagAtual(int pagAtual) {
   this.pagAtual = pagAtual;
  }

  public boolean getAberto() {
   return aberto;
  }

  public void setAberto(boolean aberto) {
   this.aberto = aberto;
  }

  public Pessoa getLeitor() {
   return leitor;
  }

  public void setLeitor(Pessoa leitor) {
   this.leitor = leitor;
  }

}
