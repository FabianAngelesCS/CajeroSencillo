public class Cajero  {

    private Cuenta cuenta;

    public Cajero(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void verBalance(){
        System.out.println("Hola " + cuenta.getTitular() + " tu balance es: " + cuenta.getBalance());
    }

    public void depositar(double depositoCantidad){
        cuenta.setBalance(cuenta.getBalance() + depositoCantidad);
        verBalance();
    }

    public void retiro(double retiroCantidad){
        if (retiroCantidad > cuenta.getBalance()){
            System.out.println("No pudes retirar mas de tus fondos totales");
            verBalance();
        }else {
            cuenta.setBalance(cuenta.getBalance()-retiroCantidad);
            verBalance();
        }
    }
}
