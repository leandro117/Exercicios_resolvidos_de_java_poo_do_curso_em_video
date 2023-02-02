//nao é recomendado que metodos printem coisa nas tela.
package contabanco;

//import java.util.Scanner;


public class ContaBanco {


   public int numConta;
   protected String tipo;
   private String dono;
   private float saldo;
   private boolean status;
   
   
    //construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
   
    //metodo de estado atual
    public void estado() {
     System.out.println("--------------------");
     System.out.println("Conta: " + this.getNumConta());
     System.out.println("Tipo: " + this.getTipo());
     System.out.println("Dono: " + this.getDono());
     System.out.println("Saldo: " + this.getSaldo());
     System.out.println("Status: " + this.getStatus());
     System.out.println("--------------------");
    }
   
    // metodos da classe
    public void abrirConta(String tipo){
    this.setStatus(true);
    System.out.println("Conta aberta com sucesso");
    //settar tipo de conta
    System.out.println("Seu tipo de conta é " + tipo);
     if(tipo == "cc") {
      this.setSaldo(saldo + 50);
     } else {
      this.setSaldo(saldo + 150);
     }
    }

    public void fecharConta(){
     if (this.getSaldo() == 0) {
      System.out.println("Conta encerrada com sucesso");
      this.setStatus(false);
     } else {
      System.out.println("Não pode encerrar a conta!!!");
      if (this.getSaldo() > 0) {
       System.out.println("Porque a conta contem saldo");    
      } else if (this.getSaldo() < 0) {
       System.out.println("Porque a conta contém debito");
      }
     }
    }

    public void depositar(float valor){
     if (this.getStatus() == true) {
      System.out.println("Deposito realizado com sucesso");
      this.setSaldo(valor + saldo);
      System.out.println("Deposito realizado de " + valor);
     } else {
      System.out.println("Não foi possivel fazer o deposito, porque você não tem uma conta");
     }
    }

    public void sacar(int valor){
     if (this.getStatus() == true) {
      if (valor <= this.getSaldo()) {
      System.out.println("Saque realizado com sucesso");
      this.setSaldo(saldo - valor);
      System.out.println("Saque realizado de " + valor);
       if (this.getStatus() == false) {
        System.out.println("Não foi possivel fazer o saque, porque você não tem uma conta");
       } 
      } else if (valor > this.getSaldo()) {
         System.out.println("Saldo insuficiente");
      }
     }
    }

    public void pagarMensal(){
     if (this.getStatus() == true) {
      if (this.getSaldo() > 0) {
       if (this.getTipo() == "cc") {
        this.setSaldo(saldo - 12);
       } else if (this.getTipo() == "cp"){
        this.setSaldo(saldo - 20);
       }
      } else {
      System.out.println("Saldo insuficiente");
      }
     } else {
      System.out.println("Não possui uma conta");
     }
    }

     //metodos dos atributos
     public int getNumConta() {
         return numConta;
     }

     public void setNumConta(int numConta) {
         this.numConta = numConta;
     }

     public String getTipo() {
         return tipo;
     }

     public void setTipo(String tipo) {
         this.tipo = tipo;
     }

     public String getDono() {
         return dono;
     }

     public void setDono(String dono) {
         this.dono = dono;
     }

     public float getSaldo() {
         return saldo;
     }

     public void setSaldo(float saldo) {
         this.saldo = saldo;
     }

     public boolean getStatus() {
         return status;
     }

     public void setStatus(boolean status) {
         this.status = status;
     }
   
}
