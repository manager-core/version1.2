package sql_data;

import manager.swing.PersonalFile;
import manager.swing.MainFrame;
import manager.impartire_cod;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.AttributedString;


/**
 * A JDBC SELECT (JDBC query) example program.
 */
public class Query_table extends sql_conections {
    public static String[] firstName = new String[10000];
    public static String[] lastName = new String[10000];
    public static int[] gender = new int[10000];
    public static String[] birthDate = new String[10000];
    public static String[] slujire = new String[10000];
    public static String[] transfer =  new String[10000];
    public static String[] id = new String[10000];
    public static int i, y;
    public static String[] marryageDate = new String[10000];
    public static String[] baptizeDate = new String[10000];
    public static String[] tel1 = new String[10000];
    public static String[] tel2 = new String[10000];
    public static String[] email = new String[10000];
    public static int id1 = 0;
    public static String[] wife = new String[10000];
    public static String[] d15 = new String[10000];
    public static String[] children = new String[10000];
    public static String[] school = new String[10000];
    public static String[] work = new String[10000];
    public static String[] adress = new String[10000];
    public static String[] others = new String[10000];
    public static int initiere;
    public static int ip_gasit;


    public static void cauta1(String data) {
        initiere = 0;
        y = 0;
        i = 0;
        ip_gasit = 0;
        Connection dbConnection = null;
        Statement statement = null;

        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);
            i = 0;


            ResultSet rs;

            rs = statement.executeQuery("SELECT * FROM  "+data+" WHERE FirstName LIKE '%" + MainFrame.jTextField1.getText() + "%' ");
            while (rs.next()) {
                i++;
                id[i] = rs.getString("ID");
                firstName[i] = rs.getString("FirstName");
                lastName[i] = rs.getString("LastName");
                gender[i] = rs.getInt("Gender");
                birthDate[i] = rs.getString("BirthDate");
            //    System.out.println(lastName[i] + "  " + i);
          //      System.out.println(lastName[i]);
            }
            dbConnection.close();

        } catch (Exception e) {
            AttributedString as = new AttributedString("ad");

            as.addAttribute(TextAttribute.FOREGROUND, Color.red);

            if (PersonalFile.check_begin == 0) {
                initiere++;
                JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n" + e.getMessage());
            } else {
            }

        }
    }


    public static void cauta_dupa_ip() {

        i = 0;
        Connection dbConnection = null;
        Statement statement = null;
        y = 0;
        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);


            ResultSet rs;

            //   int ip_aux = Edito_Manager.jComboBox1.getSelectedIndex();
            //   ip_aux++;
            //   rs = stmt.executeQuery("SELECT * FROM  Persons WHERE ID ="+ip_aux);

            rs = statement.executeQuery("SELECT * FROM  Persons WHERE FirstName ='" + impartire_cod.nume_pren[1] + "'");
            while (rs.next()) {
                y++;
                ip_gasit = rs.getInt("ID");
                firstName[y] = rs.getString("FirstName");
                lastName[y] = rs.getString("LastName");
                gender[y] = rs.getInt("Gender");
                birthDate[y] = rs.getString("BirthDate");
             //   System.out.println("HAI......" + lastName[y] + "  " + y);
            //    System.out.println(lastName[y]);
            }
            dbConnection.close();
        } catch (Exception e) {

            if (PersonalFile.check_begin == 0 && initiere == 0) {

                JOptionPane.showMessageDialog(null, "EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL \n" + e.getMessage());
            } else {
            }

        }


    }

    public static void cauta_dupa_ip_secound() {

        i = 0;
        Connection dbConnection = null;
        Statement statement = null;

        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);

            ResultSet rs;

            rs = statement.executeQuery("SELECT * FROM  Persons_secound WHERE ID =" + ip_gasit + "");
            while (rs.next()) {
                //i++;
          //      System.out.println("SECOUND");
                marryageDate[i] = rs.getString("MarryageDate");
                baptizeDate[i] = rs.getString("BaptizeDate");
                tel1[i] = rs.getString("Tel1");
                tel2[i] = rs.getString("Tel2");
                email[i] = rs.getString("email");
         //       System.out.println("SECOUND......" + marryageDate[i] + "  " + y);
          //      System.out.println(lastName[i]);
            }
            dbConnection.close();
        } catch (Exception e) {

            if (PersonalFile.check_begin == 0 && initiere == 0) {
                JOptionPane.showMessageDialog(null, "EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL \n" + e.getMessage());
            } else {
            }

        }

    }


    public static void cauta_dupa_ip_third() {

        i = 0;
        Connection dbConnection = null;
        Statement statement = null;

        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);


            ResultSet rs;

            rs = statement.executeQuery("SELECT * FROM  Persons_third WHERE ID =" + ip_gasit + "");
            while (rs.next()) {
                //i++;
              //  System.out.println("THIRD");

                wife[i] = rs.getString("Wife_man");

                children[i] = rs.getString("Children");

                school[i] = rs.getString("School");


                work[i] = rs.getString("Work1");
                adress[i] = rs.getString("Adress");
                others[i] = rs.getString("Others");
          //      System.out.println("SECOUND......" + marryageDate[i] + "  " + y);
            //    System.out.println(lastName[i]);
            }
            dbConnection.close();
        } catch (Exception e) {
            if (PersonalFile.check_begin == 0 && initiere == 0) {
                JOptionPane.showMessageDialog(null, "EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL \n" + e.getMessage());
            } else if (PersonalFile.check_begin == 1) {
                JOptionPane.showMessageDialog(null, "" + e.getMessage());
            }

        }
    }


    public static void cauta1_combinat(String data) {
        initiere = 0;
        y = 0;
        i = 0;
        ip_gasit = 0;
        Connection dbConnection = null;
        Statement statement = null;

        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);
            i = 0;


            ResultSet rs;

String aux_getText = MainFrame.jTextField1.getText();
            rs = statement.executeQuery("SELECT * FROM  "+data+" JOIN "+data+"_secound on "+data+".ID = "+data+"_secound.ID  JOIN "+data+"_third on "+data+".ID = "+data+"_third.ID WHERE FirstName LIKE '%" + aux_getText + "%' OR LastName LIKE '%" + MainFrame.jTextField1.getText() + "%' ORDER BY FIRSTNAME");

            while (rs.next()) {
                i++;
                id[i] = rs.getString("ID");
                firstName[i] = rs.getString("FirstName");
                lastName[i] = rs.getString("LastName");
                birthDate[i] = rs.getString("BirthDate");
                tel1[i] = rs.getString("Tel1");
                slujire[i] = rs.getString("Tel2");
                work[i] = rs.getString("Work1");
                adress[i] = rs.getString("Adress");
                System.out.print("ADRESA ESTE " + adress[i]);
                others[i] = rs.getString("Others");
                transfer[i] = rs.getString("Transfer");
             //      System.out.println("FIRSTNAME"+firstName[i]+"  "+i);
             //     System.out.println(lastName[i]);

            }
            dbConnection.close();

        } catch (Exception e) {
            //   AttributedString as = new AttributedString("ad");

            //  as.addAttribute(TextAttribute.FOREGROUND, Color.red);

            if (PersonalFile.check_begin == 0) {
                initiere++;
                JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n" + e.getMessage());
            } else {
            }

        }

    }
}
    
    
