public class StaatilineSegadus {

    public static void main(String[] args) {
        StaatilineSegadus uus1 = new StaatilineSegadus();
        StaatilineSegadus.Isik uus2 = uus1.new Isik("Ants", 180.0);
        System.out.println("suusakepi pikkus on " + uus2.suusakepiPikkus());
    }

    public class Isik {

        private String nimi;
        private double pikkus;

        public Isik(String isikuNimi, double isikuPikkus) {
            nimi = isikuNimi;
            pikkus = isikuPikkus;
        }

        public int suusakepiPikkus() {
            return (int) Math.round(0.85 * pikkus * 100);
        }

    }
}
