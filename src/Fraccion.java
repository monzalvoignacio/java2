public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int n, int d) {
        numerador = n;
        denominador = d;
    }

    public int getDenominador() {
        return denominador;
    }

    public double valor() {
        return (float)numerador / (float)denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void suma(Fraccion f) {
        numerador = numerador*f.getDenominador() + denominador*f.getNumerador();
        denominador = denominador*f.getDenominador();
    }

    public void suma(int f) {
        Fraccion aux = new Fraccion(f, 1);
        suma(aux);
    }

    public void resta(Fraccion f) {
        numerador = numerador*f.getDenominador() - denominador*f.getNumerador();
        denominador = denominador*f.getDenominador();
    }

    public void resta(int f) {
        Fraccion aux = new Fraccion(f, 1);
        resta(aux);
    }

    public void multiplicar(Fraccion f) {
        numerador = numerador*f.getNumerador();
        denominador = denominador*f.getDenominador();
    }

    public void multiplicar(int f) {
        Fraccion aux = new Fraccion(f, 1);
        multiplicar(aux);

    }

    public void dividir(Fraccion f) {
        numerador = numerador*f.getDenominador();
        denominador = denominador*f.getNumerador();
    }

    public void dividir(int f) {
        Fraccion aux = new Fraccion(f, 1);
        dividir(aux);
    }

}
