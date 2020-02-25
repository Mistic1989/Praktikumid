// 1. Massiivide ühildamine ja massiivi ümberpööramine

import java.util.*;
import java.lang.Math;

public class Harjutused2 {
    // Massiivide uhildamine

static String massiivideUhildamine(int[] massiiv1, int[] massiiv2) {

    int pikkus = massiiv1.length + massiiv2.length;
    int[] massiiv3 = new int[pikkus];

    for (int i = 0; i < massiiv1.length; i++) {
        massiiv3[i] = massiiv1[i];
    }
    for (int j = massiiv1.length; j < pikkus; j++) {
        massiiv3[j] = massiiv2[j-massiiv1.length];
    }

    Arrays.sort(massiiv3);
    String vastus = Arrays.toString(massiiv3);
    return vastus;
}
    // Massiivi „umberpooramine“

    static String massiiviPooramine(int[] massiiv4) {
    int pikkus = massiiv4.length;
    int[] massiiv2 = new int[pikkus];
    int j = 0;

    for (int i = pikkus-1; i > 0; i--) {
            massiiv2[j] = massiiv4[i] * -1;
            j++;
    }
        //Arrays.sort(massiiv2);
        String vastus = Arrays.toString(massiiv2);
        return vastus;
    }

    public static void main (String[] args) {
        // Massiivide uhildamine

        int[] massiiv1 = {-10, 17, 21, 4, 9, 789};
        int[] massiiv2 = {-2, 5, 17, 28, 5};
        System.out.println("Massiivide " + Arrays.toString(massiiv1) + " ja " + Arrays.toString(massiiv2) + " ühildamisel saame tulemuseks mittekahaneva järjestusega massiivi: " + massiivideUhildamine(massiiv1, massiiv2));

        // Massiivi „umberpooramine“
        int[] massiiv4 = {0, 1, 2, 3, -1, -987, -789, 15, 35, 45, 78, 11};
        System.out.println("Massiivi " + Arrays.toString(massiiv4) + " ümberpööramisel saame tulemuseks: " + massiiviPooramine(massiiv4));

    }
}
