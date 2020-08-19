package sql_data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sql_interogari extends sql_conections {
	public static String[] firstName = new String[100];
	public static String[] lastName = new String[100];
	public static String[] gender =  new String[100];
	public static String[] birthDate =  new String[100];
	public static String[] id =  new String[100];
	public static int i,y;
    
	
	public static void cauta () {
		
		Connection dbConnection=null;
		Statement statement = null;
		
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);
			
			ResultSet rs;
			rs = statement.executeQuery("SELECT * FROM  Persons ORDER BY FirstName");
			 while ( rs.next() ) {
	            	i++;
	            	id[i] = rs.getString("ID");
	            	firstName[i] = rs.getString("FirstName");
	            	lastName[i] = rs.getString("LastName");
	            	gender[i] = rs.getString("Gender");
	            	birthDate[i] = rs.getString("BirthDate");
	                System.out.println(lastName[i]+"  "+i);
	                System.out.println(lastName[i]);
	            }
	            dbConnection.close();
	        } catch (Exception e) {
	            System.err.println("Got an exception! ");
	            System.err.println(e.getMessage());
	        }
	    }
		
		
	}

