public class ElektriautoTest {
    public static void main(String[] args) {
       //Elektrijaam hind = new Elektrijaam(0.15);
       //hind.setElektrihind(0.15);

        Elektriauto auto1 = new Elektriauto("Opel", 250.0, 250, 60, 0.15);
        //auto1.setLaadimisAeg(60);
        System.out.println(auto1);
        System.out.println("Sajakilomeetrilise reisi maksumus: " + auto1.maksumus100() + " EUR");
        System.out.println("Reisi kestvus: " + auto1.reisiKestus(120, 95) + " tundi");
        System.out.println("Reisi maksumus antud autoga: " + auto1.maksumus(224) + " EUR" + "\n" + "\n");

        Elektriauto auto2 = new Elektriauto("BMW", 50.0, 220, 120, 0.15);
        //auto1.setLaadimisAeg(60);
        System.out.println(auto2);
        System.out.println("Sajakilomeetrilise reisi maksumus: " + auto2.maksumus100() + " EUR");
        System.out.println("Reisi kestvus: " + auto2.reisiKestus(120, 95) + " tundi");
        System.out.println("Reisi maksumus antud autoga: " + auto2.maksumus(224) + " EUR");

    }
}
