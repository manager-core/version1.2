package reminder;
import java.io.*;

/**
 * Created by Daniel on 3/15/2018.
 */
public class Update_DB {


    public static void main(String[] args) throws InterruptedException, IOException {
        File source = new File("d:/manager/data/db.mv");
        File dest = new File("d:/backup/as.ted");
        copyFileUsingStream(source, dest);
   //     System.out.println("Time taken by Stream Copy = "+(System.nanoTime()-start));

    }




    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}