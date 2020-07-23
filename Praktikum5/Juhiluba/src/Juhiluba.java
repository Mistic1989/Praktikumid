
import java.time.LocalDate;

public class Juhiluba implements Dokument {
    private int lõpuaasta;

    @Override
    public String toString() {
        return "Juhiluba{" +
                "lõpuaasta=" + lõpuaasta +
                '}';
    }

    public Juhiluba(int lõpuaasta) {
        this.lõpuaasta = lõpuaasta;
    }

    public boolean onVähemalt12Aastane() {
        int praeguneAasta = LocalDate.now().getYear();
        return lõpuaasta <= praeguneAasta - 12;
    }

}
