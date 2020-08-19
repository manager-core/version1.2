package sql_data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class sql_sterge extends sql_conections {





	public static void delete_data(String data) throws SQLException {
	
		
		

		Connection dbConnection = null;
		Statement statement = null;

	String createTableSQL1 = "DELETE FROM "+data+"";
	String createTableSQL2 = "DELETE FROM "+data+"_secound";
	String createTableSQL3 = "DELETE FROM "+data+"_third";
			
				 
		
		
		

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



}