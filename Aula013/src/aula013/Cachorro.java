
package aula013;

public class Cachorro extends Lobo{

     //metodos da classe
    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }
    
    public void reagir(String frase) {
       if ("positivo".equals(frase)) {
        System.out.println("abanar e latir");
       } else {
        System.out.println("rosnar");
       }
    }
    
    public void reagir(int periodo) {
       if (periodo < 12) {
        System.out.println("abanar");
       } else if (periodo <= 18) {
        System.out.println("abanar e latir");
       } else {
        System.out.println("ignorar");
       }
    }
    
    public void reagir(boolean dono) {
       if (dono) {
        System.out.println("abanar");
       } else {
        System.out.println("rosnar e latir");
       }
    }
    
    public void reagir(int idade, float peso) {
       if (idade <= 5 && peso <= 10) {
        System.out.println("abanar");
       } else if (idade < 5 && peso > 10) {
        System.out.println("latir");
       } else if (idade > 5 && peso < 10) {
        System.out.println("rosnar");
       } else if (idade > 5 && peso > 10) {
        System.out.println("ignorar");
       }
    }
    
}
