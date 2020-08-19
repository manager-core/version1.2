



		package sql_data;

import manager.swing.PersonalFile;
import manager.swing.MainFrame;
import manager.impartire_cod;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.AttributedString;
import java.time.LocalDate;


/**
 * A JDBC SELECT (JDBC query) example program.
 */
public class Query1 extends sql_conections {

	public static int barbati, femei, neselectat, total;
	public static int duuazeci, treizeci, patruzeci, cincizeci, saizeci, saptezeci,optzeci,peste;
	public static String dataplus7, data_azi;
	public static String[] Biserica = new String[100];
	public static String[] tel_biserica = new String[100];
	public static String[] adresa_biserica = new String[100];
	public static String[] email_biserica = new String[100];
	public static String[] firstName = new String[10000];
	public static String[] lastName = new String[10000];
	public static String[] slujire = new String[10000];
	public static int[] gender =  new int[10000];
	public static String[] birthDate =  new String[10000];
	public static String[] id =  new String[10000];
	public static String[] pi =  new String[10000];
	public static int i,y, ream;
	public static String[] marryageDate =  new String[10000];
	public static String[] baptizeDate =  new String[10000];
	public static String[] tel1 =  new String[10000];
	public static String[] tel2 =  new String[10000];
	public static String[] email =  new String[10000];
	public static String[] transfer =  new String[10000];
	public static int id1 = 0;
	public static String[] wife = new String[10000];
	public static String[] d15 = new String[10000];
	public static String[] children = new String[10000];
	public static String[] school = new String[10000];
	public static String[] work = new String[10000];
	public static String[] adress = new String[10000];
	public static String[] others = new String[10000];
	public static int initiere; 
	public static int ip_gasit;


