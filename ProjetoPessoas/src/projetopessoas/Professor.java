
package projetopessoas;

public class Professor {
    
    //atributos
    private String especialidade;
    private float salário;

    //construtor
 /*   public Professor(String especialidade, float salário) {
        this.especialidade = especialidade;
        this.salário = salário;
    }
*/    
    //metodos da classe
    public void receberAum(float aum) {
     this.setSalário(this.getSalário() + aum);
    }
    
    //metodos especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalário() {
        return salário;
    }

    public void setSalário(float salário) {
        this.salário = salário;
    }
    
    
}
