
public class Elektriauto {
    private String autoMark;
    private double elektriKulu;
    private int laadimisAeg;
    private int soiduUlatus;
    //private Elektrijaam elektrijaam;
    private double elektrihind;
/*
    public Elektrijaam getElektrijaam() {
        return elektrijaam;
    }
*/
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
    public Elektriauto(String autoMark, double elektriKulu, int soiduUlatus, int laadimisAeg, double elektrihind) {
        this.autoMark = autoMark;
        this.elektriKulu = elektriKulu;
        this.elektrihind = elektrihind;
        this.laadimisAeg = laadimisAeg;
        this.soiduUlatus = soiduUlatus;

    }

    public double maksumus100() {
        return elektrihind * this.elektriKulu;
    }
    public double maksumus(int teepikkusKm) {
        return (teepikkusKm * this.maksumus100()) / 100;
    }
    public double reisiKestus(int teepikkusKm, double keskmineKiirus) {
        return ((teepikkusKm/this.soiduUlatus) * this.laadimisAeg + teepikkusKm/keskmineKiirus);
    }
    public String toString() {
        return "Elektriauto: " +
                "automark = " + autoMark +
                ", elektrikulu = " + elektriKulu + "kWh/100km" +
                ", sõiduulatus = " + soiduUlatus + " km" +
                ", laadimisaeg = " + laadimisAeg + " min" +
                ", elektrihind = " + elektrihind + " eur/kWh";

    }

}
