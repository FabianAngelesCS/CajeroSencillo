import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        AccionesBancarias accioneseElegir = new AccionesBancarias();

        Cuenta cuenta = new Cuenta();
        cuenta.setTitular("Fabian");
        cuenta.setBalance(5630);
        Cajero cajero = new Cajero(cuenta);

        System.out.println("Hola, bienvenido " + cuenta.getTitular()+ " al banco CHINGON");

        System.out.println("¿Qué acción deseas realizar? " + accioneseElegir.acciones);


    }
}
