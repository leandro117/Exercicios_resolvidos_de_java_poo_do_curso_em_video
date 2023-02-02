
package projetopessoas;

public class Funcionario {
    
    //atributos
    private String setor;
    private boolean trabalhando;
    
    //construtor
/*    public Funcionario(String setor, boolean trabalhando) {
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
 */   
    //metodos da classe
    public void mudarTrabalho() {
        this.setTrabalhando(!this.getTrabalhando());
    }
    
    //metodos especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
