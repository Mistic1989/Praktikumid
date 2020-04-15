public class Test {
    public static void main(String[] args) {
        Tantsupaar paar1 = new Tantsupaar("Almond Kikerpuu", 1988, "Maili Lapik", 1989);
        System.out.println(paar1);
        System.out.println("Kõige kõrgem partneri vanus on: " + paar1.vanempartner(2020) + "aastat");
        System.out.println(paar1.samaaasta());
    }
}
