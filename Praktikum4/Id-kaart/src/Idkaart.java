public class Idkaart {

    private String idnumber;
    private String nimi;
    private String isikukood;


    public int sünnikuupäev() {
        int algus = Integer.parseInt(isikukood.substring(0, 1));
        int aasta = Integer.parseInt(isikukood.substring(1, 3));
        if (algus <= 2)
            return 1800 + aasta;
        if (algus <= 4)
            return 1900 + aasta;
        if (algus <= 6)
            return 2000 + aasta;
        return 2100 + aasta;
    }

    public String sugu() {
        String a1 = isikukood.substring(0, 1);

        if (a1.equals("1"))
            return "Sugu: mees";
        if (a1.equals("3"))
            return "Sugu: mees";
        if (a1.equals("5"))
            return "Sugu: mees";

        if (a1.equals("2"))
            return "Sugu: naine";
        if (a1.equals("4"))
            return "Sugu: naine";
        if (a1.equals("6"))
            return "Sugu: naine";
        return "Viga";
    }
/*
        String[] isikukoodnr = isikukood.split("");
        String[] varem = new String[3];
        
        String aasta = isikukoodnr[1] + isikukoodnr[2];
        String kuu = isikukoodnr[3] + isikukoodnr[4];
        String päev = isikukoodnr[5] + isikukoodnr[6];
        String aasta1900 = "19";
        String aasta2000 = "20";
        String a = aasta1900 + aasta;
        String b = aasta2000 + aasta;;

        if (isikukoodnr[0] == "3" || isikukoodnr[0] == "4") {
            varem[0] = päev;
            varem[1] = kuu;
            varem[2] = a;

        }
        if (isikukoodnr[0] == "5" || isikukoodnr[0] == "6") {
            varem[0] = päev;
            varem[1] = kuu;
            varem[2] = b;

        }
        return varem[0] + varem[1] + varem[2];*/
    /*}




    /*
        String[] isikukoodnr = isikukood.split("");
        String[] suguarr = new String[1];
        String mees = "Sugu: mees";
        String naine = "Sugu: naine";
        if (isikukoodnr[0] == "1" || isikukoodnr[0] == "3" || isikukoodnr[0] == "5") {
            suguarr[0] = mees;
        }
            if (isikukoodnr[0] == "2" || isikukoodnr[0] == "4" || isikukoodnr[0] == "6") {
                suguarr[0] = naine;
        }
            return suguarr[0];
    }*/

    @Override
    public String toString() {
        return "Idkaart{" +
                "idnumber='" + idnumber + '\'' +
                ", nimi='" + nimi + '\'' +
                ", isikukood='" + isikukood + '\'' +
                '}';
    }

    public Idkaart(String idnumber, String nimi, String isikukood) {
        this.idnumber = idnumber;
        this.nimi = nimi;
        this.isikukood = isikukood;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }


}
