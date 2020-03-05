package uus;

import uus.Lennuk;

public class Reis {

    public Reis(String sihtpunkt, int kaugus, int piletiteArv, Lennuk lennuk) {
        this.sihtpunkt = sihtpunkt;
        this.kaugus = kaugus;
        this.piletiteArv = piletiteArv;
        this.lennuk = lennuk;
    }

    public String getSihtpunkt() {
        return sihtpunkt;
    }

    public int getKaugus() {
        return kaugus;
    }

    public Lennuk getLennuk() {
        return lennuk;
    }

    public int getPiletiteArv() {
        return piletiteArv;
    }

    public int reisiKestvus() {
        return (int)Math.round((this.kaugus / lennuk.getKiirus())*60);
    }

    public int vabadKohad() {
        return (int)lennuk.getKiirus() - piletiteArv;
    }
    public String toString() {
        return "Sihtpunkt: " + sihtpunkt + "\n" +
                "Kaugus sihtkohta: " + kaugus + "\n" +
                "Alles olev piletitearv: " + piletiteArv + "\n" +
                "Lennuk: " + lennuk + "\n" +
                "Reisi kestvus sihtpunktiga " + sihtpunkt + " on " + reisiKestvus() + " minutit" + "\n" +
                "Vabu kohti reisil sihtpunktiga " + sihtpunkt + " on " + vabadKohad() + "\n";
    }
    private String sihtpunkt;
    private int kaugus;
    private Lennuk lennuk;
    private int piletiteArv;
}
