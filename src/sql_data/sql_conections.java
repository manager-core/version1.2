package sql_data;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sql_conections {


    static final String DB_DRIVER = "org.h2.Driver";
   static final String DB_CONNECTION = "jdbc:h2:./data/db"; //DB_URl
//	static final String DB_CONNECTION = "jdbc:h2:d:.\\Manager\\data\\db"; //DB_URl
   public static final String USER = "sa";
    public static final String PASS = "";


    public static Connection getDBConnection() throws SQLException {

		  Connection dbConnection = null;
		  Statement statement = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			int input = JOptionPane.showOptionDialog(null, "Probabil Manager deja rulează. Închideți vechea aplicație și încercați din nou. E0001", "Mesaj de Eroare", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			// E0001 - EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL
			if (input == JOptionPane.OK_OPTION) {
				System.exit(1);
			}


		}



		try {

            dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

            return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;


	}
}