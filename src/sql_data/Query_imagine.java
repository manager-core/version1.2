package sql_data;

import manager.swing.PersonalFile;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query_imagine  extends sql_conections {


    public static String[] firstName = new String[100];
    public static String[] lastName = new String[100];
    public static int[] gender =  new int[100];
    public static String[] birthDate =  new String[100];
    public static String[] id =  new String[100];
    public static String[] pi =  new String[100];
    public static int i,y;
    public static String[] marryageDate =  new String[100];
    public static String[] baptizeDate =  new String[100];
    public static String[] tel1 =  new String[100];
    public static String[] tel2 =  new String[100];
    public static String[] email =  new String[100];
    public static int id1 = 0;
    public static String[] wife = new String[100];
    public static String[] d15 = new String[100];
    public static String[] children = new String[100];
    public static String[] school = new String[100];
    public static String[] work = new String[100];
    public static String[] adress = new String[100];
    public static String[] others = new String[100];
    public static int initiere;
    public static int ip_gasit;

    public static void cauta_dupa_ip_third (String tabel) {

        i=0;
        Connection dbConnection = null;
        Statement statement = null;

        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);


            ResultSet rs;
System.out.println("Image+++++++++++++++++++++++++++++is"+ PersonalFile.jTextField1.getText());
            rs = statement.executeQuery("SELECT * FROM  "+tabel+"_third WHERE ID ="+ PersonalFile.jTextField1.getText()+"");
            while ( rs.next() ) {


                pi[i] = rs.getString("Pi");

                System.out.println(pi[i]);
            }
            dbConnection.close();
        } catch (Exception e) {
            if (PersonalFile.check_begin == 0 && initiere==0) {
                JOptionPane.showMessageDialog(null, "EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL \n"+e.getMessage()); } else if (PersonalFile.check_begin == 1){ JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }

        }
    }
}
