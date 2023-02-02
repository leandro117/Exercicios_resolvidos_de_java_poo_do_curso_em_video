
package aula12;

public abstract class Animal {
    
    //atributos
    protected float peso;
    protected int idade;
    protected int membros;
    
    //metodos da classe
    public abstract void locomover();
    
    public abstract void alimentar();
    
    public abstract void emitirsom();
    
    //metodos especiais
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
}
