package despre.install;

import javax.swing.*;
import java.io.File;
/**
 * Created by Daniel on 2/8/2018.
 */
public class check_exist {

    public static void main (String[] args){
        check("d:\\Manager\\data\\manual.txt");
    }

    public static void check(String file) {
        File f = new File(file);
        if (!f.exists() || f.isDirectory()) {
            JOptionPane.showMessageDialog(null,"[ERROR:] Lipsește fișierul: \n" + file);
            System.exit(1);
        }
    }
}
