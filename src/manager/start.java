package manager;

import manager.swing.MainFrame;

import java.io.IOException;

/**
 * Created by Daniel on 3/5/2018.
 */
public class start {



    public static void main (String[] args) throws IOException {


        MainFrame.exit(1);
        MainFrame h = new MainFrame();
        h.setVisible(true);
    }


}
