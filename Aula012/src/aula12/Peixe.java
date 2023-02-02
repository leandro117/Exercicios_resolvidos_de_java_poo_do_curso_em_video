
package aula12;

public abstract class Peixe extends Animal {
    
    //atributos
    protected String corescama;
    
    //metodos da classe
    public void soltabolha() {
        System.out.println("Soltando bolha");
    }
    
    //metodos especiais

    @Override
    public void emitirsom() {
        System.out.println("Som de peixe");
    }

    @Override
    public void alimentar() {
        System.out.println("alimentando-se de substancias");
    }

    @Override
    public void locomover() {
        System.out.println("Som de peixe");
    }
    
    //metodos especiais

    public String getCorescama() {
        return corescama;
    }

    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }
    
}
