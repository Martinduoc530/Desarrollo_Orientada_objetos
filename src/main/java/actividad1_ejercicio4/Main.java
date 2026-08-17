package actividad1_ejercicio4;

class CuentaBancaria {

    String titular;
    String numeroCuenta;
    double saldo;
    boolean activa;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo, boolean activa) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.activa = activa;
    }

    public void ConsultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public void depositar(double monto) {
        if (activa && monto > 0) {
            saldo = saldo + monto;
            System.out.println("Deposito realizado correctamente");
        } else {
            System.out.println("No se pudo realizar el deposito");
        }
    }

    public void retirar(double monto) {
        if (activa && monto > 0 && saldo >= monto) {
            saldo = saldo - monto;
            System.out.println("Retiro realizado correctamente");
        } else {
            System.out.println("No se pudo realizar el retiro");
        }
    }
}













public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria(
                "Martin Gutierrez",
                "123456789",
                500000,
                true
        );

        cuenta1.ConsultarSaldo();

        System.out.println();

        cuenta1.depositar(100000);

        System.out.println();

        cuenta1.ConsultarSaldo();

        System.out.println();

        cuenta1.retirar(200000);

        System.out.println();

        cuenta1.ConsultarSaldo();

        // Dejé fuera datos como la dirección del titular y el historial de movimientos,
        // porque no son necesarios para representar las operaciones básicas de la cuenta:
        // consultar saldo, depositar dinero y retirar fondos.


    }



}
