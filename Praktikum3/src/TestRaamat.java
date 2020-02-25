public class TestRaamat {
    public static void main (String[] args) {
    Raamat kevade = new Raamat("Oskar Luts", "Kevade");
    Raamat[] riiul = new Raamat[100];
    riiul[8] = kevade;
    System.out.println(riiul[8]);

    String autor = "Eduard Vilde";
    for (int i = 0; i < riiul.length; i++) {
        riiul[i] = new Raamat(autor, "Kogutud teosed " + String.valueOf(i + 1));
    }
    System.out.println("10. raamat riiulil on " + riiul[9] + ".");

    class Arv {
            public int arv;
        }

        // Viitüübi näidis 1
        Arv viitarv1 = new Arv();
        viitarv1.arv = 1632;
        Arv viitarv2 = new Arv();
        viitarv2 = viitarv1;
        viitarv2.arv = 1802;
        System.out.println("viitarv1.arv on: " + viitarv1.arv);
        System.out.println("viitarv2.arv on: " + viitarv2.arv);

        // Viitüübi näidis 2
        int[] arvud1 = {1632};
        int[] arvud2 = arvud1;
        arvud2[0] = 1802;
        System.out.println("arvud1[0] on: " + arvud1[0]);
        System.out.println("arvud2[0] on: " + arvud2[0]);
    }

}
