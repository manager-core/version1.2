package reminder;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import manager.ConversUserData;
import manager.data_calendaristica;
import sql_data.Query1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

/**
 *
 * @author Daniel
 */
public class Data_Nastere_Dreapta_Jos extends javax.swing.JFrame {


    public static String[] varsta = new String[50];
    public static String[] nastere = new String[50];


    public static int pornire=0;
    /**
     * Creates new form Remainder
     */
    public Data_Nastere_Dreapta_Jos() {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width-413-this.getSize().width/-100, dim.height-160-this.getSize().height/-10);

        setBackground(Color.ORANGE);
        setUndecorated(true);
        initComponents();
        setAlwaysOnTop(true);
       // frame.setAlwaysOnTop(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {


        pornire=1;
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);


        jLabel1.setForeground(new java.awt.Color(0, 102, 102));



        ImageIcon img = new ImageIcon("D:\\Manager\\Icons\\mare.jpg");
        setIconImage(img.getImage());

        jLabel1.setText(" X \n");
        jLabel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {

               dispose();
            }

        });




        LocalDate today1 = LocalDate.now();
        String data_c =""+today1;
        System.out.print(today1);
        manager.data_calendaristica.reamintire(data_c);

        int data_initiala_an = manager.data_calendaristica.an;
        int data_initiala_luna = manager.data_calendaristica.luna;
        int data_initiala_zi = manager.data_calendaristica.zi;

        String luna = "0"+data_initiala_luna;
        String zi = ""+data_initiala_zi;

        if(data_initiala_zi<10){
                zi= "0"+data_initiala_zi;}else {zi=""+data_initiala_zi;}
        int    zi_maine = data_initiala_zi+1;
        String maine = ""+zi_maine;


        Query1.reaminteste("Persons", luna, zi);


        if (Query1.ream==0){jLabel1.setText("<html>Astăzi nu avem sărbătoriți   [x]</html>");
            // jLabel2.setText("Astăzi nu avem sărbătoriți");
        }

        jPanel1.setBackground(new Color(44, 44, 47));

        if (Query1.i>0) {


            if (Query1.firstName[1] == null) {
            } else {
                nastere[1] = ConversUserData.con_home_search1(Query1.birthDate[1]);
                data_calendaristica.initiere_data(Query1.birthDate[1]);
                varsta[1] = data_calendaristica.an_final;
                data_calendaristica.initiere_data(Query1.birthDate[2]);
                varsta[2] = data_calendaristica.an_final;
                nastere[2] = ConversUserData.con_home_search1(Query1.birthDate[2]);
                data_calendaristica.initiere_data(Query1.birthDate[3]);
                nastere[3] = ConversUserData.con_home_search1(Query1.birthDate[3]);
                varsta[3] = data_calendaristica.an_final;
                data_calendaristica.initiere_data(Query1.birthDate[4]);
                nastere[4] = ConversUserData.con_home_search1(Query1.birthDate[4]);
                varsta[4] = data_calendaristica.an_final;

                jLabel2.setForeground(new Color(167, 162, 173));


                Data_Nastere_Dreapta_Jos.jLabel2.setText("<html><RIGHT><font color=#BF7F3F> Astăzi: </font></RIGHT><br><html> 1.  &nbsp; " + Query1.firstName[1] + "  &nbsp;" + Query1.lastName[1]
                        + "<font color=#005580> &nbsp;&nbsp; " + varsta[1] + "</font> &nbsp;&nbsp;" + nastere[1] + "  &nbsp;<font color=#ebebe0>&nbsp;" + Query1.tel1[1] + "</font>" +
                        "</font></html>");
            }
            if (Query1.i == 1) {

                Data_Nastere_Dreapta_Jos.jLabel2.setText("<html><RIGHT><font color=#005580> Astăzi: </font></RIGHT><br><html> 1.  &nbsp; " + Query1.firstName[1] + "  &nbsp;" + Query1.lastName[1]
                        + "<font color=#005580> &nbsp;&nbsp; " + varsta[1] + "</font> &nbsp;&nbsp;" + nastere[1] + "  &nbsp;<font color=#ebebe0>&nbsp;" + Query1.tel1[1] + "</font></html>");
            }


            if (Query1.i == 2) {

                Data_Nastere_Dreapta_Jos.jLabel2.setText("<html><RIGHT><font color=#005580> Astăzi: </font></RIGHT><br><html> 1.  &nbsp; " + Query1.firstName[1] + "  &nbsp;" + Query1.lastName[1]
                        + "<font color=#005580> &nbsp;&nbsp; " + varsta[1] + "</font> &nbsp;&nbsp;" + nastere[1] + "  &nbsp;<font color=#ebebe0>&nbsp;" + Query1.tel1[1] + "</font>" +
                        " <br>2.  &nbsp; " + Query1.firstName[2] + "  &nbsp;" + Query1.lastName[2]
                        + "<font color=#005580> &nbsp;&nbsp; " + varsta[2] + "</font> &nbsp;&nbsp;" + nastere[2] + "  &nbsp;<font color=#ebebe0>" + Query1.tel1[2] + "</font></html>");
            }
            if (Query1.i == 3) {

                Data_Nastere_Dreapta_Jos.jLabel2.setText("<html><RIGHT><font color=#005580> Astăzi: </font></RIGHT><br><html> 1.  &nbsp; " + Query1.firstName[1] + "  &nbsp;" + Query1.lastName[1]
                        + "<font color=#005580> &nbsp;&nbsp; " + varsta[1] + "</font> &nbsp;&nbsp;" + nastere[1] + "  &nbsp;<font color=#ebebe0>&nbsp;" + Query1.tel1[1] + "</font>" +
                        " <br>2.  &nbsp; " + Query1.firstName[2] + "  &nbsp;" + Query1.lastName[2]
                        + "<font color=#005580> &nbsp;&nbsp; " + varsta[2] + "</font> &nbsp;&nbsp;" + nastere[2] + "  &nbsp;" + Query1.tel1[2] +
                        " <br>3.  &nbsp; " + Query1.firstName[3] + "  &nbsp;" + Query1.lastName[3]
                        + "<font color=#005580> &nbsp;&nbsp; " + varsta[3] + "</font> &nbsp;&nbsp;" + nastere[3] + "  &nbsp;<font color=#ebebe0>" + Query1.tel1[3] +
                        "</font></html>");
            }

            if (Query1.i == 4) {


                Data_Nastere_Dreapta_Jos.jLabel6.setText("<html><RIGHT><font color=#005580> Mâine: </font></RIGHT><br><html> 1.  &nbsp; " + Query1.firstName[1] + "  &nbsp;" + Query1.lastName[1]
                        + "<font color=#005580> &nbsp;&nbsp; " + varsta[1] + "</font> &nbsp;&nbsp;" + nastere[1] + "  &nbsp;<font color=#ebebe0>&nbsp;" + Query1.tel1[1] + "</font>" +
                        " <br>2.  &nbsp; " + Query1.firstName[2] + "  &nbsp;" + Query1.lastName[2]
                        + "<font color=#005580> &nbsp;&nbsp; " + varsta[2] + "</font> &nbsp;&nbsp;" + nastere[2] + "  &nbsp;<font color=#ebebe0>" + Query1.tel1[2] +
                        " <br>3.  &nbsp; " + Query1.firstName[3] + "  &nbsp;" + Query1.lastName[3]
                        + "<font color=#005580> &nbsp;&nbsp; " + varsta[3] + "</font> &nbsp;&nbsp;" + nastere[3] + "  &nbsp;<font color=#ebebe0>" + Query1.tel1[3] +
                        " <br>4.  &nbsp; " + Query1.firstName[4] + "  &nbsp;" + Query1.lastName[4]
                        + "<font color=#005580> &nbsp;&nbsp; " + varsta[4] + "</font> &nbsp;&nbsp;" + nastere[4] + "  &nbsp;<font color=#ebebe0>" + Query1.tel1[4] + "</font></html>");

            }
        }

        Query1.i=0;

        Query1.reaminteste("Persons", luna, maine);

