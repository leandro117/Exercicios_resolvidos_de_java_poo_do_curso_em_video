
package classecaneta;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status() {
     System.out.println("Qual é o modelo ? " + this.modelo);
     System.out.println("Qual é a cor ? " + this.cor);
     System.out.println("Qual é a ponta ? " + this.ponta);
     System.out.println("Qual é a carga ? " + this.carga);
     System.out.println("Está tampada ? " + this.tampada);
    }
    
    public void rabiscar(){
     if (this.tampada == true) {
      System.out.println("Erro, Não posso rabiscar");
     } else {
      System.out.println("Estou rabiscando");
     }
    }
    
    private void tampar() {
     this.tampada = true;
    }
    
    private void destampar() {
     this.tampada = false;
    } 
    
}
