public class AmeerikaMäed {
    public boolean vanusedSobivad(Dokument[] dokumendid) {
        for (Dokument dokument : dokumendid) {
            if (!dokument.onVähemalt12Aastane())
                return false;
        }
        return true;
    }


    /* public boolean vanusedSobivad(IdKaart[] idKaardid, Õpilaspilet[] õpilaspiletid, Juhiluba[] juhiluba) {
        for (IdKaart id : idKaardid) {
            if (!id.onVähemalt12Aastane())
                return false;
        }
        for (Õpilaspilet pilet : õpilaspiletid) {
            if (!pilet.onVähemalt12Aastane())
                return false;
        }
        for (Juhiluba id : juhiluba) {
            if (!id.onVähemalt12Aastane())
                return false;
        }
        return true;
    }*/
}