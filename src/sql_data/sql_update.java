package sql_data;

import manager.ConversUserData;
import manager.swing.PersonalFile;
import manager.FileChooser1;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class sql_update extends sql_conections {
	public static int t1;
	public static void update_sql(String data) {

		Connection dbConnection = null;
		Statement statement = null;
		try{

			t1=0;
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);


			String birthdate1 = ConversUserData.modific_1(PersonalFile.jTextFieldBirthDate.getText());

			String sql = "UPDATE "+data+" SET FirstName='"+ PersonalFile.jTextFieldName.getText()+"' ,"+
					" LastName = '"+ PersonalFile.jTextFieldLastName.getText()+"'"+
				// pentru ca e doar update si poate crea probleme	" Gender = '"+Edito_Manager.jComboBox2.getSelectedIndex()+"'"+
					" WHERE ID="+ PersonalFile.jTextField1.getText();

			//   String sql1 = "UPDATE Persons SET BirthDate = '"+birthdate1+"'"+

			statement.executeUpdate(sql);


		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(dbConnection!=null)
					dbConnection.close();
			}catch(SQLException se){ t1=1;  JOptionPane.showMessageDialog(null, "Probleme la comunicarea cu serverul - modificarea nu s-a operat!");
			}// do nothing
			try{
				if(dbConnection!=null)
					dbConnection.close();
			}catch(SQLException se){ t1=1; JOptionPane.showMessageDialog(null, "Probleme SQL UPDATE - modificarea nu s-a operat!");
				se.printStackTrace();
			}   // if (t1==0) {JOptionPane.showMessageDialog(null, "Datele au fost modificate cu succes");}
		}//end try

		update_sql_person_secound(data);
		update_sql_casatorie(data);
		update_sql_datanasterii(data);
		update_sql_botez(data);
		update_sql_person_third(data);
	}


	public static void update_sql_datanasterii(String data) {

		Connection dbConnection = null;
		Statement statement = null;
		try{

			t1=0;
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);


			String birthdate1 = ConversUserData.modific_1(PersonalFile.jTextFieldBirthDate.getText());

			if (birthdate1=="nu"){} else {

				String sql = "UPDATE "+data+" SET BirthDate = '" + birthdate1 + "'" +
						" WHERE ID=" + PersonalFile.jTextField1.getText();

				statement.executeUpdate(sql);
			}

		}catch(SQLException se){
			JOptionPane.showMessageDialog(null, "Data Nasterii este gresita si nu a mai fost modificata !");
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(dbConnection!=null)
					dbConnection.close();
			}catch(SQLException se){ t1=1;  JOptionPane.showMessageDialog(null, "Probleme la comunicarea cu serverul - modificarea nu s-a operat!");
			}// do nothing
			try{
				if(dbConnection!=null)
					dbConnection.close();
			}catch(SQLException se){ t1=1; JOptionPane.showMessageDialog(null, "Probleme SQL UPDATE - modificarea nu s-a operat!");
				se.printStackTrace();
			}    if (t1==0) {}
		}//end try
	}



	public static void update_sql_person_secound(String data) {

		Connection dbConnection = null;
		Statement statement = null;
		try{

			t1=0;
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);


			String sql = "UPDATE "+data+"_secound SET Tel1 = '"+ PersonalFile.jTextFieldPhone1.getText()+"' ,"+
					" Tel2 = '"+ PersonalFile.jTextFieldPhone2.getText()+"',"+
					" email = '"+ PersonalFile.jTextFieldEmail.getText()+"'"+
					" WHERE ID="+ PersonalFile.jTextField1.getText();

			statement.executeUpdate(sql);


		}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(dbConnection!=null)
					dbConnection.close();
			}catch(SQLException se){ t1=1;  JOptionPane.showMessageDialog(null, "Probleme la comunicarea cu serverul - modificarea nu s-a operat!");
			}// do nothing
			try{
				if(dbConnection!=null)
					dbConnection.close();
			}catch(SQLException se){ t1=1; JOptionPane.showMessageDialog(null, "Probleme SQL UPDATE - modificarea nu s-a operat!");
				se.printStackTrace();
			}    if (t1==0) {}
		}//end try
	}





	public static void update_sql_casatorie(String data) {

		Connection dbConnection = null;
		Statement statement = null;
		try{

			t1=0;
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);


			String marryage = ConversUserData.modific_1(PersonalFile.jTextFieldMarriageDate.getText());

			if (marryage=="nu"){} else {

				String sql = "UPDATE "+data+"_secound SET Marryagedate = '" + marryage + "'" +
						" WHERE ID=" + PersonalFile.jTextField1.getText();

				statement.executeUpdate(sql);
			}

		}catch(SQLException se){
			JOptionPane.showMessageDialog(null, "Data Casatoriei este gresita si nu a mai fost modificata !");
			se.printStackTrace();
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(dbConnection!=null)
					dbConnection.close();
			}catch(SQLException se){ t1=1;  JOptionPane.showMessageDialog(null, "Probleme la comunicarea cu serverul - modificarea nu s-a operat!");
			}// do nothing
			try{
				if(dbConnection!=null)
					dbConnection.close();
			}catch(SQLException se){ t1=1; JOptionPane.showMessageDialog(null, "Probleme SQL UPDATE - modificarea nu s-a operat!");
				se.printStackTrace();
			}    if (t1==0) {}
		}//end try
	}



	public static void update_sql_botez(String data) {

		Connection dbConnection = null;
		Statement statement = null;
		try{

			t1=0;
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);


			String botez = ConversUserData.modific_1(PersonalFile.jTextFieldBaptizeDate.getText());


			if (botez=="nu"){} else {

				String sql = "UPDATE "+data+"_secound SET BAPTIZEDATE = '" + botez + "'" +
						" WHERE ID=" + PersonalFile.jTextField1.getText();

				statement.executeUpdate(sql);
			}

		}catch(SQLException se){
			JOptionPane.showMessageDialog(null, "Data Botezului este gresita si nu a mai fost modificata !");
			se.printStackTrace();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Data Botezului este gresita si nu a mai fost modificata !");
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(dbConnection!=null)
					dbConnection.close();
			}catch(SQLException se){ t1=1;  JOptionPane.showMessageDialog(null, "Probleme la comunicarea cu serverul - modificarea nu s-a operat!");
			}// do nothing
			try{
				if(dbConnection!=null)
					dbConnection.close();
			}catch(SQLException se){ t1=1; JOptionPane.showMessageDialog(null, "Probleme SQL UPDATE - modificarea nu s-a operat!");
				se.printStackTrace();
			}    if (t1==0) {}
		}//end try
	}

	public static void update_sql_person_third(String data) {

		Connection dbConnection = null;
		Statement statement = null;
		try{

			t1=0;
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);


			String sql = "UPDATE "+data+"_third SET Wife_man = '"+ PersonalFile.jTextFieldWife.getText()+"' ,"+
					" Children = '"+ PersonalFile.jTextFieldChildren.getText()+"',"+
					" School = '"+ PersonalFile.jTextFieldSchool.getText()+"',"+
					" Work1 = '"+ PersonalFile.jTextFieldWork.getText()+"',"+
					" Adress = '"+ PersonalFile.jTextAreaAdress.getText()+"',"+
					" Others = '"+ PersonalFile.jTextAreaOthers.getText()+"',"+
					" Pi = '"+ FileChooser1.nfile+"'"+
					" WHERE ID="+ PersonalFile.jTextField1.getText();

			statement.executeUpdate(sql);


		}catch(SQLException se){
			JOptionPane.showMessageDialog(null, "Această persoană încă nu a fost înregistrată. Vă rog mai întâi folositi butonul Adauga! \n din " +
					"partea dreaptă jos, apoi puteți și modifica. Mulțumesc");
		}catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(dbConnection!=null)
					dbConnection.close();
			}catch(SQLException se){ t1=1;
			}// do nothing
			try{
				if(dbConnection!=null)
					dbConnection.close();
			}catch(SQLException se){ t1=1;
				se.printStackTrace();
			}    if (t1==0) {}
		}//end try
	}
}
