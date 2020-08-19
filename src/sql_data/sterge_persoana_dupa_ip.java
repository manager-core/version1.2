package sql_data;

import manager.swing.PersonalFile;
import manager.swing.MainFrame;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sterge_persoana_dupa_ip extends sql_conections {


public static int test_sters=0; //daca inainte de reafisare a fost sters ceva


	public static void delete_data(String data) throws SQLException {
		test_sters=1;
		Query1.cauta_dupa_ip(MainFrame.tabel);
		

		Connection dbConnection = null;
		Statement statement = null;
		
		
		   //int ip_aux = Edito_Manager.jComboBox1.getSelectedIndex();

	
	String createTableSQL1 = "DELETE FROM "+data+" WHERE FirstName='"+ PersonalFile.jTextFieldName.getText()+"' AND LastName='"+ PersonalFile.jTextFieldLastName.getText()+"'";
	String createTableSQL2 = "DELETE FROM "+data+"_secound WHERE ID="+ Query1.ip_gasit;
	String createTableSQL3 = "DELETE FROM "+data+"_third WHERE ID="+ Query1.ip_gasit;
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);
			
                        // execute the SQL stetement
			statement.execute(createTableSQL1);
			System.out.println(createTableSQL1);
			statement.execute(createTableSQL2);
			System.out.println(createTableSQL2);
			statement.execute(createTableSQL3);
			System.out.println(createTableSQL3);

			System.out.println("Persoanaa fost stearsă");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Înregistrarea nu a putut fi stearsă"+e.getMessage());
			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}
		if (PersonalFile.confirmare_stergere==1){}else {
			JOptionPane.showMessageDialog(null, "Înregistrarea " + Query1.firstName[1] + " " + Query1.lastName[1] + " a fost ștearsă");
		}
		}




	public static void delete_data_dupa_click(String data, String value, String value1) throws SQLException {

		 test_sters=1;
		//Query1.cauta_dupa_ip(Home_search.tabel);


		Connection dbConnection = null;
		Statement statement = null;


		//int ip_aux = Edito_Manager.jComboBox1.getSelectedIndex();
System.out.println("Value teste is"+ MainFrame.valuetest );
		String createTableSQL1 = "DELETE FROM "+data+" WHERE ID='"+ MainFrame.id[MainFrame.valuetest]+"'";
		String createTableSQL2 = "DELETE FROM "+data+"_secound WHERE ID="+ MainFrame.id[MainFrame.valuetest];
		String createTableSQL3 = "DELETE FROM "+data+"_third WHERE ID="+ MainFrame.id[MainFrame.valuetest];

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

			System.out.println(Query1.firstName[1]+Query1.lastName[1]+ " a fost șters(ștersă)");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Înregistrarea nu a putut fi stearsă"+e.getMessage());
			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}
		System.out.println("ASDASDASDDASDASDADS"+ Query1.lastName[Query1.i]);
		Query1.lastName[Query1.i]=null;
		System.out.println("ASDASDASDDASDASDADS"+ Query1.lastName[Query1.i]);

					JOptionPane.showMessageDialog(null, "Înregistrarea "+ Query1.firstName[1]+" "+Query1.lastName[1]+ " a fost ștearsă");



	}


}