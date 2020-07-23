public class Test {
    public static void main(String[] args) {
       /*
        IdKaart[] idKaardid = { new IdKaart("39108071234") };
        Õpilaspilet[] õpilaspiletid = { new Õpilaspilet(2007) };
        Juhiluba[] juhiluba = { new Juhiluba(2009) };


        System.out.println(ameerikaMäed.vanusedSobivad(idKaardid, õpilaspiletid, juhiluba));
        */
        AmeerikaMäed ameerikaMäed = new AmeerikaMäed();
        Dokument[] dokumendid = {
                new IdKaart("39108071234"),
                new Õpilaspilet(1991)
        };
        System.out.println("sobib: " + ameerikaMäed.vanusedSobivad(dokumendid));

    }
}