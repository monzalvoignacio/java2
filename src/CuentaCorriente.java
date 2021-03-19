public class CuentaCorriente {

    private double saldo;

    public CuentaCorriente(CuentaCorriente c) {
        this.saldo = c.getSaldo();
    }

    public CuentaCorriente() {
        this.saldo = 0;
    }

    public CuentaCorriente(int s) {
        this.saldo = s;
    }

    public double getSaldo() {
        return this.saldo;
    };

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void ingreso(int s) {
        this.saldo += s;
    }

    public void reintegro(int s) {
        ingreso(s);
    }

    public void egreso(int s) {
        this.saldo -= s;
    }

    public void transferencia(int s) {
        egreso(s);
    }
}
