/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

/**
 *
 * @author leandro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ContaBanco conta1 = new ContaBanco();
     ContaBanco conta2 = new ContaBanco();
     
     conta1.setNumConta(1111);
     conta1.setDono("Jubileu");
     conta1.abrirConta("cc");
     conta1.depositar(300);
     conta1.fecharConta();
     conta1.estado();
     
     conta2.setNumConta(2222);
     conta2.setDono("Creuza");
     conta2.abrirConta("cp");
     conta2.depositar(500);
     conta2.sacar(100);
     conta2.estado();
    }
    
}
