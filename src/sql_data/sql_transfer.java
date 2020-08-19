package sql_data;
import manager.Confirm_Transfer;
import manager.ConversUserData;
import manager.swing.PersonalFile;
import manager.FileChooser1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static sql_data.sql_conections.*;

/**
 * Created by Daniel on 2/10/2018.
 */
public class sql_transfer {
    public static String[] dateString = new String[5];
    public static  String data_c;
    public String data1_null;


    public static void executare_inserare_transfer(String data) {

        String data1 ="";

        data1 = ConversUserData.modific_1(Confirm_Transfer.jTextField1.getText());


        Connection dbConnection = null;
        Statement statement = null;

        dateString[1]=null;
        dateString[2]=null;
        dateString[3]=null;
        ConversUserData.noua_data="";
        dateString[1] = "" + PersonalFile.jTextFieldBirthDate.getText();
        String aux = PersonalFile.jTextFieldBirthDate.getText();
        dateString[1] = ConversUserData.modific_1(aux);
        ConversUserData.noua_data="";
        System.out.println("DATAE _SD_AOD_OSD___AS_DO_ASD_" + dateString[1]);


        String aux1 = PersonalFile.jTextFieldMarriageDate.getText();
        dateString[2] = ConversUserData.modific_1(aux1);
        ConversUserData.noua_data="";
        System.out.println("DATAE _SD_AOD_OSD___AS_DO_ASD_" + dateString[2]);


        String aux3 = PersonalFile.jTextFieldBaptizeDate.getText();
        ConversUserData.noua_data="";
        dateString[3] = ConversUserData.modific_1(aux3);


        String birthdate = dateString[1];

        String marryage = dateString[2];

        String baptize = dateString[3];

        String confirm="";
        try {


            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

            String  sql = "INSERT INTO "+data+" (ID, FirstName, LastName, Gender) " +
                    "VALUES (" + sql_take_ip.id[sql_take_ip.ip] +
                    ", '" + PersonalFile.jTextFieldName.getText() +
                    "', '" + PersonalFile.jTextFieldLastName.getText() +
                    "','" + PersonalFile.jComboBox2.getSelectedIndex() +
                    "')";


            String sql1 = "INSERT INTO "+data+"_secound (ID, Tel1, Tel2, email, Transfer)" +
                    "VALUES (" + sql_take_ip.id[sql_take_ip.ip] + ",'" +
                    PersonalFile.jTextFieldPhone1.getText() + "','" +
                    PersonalFile.jTextFieldPhone2.getText() + "','" +
                    PersonalFile.jTextFieldEmail.getText() +"','" +
                    data1 +
                    "')";


            String sql2 = "INSERT INTO "+data+"_third (ID, Wife_man, Children, School, Work1, Adress, Others, Pi)" +
                    "VALUES (" + sql_take_ip.id[sql_take_ip.ip] + ", '" +
                    PersonalFile.jTextFieldWife.getText() + "', '" +
                    PersonalFile.jTextFieldChildren.getText() + "','" +
                    PersonalFile.jTextFieldSchool.getText() + "','" +
                    PersonalFile.jTextFieldWork.getText() + "','" +
                    PersonalFile.jTextAreaAdress.getText() + "','" +
                    PersonalFile.jTextAreaOthers.getText() + "','" +
                    FileChooser1.nfile +
                    "')";





            statement.executeUpdate(sql);
            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);




            System.out.println("Inserted records into the table...");

        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(statement!=null)
                    dbConnection.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(dbConnection!=null)
                    dbConnection.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");


        if (PersonalFile.jTextFieldBirthDate.getText().length()<1){}else{
            sql_data_insert.inserare_data_nasterii(data);}

        if (PersonalFile.jTextFieldMarriageDate.getText().length()<1){}else{
            sql_data_insert.inserare_data_casatoriei(data);}

        if (PersonalFile.jTextFieldBaptizeDate.getText().length()<1){}else{
            sql_data_insert.inserare_data_botezului(data);}

    }//end main



}
