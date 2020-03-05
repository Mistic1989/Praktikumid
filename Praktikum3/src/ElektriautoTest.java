public class ElektriautoTest {
    public static void main(String[] args) {
       Elektrijaam hind = new Elektrijaam(0.15);
       Elektriauto auto1 = new Elektriauto("Opel", 250.0, 250, 60, hind);
       Elektriauto auto2 = new Elektriauto("Ford", 350.0, 450, 90, hind);

       // Auto: Opel
       System.out.println(auto1 + "\n");
       System.out.println("Reisi kestvus: " + auto1.reisiKestus(260, 98.0) + " tundi" + "\n");
       System.out.println(auto1.maksumus(290) + "\n");
       // Auto: Ford
        System.out.println(auto2 + "\n");
        System.out.println("Reisi kestvus: " + auto2.reisiKestus(290, 105.0) + " tundi" + "\n");
        System.out.println(auto2.maksumus(350) + "\n");
    }
}
