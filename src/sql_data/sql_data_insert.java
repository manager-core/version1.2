package sql_data;

import despre.install.Date__Biserica;
import manager.*;
import manager.swing.PersonalFile;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import old.Edito_Manager;

public class sql_data_insert extends sql_conections {
    public static String[] dateString = new String[5];
   public static  String data_c;
    public String data1_null;

    public static void executare_inserare(String data) {
        Connection dbConnection = null;
        Statement statement = null;
        data_c="";
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


             String sql1 = "INSERT INTO "+data+"_secound (ID, Tel1, Tel2, email)" +
                      "VALUES (" + sql_take_ip.id[sql_take_ip.ip] + ",'" +
                      PersonalFile.jTextFieldPhone1.getText() + "','" +
                      PersonalFile.jTextFieldPhone2.getText() + "','" +
                      PersonalFile.jTextFieldEmail.getText() +
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
            String sql2s = "INSERT INTO "+data+"_third (ID)"+"VALUES (" + sql_take_ip.id[sql_take_ip.ip]+")";
      try {
          statement.executeUpdate(sql2s);
      } catch  (SQLException e) {
        JOptionPane.showMessageDialog(null,"Eroare la adaugarea Persoanei, probabil tabelul III");
      } {}

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
        inserare_data_nasterii(data);}

        if (PersonalFile.jTextFieldMarriageDate.getText().length()<1){}else{
        inserare_data_casatoriei(data);}

