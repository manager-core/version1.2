package despre;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

/**
 *
 * @author Daniel
 */
public class help extends javax.swing.JFrame {

    /**
     * Creates new form comitet_form
     */
    public help() throws FileNotFoundException {
        super("Ajutor");
        setLocation(250,80);
        setSize(300,300);
        ImageIcon img = new ImageIcon("D:\\Manager\\Icons\\help1.png");
        setIconImage(img.getImage());
        initComponents();
        read_help_file.rea_file();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        Font font = new Font("Courier", Font.PLAIN,14);

        //set font for JTextField

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextArea1.setFont(font);


        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(7);

        jTextArea1.setText("                                                            Faceți cunoștință cu MANAGER \n \n ");

     //   Font font1 = new Font("Courier", Font.PLAIN,14);

        //jTextArea1.setFont(font1);

        jTextArea1.append("\n\n Tasta ' i ' - afisază poza persoanei selectate din tabel");
        jTextArea1.append("\n\n Tasta delete sau 'del' - instantiază posibilitatea stergerii persoanei selectate");
        jTextArea1.append("\n\n Butonul \"+ membru nou\" - premite adăugarea de noi membri\n" +

                        "\n Imaginea feliei de tort (ultimul buton din partea dreaptă) - permite sortarea tabeleului după zilele de naștere.  \n" +
                        "\n Imaginea bunicuței - afișază doar văduvii și văduvele bisericii\n" +
                        "\n Mâna ce ține o cheie - sortează lista după locul de muncă \n" +
                        "\n Bătrânelul cu ochelari - afișază doar pensionarii bisericii\n" +
                        "\n Fișa de carnețel - afișază în dreapta jos o fereastră cu sarbatoriții zilei\n" +
                        "\n Căsuța - sortează persoanele din tabel după adresa \n" +
                        "\n Butonul \"refresh\" - va ordona tabelul în ordine alfabetică\n" +
                        "\n Tasta P - Afișază fișa personală doar pentru citire \n" +
                        "\n Directorul care trebuie păstrat cu sfințenie este d:/manager/data aici sunt membri dumneavoastră. \n                                                                                   Vă rog asigurați copii regulate ale directorului !!"+

                        "\n");
        jScrollPane1.add(jTextArea1);
        add(jScrollPane1);






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
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new help().setVisible(true);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
    // End of variables declaration
}