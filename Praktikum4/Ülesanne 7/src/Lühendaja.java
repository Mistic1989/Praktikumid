import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Lühendaja {

    public static void main(String[] args) throws Exception {
        File fail = new java.io.File("c:/coffee/nimed.txt");
        Scanner sc = new Scanner(fail, "UTF-8");
        while (sc.hasNextLine()) {
            String rida = sc.nextLine();
            String[] tükid = rida.split(" ");
            System.out.print(tükid[tükid.length-2]+" "+tükid[tükid.length-1]);
            System.out.println();
        }
    }
}
