
package aula013;

public abstract class Mamifero {
    
    //atributos
    protected float peso;
    protected int idade;
    protected int membros;
    protected String corDoPelo;
    
    //metodos da classe
    public void alimentar() {
        System.out.println("Mamando");
    }
    
    public void locomover() {
        System.out.println("Andando");
    }
    
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
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

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
    
}
