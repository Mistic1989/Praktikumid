package uus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class Lastehoid {
    public Lastehoid(Lapsehoidja lapsehoidja) {
        this.lapsehoidja = lapsehoidja;
    }

    private Lapsehoidja lapsehoidja;

    public static void main(String[] args) throws Exception {
        File fail = new File("C:\\Users\\Procurator_Myyk005\\IdeaProjects\\Praktikum4\\Ülesanne 8\\lapsehoidjad.txt");
        Scanner sc = new Scanner(fail, "UTF-8");
        List<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        Lapsehoidja esimene = new Lapsehoidja(35, "Jana");
        while (sc.hasNextLine()) {
            String rida = sc.nextLine();
            String tükid[] = rida.split(" ");
           // System.out.println(tükid[0]);
            list1 = Arrays.asList(tükid);
            System.out.println(list1.get(0) + " " + list1.get(1));
    }
       list2.add("Tere");
       System.out.println(esimene.getNumber() + " " + esimene.getNimi());

    }
}
