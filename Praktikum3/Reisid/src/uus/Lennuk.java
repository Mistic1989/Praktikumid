package uus;

public class Lennuk {
    public Lennuk(String nimi, double kiirus, int maxReisijateArv) {
        this.nimi = nimi;
        this.kiirus = kiirus;
        this.maxReisijateArv = maxReisijateArv;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getKiirus() {
        return this.kiirus;
    }

    public void setKiirus(double kiirus) {
        this.kiirus = kiirus;
    }

    public int getMaxReisijateArv() {
        return maxReisijateArv;
    }

    public void setMaxReisijateArv(int maxReisijateArv) {
        this.maxReisijateArv = maxReisijateArv;
    }

    public String toString() {
        return nimi + "\n" + "Kiirus: " + kiirus + "\n" + "Maksimaalne reisijate arv: " + maxReisijateArv + "\n";
    }

    private String nimi;
    private double kiirus;
    private int maxReisijateArv;
}
