package banco;

public class Cuenta extends Object {
    private int numeroCuenta;
    private String titular;
    private double saldo;

    public Cuenta(int numeroCuenta, String titular,
            double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double importe) {
        if (importe > 0) {
            this.saldo = this.saldo + importe;
        }
    }

    public void retirar(double importe) {
        if (importe > 0 && importe <= this.saldo) {
            this.saldo = this.saldo - importe;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Cuenta N°: " + this.numeroCuenta
                + ", Titular: " + this.titular
                + ", Saldo: Bs" + this.saldo);
    }
}
