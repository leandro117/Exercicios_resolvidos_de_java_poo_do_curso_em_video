
package projetoyoutube;

public class Gafanhoto extends Pessoa {
    
    //atributos
    private int login;
    private int totAssistindo;

    public Gafanhoto(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.totAssistindo = 0;
    }
    
    //metodos da classe
    public void viuMaisUm() {
        this.setTotAssistindo(this.getTotAssistindo() + 1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString()
               + "login=" + login 
               + ", totAssistindo=" + totAssistindo + '}';
    }
    
    
    
    //metodos especiais
    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }
    
}
