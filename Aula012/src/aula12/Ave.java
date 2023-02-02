
package aula12;

public abstract class Ave extends Animal{
    
    //atributos
    protected String corPena;
    
    //metodos da classe
    public void fazerNinho() {
        System.out.println("Fazendo ninho");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de ave");
    }

    @Override
    public void alimentar() {
       System.out.println("alimentando-se de frutas"); 
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
