import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private GregorianCalendar f;

     public Fecha(int d, int m, int a) {
         f = new GregorianCalendar(a, m, d);
     }

     public int getDia() {
         return f.get(Calendar.DAY_OF_MONTH);
     }

    public int getMes() {
        return f.get(Calendar.MONTH);
    }

    public int getAno() {
        return f.get(Calendar.YEAR);
    }

    public void agregarDia() {
        f.add(Calendar.DAY_OF_MONTH, 1);
    }

    @Override
    public String toString() {
         return getDia() + "/" + getMes() + "/" + getAno();
    }
}
