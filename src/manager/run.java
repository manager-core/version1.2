package manager;

import manager.swing.PersonalFile;
import manager.swing.MainFrame;

public class run {


    public static void main(String[] args){
        PersonalFile p =PersonalFile.getInstance(MainFrame.categorie);
        p.setVisible(true);


    }
}
