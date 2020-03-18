import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Lühendaja {

    public static void main(String[] args) throws Exception {
        File fail = new java.io.File("c:/coffee/nimed.txt");
        Scanner sc = new Scanner(fail, "UTF-8");
        while (sc.hasNextLine()) {
            String rida = sc.nextLine();
            if (rida.contains("-")) {
                String[] tükid = rida.split(" ");
                System.out.print(tükid[tükid.length-1] + " ");
                String[] tükid2 = rida.split("-");
                System.out.print(tükid2[0].charAt(0) + "-");
                System.out.print(tükid2[1].charAt(0) + ". ");

            } else {
                    String[] tükid = rida.split(" ");
                    System.out.print(tükid[tükid.length-1]+" ");
                    for (int i = 0; i < tükid.length-1; i++) {
                        System.out.print(tükid[i].charAt(0) + ". ");
                }
            }

        }
    }
}
