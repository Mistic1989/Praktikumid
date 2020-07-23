import java.time.LocalDate;

public class Õpilaspilet implements Dokument {
    private int sünniaasta;

    @Override
    public String toString() {
        return "Õpilaspilet{" +
                "sünniaasta=" + sünniaasta +
                '}';
    }

    public Õpilaspilet(int sünniaasta) {
        this.sünniaasta = sünniaasta;
    }

    public boolean onVähemalt12Aastane() {
        return sünniaasta + 12 <= LocalDate.now().getYear();
    }
}