	public static void cauta (String data) {
		initiere = 0;
		y = 0;
		i = 0;
		ip_gasit = 0;
		Connection dbConnection = null;
		Statement statement = null;

		try {

			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION, USER, PASS);

			i = 0;


			ResultSet rs;
			rs = statement.executeQuery("SELECT * FROM  " + data + "  JOIN " + data + "_secound on " + data + ".ID = " + data + "_secound.ID  JOIN " + data + "_third on " + data + ".ID = " + data + "_third.ID  ORDER BY  FirstName, LastName;");
			//rs = statement.executeQuery("SELECT * FROM  "+data+" ORDER BY ID");
			while (rs.next()) {
				i++;
				id[i] = rs.getString("ID");
				firstName[i] = rs.getString("FirstName");
				lastName[i] = rs.getString("LastName");
				gender[i] = rs.getInt("Gender");

				birthDate[i] = rs.getString("BirthDate");
			//	System.out.println(lastName[i] + "  " + i);
			//	System.out.println(lastName[i]);

			}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) {
				initiere++;
				int input = JOptionPane.showOptionDialog(null, "Programul Manager deja rulează sau unele fisiere au fost șterse. \nPentru a putea continua închideți vechea aplicație și încercați din nou.\nE0001, Mulțumesc!", "Mesaj de Atenționare",  JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
				// E0001 - EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL
				//De asemenea asigurațivă că fișierul Manager se afla în D:/Manager si directorul data există
				if (input == JOptionPane.OK_OPTION) {

				}

				System.exit(1);
			}
		}
	}

	public static void cautaa (String data) {
		initiere=0;
		y=0;
		i=0;
		ip_gasit=0;
		Connection dbConnection = null;
		Statement statement = null;


		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);
			i=0;


			ResultSet rs;

			rs = statement.executeQuery("SELECT * FROM  "+data+"  JOIN "+data+"_secound on "+data+".ID = "+data+"_secound.ID  JOIN "+data+"_third on "+data+".ID = "+data+"_third.ID  ORDER BY  FirstName, LastName;");
			while ( rs.next() ) {
				i++;
				marryageDate[i] = rs.getString("MarryageDate");
				baptizeDate[i] = rs.getString("BaptizeDate");
				tel1[i] = rs.getString("Tel1");
				tel2[i] = rs.getString("Tel2");
				email[i] = rs.getString("email");
				transfer[i] = rs.getString("Transfer");
		//		System.out.println(lastName[i]+"  "+i);
			//	System.out.println(lastName[i]);
			}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) { initiere++;
				JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n"+e.getMessage()); } else { }

		}
	}

	public static void cautaaa (String data) {
		initiere=0;
		y=0;
		i=0;
		ip_gasit=0;
		Connection dbConnection = null;
		Statement statement = null;


		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);
			i=0;


			ResultSet rs;

			rs = statement.executeQuery("SELECT * FROM  "+data+"  JOIN "+data+"_secound on "+data+".ID = "+data+"_secound.ID  JOIN "+data+"_third on "+data+".ID = "+data+"_third.ID  ORDER BY  FirstName, LastName;");
			while ( rs.next() ) {
				i++;
				wife[i] = rs.getString("Wife_man");

				children[i] = rs.getString("Children");

				school[i] = rs.getString("School");


				work[i] = rs.getString("Work1");
				adress[i] = rs.getString("Adress");
				others[i] = rs.getString("Others");
				pi[i] = rs.getString("Pi");
			//	System.out.println(lastName[i]+"  "+i);
			//	System.out.println(lastName[i]);
			}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) { initiere++;
				JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n"+e.getMessage()); } else { }

		}
	}
    
    public static void cauta_dupa_ip (String data) {
        
    	i=0;
		Connection dbConnection = null;
		Statement statement = null;

y=0;
    	try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			ResultSet rs;
       
     //   int ip_aux = Edito_Manager.jComboBox1.getSelectedIndex();
     //   ip_aux++;
        	//   rs = stmt.executeQuery("SELECT * FROM  Persons WHERE ID ="+ip_aux);
        	
        		rs = statement.executeQuery("SELECT * FROM  "+data+" WHERE FirstName ='"+impartire_cod.nume_pren[1]+"'");
        	   while ( rs.next() ) {
            	y++;
            	ip_gasit = rs.getInt("ID");
            	firstName[y] = rs.getString("FirstName");
            	lastName[y] = rs.getString("LastName");
            	gender[y] = rs.getInt("Gender");
            	birthDate[y] = rs.getString("BirthDate");
            //    System.out.println("HAI......"+lastName[y]+"  "+y);
             //   System.out.println(lastName[y]);
            }
			dbConnection.close();
        } catch (Exception e) {
        	
      	  if (PersonalFile.check_begin == 0 && initiere==0) {

			  int input = JOptionPane.showOptionDialog(null, "Probabil Manager deja rulează. Închideți vechea aplicație și încercați din nou. E0001", "Mesaj de Eroare", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
			  // E0001 - EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL
			  if (input == JOptionPane.OK_OPTION) {
				  System.exit(1);
			  }
			  if (input == JOptionPane.OK_CANCEL_OPTION) {
				  System.exit(1);
			  }


		  }
		}
           		
        }
  
   

 
    public static void cauta_dupa_ip_secound (String data) {
        
    	i=0;
    	 Connection dbConnection = null;
    	   Statement statement = null;

    	try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			ResultSet rs;
        	 
            rs = statement.executeQuery("SELECT * FROM  "+data+"_secound WHERE ID ="+ip_gasit+"");
            while ( rs.next() ) {
            	//i++;
            //	 System.out.println("SECOUND");
            	marryageDate[i] = rs.getString("MarryageDate");
            	baptizeDate[i] = rs.getString("BaptizeDate");
            	tel1[i] = rs.getString("Tel1");
            	tel2[i] = rs.getString("Tel2");
            	email[i] = rs.getString("email");
        //        System.out.println("SECOUND......"+marryageDate[i]+"  "+y);
        //        System.out.println(lastName[i]);
            }
			dbConnection.close();
        } catch (Exception e) {
        
        	if (PersonalFile.check_begin == 0 && initiere==0) {
           	  JOptionPane.showMessageDialog(null, "EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL \n"+e.getMessage()); } else { } 
           		
        }
    	
    }
    
    
    
    
	public static void cauta_dupa_ip_third (String data) {
        
    	i=0;
    	 Connection dbConnection = null;
    	   Statement statement = null;

    	try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			ResultSet rs;
        	 
            rs = statement.executeQuery("SELECT * FROM  "+data+"_third WHERE ID ="+ip_gasit+"");
            while ( rs.next() ) {
            	//i++;
          //  	 System.out.println("THIRD");

            	wife[i] = rs.getString("Wife_man");

            	children[i] = rs.getString("Children");
            	
            	school[i] = rs.getString("School");
            	
            	
            	work[i] = rs.getString("Work1");
            	adress[i] = rs.getString("Adress");
            	others[i] = rs.getString("Others");
				pi[i] = rs.getString("PI");
         //       System.out.println("SECOUND......"+marryageDate[i]+"  "+y);
         //       System.out.println(lastName[i]);
            }
			dbConnection.close();
        } catch (Exception e) {
        	if (PersonalFile.check_begin == 0 && initiere==0) {
           	  JOptionPane.showMessageDialog(null, "EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL \n"+e.getMessage()); } else if (PersonalFile.check_begin == 1){ JOptionPane.showMessageDialog(null, ""+e.getMessage());
           	  } 
           		
        }
}




	public static void cauta_dupa_ip_tabel (String data) {

		i=0;
		Connection dbConnection = null;
		Statement statement = null;
		y=0;
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			ResultSet rs;

			//   int ip_aux = Edito_Manager.jComboBox1.getSelectedIndex();
			//   ip_aux++;
			//   rs = stmt.executeQuery("SELECT * FROM  Persons WHERE ID ="+ip_aux);
//System.out.println("Val************************************ue 1 si doi sunt"+Home_search.value+Home_search.value1);
//			rs = statement.executeQuery("SELECT * FROM  "+data+" WHERE FirstName ='"+Home_search.value+"' AND LastName = '"+Home_search.value1+"'");
			rs = statement.executeQuery("SELECT * FROM  "+data+" WHERE ID = '"+ MainFrame.id[MainFrame.valuetest+1] +"'");
			while ( rs.next() ) {
				y++;
				ip_gasit = rs.getInt("ID");
				firstName[y] = rs.getString("FirstName");
				lastName[y] = rs.getString("LastName");
				gender[y] = rs.getInt("Gender");
				birthDate[y] = rs.getString("BirthDate");
			//	System.out.println("HAI......"+lastName[y]+"  "+y);
			//	System.out.println(lastName[y]);
			}
			dbConnection.close();

		} catch (Exception e) {

			if (PersonalFile.check_begin == 0 && initiere==0) {

				JOptionPane.showMessageDialog(null, "EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL \n"+e.getMessage()); } else { }

		}}




	public static void cauta_dupa_ip_tabel_comitet (String data) {

		i=0;
		Connection dbConnection = null;
		Statement statement = null;
		y=0;
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			ResultSet rs;



			rs = statement.executeQuery("SELECT * FROM  "+data+" WHERE DATA_CONSILIU ='"+ MainFrame.value+"' AND Subiect = '"+ MainFrame.value1+"'");

			while ( rs.next() ) {
				y++;
				ip_gasit = rs.getInt("ID");

			//	System.out.println("HAI......"+lastName[y]+"  "+y);
			//	System.out.println(lastName[y]);
			}
			dbConnection.close();

		} catch (Exception e) {

			if (PersonalFile.check_begin == 0 && initiere==0) {

				JOptionPane.showMessageDialog(null, "EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL \n"+e.getMessage()); } else { }

		}







	}




	public static void cauta_birthdate (String data) {
		initiere=0;
		y=0;
		i=0;
		ip_gasit=0;
		Connection dbConnection = null;
		Statement statement = null;


		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);
			i=0;


			ResultSet rs;

			rs = statement.executeQuery("SELECT  * FROM  "+data+"  JOIN "+data+"_secound on "+data+".ID = "+data+"_secound.ID  JOIN "+data+"_third on "+data+".ID = "+data+"_third.ID  ORDER BY MONTH(BirthDate), DAYOFMONTH(BirthDate);");
			while ( rs.next() ) {
				i++;
				id[i] = rs.getString("ID");
				firstName[i] = rs.getString("FirstName");
				lastName[i] = rs.getString("LastName");
				birthDate[i] = rs.getString("BirthDate");
				tel1[i] = rs.getString("Tel1");
				transfer[i] = rs.getString("Transfer");
				adress[i] = rs.getString("Adress");
				work[i]=rs.getString("Work1");
			//	System.out.print("ADRESA ESTE " + adress[i]);
				others[i] = rs.getString("Others");

					}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) { initiere++;
				JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n"+e.getMessage()); } else { }

		}
	for (int tt=0; tt<i+1; tt++){

			//System.out.println("Ordinea este "+ firstName[tt] );

	}

	}

	public static void cauta_comitet(String data) {
		initiere=0;
		y=0;
		i=0;
		ip_gasit=0;
		Connection dbConnection = null;
		Statement statement = null;

		try {

			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			i=0;


			ResultSet rs;
			rs = statement.executeQuery("SELECT * FROM  "+data+" ");
			//rs = statement.executeQuery("SELECT * FROM  "+data+" ORDER BY ID");
			while ( rs.next() ) {
				i++;
				id[i] = rs.getString("ID");
				firstName[i] = rs.getString("DATA_CONSILIU");
				lastName[i] = rs.getString("SUBIECT");
				birthDate[i] = rs.getString("CONTINUT");

				adress[i] = rs.getString("PROCESE_VERBALE");
//System.out.print("id:" + id);
			}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) { initiere++;
				JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n"+e.getMessage()); } else { }

		}
	}


	public static void reaminteste (String data, String luna , String zi) {
		Query1.firstName[1]=null;
		Query1.firstName[2]=null;
		Query1.firstName[3]=null;
		Query1.firstName[4]=null;
		Query1.firstName[5]=null;
		ream=0;
		LocalDate today1 = LocalDate.now();
        String data_c =""+today1;
	//	System.out.print(today1);
		manager.data_calendaristica.reamintire(data_c);

        int data_initiala_an = manager.data_calendaristica.an;
		int data_initiala_luna = manager.data_calendaristica.luna;
		int data_initiala_zi = manager.data_calendaristica.zi;

		int an_final =data_initiala_an;
		int luna_final = data_initiala_luna;
		int zi_final = data_initiala_zi;
//System.out.print("zi luna an "+an_final+luna_final+zi_final+" \n");

		if (luna_final == 02){//System.out.println("luna e februarie");
luna_final = luna_final+1;
		zi_final = data_initiala_zi+7;
		int test =28;

		int reportare = 0;
			try {reportare= zi_final-28;
			} catch (Exception e){}

		if (reportare > 0){ luna_final = luna_final+1;
							zi_final = 0+reportare;
							an_final = an_final;
		}


		}
String data_initiala_luna2="";
String data_l ="";
if (luna_final<10){data_l="0"+luna_final;}
if (data_initiala_luna<10){data_initiala_luna2="0"+data_initiala_luna;}


 data_azi = ""+data_initiala_an+"-"+data_initiala_luna2+"-"+data_initiala_zi;
 dataplus7 = ""+an_final+"-"+data_l+"-0"+zi_final;

//System.out.print(data_azi+" "+dataplus7);


		initiere=0;
		y=0;
		i=0;
		ip_gasit=0;
		Connection dbConnection = null;
		Statement statement = null;


		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);
			i=0;


			ResultSet rs;

			rs = statement.executeQuery("SELECT  * FROM  "+data+"  JOIN "+data+"_secound on "+data+".ID = "+data+"_secound.ID  JOIN "+data+"_third on "+data+".ID = "+data+"_third.ID  WHERE MONTH(BirthDate)='"+luna+"' AND Day(BirthDate)='"+zi+"' ORDER BY BirthDate;");
			while ( rs.next() ) {
				i++;
				ream++;
				id[i] = rs.getString("ID");
				firstName[i] = rs.getString("FirstName");
				lastName[i] = rs.getString("LastName");
				birthDate[i] = rs.getString("BirthDate");
				tel1[i] = rs.getString("Tel1");
				adress[i] = rs.getString("Adress");
				work[i]=rs.getString("Work1");
		//			System.out.print("ADRESA ESTE " + firstName[i]);
				others[i] = rs.getString("Others");

			}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) { initiere++;
				JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n"+e.getMessage()); } else { }

		}
		for (int tt=0; tt<i+1; tt++){

			//System.out.println("Ordinea este "+ firstName[tt] );

		}

	}




	public static void cauta_adresa (String data) {
		initiere=0;
		y=0;
		i=0;
		ip_gasit=0;
		Connection dbConnection = null;
		Statement statement = null;

		try {

			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			i=0;


			ResultSet rs;
			rs = statement.executeQuery("SELECT * FROM  "+data+"  JOIN "+data+"_secound on "+data+".ID = "+data+"_secound.ID  JOIN "+data+"_third on "+data+".ID = "+data+"_third.ID  ORDER BY  Adress");
			//rs = statement.executeQuery("SELECT * FROM  "+data+" ORDER BY ID");
			while ( rs.next() ) {
				i++;
				id[i] = rs.getString("ID");
				firstName[i] = rs.getString("FirstName");
				lastName[i] = rs.getString("LastName");
				gender[i] = rs.getInt("Gender");
				tel1[i] = rs.getString("Tel1");
				wife[i] = rs.getString("Wife_man");
				adress[i] = rs.getString("Adress");
				work[i]=rs.getString("Work1");
				birthDate[i] = rs.getString("BirthDate");
		//		System.out.println(lastName[i]+"  "+i);
		//		System.out.println(lastName[i]);

			}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) { initiere++;
				JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n"+e.getMessage()); } else { }

		}
	}


	public static void cauta_numai_vaduve (String data) {
		initiere=0;
		y=0;
		i=0;
		ip_gasit=0;
		Connection dbConnection = null;
		Statement statement = null;

		try {

			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			i=0;


			ResultSet rs;
			rs = statement.executeQuery("SELECT * FROM  "+data+"  JOIN "+data+"_secound on "+data+".ID = "+data+"_secound.ID  JOIN "+data+"_third on "+data+".ID = "+data+"_third.ID " +
					" Where  Wife_man like 'văduv' OR   Wife_man like 'văduvă' Or " +
					"  Wife_man like 'Văduv' OR   Wife_man like 'Văduvă' order by Wife_man ");
			//rs = statement.executeQuery("SELECT * FROM  "+data+" ORDER BY ID");
			while ( rs.next() ) {
				i++;
				id[i] = rs.getString("ID");
				firstName[i] = rs.getString("FirstName");
				lastName[i] = rs.getString("LastName");
				gender[i] = rs.getInt("Gender");
				tel1[i] = rs.getString("Tel1");
				wife[i] = rs.getString("Wife_man");
				work[i]=rs.getString("Work1");
				birthDate[i] = rs.getString("BirthDate");
		//		System.out.println(lastName[i]+"  "+i);
		//		System.out.println(lastName[i]);

			}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) { initiere++;
				JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n"+e.getMessage()); } else { }

		}
	}


	public static void cauta_pensionari (String data) {
		initiere=0;
		y=0;
		i=0;
		ip_gasit=0;
		Connection dbConnection = null;
		Statement statement = null;

		try {

			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			i=0;


			ResultSet rs;
			rs = statement.executeQuery("SELECT * FROM  "+data+"  JOIN "+data+"_secound on "+data+".ID = "+data+"_secound.ID  JOIN "+data+"_third on "+data+".ID = "+data+"_third.ID " +
					" Where  Work1 like 'pensionar' OR   Work1 like 'pensionară' Or " +
					"  Work1 like 'Pensionar' OR   Work1 like 'Pensionară' order by work1 ");
			//rs = statement.executeQuery("SELECT * FROM  "+data+" ORDER BY ID");
			while ( rs.next() ) {
				i++;
				id[i] = rs.getString("ID");
				firstName[i] = rs.getString("FirstName");
				lastName[i] = rs.getString("LastName");
				gender[i] = rs.getInt("Gender");
				tel1[i] = rs.getString("Tel1");
				wife[i] = rs.getString("Wife_man");
				work[i]=rs.getString("Work1");
				birthDate[i] = rs.getString("BirthDate");
			//	System.out.println(lastName[i]+"  "+i);
			//	System.out.println(lastName[i]);

			}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) { initiere++;

				int input = JOptionPane.showOptionDialog(null, " EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL", "The title", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

				if(input == JOptionPane.OK_OPTION)
				{
					// do something
				}
						JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n"+e.getMessage()); } else { }

		}
	}




	public static void cauta_work (String data) {
		initiere=0;
		y=0;
		i=0;
		ip_gasit=0;
		Connection dbConnection = null;
		Statement statement = null;

		try {

			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			i=0;


			ResultSet rs;
			rs = statement.executeQuery("SELECT * FROM  "+data+"  JOIN "+data+"_secound on "+data+".ID = "+data+"_secound.ID  JOIN "+data+"_third on "+data+".ID = "+data+"_third.ID  ORDER BY  Work1");
			//rs = statement.executeQuery("SELECT * FROM  "+data+" ORDER BY ID");
			while ( rs.next() ) {
				i++;
				id[i] = rs.getString("ID");
				firstName[i] = rs.getString("FirstName");
				lastName[i] = rs.getString("LastName");
				gender[i] = rs.getInt("Gender");
				tel1[i] = rs.getString("Tel1");
				birthDate[i] = rs.getString("BirthDate");
				work[i]=rs.getString("Work1");

				tel1[i] = rs.getString("Tel1");
				adress[i] = rs.getString("Adress");
		//		System.out.println(lastName[i]+"  "+i);
		//		System.out.println(lastName[i]);

			}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) { initiere++;
				JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n"+e.getMessage()); } else { }

		}
	}


	public static void dupa_slujire (String data) {
		initiere=0;
		y=0;
		i=0;
		ip_gasit=0;
		Connection dbConnection = null;
		Statement statement = null;

		try {

			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			i=0;


			ResultSet rs;
			rs = statement.executeQuery("SELECT * FROM  "+data+"  JOIN "+data+"_secound on "+data+".ID = "+data+"_secound.ID  JOIN "+data+"_third on "+data+".ID = "+data+"_third.ID  ORDER BY  Tel2");
			//rs = statement.executeQuery("SELECT * FROM  "+data+" ORDER BY ID");
			while ( rs.next() ) {
				i++;
				id[i] = rs.getString("ID");
				firstName[i] = rs.getString("FirstName");
				lastName[i] = rs.getString("LastName");
				gender[i] = rs.getInt("Gender");
				tel1[i] = rs.getString("Tel1");
				slujire[i]=rs.getString("Tel2");
				birthDate[i] = rs.getString("BirthDate");
				work[i]=rs.getString("Work1");

				tel1[i] = rs.getString("Tel1");
				adress[i] = rs.getString("Adress");
			//	System.out.println(lastName[i]+"  "+i);
		//		System.out.println(lastName[i]);
////
			}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) { initiere++;
				JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n"+e.getMessage()); } else { }

		}
	}





	public static void cauta_nume_biserica (String data) {

		i=0;
		Connection dbConnection = null;
		Statement statement = null;

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			ResultSet rs;

			rs = statement.executeQuery("SELECT * FROM  Biserica WHERE ID ='1'");
			while ( rs.next() ) {


				Biserica[1] = rs.getString("Nume");
				adresa_biserica[1] = rs.getString("Adresa");
				tel_biserica[1] = rs.getString("Tel");
				email_biserica[1] = rs.getString("email");

				//        System.out.println("SECOUND......"+marryageDate[i]+"  "+y);
				//        System.out.println(lastName[i]);
			}
			dbConnection.close();
		} catch (Exception e) {

			if (PersonalFile.check_begin == 0 && initiere==0) {
			/*	int input = JOptionPane.showOptionDialog(null, "Probabil Manager deja rulează. Închideți vechea aplicație și încercați din nou. E0001", "Mesaj de Eroare", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
				// E0001 - EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL
				if (input == JOptionPane.OK_OPTION) {
					System.exit(1);
				}if (input == JOptionPane.CANCEL_OPTION) {
					System.exit(1);
				}
*/

			}}}




	public static void cautaaa_order_by_transfer (String data) {
		initiere=0;
		y=0;
		i=0;
		ip_gasit=0;
		Connection dbConnection = null;
		Statement statement = null;


		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);
			i=0;


			ResultSet rs;

			rs = statement.executeQuery("SELECT * FROM  "+data+"  JOIN "+data+"_secound on "+data+".ID = "+data+"_secound.ID  JOIN "+data+"_third on "+data+".ID = "+data+"_third.ID  ORDER BY  BIRTHDATE;");
			while ( rs.next() ) {
				i++;
				id[i] = rs.getString("ID");
				firstName[i] = rs.getString("FirstName");
				lastName[i] = rs.getString("LastName");
				gender[i] = rs.getInt("Gender");
				tel1[i] = rs.getString("Tel1");
				slujire[i]=rs.getString("Tel2");
				birthDate[i] = rs.getString("BirthDate");
				work[i]=rs.getString("Work1");

				tel1[i] = rs.getString("Tel1");
				adress[i] = rs.getString("Adress");
				transfer[i] = rs.getString("Transfer");
				//	System.out.println(lastName[i]+"  "+i);
				//	System.out.println(lastName[i]);
			}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) { initiere++;
				JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n"+e.getMessage()); } else { }

		}
	}






	public static void cautaaa_order_by_deces (String data) {
		initiere=0;
		y=0;
		i=0;
		ip_gasit=0;
		Connection dbConnection = null;
		Statement statement = null;


		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);
			i=0;


			ResultSet rs;

			rs = statement.executeQuery("SELECT * FROM  "+data+"  JOIN "+data+"_secound on "+data+".ID = "+data+"_secound.ID  JOIN "+data+"_third on "+data+".ID = "+data+"_third.ID  ORDER BY  TRANSFER;");
			while ( rs.next() ) {
				i++;
				id[i] = rs.getString("ID");
				firstName[i] = rs.getString("FirstName");
				lastName[i] = rs.getString("LastName");
				gender[i] = rs.getInt("Gender");
				tel1[i] = rs.getString("Tel1");
				slujire[i]=rs.getString("Tel2");
				birthDate[i] = rs.getString("BirthDate");
				work[i]=rs.getString("Work1");

				tel1[i] = rs.getString("Tel1");
				adress[i] = rs.getString("Adress");
				transfer[i] = rs.getString("Transfer");
				//	System.out.println(lastName[i]+"  "+i);
				//	System.out.println(lastName[i]);
			}
			dbConnection.close();
		} catch (Exception e) {
			AttributedString as = new AttributedString("ad");

			as.addAttribute(TextAttribute.FOREGROUND, Color.red);

			if (PersonalFile.check_begin == 0) { initiere++;
				JOptionPane.showMessageDialog(null, "                 EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL   \n"+e.getMessage()); } else { }

		}
	}






	public static void cauta_statistici (String data) {

		i=0;
		Connection dbConnection = null;
		Statement statement = null;
		y=0;
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			dbConnection = DriverManager.getConnection(DB_CONNECTION,USER,PASS);

			ResultSet rs;

neselectat=0;
barbati=0;
femei=0;
total=0;
			rs = statement.executeQuery("SELECT * FROM  "+data+" ORDER BY FIRSTNAME");

			while ( rs.next() ) { total=total+1;
				y++;
				ip_gasit = rs.getInt("ID");
				gender[i] = rs.getInt("Gender");
		if(gender[i]==1){
			femei=femei+1;
		}
		if(gender[i]==2){
					barbati=barbati+1;
				}

		if(gender[i]==0){
					neselectat=neselectat+1;
				}

			}
			dbConnection.close();

		} catch (Exception e) {

			if (PersonalFile.check_begin == 0 && initiere==0) {

				JOptionPane.showMessageDialog(null, "EROARE: Conectarea la BAZA DE DATE nu se poate realiza - verificati serverul SQL \n"+e.getMessage()); } else { }

		}







	}





}
