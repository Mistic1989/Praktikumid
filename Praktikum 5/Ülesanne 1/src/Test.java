import java.util.Arrays;
import java.lang.*;
public class Test {
    public static void main(String[] args) {
        /*Juhiluba uus = new Juhiluba("2020");
        IdKaart[] idKaardid =  { new IdKaart("39108071234") };
        Õpilaspilet[] õpilaspiletid = { new Õpilaspilet(2001) };

        AmeerikaMäed ameerikaMäed = new AmeerikaMäed();
        System.out.println(Arrays.toString(idKaardid));
        System.out.println(uus.kasKehtib());

        System.out.println(ameerikaMäed.vanusedSobivad(idKaardid, õpilaspiletid));*/
        AmeerikaMäed mäed = new AmeerikaMäed();
        Dokument[] dokumendid = {
                new IdKaart("39108071234"),
                new Õpilaspilet(1991)
        };
        System.out.println("sobib: " + mäed.vanusedSobivad(dokumendid));
        System.out.println("sobib: " + mäed.ebasobivadDokumendid(dokumendid));
    }
}