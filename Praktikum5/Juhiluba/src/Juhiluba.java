
import java.time.LocalDate;

public class Juhiluba implements Dokument {
    private int lõpuaasta;

    public Juhiluba(int lõpuaasta) {
        this.lõpuaasta = lõpuaasta;
    }

    public boolean onVähemalt12Aastane() {
        int praeguneAasta = LocalDate.now().getYear();
        return lõpuaasta <= praeguneAasta - 12;
    }

}
