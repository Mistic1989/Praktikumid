import java.time.LocalDate;

public class Juhiluba {
    public String toString() {
        return juhiluba;
    }

    public Juhiluba(String juhiluba) {
        this.juhiluba = juhiluba;
    }

    private String juhiluba;
    public boolean kasKehtib() {
        int praeguneAasta = LocalDate.now().getYear();
        int aasta = Integer.parseInt(juhiluba.substring(0, 4));
        return aasta >= praeguneAasta;
    }
}
