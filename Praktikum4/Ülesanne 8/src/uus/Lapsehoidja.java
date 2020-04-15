package uus;

public class Lapsehoidja {
    public Lapsehoidja(int number, String nimi) {
        this.number = number;
        this.nimi = nimi;
    }

    public int getNumber() {
        return number;
    }

    public String getNimi() {
        return nimi;
    }

    private int number;
    private String nimi;

    @Override
    public String toString() {
        return number + " " + nimi;
    }
}
