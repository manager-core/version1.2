
package manager;

import manager.swing.PersonalFile;
import manager.swing.MainFrame;
import sql_data.Query1;

public class initiere_editor {

		public static int lungime_sir;

	
	public static   String[] id1 = new String[3000];	
		
	
	
	public static void afisare_choice(String data) {
	
		
		lungime_sir=0;
		
		 Query1.cauta(data);
	        
	      
	        String[] name1 = new String[3000];
	        String[] last_name1 = new String[3000];

	        for (int iy=1; iy<Query1.i+1; iy++){
	        	lungime_sir++;
	        	id1[iy]= Query1.id[iy];
	            name1[iy]= Query1.firstName[iy];
	            last_name1[iy]= Query1.lastName[iy];
	           
	            String comp = new String();
	            		comp = name1[iy]+" "+last_name1[iy];
	            

	              }
	        
	        
	   
	}
	        public static void afisare_campuri(String data) {
	         

	       // 	Edito_Manager.jComboBox1.setSelectedIndex(0);

		 /*       Edito_Manager.data = ""
		     		   +  Edito_Manager.jComboBox1.getItemAt( Edito_Manager.jComboBox1.getSelectedIndex());


	        	try {
			impartire_cod.impartire_choice();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    */
	    
	        	
	    Query1.cauta_dupa_ip_tabel(MainFrame.tabel); ;
	    
	    // jTextFieldName.repaint();



				//Edito_Manager.jTextField1.setText(""+Query1.id1);
				//Edito_Manager.jComboBox1.setSelectedIndex(2);



	//	Edito_Manager.jComboBox1.addItem(Query1.firstName[Query1.y]+Query1.lastName[Query1.y]);
				PersonalFile.jTextField1.setText(String.valueOf(Query1.ip_gasit));
				PersonalFile.jTextFieldName.setText(Query1.firstName[Query1.y]);
				PersonalFile.jTextFieldLastName.setText(Query1.lastName[Query1.y]);

				String nastere = ConversUserData.con_home_search(Query1.birthDate[Query1.y]);
				PersonalFile.jTextFieldBirthDate.setText(nastere);


				Query1.cauta_dupa_ip_secound (MainFrame.tabel);

				String casatorie= ConversUserData.con_home_search(Query1.marryageDate[Query1.i]);
				PersonalFile.jTextFieldMarriageDate.setText(casatorie);

				String botez = ConversUserData.con_home_search(Query1.baptizeDate[Query1.i]);
				PersonalFile.jTextFieldBaptizeDate.setText(botez);
				PersonalFile.jTextFieldPhone1.setText(Query1.tel1[Query1.i]);
				PersonalFile.jTextFieldPhone2.setText(Query1.tel2[Query1.i]);
				PersonalFile.jTextFieldEmail.setText(Query1.email[Query1.i]);
				Query1.cauta_dupa_ip_third (MainFrame.tabel);

				PersonalFile.jTextFieldWife.setText(Query1.wife[Query1.i]);
				PersonalFile.jTextFieldChildren.setText(Query1.children[Query1.i]);
				PersonalFile.jTextFieldSchool.setText(Query1.school[Query1.i]);
				PersonalFile.jTextField15.setText(Query1.d15[Query1.i]);
				PersonalFile.jTextFieldWork.setText(Query1.work[Query1.i]);
				PersonalFile.jTextAreaAdress.setText(Query1.adress[Query1.i]);
				PersonalFile.jTextAreaOthers.setText(Query1.others[Query1.i]);


	   //  Edito_Manager.jTextField15.setText(Query1.school[Query1.i]);
	     
	   //  jTextFieldChildrens.setText(Query1.email[Query1.i]);
	     
	     
		
		
		
		
		
	
	     
		
		
		
		
		
	}
	
	
	
	
}
