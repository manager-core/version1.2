package manager;

import manager.swing.MainFrame;

import java.awt.*;

/**
 * Created by Daniel on 2/10/2018.
 */
public class Fonts_t {

    public static void fonts_tabel(String font, String tip, int size){

        MainFrame.jTable1.setFont(new Font("Helvetica", Font.PLAIN, 13));

        MainFrame.af_lista(MainFrame.tabel);
    }



}
