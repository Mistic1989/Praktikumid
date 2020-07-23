import java.util.*;

public class AmeerikaMäed {
    public List<Dokument> ebasobivadDokumendid(Dokument[] docid) {
       ArrayList<Dokument> tagastus = new ArrayList<Dokument>();
       for (int i=0; i < docid.length; i++) {
           if (!docid[i].onVähemalt12Aastane()) {
               tagastus.add(docid[i]);
           }
       }
        return tagastus;
    }

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