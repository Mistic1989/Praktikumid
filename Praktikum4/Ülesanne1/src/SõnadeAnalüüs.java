public class SõnadeAnalüüs {
    public void analüüs(String a) {
        String[] tükid = a.split(" ");
        System.out.println(a);
        for (int i = 0; i<tükid.length; i++) {
            System.out.println(tükid[i] + " - sõna pikkus: " + tükid[i].length());
        }
    }
    public static void main(String[] args) {
        SõnadeAnalüüs uus = new SõnadeAnalüüs();
        uus.analüüs("Tere kuidas siis päev on ka möödunud?");
    }
}
