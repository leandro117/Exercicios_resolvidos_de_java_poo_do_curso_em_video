
package classecaneta;

public class Principal {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.tampada = false;
        c1.carga = 80;
        c1.status();
        c1.rabiscar();
    }
}
