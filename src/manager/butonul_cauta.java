
package manager;

import java.io.IOException;

import manager.swing.PersonalFile;
import manager.swing.MainFrame;
import sql_data.Query1;

public class butonul_cauta {

public static void cauta1() {   
	
				PersonalFile.data = "" ;

    
				try {
					impartire_cod.impartire_choice();
				} catch (IOException e) {
					// 	TODO Auto-generated catch block
					e.printStackTrace();
					}
   
   
   System.out.println(" datele sunt!!!!!"+impartire_cod.nume_pren[1]+ impartire_cod.nume_pren[2]);
   Query1.cauta_dupa_ip(MainFrame.tabel) ;
   
   
    PersonalFile.jTextField1.setText(""+Query1.ip_gasit);
    PersonalFile.jTextFieldName.setText(Query1.firstName[Query1.y]);
    PersonalFile.jTextFieldLastName.setText(Query1.lastName[Query1.y]);
    PersonalFile.jTextFieldBirthDate.setText(Query1.birthDate[Query1.y]);
  //  Edito_Manager.jComboBox2.removeAllItems();
    PersonalFile.jComboBox2.setSelectedIndex(Query1.gender[Query1.y]);
    Query1.cauta_dupa_ip_secound (MainFrame.tabel);
    
    PersonalFile.jTextFieldMarriageDate.setText(Query1.marryageDate[Query1.i]);
    PersonalFile.jTextFieldBaptizeDate.setText(Query1.baptizeDate[Query1.i]);
    PersonalFile.jTextFieldPhone1.setText(Query1.tel1[Query1.i]);
    PersonalFile.jTextFieldPhone2.setText(Query1.tel2[Query1.i]);
    PersonalFile.jTextFieldEmail.setText(Query1.email[Query1.i]);
    Query1.cauta_dupa_ip_third (MainFrame.tabel);
    PersonalFile.jTextFieldSchool.setText(Query1.school[Query1.i]);
    PersonalFile.jTextFieldWife.setText(Query1.wife[Query1.i]);
    PersonalFile.jTextFieldChildren.setText(Query1.children[Query1.i]);
    PersonalFile.jTextAreaAdress.setText(Query1.adress[Query1.i]);
    PersonalFile.jTextAreaOthers.setText(Query1.others[Query1.i]);
    PersonalFile.jTextFieldWork.setText(Query1.work[Query1.i]);
   
  //  Edito_Manager.jTextField15.setText("ASDasda");
    
}
}
