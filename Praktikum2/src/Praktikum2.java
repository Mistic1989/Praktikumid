import java.lang.Math;
import java.util.*;

public class Praktikum2 {

    // Ulesanne A4 (kontroll) --> P4 (kontroll)

    static int proovMeetod(int a, int b) {
        return a + b;
    }
    static int proovMeetod(double a) {
        int teisendatud = (int)Math.round(a*a);
        return teisendatud;
    }
    static void proovMeetod(String sone, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(sone);
        }
    }

    // Ulesanne A5 (kontroll) --> P5 (kontroll)

    static int juhuslikArv(int a, int b) {
        int c = a - b;
        int teisendus = (int)Math.round(Math.random()*c+b);
        return teisendus;
    }

    static int[] pikkusteMassiiv(int lasteArv, int pikkusteAluminePiir, int pikkusteUleminePiir) {
        int[] massiiv = new int[lasteArv];
        for (int i = 0; i < lasteArv; i++) {
            massiiv[i] = (juhuslikArv(pikkusteUleminePiir, pikkusteAluminePiir));
        }
    return massiiv;
        }

    static double harmoonilineKeskmine(int[] a) {
        double summa = 0.0;
        for (int i = 0; i < a.length; i++) {
            summa = summa + 1.0 / a[i];
        }
        return a.length/summa;
}




    public static void main(String[] args) {

        //Ulesanne A7 (kontroll) --> P7 (kontroll)

        /*
        String eesnimi = args[0];
        int kehamass = Integer.parseInt(args[1]);
        double pikkus = Double.parseDouble(args[2]);
        double kehamassiIndeks = kehamass/Math.pow(pikkus, 2);
        if (kehamass < 45) {
            System.out.println("Söö rohkem!");
        }
        if (pikkus < 140) {
            System.out.println("Kasva pikemaks!");
        }
        if (pikkus > 200) {
            System.out.println("Pikkust ikka on!");
        }
      */

        // Ulesanne A5 valjastus

        //System.out.println(Arrays.toString(pikkusteMassiiv(10,60,100)));
        //System.out.println(Arrays.toString(pikkusteMassiiv(15,101,140)));
        //System.out.println(Arrays.toString(pikkusteMassiiv(20,141,200)));
        int[] vaiksemad = (pikkusteMassiiv(10,60,100));
        int[] keskmised = (pikkusteMassiiv(15,101,140));
        int[] suured = (pikkusteMassiiv(20,141,200));


        System.out.println("Väiksemad:");
        for(int i = 0; i < vaiksemad.length; i++) {
            if (vaiksemad[i] > 80) {
                System.out.println(vaiksemad[i]);
            }
        }
        System.out.println("Keskmised:");
        for(int item : keskmised) {
                System.out.println(item);
        }
        System.out.println("Suured:");
        for(int i = 0; i < suured.length; i++) {
            System.out.println(suured[i]);
        }
        //Harmooniline keskmine
        System.out.println("Väiksemate laste pikkuste harmooniline keskmine on: " + harmoonilineKeskmine(vaiksemad));
        System.out.println("Keskmiste laste pikkuste harmooniline keskmine on: " + harmoonilineKeskmine(keskmised));
        System.out.println("Suuremate pikkuste harmooniline keskmine on: " + harmoonilineKeskmine(suured));

        // Ulesanne A4
        System.out.println(proovMeetod(2,2));
        System.out.println(proovMeetod(5));
        proovMeetod("Hommikust!", 5);


        // Ulesanne A1

        int summa = 0;
        for (int i = 0; i <= 5; i++) {
            summa += i;
        } System.out.println(summa);

        // Ulesanne A2
        int a = 2147483647;
        int b = 354;
        int c = 52;
        int d = 87;
        int e = 999;

        System.out.println("Arvude " + b + " ja " + c + " summa on " + (b + c));
        System.out.println("Arvude " + c + " ja " + e + " lahutis on " + (c - e));
        System.out.println("Arvude " + a + " ja " + d + " korrutis on " + (a + d));
        System.out.println("Arvude " + b + " ja " + c + " jagatis on " + (b/d));
        System.out.println("Arvude " + b + " ja " + c + " jääk on " + (b%c));
        System.out.println(1-0.9);

        // Ulesanne P2

        double juhuarv = Math.random()*10+15;
        long longarv = Math.round(Math.random()*10+15);
        int taisjuhuarv = (int)Math.round(Math.random()*10+15);
        int valeJuhuarv = (int)Math.random()*5+15;
        System.out.println(juhuarv);
        System.out.println(longarv);
        System.out.println(taisjuhuarv);

        // Ulesanne A3 --> P3

        int absoluut = -30;
        System.out.println(Math.abs(absoluut));

        int addexact1 = 20;
        int addexact2 = (int)Math.round(Math.PI);
        System.out.println(Math.addExact(addexact1, addexact2));

        double cosinus = 90;
        System.out.println(Math.cos(cosinus));




    }
}


