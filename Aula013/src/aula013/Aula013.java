
package aula013;

public class Aula013 {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        c.reagir("positivo");
        c.reagir("negativo");
        c.reagir(11);
        c.reagir(19);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
    
}
