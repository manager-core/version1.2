package manager;

import manager.swing.MainFrame;

import javax.swing.*;

public class pictures extends JFrame{


public static String img =null;





    public static void main(String[] args) {


    }




public void afisare(){


    ImageIcon icon = new ImageIcon(MainFrame.reverse1);

    JLabel label = new JLabel(icon);

    JFrame frame = new JFrame("Manager");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//    System.out.println("IMAGE IS: "+img);

    frame.setSize(500,500);
    frame.setLocation(480,180);
    frame.getContentPane().add(label);
    frame.setVisible(true);}
}




