public class Main {

    public static void main(String[] args)
    {
        CuentaCorriente c1 = new CuentaCorriente();
        CuentaCorriente c2 = new CuentaCorriente(10);
        CuentaCorriente c3 = new CuentaCorriente(c2);
        System.out.println("c1" + c1.getSaldo());
        System.out.println("c2" + c2.getSaldo());
        System.out.println("c3" + c3.getSaldo());

        Libro l = new Libro("Harry", "isbn", "JK");
        System.out.println(l.toString());


        Fraccion f = new Fraccion(3, 5);
        f.multiplicar(2);
        f.multiplicar(1);
        f.suma(1);
        System.out.println(f.valor());

        Fecha fecha = new Fecha(28, 1, 1996);
        fecha.agregarDia();
        fecha.agregarDia();
        System.out.println(fecha.getDia());
        System.out.println(fecha.getMes());
        System.out.println(fecha.getAno());
        System.out.println(fecha.toString());

        System.out.println(StringUtil.indexOfN("John|Paul|George|Ringo", '|', 2));

    }
}
