public class AmeerikaMäed {
    int i = 0;
    public int[] ebasobivadDokumendid(Dokument[] dokumendid) {
        for (Dokument dokument : dokumendid) {
            if (!dokument.onVähemalt12Aastane()) {

            }

        }
    }

    public boolean vanusedSobivad(Dokument[] dokumendid) {
        for (Dokument dokument : dokumendid) {
            if (!dokument.onVähemalt12Aastane())
                return false;
        }
        return true;
    }
}