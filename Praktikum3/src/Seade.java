public class Seade {
    public Seade(int kood, String nimetus, double hindKMta) {
        this.kood = kood;
        this.nimetus = nimetus;
        this.hindKMta = hindKMta;
    }

    public int getKood() {
        return kood;
    }

    public void setKood(int kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double getHindKMta() {
        return hindKMta;
    }

    public void setHindKMta(double hindKMta) {
        this.hindKMta = hindKMta;
    }

    private int kood;
    private String nimetus;
    private double hindKMta;
    private static double kaibemaks = 20.0;

    public double kmhind(double hindKMta) {
        return hindKMta * ((kaibemaks/100)+1);
    }

    public String toString() {
        return "Seadme kood on: " + kood + "\n" + "Nimetus: " + nimetus + "\n" + "Hind ilma kaibemaksuta: " + hindKMta + "\n" + "Kaibemaks: " + kaibemaks + "\n" + "Hind koos kaibemaksuga: " + kmhind(hindKMta);
    }
}
