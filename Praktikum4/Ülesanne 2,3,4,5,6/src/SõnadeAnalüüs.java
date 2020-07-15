import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class SõnadeAnalüüs {
    public void analüüs(String a) {
        String[] tükid = a.split(" ");
        System.out.println(a);
        for (int i = 0; i<tükid.length; i++) {
            System.out.println(tükid[i] + " - sõna pikkus: " + tükid[i].length());
        }
    }
    public static void main(String[] args) throws Exception {
        SõnadeAnalüüs uus = new SõnadeAnalüüs();
        uus.analüüs("Tere kuidas siis päev on ka möödunud?");


        char[] sümboliteMassiiv = {'T','e','r','e'};
        String teade1 = new String(sümboliteMassiiv);
        String teade2 = "Tere";
        String teade3 = "Tere";


        System.out.println(teade1.equals(teade2));
        System.out.println(teade2.equals(teade3));
        System.out.println(teade1 == teade2);
        System.out.println(teade2 == teade3);

        int[] arvud = { 3, 5, 7, 11 };
        StringBuilder sb = new StringBuilder(50); // küsime 50 tähemärgi jagu puhvrit
        sb.append("esimesed algarvud on ");
        for (int arv : arvud) {
            sb.append(arv);
            sb.append(", ");
        }
        sb.insert(34, 100);
        String tulemus = sb.toString();
        System.out.println(tulemus);

        File fail = new java.io.File("c:/coffee/marsruut2.txt");

        if (fail.createNewFile())
            System.out.println("Fail loodud");
        else
            System.out.println("Faili on juba olemas" + "\n");

        PrintWriter pw = new PrintWriter(fail, "UTF-8");
        pw.print("Karl Ernst von Baeri ");
        pw.println("tänav");
        pw.print("Johann Wilhelm Friedrich Hezeli ");
        pw.println("tänav");
        pw.print("Juhan Liivi ");
        pw.println("tänav");

        pw.close();

        Scanner tere = new Scanner(fail);
        while (tere.hasNextLine()) {
            String data = tere.nextLine();
            System.out.println(data);
        }

    }
}
