
class TestIsik {
    public static void main(String[] args) {
         Isik a = new Isik(38902184988L);
         a.setNimi("Evelin");
         a.setPikkus(1.71);
         a.setMass(78.0);

        System.out.println(a);
        System.out.println(a.suusakepiPikkus());
    }
}

