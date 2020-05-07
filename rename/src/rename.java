import java.io.File;
import java.io.IOException;

public class rename {


    public static void main(String[] argv) throws IOException {

        File folder = new File("c:\\test\\");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {

                File f = new File("c:\\test\\"+listOfFiles[i].getName());

                f.renameTo(new File("c:\\test\\"+(i+1)+".jpg"));
            }
        }

        System.out.println("conversion is done");
    }
}