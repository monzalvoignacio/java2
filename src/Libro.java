public class Libro {

    private String nombre;
    private String isbn;
    private String autor;
    private boolean disponible;

    public Libro(String n, String i, String a) {
        this.nombre = n;
        this.isbn = i;
        this.autor = a;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestamo() {
        this.disponible = false;
    }

    public void devolucion() {
        this.disponible = true;
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.isbn  + ", " + autor;
    }
}