if (Query1.i>0) {
    nastere[1] = ConversUserData.con_home_search1(Query1.birthDate[1]);
    data_calendaristica.initiere_data(Query1.birthDate[1]);
    varsta[1] = data_calendaristica.an_final;
    data_calendaristica.initiere_data(Query1.birthDate[2]);
    varsta[2] = data_calendaristica.an_final;
    nastere[2] = ConversUserData.con_home_search1(Query1.birthDate[2]);
    data_calendaristica.initiere_data(Query1.birthDate[3]);
    nastere[3] = ConversUserData.con_home_search1(Query1.birthDate[3]);
    varsta[3] = data_calendaristica.an_final;
    data_calendaristica.initiere_data(Query1.birthDate[4]);
    nastere[4] = ConversUserData.con_home_search1(Query1.birthDate[4]);
    varsta[4] = data_calendaristica.an_final;

    if(Query1.i>1){        //jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N



        jLabel6.setForeground(new Color(167, 162, 173));
        Data_Nastere_Dreapta_Jos.jLabel6.setText("<html><RIGHT><font color=#005580> Mâine: </font></RIGHT><br><html> 1.  &nbsp; "+Query1.firstName[1] +"  &nbsp;"+ Query1.lastName[1]
                + " &nbsp; "+ varsta[1]+"</font> &nbsp;&nbsp;"+nastere[1]+"  &nbsp;<font color=#ebebe0>&nbsp;"+Query1.tel1[1]+"</font>"+
                "</font></html>");
    }
    if(Query1.i==1){

        Data_Nastere_Dreapta_Jos.jLabel6.setText("<html><RIGHT><font color=#BF7F3F> Mâine: </font></RIGHT><br><html> 1.  &nbsp; "+Query1.firstName[1] +"  &nbsp;"+ Query1.lastName[1]
                + " &nbsp; "+ varsta[1]+"</font> &nbsp;&nbsp;"+nastere[1]+"  &nbsp;<font color=#ebebe0>&nbsp;"+Query1.tel1[1]+"</font></html>");
    }



    if(Query1.i==2){

        Data_Nastere_Dreapta_Jos.jLabel6.setText("<html><RIGHT><font color=#005580> Mâine: </font></RIGHT><br><html> 1.  &nbsp; "+Query1.firstName[1] +"  &nbsp;"+ Query1.lastName[1]
                + " &nbsp;&nbsp; "+ varsta[1]+"</font> &nbsp;&nbsp;"+nastere[1]+"  &nbsp;<font color=#ebebe0>&nbsp;"+Query1.tel1[1]+"</font>"+
                " <br>2.  &nbsp; "+Query1.firstName[2] +"  &nbsp;"+ Query1.lastName[2]
                + "<font color=#005580> &nbsp;&nbsp; "+ varsta[2]+"</font> &nbsp;&nbsp;"+nastere[2]+"  &nbsp;<font color=#ebebe0>"+Query1.tel1[2]+
               "</font></html>");
    }
    if(Query1.i==3){
        Data_Nastere_Dreapta_Jos.jLabel6.setText("<html><RIGHT><font color=#005580> Mâine: </font></RIGHT><br><html> 1.  &nbsp; " + Query1.firstName[1] + "  &nbsp;" + Query1.lastName[1]
                + "<font color=#005580> &nbsp;&nbsp; " + varsta[1] + "</font> &nbsp;&nbsp;" + nastere[1] + "  &nbsp;<font color=#ebebe0>&nbsp;" + Query1.tel1[1] + "</font>" +
                " <br>2.  &nbsp; " + Query1.firstName[2] + "  &nbsp;" + Query1.lastName[2]
                + "<font color=#005580> &nbsp;&nbsp; " + varsta[2] + "</font> &nbsp;&nbsp;" + nastere[2] + "  &nbsp;" + Query1.tel1[2] +
                " <br>3.  &nbsp; " + Query1.firstName[3] + "  &nbsp;" + Query1.lastName[3]
                + "<font color=#005580> &nbsp;&nbsp; " + varsta[3] + "</font> &nbsp;&nbsp;" + nastere[3] + "  &nbsp;<font color=#ebebe0>" + Query1.tel1[3] + "</font></html>");

    }
    if(Query1.i==4){
        Data_Nastere_Dreapta_Jos.jLabel6.setText("<html><RIGHT><font color=#005580> Mâine: </font></RIGHT><br><html> 1.  &nbsp; " + Query1.firstName[1] + "  &nbsp;" + Query1.lastName[1]
                + "<font color=#005580> &nbsp;&nbsp; " + varsta[1] + "</font> &nbsp;&nbsp;" + nastere[1] + "  &nbsp;<font color=#ebebe0>&nbsp;" + Query1.tel1[1] + "</font>" +
                " <br>2.  &nbsp; " + Query1.firstName[2] + "  &nbsp;" + Query1.lastName[2]
                + "<font color=#005580> &nbsp;&nbsp; " + varsta[2] + "</font> &nbsp;&nbsp;" + nastere[2] + "  &nbsp;<font color=#ebebe0>" + Query1.tel1[2] +
                " <br>3.  &nbsp; " + Query1.firstName[3] + "  &nbsp;" + Query1.lastName[3]
                + "<font color=#005580> &nbsp;&nbsp; " + varsta[3] + "</font> &nbsp;&nbsp;" + nastere[3] + "  &nbsp;<font color=#ebebe0>" + Query1.tel1[3] +
                " <br>4.  &nbsp; " + Query1.firstName[4] + "  &nbsp;" + Query1.lastName[4]
                + "<font color=#005580> &nbsp;&nbsp; " + varsta[4] + "</font> &nbsp;&nbsp;" + nastere[4] + "  &nbsp;<font color=#ebebe0>" + Query1.tel1[4] +"</font></html>");

    }


}



        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel1))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                       ))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                ))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.getAccessibleContext().setAccessibleName("jLabel3");
        jLabel8.getAccessibleContext().setAccessibleName("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Data_Nastere_Dreapta_Jos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Nastere_Dreapta_Jos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Nastere_Dreapta_Jos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Nastere_Dreapta_Jos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Nastere_Dreapta_Jos().setVisible(true);
            }
        });
    }


    public static void exitt(){
       System.exit(1);




    }
    // Variables declaration - do not modify
   public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JPanel jPanel1;

    public static void exit(int i) {
        System.exit(0);
    }
    // End of variables declaration
}