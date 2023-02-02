
package ultimateemojicombat;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    
    //metodos da classe
    public void marcaLuta(Lutador desafiante, Lutador desafiado) {
     if (desafiante != desafiado 
         && desafiante.getCategoria().equals(desafiado.getCategoria())) {
      this.setAprovada(true);
      System.out.println("A luta foi marcada");
      this.desafiante = desafiante;
      this.desafiado = desafiado;
     } else {
      this.setDesafiado(null);
      this.setDesafiante(null);
      System.out.println("A luta não pode ser marcada");
     }
        
    }
    
    public void luta() {
     if (this.getAprovada()) {
      this.desafiante.apresentar();
      this.desafiado.apresentar();
      Random aleatorio = new Random();
      int vencedor = aleatorio.nextInt(3);
      //Empate
         switch (vencedor) {
             case 0:
                 System.out.println("Deu empate");
                 desafiante.empatarLuta();
                 desafiado.empatarLuta();
                 break;
             case 1:
                 System.out.println("Vitória do desafiante");
                 desafiante.ganharLuta();
                 desafiado.perderLuta();
                 break;
             case 2:
                 System.out.println("Vitória do desafiado");
                 desafiado.ganharLuta();
                 desafiante.perderLuta();
                 break;
         }
     }
    }
    
    //metodos especiais

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiando) {
        this.desafiante = desafiando;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
