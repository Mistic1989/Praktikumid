package Hello;
import java.util.Scanner;

public class HelloDate  {

    public static void main(String[] args) {

            //for tsükkel

        int summa = 0;
        for(int i = 1; i <= 5; i++) {
            summa += i;
      }
            System.out.println(summa);

            //while tsükkel

        int j = 1;
        int summa2 = 0;
        while (j <= 5) {
            summa2 += j;
            j++;
        }
            System.out.println(summa2);

            //do-while tsükkel

        int k = 1;
        int summa3 = 0;
        do {
            summa3 += k;
            k++;
        }
        while (k <= 5);
            System.out.println(summa3);

            // Ülesanne A5 - 1
        for (int h = 1; h <= 5; h++) {
            System.out.println(h);
        }
             // Ülesanne A5 - 2

        int summa4 = 0;
        int piir = 2000;
        while (summa4 <= piir) {
            summa4 += 2;
        }   System.out.println(summa4);

            // Ülesanne A5 - 3

        int l = 0;
        int summa5 = 5;
        do {
            l++;
            System.out.println("Tuletan meelde, et varsti algab loeng!");
        }
        while (summa5 > l);

            // Ülesanne A6

        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta reaalarv: ");
        int reaalarv = scan.nextInt();
        int reaalarv2 = scan.nextInt();
        int reaalarv3 = scan.nextInt();
        if ((reaalarv < 2) && (reaalarv2 < 2) && (reaalarv3 < 2)) {
            System.out.println("Ei saa kolmnurka moodustada");
        } else {
            System.out.println("Kolmnurga saab moodustada!");
        }

           // Ülesanne A7

        int taisarv;

        do {

            System.out.println("Sisesta taisarv: ");
            taisarv = scan.nextInt();
            if (taisarv % 2 == 0) {
                System.out.println("Tegemist on paarisarvuga!");
            } else {
                System.out.println("Tegemist on paaritu arvuga!");
            }
             }
        while (taisarv != 0);
        System.out.println("Programm lõpetatud!");

           // Ülesanne A8

        int sisendarv;
        int sisendarv2;

        System.out.println("Siseta kilogrammi ja naela vastavustabeli loomiseks vahemiku algusarv: ");
        sisendarv = scan.nextInt();
        System.out.println("Siseta kilogrammi ja naela vastavustabeli loomiseks vahemiku lõpparv: ");
        sisendarv2 = scan.nextInt();
        System.out.println("Kg"+"\t"+"   Nael");

        for (int i = sisendarv; sisendarv <= sisendarv2; sisendarv++) {
            float naelades = sisendarv*2.20462262185f;

            System.out.println(sisendarv + "\t" + naelades);
        }

            // Ülesanne A9

        double a = 1;
        double kogusumma = 0;
        int liikmetearv;

        System.out.println("Siseta arv, mitme esimese liikme summa on vaja arvutada: ");
        liikmetearv = scan.nextInt();

        for (double b = 3; b <= liikmetearv; b = b + 2) {
                //System.out.println(a + "/" + b);
                double jagatis = (a / b);
                kogusumma = kogusumma + jagatis;
                a = a + 2;

            }
        System.out.println("Selle murdude jada kogusumma on: " + kogusumma);


    }
}