        if (PersonalFile.jTextFieldBaptizeDate.getText().length()<1){}else{
        inserare_data_botezului(data);}

    }//end main







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
            inserare_data_nasterii(data);}

        if (PersonalFile.jTextFieldMarriageDate.getText().length()<1){}else{
            inserare_data_casatoriei(data);}

        if (PersonalFile.jTextFieldBaptizeDate.getText().length()<1){}else{
            inserare_data_botezului(data);}

    }//end main


























    public static void inserare_data_nasterii (String data) {


    Connection dbConnection = null;
    Statement statement = null;

    try {

        dbConnection = getDBConnection();
        statement = dbConnection.createStatement();
        dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);

        String sql_data_nasterii = "UPDATE "+data+" SET BIRTHDATE='" + dateString[1] + "' WHERE ID=" + sql_take_ip.id[sql_take_ip.ip] + "";

        statement.executeUpdate(sql_data_nasterii);

    } catch (SQLException se) {
        //Handle errors for JDBC

        JOptionPane.showMessageDialog(null, "Data nasterii este inccorectă și nu a fost adaugata!");
        //   se.printStackTrace();
    } catch (Exception e) {

        //  e.printStackTrace();
    } finally {
        //finally block used to close resources
        try {
            if (statement != null)
                dbConnection.close();
        } catch (SQLException se) {
        }// do nothing
        try {
            if (dbConnection != null)
                dbConnection.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }//end finally try
    }//end try
    //System.out.println("");
}


    public static void inserare_data_botezului(String data){


        Connection dbConnection = null;
        Statement statement = null;

        try {

            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);



            String sql_data_botezului = "UPDATE "+data+"_SECOUND SET BAPTIZEDATE='"+dateString[3]+"' WHERE ID="+sql_take_ip.id[sql_take_ip.ip]+"";


            statement.executeUpdate(sql_data_botezului);

        }catch(SQLException se){
            //Handle errors for JDBC

            JOptionPane.showMessageDialog(null, "Data botezului este inccorectă și nu a fost adaugata!");
            //   se.printStackTrace();
        }catch(Exception e){

            //  e.printStackTrace();
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
        //System.out.println("");


}


    public static void inserare_data_casatoriei(String data){


        Connection dbConnection = null;
        Statement statement = null;

        try {

            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);

            String sql_data_nasterii = "UPDATE "+data+"_SECOUND SET MARRYAGEDATE='"+dateString[2]+"' WHERE ID="+sql_take_ip.id[sql_take_ip.ip]+"";

            statement.executeUpdate(sql_data_nasterii);

        }catch(SQLException se){
            //Handle errors for JDBC

            JOptionPane.showMessageDialog(null, "Data casatoriei este inccorectă și nu a fost adaugata!");
            //   se.printStackTrace();
        }catch(Exception e){

            //  e.printStackTrace();
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
        //System.out.println("");


    }



    public static void delete_data(String categorie, int id) throws SQLException {




        Connection dbConnection = null;
        Statement statement = null;

        String createTableSQL1 = "DELETE FROM "+categorie+" where ID = "+id;
        String createTableSQL2 = "DELETE FROM "+categorie+"_secound where ID = "+id;
        String createTableSQL3 = "DELETE FROM "+categorie+"_third where ID = "+id;






        //String createTableSQL = "INSERT INTO TABLE MEMBRI (1, 'Cerna', 'Daniel Victor',"
        //	+ " 'Nadastia de Jos', 0720847347, 0762222812, 'cerna.daniel@outlook.com' )";

        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();


            // execute the SQL stetement
            statement.execute(createTableSQL1);
            System.out.println(createTableSQL1);
            statement.execute(createTableSQL2);
            System.out.println(createTableSQL2);
            statement.execute(createTableSQL3);
            System.out.println(createTableSQL3);

            System.out.println("Toate datele au fost sterse");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            if (statement != null) {
                statement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }

        }

    }









    public static void executare_inserare_comitet(String data, int commited) {


        Connection dbConnection = null;
        Statement statement = null;

String data1 = ConversUserData.modific_transfer(comitet_form.jTextField1.getText());

        commited = commited+1;
        try {


            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

            String  sql = "INSERT INTO "+data+" (ID, Data_Consiliu, Subiect, Continut, Procese_Verbale) " +
                    "VALUES (" + commited +
                    ", '" + data1 +
                    "', '" +comitet_form.jTextField2.getText() +
                    "','" + comitet_form.jTextField3.getText() +
                    "','" + comitet_form.jTextArea1.getText() +
                    "')";








            statement.executeUpdate(sql);





            System.out.println("Inserted records into the table _ comitet...");

        }catch(SQLException se){
          JOptionPane.showMessageDialog(null, "Informatiile nu au fost adaugate: " +se);  //Handle errors for JDBC
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




    }//end main



    public static void inserare_data_transfer(String data){
String data1 ="";

try {
    data1 = ConversUserData.modific_transfer(confirm_data_transfer.jTextField1.getText());

} catch (Exception e){System.out.print("Eroarea este:"+e);}

        Connection dbConnection = null;
        Statement statement = null;

        try {

            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);

            String sql_data_nasterii = "UPDATE "+data+"_SECOUND SET Transfer='"+ data1+"' WHERE ID='"+ PersonalFile.jTextField1.getText()+"'";

            statement.executeUpdate(sql_data_nasterii);

        }catch(SQLException se){
            //Handle errors for JDBC

            JOptionPane.showMessageDialog(null, "Pesroana "+ PersonalFile.jTextFieldName.getText()+" "+ PersonalFile.jTextFieldLastName.getText()+" nu există ăn baza de date, sau data indrodusă este incorectă.");
               se.printStackTrace();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            //  e.printStackTrace();
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
        //System.out.println("");


    }



    public static void inserare_data_transfer_direct(String data){
        String data1 ="";

        try {
            data1 = ConversUserData.modific_transfer(Confirm_Transfer.jTextField1.getText());

        } catch (Exception e){System.out.print("Eroarea este:"+e);}

        Connection dbConnection = null;
        Statement statement = null;

        try {

            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);

            String sql_data_nasterii = "UPDATE "+data+"_SECOUND SET Transfer='"+ data1+"' WHERE ID='"+ PersonalFile.jTextField1.getText()+"'";

            statement.executeUpdate(sql_data_nasterii);

        }catch(SQLException se){
            //Handle errors for JDBC

            JOptionPane.showMessageDialog(null, "Data este incorectă, persoana a fost transferată FARA DATA DE TRANSFER \n"+ "Pentru a adauga o data de transfer din pagina principala cu persoanele transferate faceti un click pe persoana dorita si apoi apasati tasta 't' ");
            se.printStackTrace();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            //  e.printStackTrace();
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
        //System.out.println("");


    }


    public static void inserare_Creare_Arbore (String data) {


        Connection dbConnection = null;
        Statement statement = null;

        try {

            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);

     //       String sql_data_nasterii = "UPDATE "+data+"_Arbore SET ID='" + ID[1]+ "' ";

         //   statement.executeUpdate(sql_data_nasterii);

        } catch (SQLException se) {
            //Handle errors for JDBC

            JOptionPane.showMessageDialog(null, "Data nasterii este inccorectă și nu a fost adaugata!");
            //   se.printStackTrace();
        } catch (Exception e) {

            //  e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (statement != null)
                    dbConnection.close();
            } catch (SQLException se) {
            }// do nothing
            try {
                if (dbConnection != null)
                    dbConnection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        //System.out.println("");
    }







    public static void inserare_date_Biserica(String data){
        String data1 ="";

        try {
            data1 = ConversUserData.modific_transfer(Confirm_Transfer.jTextField1.getText());

        } catch (Exception e){System.out.print("Eroarea este:"+e);}

        Connection dbConnection = null;
        Statement statement = null;

        try {

            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);

            String sql_data_nasterii = "UPDATE "+data+"_SECOUND SET Transfer='"+ data1+"' WHERE ID='"+ PersonalFile.jTextField1.getText()+"'";

            statement.executeUpdate(sql_data_nasterii);

        }catch(SQLException se){
            //Handle errors for JDBC

            JOptionPane.showMessageDialog(null, "Data este incorectă, persoana a fost transferată FARA DATA DE TRANSFER \n"+ "Pentru a adauga o data de transfer din pagina principala cu persoanele transferate faceti un click pe persoana dorita si apoi apasati tasta 't' ");
            se.printStackTrace();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            //  e.printStackTrace();
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
        //System.out.println("");


    }





    public static void executare_inserare_date_Biserica(String data) {


        Connection dbConnection = null;
        Statement statement = null;


        try {


            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);



            String sql = "UPDATE BISERICA SET Nume='"+ Date__Biserica.jTextField1.getText()+"' WHERE ID='1'";
            String sql1 = "UPDATE BISERICA SET Adresa='"+ Date__Biserica.jTextField2.getText()+"' WHERE ID='1'";
            String sql2 = "UPDATE BISERICA SET Tel='"+ Date__Biserica.jTextField3.getText()+"' WHERE ID='1'";
            String sql3 = "UPDATE BISERICA SET email='"+ Date__Biserica.jTextField4.getText()+"' WHERE ID='1'";
            String sql4 = "UPDATE BISERICA SET imagine='"+ Date__Biserica.jTextField5.getText()+"' WHERE ID='1'";







            statement.executeUpdate(sql);
            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);
            statement.executeUpdate(sql3);
            statement.executeUpdate(sql4);






            System.out.println("Inserted records into the table Biserica...");

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




    }//end main


















}//end JDBCExample