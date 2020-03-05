package uus;

import uus.Lennuk;
import uus.Reis;

public class Testklass {
    public static void main(String args[]) {
        Lennuk esimene = new Lennuk("Fokker F50", 730, 46);
        Lennuk teine = new Lennuk("Boeing", 920, 200);
        Reis reis1 = new Reis("Rooma", 2126, 40, esimene);
        Reis reis2 = new Reis("Miami", 8383, 70, teine);
        System.out.println(reis1);
       /* System.out.println("Reisi kestvus sihtpunktiga " + reis1.getSihtpunkt() + " on " + reis1.reisiKestvus() + " minutit");
        System.out.println("Vabu kohti reisil sihtpunktiga " + reis1.getSihtpunkt() + " on " + reis1.vabadKohad());

        System.out.println("Reisi kestvus sihtpunktiga " + reis2.getSihtpunkt() + " on " + reis2.reisiKestvus() + " minutit");
        System.out.println("Vabu kohti reisil sihtpunktiga " + reis2.getSihtpunkt() + " on " + reis2.vabadKohad());*/
}
}
