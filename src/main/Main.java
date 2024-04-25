import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();
        cuenta.setTitular("Fabian");
        cuenta.setBalance(5630);
        Cajero cajero = new Cajero(cuenta);

        System.out.println("Hola, bienvenido " + cuenta.getTitular()+ " al banco 'CHINGON'");
        AccionesBancarias.imprimirAcciones();

        AccionesBancarias.realizarOperaciones(cajero);

    }


}
