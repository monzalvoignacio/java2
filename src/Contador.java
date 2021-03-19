public class Contador {
    private int cont = 0;

    public Contador() {
        this.cont = 0;
    }

    public Contador(int c) {
        this.cont = c;
    }

    public Contador(Contador c) {
        this.cont = c.getCont();
    }

    public int getCont() {
        return cont;
    }

    public void increment() {
        this.cont++;
    }

    public void decrement() {
        this.cont++;
    }
}
