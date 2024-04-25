import java.util.Scanner;

public class AccionesBancarias {

    static String[] acciones = {"A --> Ver balance", "B --> Depositar", "C --> Retirar"};

    static void imprimirAcciones(){
        System.out.println("¿Qué acción deseas realizar? ");
        for (String accion: acciones){
            System.out.println(accion);
        }
    }

    public static void realizarOperaciones(Cajero cajero){
        Scanner respuesta = new Scanner(System.in);
        String eleccion = respuesta.nextLine().trim().toUpperCase();
        switch (eleccion){
            case "A":
                cajero.verBalance();
                continuar(cajero);
                break;
            case "B":
                System.out.println("Ingrese la cantidad que desea depositar: ");
                respuesta = new Scanner(System.in);
                double depositoCantidad = respuesta.nextDouble();
                cajero.depositar(depositoCantidad);
                continuar(cajero);
                break;
            case "C":
                System.out.println("Ingresa la cantidad que deseas retirar: ");
                respuesta = new Scanner(System.in);
                double retiroCantidad = respuesta.nextDouble();
                cajero.retiro(retiroCantidad);
                continuar(cajero);
                break;
            default:
                System.out.println("Opción invalidad");
                imprimirAcciones();
                realizarOperaciones(cajero);
        }

    }

    static void continuar(Cajero cajero){
        System.out.println("¿Deseas realizar otra accion? ");
        Scanner imput = new Scanner(System.in);
        String eleccion = imput.nextLine().trim().toLowerCase();
        switch (eleccion){
            case "si":
                imprimirAcciones();
                realizarOperaciones(cajero);
                break;
            case "no":
                System.out.println("Gracias por usar nuestro servicio");
                break;
            default:
                System.out.println("Opción invalidad");
                continuar(cajero);
        }
    }
}
