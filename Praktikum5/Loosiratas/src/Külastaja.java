public class Külastaja {
    @Override
    public String toString() {
        return "Külastaja{" +
                "nimi='" + nimi + '\'' +
                '}';
    }

    public String getNimi() {
        return nimi;
    }

    public int getAtraktsioonideArv() {
        return atraktsioonideArv;
    }

    private String nimi;
    private int atraktsioonideArv;
}
