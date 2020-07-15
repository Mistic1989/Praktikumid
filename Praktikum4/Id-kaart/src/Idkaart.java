public class Idkaart {
    public String sugu() {
        if (isikukood[0] = 1 || isikukood[0] = 3 || isikukood[0] = 5) {
            return "Sugu: mees";
            if (isikukood[0] = 2 || isikukood[0] = 4 || isikukood[0] = 6) {
                return "Sugu: naine";
            };
        }
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

    private String idnumber;
    private String nimi;
    private String isikukood;
}
