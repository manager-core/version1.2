
package manager;


import manager.swing.PersonalFile;

import java.io.IOException;

//import Edito_Manager;

public class impartire_cod {
	
	public static String []  nume_pren = new String [15];
	public static void  impartire_choice() throws IOException {
	       
		//Object nume_prenume = Edito_Manager.jComboBox1.getSelectedItem();
	     
		nume_pren[1]= null;
		nume_pren[2]= null;
		
		String Str3 = new String(PersonalFile.data);
	         	        
	     
	    
	    int ti = 0;
	         for (String prenume_decodat1: Str3.split(" ")) {
	     ti =ti+1;
	      //  if (prenume_decodat.equals(" ") ) {prenume_decodat="";}
	             if (ti ==1) {  nume_pren[1] =   prenume_decodat1;} else {
	             nume_pren[2] =   prenume_decodat1;}
	   
	  


	   }
	         System.out.println("prenume decodat"+ti+"este: I "+nume_pren[1]);
	         System.out.println("prenume decodat"+ti+"este: II "+nume_pren[2]);
	
	}
}