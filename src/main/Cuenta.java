public class Cuenta {

    private String titular;
    private double balance;

    public Cuenta(String titular, double balance) {
        this.titular = titular;
        this.balance = balance;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
