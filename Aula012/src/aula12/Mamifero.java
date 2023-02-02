
package aula12;

public abstract class Mamifero extends Animal {
    
    //atributos
    protected String corPelo;
    
    //metodos da classe
    @Override
    public void emitirsom() {
        System.out.println("Som de mamifero");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void locomover() {
        System.out.println("Caminhando");
    }
    
    //metodos especiais

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
