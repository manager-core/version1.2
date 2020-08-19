package sql_data;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sql_crate_tabel extends sql_conections {


	public static void main(String[] argv) {

		try {



			//create_tabel_Info_Biserica("Biserica");
			createTable("Decedati");
			//createTable("Transferati");
			//createTable("Copii");
			//createTable("Apartinatori");
			//createTable("Disciplina");
			//createTable("Persons");



		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void createTable(String categorie) throws SQLException {
		Connection dbConnection = null;
		Statement statement = null;



		String createTableSQL1 = "CREATE TABLE "+categorie+" (\r\n" +
				"    ID int NOT NULL UNIQUE,\r\n" +
				"    FirstName varchar(100),\r\n" +
				"    LastName varchar(100),\r\n" +
				"    Gender varchar(80),\r\n" +
				"    BirthDate   date\r\n)";


		String createTableSQL2 = "CREATE TABLE "+categorie+"_third (\r\n" +
				"    ID int NOT NULL UNIQUE,\r\n" +
				"    Wife_man varchar(100),\r\n" +
				"    Children varchar(300),\r\n" +
				"    School varchar(300),\r\n" +
				"    Work1   varchar(300),\r\n" +
				"    Adress varchar(12000),\r\n" +
				"    Others varchar(16000),\r\n" +
				"    Pi varchar(600)\r\n)";


		String createTableSQL3 = "CREATE TABLE "+categorie+"_secound (\r\n" +
				"    ID int NOT NULL UNIQUE,\r\n" +
				"    MarryageDate date,\r\n" +
				"    BaptizeDate date,\r\n" +
				"    Tel1 varchar(50),\r\n" +
				"    Tel2 varchar(50),\r\n" +
				"    email varchar(100),\r\n" +
				"    Transfer date\r\n)";


		String createTableSQL4 = "CREATE TABLE Biserica (\r\n" +
				"    ID int NOT NULL UNIQUE,\r\n" +
				"    Nume varchar(50),\r\n" +
				"    Adresa varchar(50),\r\n" +
				"    tel varchar(50),\r\n" +
				"    email varchar(100),\r\n" +
				"    imagine varchar(100),\r\n" +
				"    data date\r\n)";





		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();



			//	System.out.println(createTableSQL1);
			//statement.execute(createTableSQL2);
			//	System.out.println(createTableSQL2);
	    	//	statement.execute(createTableSQL3);
			//	System.out.println(createTableSQL3);
			statement.execute(createTableSQL4);
			//	System.out.println("Table "+categorie+" is created!");

		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, e);

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}



	private static void create_tabel_Info_Biserica(String categorie) throws SQLException {
		Connection dbConnection = null;
		Statement statement = null;


		String createTableSQL1 = "CREATE TABLE Biserica (\r\n" +
				"    ID int NOT NULL UNIQUE,\r\n" +
				"    Nume varchar(50),\r\n" +
				"    Adresa varchar(50),\r\n" +
				"    tel varchar(50),\r\n" +
				"    email varchar(100),\r\n" +
				"    imagine varchar(100),\r\n" +
				"    data date\r\n)";




		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();



			statement.execute(createTableSQL1);


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


	public static void update(String data) {


		Connection dbConnection = null;
		Statement statement = null;


		try {


			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			String sql5 = "INSERT INTO BISERICA (ID, Nume) \n" +
					"VALUES(1, '--')";






			statement.executeUpdate(sql5);






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



}