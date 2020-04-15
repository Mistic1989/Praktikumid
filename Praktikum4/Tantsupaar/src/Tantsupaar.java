public class Tantsupaar {
    public String toString() {
        return perenimi();
    }

    public int vanempartner(int aastaarv) {
        int poisivanus = aastaarv - psünniaasta;
        int tüdrukuvanus = aastaarv - tsünniaasta;
            if (poisivanus > tüdrukuvanus) {
            return poisivanus;
        } else {
            return tüdrukuvanus;
        }
    }

    public boolean samaaasta() {
        if (psünniaasta == tsünniaasta) {
            return true;
        } else {
            return false;
        }
    }

    public String perenimi() {
        String[] poiss = this.poiss.split(" ");
        String lastword = poiss[poiss.length-1];
        String[] tüdruk = this.tüdruk.split(" ");
        String lastword2 = tüdruk[tüdruk.length-1];

        return lastword + " " + lastword2;
    }

    public Tantsupaar(String poiss, int psünniaasta, String tüdruk, int tsünniaasta) {
        this.poiss = poiss;
        this.psünniaasta = psünniaasta;
        this.tüdruk = tüdruk;
        this.tsünniaasta = tsünniaasta;
    }

    public String getPoiss() {
        return poiss;
    }

    public void setPoiss(String poiss) {
        this.poiss = poiss;
    }

    public int getPsünniaasta() {
        return psünniaasta;
    }

    public void setPsünniaasta(int psünniaasta) {
        this.psünniaasta = psünniaasta;
    }

    public String getTüdruk() {
        return tüdruk;
    }

    public void setTüdruk(String tüdruk) {
        this.tüdruk = tüdruk;
    }

    public int getTsünniaasta() {
        return tsünniaasta;
    }

    public void setTsünniaasta(int tsünniaasta) {
        this.tsünniaasta = tsünniaasta;
    }

    private String poiss;
    private int psünniaasta;
    private String tüdruk;
    private int tsünniaasta;
}
