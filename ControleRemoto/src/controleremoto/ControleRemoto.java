
package controleremoto;

public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //metodos abstratos da classe
    
    @Override
    public void ligar() {
     this.setLigado(true);
    }
    
    @Override
    public void desligar() {
     this.setLigado(false);
    }
    
    @Override
    public void abriMenu(){
     if (this.getLigado() == true) {
      System.out.println("---------- Menu --------");
      System.out.println("Está ligado " + this.getLigado());
      System.out.println("Éstá tocando " + this.getTocando());
      System.out.println("Qual o volume ? " + this.getVolume());
      int i;
      for (i = 0; i < this.getVolume(); i+=10) {
       System.out.print("| ");
      }
      System.out.println("");
      } else {
       System.out.println("Não pode abrir o menu"); 
      }
    }
    
    @Override
    public void fechaMenu() {
     System.out.println("Fechando menu");
    }
    
    @Override
    public void maisVolume() {
     if (this.getLigado() == true) {
       this.setVolume(this.getVolume() + 1);
      } else {
       System.out.println("Impossível Aumentar volume");
      }
     }
    
    @Override
    public void menosVolume() {
     if (this.getLigado() == true) {
       this.setVolume(this.getVolume() - 1);
     } else {
       System.out.println("Impossível Diminuir volume");
     }
    }
    
    @Override
    public void ligarMudo() {
     if (this.getVolume() != 0 && this.getLigado() == true) {
      this.setVolume(0);
      System.out.println("está no mudo");
     } else {
      System.out.println("não está no mudo");
     }
    }
    
    @Override
    public void desligarMudo() {
     if (this.getVolume() == 0 && this.getLigado() == true) {
      this.setVolume(50);
      System.out.println("não está no mudo");
     }
    }
    
    @Override
    public void play() {
     if (this.getLigado() == true && this.getTocando() == false) {
      this.setTocando(true);
     } else {
        System.out.println("Não pode reproduzir");
     }
    }
    
    @Override
    public void pause() {
     if (this.getLigado() == true && this.getTocando() == true) {
      this.setTocando(false);
     }
    }
    
    //metodos especiais
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
