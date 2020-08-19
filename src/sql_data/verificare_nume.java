package sql_data;

import manager.swing.PersonalFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




//import old.Edito_Manager;


/**
 * A JDBC SELECT (JDBC query) example program.
 */
public class verificare_nume extends sql_conections {
	public static String firstName = new String();
	public static String lastName = new String();
	public static int nn, comitet_id;
	

	public static void cauta (String data) {
		comitet_id=0;
     nn=0;
    	 Connection dbConnection = null;
    	   Statement statement = null;

    	try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);
    	   firstName = PersonalFile.jTextFieldName.getText();
    	   lastName = PersonalFile.jTextFieldLastName.getText();
        	ResultSet rs;
 
            rs = statement.executeQuery("SELECT * FROM  "+data+" WHERE firstName='"+firstName+"' AND LastName='"+lastName+"'");
            while ( rs.next() ) {
            
            	firstName = rs.getString("FirstName");
            	lastName = rs.getString("LastName");
            
                System.out.println("ACIIIIII"+firstName+"  "+lastName);
        nn=1;
            }
            statement.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }



	public static void cauta_comitet (String data) {
		nn=0;
		Connection dbConnection = null;
		Statement statement = null;

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			ResultSet rs;

			rs = statement.executeQuery("SELECT * FROM  "+data+" ORDER BY ID");
			while ( rs.next() ) {

				comitet_id = rs.getInt("ID");
				comitet_id =comitet_id+1;
				System.out.print("comited is  "+ comitet_id);
			}
			statement.close();
		} catch (Exception e) {
			System.err.println("Got an exception! "+e);
			System.err.println(e.getMessage());
		}
	}



}
    
	