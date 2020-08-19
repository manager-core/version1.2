package despre.install;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by Daniel on 2/8/2018.
 */
public class copy {
    public static String dir;

    public static void main(String[] args) throws IOException {
        creare_director("e:\\Manager");
        dir="d:/Manager/data";
        get_dir (); String tt = "d:/Manager/data/db.mv.db";
        File t = new File(tt);
        File t1 = new File("d:/db.mv");

        copyFileUsingJava7Files(t,t1);





   //     creare_director("e:\\Manager\\data");
      // creare_director("e:\\Manager\\icons");
      //  creare_director("e:\\Manager\\pcts");

    }

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());

    }


    public static void get_dir () { dir =  System.getProperty("user.dir");
        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
    }


    public static void creare_director(String name) {


        File theDir = new File(name);

// if the directory does not exist, create it
        if (!theDir.exists()) {
            System.out.println("creating directory: " + theDir.getName());
            boolean result = false;

            try {
                theDir.mkdir();
                result = true;
            } catch (SecurityException se) {
                //handle it
            }
            if (result) {
                System.out.println("DIR created");
            }
        }
    }







}
