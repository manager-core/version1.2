package manager;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import manager.swing.PersonalFile;
import manager.swing.MainFrame;
import sql_data.Query1;

public class ItemChangeListener implements ItemListener{
    @Override
    public void itemStateChanged(ItemEvent event) {
       if (event.getStateChange() == ItemEvent.SELECTED) {
          Object item = event.getItem();

       }
     
    }
    
	
    
    public void afisare() {
    	   Query1.cauta_dupa_ip(MainFrame.tabel) ;
           
           
           PersonalFile.jTextField1.setText(""+Query1.ip_gasit);
           PersonalFile.jTextFieldName.setText(Query1.firstName[Query1.y]);
           PersonalFile.jTextFieldLastName.setText(Query1.lastName[Query1.y]);
           PersonalFile.jTextFieldBirthDate.setText(Query1.birthDate[Query1.y]);
    	   PersonalFile.jTextField1.setText(""+Query1.ip_gasit);
    }
    
    
    
}