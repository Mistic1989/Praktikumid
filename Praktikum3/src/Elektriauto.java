
public class Elektriauto {
    private String autoMark;
    private double elektriKulu;
    private int laadimisAeg;
    private int soiduUlatus;
    private Elektrijaam elektrijaam;

    public Elektrijaam getElektrijaam() {
        return elektrijaam;
    }

    public int getLaadimisAeg() {
        return laadimisAeg;
    }

    public void setLaadimisAeg(int laadimisAeg) {
        if (laadimisAeg < 0) {
            System.out.println("Positiivne arv peab olema!");
        } else {
            this.laadimisAeg = laadimisAeg;
        }

    }
/*
    public Elektrijaam getElektriHind() {
        return elektriHind;
    }

    public void setElektriHind(Elektrijaam elektriHind) {
        this.elektriHind = elektriHind;
    }


*/
    public Elektriauto(String autoMark, double elektriKulu, int soiduUlatus, int laadimisAeg, Elektrijaam elektrijaam) {
        this.autoMark = autoMark;
        this.elektriKulu = elektriKulu;
        this.laadimisAeg = laadimisAeg;
        this.soiduUlatus = soiduUlatus;
        this.elektrijaam = elektrijaam;
    }

    public double maksumus100() {

        return elektrijaam.getElektrihind() * this.elektriKulu;
    }
    public double maksumus(int teepikkusKm) {

        return (teepikkusKm * this.maksumus100()) / 100;
    }
    public double reisiKestus(int teepikkusKm, double keskmineKiirus) {
        return (int)Math.round((teepikkusKm/this.soiduUlatus) * this.laadimisAeg/60 + teepikkusKm/keskmineKiirus);
    }
    public String toString() {
        return "Elektriauto: " +
                "automark = " + autoMark +
                ", elektrikulu = " + elektriKulu + "kWh/100km" +
                ", sõiduulatus = " + soiduUlatus + " km" +
                ", laadimisaeg = " + laadimisAeg + " min" +
                ", elektrihind = " + elektrijaam.getElektrihind() + " eur/kWh" +
                ", sajakilomeetrilise reisi maksumus = " + maksumus100();
    }

}
