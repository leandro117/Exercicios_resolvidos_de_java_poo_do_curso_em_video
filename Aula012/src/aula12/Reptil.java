
package aula12;

public abstract class Reptil extends Animal{
    
    //atributos
    protected String corescama;
    
    //metodos da classe
    @Override
    public void emitirsom() {
        System.out.println("Som de reptil");
    }

    @Override
    public void alimentar() {
        System.out.println("come folhas");
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    
    //metodos especiais

    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }
    
}
