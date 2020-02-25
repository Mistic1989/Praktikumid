// Ulesanne 3

class Isik {

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(double pikkus) {
        if (pikkus < 0) {
            System.out.println("Sisestage positiivne arv pikkusele!");
        } else {
            this.pikkus = pikkus;
        }

    }
    // Isikukoodi ei tohi saada muuta! Väärtus antakse isendiloome käigus.
/*
    public String getIsikukood() {
        return isikukood;
    }


    public void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }
*/
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        if (mass < 0) {
            System.out.println("Sisestage positiivne arv massile!");
        } else {
            this.mass = mass;
        }

    }

    private String nimi;
    private double pikkus;
    private long isikukood;
    private double mass;

    //Konstruktor

public Isik(long isikukood) {
    this.isikukood = isikukood;
}

/*
   public Isik(String nimi, double pikkus) {
        this.nimi = nimi;
        this.pikkus = pikkus;
    }*/

    public String toString() {
        return nimi + ", pikkus=" + pikkus + ", mass=" + mass + ", isikukood:" + isikukood;
    }
    public int suusakepiPikkus() {
        return (int) Math.round(0.85 * pikkus * 100);
    }
}
