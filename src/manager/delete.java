package manager;

import manager.swing.MainFrame;
import sql_data.Query1;
import sql_data.sterge_persoana_dupa_ip;

import javax.swing.*;
import java.sql.SQLException;

/**
 * Created by Daniel on 1/28/2018.
 */
public class delete {


    public static void sterge_171(String data) {

        int t;
        String value;
        String value1;

        t = MainFrame.jTable1.getSelectedRow() + 1;


        Query1.cauta_dupa_ip_tabel(MainFrame.tabel);
        Query1.cauta_dupa_ip_secound(MainFrame.tabel);
        Query1.cauta_dupa_ip_third(MainFrame.tabel);
        System.out.println("id-ul estte" + Query1.id[t]);


        try {

            sterge_persoana_dupa_ip.delete_data_dupa_click(MainFrame.tabel,"f","F");
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null, " Datele nu au fost sterse.");
            e1.printStackTrace();
        }

        MainFrame.af_lista(MainFrame.tabel);
    }
}

