package sql_data;

import manager.swing.PersonalFile;

import javax.swing.*;
import java.sql.*;

//import old.Edito_Manager;


/**
 * A JDBC SELECT (JDBC query) example program.
 */
public class sql_take_ip extends sql_conections {
	public static int[] id = new int[100000];
	public static int ip;
	
	public static void tak_ip(String data){
		ip=0;
    	 Connection dbConnection = null;
    	 Statement statement = null;

    	try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);
        	      	
        	
        	ResultSet rs;
 
            rs = statement.executeQuery("SELECT * FROM  "+data+" ORDER BY ID");
            while ( rs.next() ) {
            ip=ip+1;
            
            	id[ip] = rs.getInt("ID");
                System.out.println("Last IP is:  "+id[ip]);
               // System.out.println(lastName[i]);
        
            
            }
            dbConnection.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

	id[ip] = id[ip]+1; // se adaugă 1 pentru a inregistra urmatorul Ip disponibil;
	}





	public static void tak_ip_modifica(String data){
		ip=0;
		Connection dbConnection = null;
		Statement statement = null;

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);


			ResultSet rs;

			rs = statement.executeQuery("SELECT * FROM  "+data+" Where FirstName LIKE '"+ PersonalFile.jTextFieldName+"' and LastName Like '"+ PersonalFile.jTextFieldLastName+"'");
			while ( rs.next() ) {
				ip=ip+1;

				id[ip] = rs.getInt("ID");
				System.out.println("Last IP is:  "+id[ip]);
				// System.out.println(lastName[i]);


			}
			dbConnection.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Această persoană încă nu a fost înregistrată. Vă rog mai întâi adăugați, apoi modificati");
				System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}

		id[ip] = id[ip]+1; // se adaugă 1 pentru a inregistra urmatorul Ip disponibil;
	}

}
	