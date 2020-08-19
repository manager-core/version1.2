package manager;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class FileChooser1 {
public static String nfile;
    public static void arata() {

        JFileChooser jfc = new JFileChooser();
        File workingDirectory = new File(System.getProperty("user.dir"));
       jfc.setCurrentDirectory(workingDirectory);

      //  JFileChooser  = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            nfile = selectedFile.getAbsolutePath();
            System.out.println(nfile);
        }

    }

}