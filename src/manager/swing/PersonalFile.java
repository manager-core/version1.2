/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager.swing;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.*;

import manager.*;
import sql_data.*;

/**
 *
 * @author daniel
 */
public class PersonalFile extends JFrame {



    private static PersonalFile single_instance = null;

    //private constructor to avoid client applications to use constructor
    private PersonalFile(String categorie) {
        super("Fișă Personală [Manager 1.0]");
        check_begin = 1;
        ImageIcon img = new ImageIcon("D:\\Manager\\Icons\\icon.png");
        setIconImage(img.getImage());

        if (categorie == "Copii") {
            culoare = "0, 102, 122";
        }

        initComponents();
        jTextField1.setEditable(false);
        jTextFieldName.requestFocus();
    }
    public static PersonalFile getInstance(String categorie){
      //  if (single_instance == null)
            single_instance = new PersonalFile(categorie);
        return single_instance;
    }


    public static int check_begin, check, gen_selectat, not_there=0;

    public String t;
    private int age;
    public static String data;
    public static int confirmare_stergere=0;
    String nume_biserica;
    public String culoare = new String();



    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonalFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalFile("Persons").setVisible(true);
            }
        });
    }


    public void windowClosing(WindowEvent e3){check=0;}

    private void initComponents() {


        //setUndecorated(true);
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();


        jPanel3 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jTextField1 = new JTextField();
        int initiere_ok = 0;
        jTextFieldName = new JTextField();
        jTextFieldLastName = new JTextField();
        jTextFieldPhone1 = new JTextField();
        jLabel5 = new JLabel();
        jComboBox2 = new JComboBox<>();
        jLabel17 = new JLabel();
        jTextFieldPhone2 = new JTextField();
        jTextFieldEmail = new JTextField();
        jLabel9 = new JLabel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jTextFieldBaptizeDate = new JTextField();
        jTextFieldBirthDate = new JTextField();
        jLabel29 = new JLabel();
        jTextFieldMarriageDate = new JTextField();
        jButtonimag = new JButton();
        jToggleButton2 = new JButton();
        jToggleButton3 = new JButton();
        jLabel7 = new JLabel("");

        jButton2 = new JButton();
        jPanel5 = new JPanel();
        jLabel13 = new JLabel();
        jTextFieldSchool = new JTextField();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jTextFieldWife = new JTextField();
        jTextField15 = new JTextField("Asdasdasd");
        jLabel16 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextAreaOthers = new JTextArea();
        jScrollPane2 = new JScrollPane();
        jTextAreaAdress = new JTextArea();
        jLabel18 = new JLabel("", JLabel.CENTER);
        jLabel26 = new JLabel();
        jTextFieldWork = new JTextField();
        jTextFieldChildren = new JTextField("asdadsasdads");
        jLabel8 = new JLabel();
        jLabel10 = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jPanel1.setBackground(new Color(0, 153, 153));
        jPanel2.setBackground(new Color(0, 153, 153));
        jPanel2.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jLabel1.setForeground(new Color(255, 255, 255));

        afisare_item.Initiere_din_Tabel.initiere1();
        jButtonimag.setText("+imagine");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//application will be closed when you close frame
        frame.setSize(800, 600);
        frame.setLocation(100, 200);


        if (MainFrame.but_adaug != true) {
//            jLabel8.setFont(new Font("Tahoma", 1, 18)); // NOI18N
            jLabel8.setForeground(new Color(255, 255, 255));
            jLabel7.setBackground(new Color(196, 122, 134));

            check_begin = 0;
            System.out.println("CHECK Edito_Manager." + check_begin);
            initiere_editor.afisare_choice(MainFrame.tabel);
            initiere_editor.afisare_campuri(MainFrame.tabel);
            check_begin = 1;
            if (initiere_ok == 0) {
            } else {
            }
            initiere_ok++;


        } else {
            jLabel7.setForeground(new Color(125, 36, 71));
            jLabel7.setText("  Filadelfia  - Călan");

            jLabel8.setBackground(new Color(51, 0, 102));

            jLabel8.setFont(new Font("Tahoma", 2, 18)); // NOI18N
            jLabel8.setForeground(new Color(125, 36, 71));
            jLabel8.setText(nume_biserica);


            PersonalFile.jTextField1.setText("");
            PersonalFile.jTextFieldName.setText("");
            PersonalFile.jTextFieldLastName.setText("");

            PersonalFile.jTextFieldBirthDate.setText("");


            PersonalFile.jTextFieldMarriageDate.setText("");
            PersonalFile.jTextFieldBaptizeDate.setText("");
            PersonalFile.jTextFieldPhone1.setText("");
            PersonalFile.jTextFieldPhone2.setText("");
            PersonalFile.jTextFieldEmail.setText("");


            PersonalFile.jTextFieldWife.setText("");
            PersonalFile.jTextFieldChildren.setText("");
            PersonalFile.jTextFieldSchool.setText("");
            PersonalFile.jTextField15.setText("");
            PersonalFile.jTextFieldWork.setText("");
            PersonalFile.jTextAreaAdress.setText("");
            PersonalFile.jTextAreaOthers.setText("");

            MainFrame.but_adaug = false;

        }


        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);


        jPanel3.setBackground(new Color(0, 153, 153));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new Color(255, 255, 255), 1, true));
        jPanel3.setForeground(new Color(0, 153, 153));
        jLabel2.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("ID Frate:");
        jLabel3.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Prenume");
        jLabel4.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("Nume");
        jTextField1.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextFieldName.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldLastName.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldPhone1.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setBackground(new Color(255, 255, 255));
        jLabel5.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Telefon");
        if (MainFrame.tabel=="Decedati"){jLabel5.setText("Data Deces:");}

        if (MainFrame.tabel == "Copii") {
            jLabel5.setText("Alte Inf.");
        }

        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"Gen", "Feminin", "Masculin"}));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                gen_selectat=1;
                jComboBox2ActionPerformed(evt);
            }


        });

        jLabel17.setBackground(new Color(255, 255, 255));
        jLabel17.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new Color(255, 255, 255));
        jLabel17.setText("Slujire");
        if (MainFrame.tabel == "Copii") {
            jLabel17.setText("Tată");
            jLabel17.setFont(new Font("Tahoma", 1, 12));
        } // NOI18N}


        jTextFieldPhone2.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldEmail.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText("@ email: ");

        if (MainFrame.tabel == "Copii") {
            jLabel9.setText("Mamă");
            jLabel9.setFont(new Font("Tahoma", 1, 12));
        }


        jLabel27.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setForeground(new Color(255, 255, 255));
        jLabel27.setText("Data Nașterii");
        jLabel28.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setForeground(new Color(255, 255, 255));
        jLabel28.setText("Dată Căsătoriei:");
        jLabel28.setBackground(new Color(255, 255, 255));
        if (MainFrame.tabel == "Transferati") {
            jLabel28.setText("Data casatoriei!!!");
        }
        if (MainFrame.tabel == "Copii") {
            jLabel28.setText("Alte inf.");
            jLabel28.setFont(new Font("Tahoma", 1, 12));
        }

        jTextFieldBaptizeDate.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldBirthDate.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jLabel29.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setForeground(new Color(255, 255, 255));
        jLabel29.setText("Data Botezului:");
        if (MainFrame.tabel == "Copii") {
            jLabel29.setText("Data Binecuvântare");
            jLabel9.setFont(new Font("Tahoma", 1, 12));
        }


        jTextFieldMarriageDate.setFont(new Font("Tahoma", 0, 12)); // NOI18N

        jToggleButton3.setText("vezi imagine");


        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);

                Query_imagine.cauta_dupa_ip_third(MainFrame.tabel);


                pictures.img = Query_imagine.pi[Query_imagine.i];
                try {
                    MainFrame.scurtatura_imagine(pictures.img);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }


                pictures p = new pictures();
                p.afisare();

            }
        });

        jToggleButton2.setBackground(new Color(51, 204, 0));
        jToggleButton2.setForeground(new Color(51, 153, 0));
        jToggleButton2.setText("MODIFICĂ");
        //  jToggleButton2.setActionCommand("MODIFICĂ");


        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);

                try {
                    sql_take_ip.tak_ip_modifica(MainFrame.tabel);
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Această persoană încă nu a fost înregistrată. Vă rog mai întâi adăugați, apoi modificati");
            not_there=1;
                }
            if(not_there==1){}else {
            try {

        sql_update.update_sql(MainFrame.tabel);
               } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "EROARE");
                  }
                not_there=0;
                }
    not_there=0;
                afisare_item.afisare();
                MainFrame.af_lista(MainFrame.tabel);
                FileChooser1.nfile = "";
                Query1.dupa_slujire(MainFrame.tabel);
                MainFrame.s(MainFrame.tabel);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(62, 62, 62))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jToggleButton3)
                                                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel27, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel29, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextFieldBaptizeDate, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jTextFieldMarriageDate)
                                                                .addComponent(jTextFieldBirthDate, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jTextFieldPhone2)
                                                        .addComponent(jTextFieldPhone1)
                                                        .addComponent(jTextFieldLastName)
                                                        .addComponent(jTextFieldName)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jTextFieldEmail, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButtonimag)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jToggleButton2)))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldPhone1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextFieldPhone2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(jTextFieldBirthDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldMarriageDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel28))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldBaptizeDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel29))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonimag)
                                        .addComponent(jToggleButton2)
                                        .addComponent(jToggleButton3))
                                .addContainerGap(23, Short.MAX_VALUE))
        );


        //but add imagine
        jButtonimag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooser1 fopen = new FileChooser1();
                FileChooser1.nfile="";
                fopen.arata();

            }
        });


        jButton2.setText("Adauga!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);

                if (gen_selectat==0) {
                    JOptionPane.showMessageDialog(null, "Vă rog selectati Genul!");


                } else {
                    verificare_nume.cauta(MainFrame.tabel);
                    if (verificare_nume.nn == 0) {
                        sql_take_ip.tak_ip(MainFrame.tabel);
                        sql_data_insert.executare_inserare(MainFrame.tabel);
                        jTextField1.setText(String.valueOf(sql_take_ip.id[sql_take_ip.ip]));
                        verificare_nume.nn = 0;
                    } else {
                        JOptionPane.showMessageDialog(null, "Deja există în baza de date o persoana cu acest nume");
                    }
                }
                MainFrame.af_lista(MainFrame.tabel);
              //
            }
        });

        jPanel5.setBackground(new Color(0, 153, 153));
        jPanel5.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        jPanel5.setForeground(new Color(255, 255, 255));

        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setText("Soț(ie)");
        if (MainFrame.tabel == "Copii") {
            jLabel13.setText("Orchestră:");
        }

        jLabel14.setForeground(new Color(255, 255, 255));
        jLabel14.setText("Copii:");
        if (MainFrame.tabel == "Copii") {
            jLabel14.setText("Activitati 1");
        }
        jLabel15.setForeground(new Color(255, 255, 255));
        jLabel15.setText("Studii");
        if (MainFrame.tabel == "Copii") {
            jLabel15.setText("Activități 2:");
        }

        jLabel16.setForeground(new Color(255, 255, 255));
        jLabel16.setText("Adresa:");
        if (MainFrame.tabel == "Copii") {
            jLabel16.setText("Adresă:");
        }
        jTextAreaOthers.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null); //interzice tabul
        jTextAreaOthers.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);//interzice tabul

        jTextAreaAdress.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);//interzice tabul
        jTextAreaAdress.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);//interzice tabul

        jTextAreaOthers.setColumns(20);
        jTextAreaOthers.setRows(5);
        jScrollPane1.setViewportView(jTextAreaOthers);

        jTextAreaAdress.setColumns(20);
        jTextAreaAdress.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAdress);

        //  jLabel18.setForeground(new java.awt.Color(51, 0, 102));
        jLabel18.setText("Mentiuni");

        jLabel26.setForeground(new Color(255, 255, 255));
        jLabel26.setText("Loc de muncă");
        if (MainFrame.tabel == "Copii") {
            jLabel26.setText("   Activități 3:");

            // jPanel2Layout.setBackground(new Color(153, 45, 89));
            jPanel2.setBackground(new Color(64, 31, 37));
            // jPanel3Layout.setBackground(new Color(153, 45, 89));
            jPanel3.setBackground(new Color(64, 31, 37));
            jPanel1.setBackground(new Color(64, 31, 37));
            jPanel5.setBackground(new Color(64, 31, 37));
        }


        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel15, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel16, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextFieldWife, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextFieldSchool, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(45, 45, 45)
                                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextFieldWork, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextFieldChildren, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 119, Short.MAX_VALUE))
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane2))))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1)))
                                .addGap(16, 16, 16))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jTextFieldWife, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jTextFieldSchool, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextFieldChildren, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel14))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextFieldWork, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel26))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel18)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        jLabel10.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new Color(255, 255, 255));


        jButton3.setBackground(new Color(255, 0, 51));
        jButton3.setForeground(new Color(255, 255, 255));
        jButton3.setText("FORMATEAZA!");

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);


                //     JOptionPane.showMessageDialog(null, "SUNTETI SIGUR - Daca continuati veti sterge toate datele din acest program? !!!");


                String input = JOptionPane.showInputDialog("SUNTETI SIGUR - Daca continuati veti sterge toate datele din acest program? !!!\n "
                        + " Pentru Da tastati codul 171");

                try {
                    age = Integer.parseInt(input);
                } catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                }
                if (age >= 171) {


                    try {
                        sterge_persoana_dupa_ip.delete_data(MainFrame.tabel);
                    } catch (SQLException e) {
                        //JOptionPane.showMessageDialog(null," Datele nu au fost sterse.");
                        System.out.println("Eroare" + e);
                        e.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, " Toate datele au fost sterse");
                } else {
                    JOptionPane.showMessageDialog(null, "Datele sunt INTACTE,  nu a fost ștearsă nici o înregistrare");
                }

            }


        });
        jButton3.setEnabled(false);
        jButton4.setBackground(new Color(151, 190, 255));
        jButton4.setForeground(new Color(255, 255, 255));
        jButton4.setText("TRANSFER");


        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {



                if (MainFrame.tabel =="Apartinatori"){

                    jButton4ActionPerformed(evt);

                    if (gen_selectat == 0) {
                        JOptionPane.showMessageDialog(null, "Vă rog selectati Genul!");


                    } else {
                        verificare_nume.cauta("Persons");
                        if (verificare_nume.nn == 0) {
                            sql_take_ip.tak_ip("Persons");
                            sql_data_insert.executare_inserare("Persons");
                            jTextField1.setText(String.valueOf(sql_take_ip.id[sql_take_ip.ip]));
                            verificare_nume.nn = 0;
                            try {
                                confirmare_stergere = 1;
                                sterge_persoana_dupa_ip.delete_data("Apartinatori");
                                confirmare_stergere = 0;
                            } catch (SQLException e) {
                            //    JOptionPane.showMessageDialog(null," Datele nu au fost sterse."+e);
                                e.printStackTrace();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Deja există în baza de date o persoana cu acest nume");
                        }
                  dispose();

                    }
                    MainFrame.af_lista(MainFrame.tabel);



                } else{

                    if (MainFrame.tabel =="Decedati"){
                        confirm_data_transfer.tabel="Decedati";
                        confirm_data_transfer.ocazie="decesului";
                        jButton4ActionPerformed(evt);
                        confirm_data_transfer c = new confirm_data_transfer();
                        c.show();





                    }

                if (MainFrame.tabel =="Transferati"){

                    jButton4ActionPerformed(evt);
confirm_data_transfer.tabel="Transferati";
                    confirm_data_transfer.ocazie="transferului";

                   confirm_data_transfer c = new confirm_data_transfer();
                    c.show();





                }else{
                 confirm_data_transfer.tabel="Transferati";
                    confirm_data_transfer.ocazie="transferului";
                jButton4ActionPerformed(evt);
                Confirm_Transfer c = new Confirm_Transfer();
                c.setVisible(true);


                dispose();


            }}
                check_begin = 0;
            }


        });








        jButton5.setBackground(new Color(151, 190, 255));
        jButton5.setForeground(new Color(255, 255, 255));
        jButton5.setText("DECES");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);


                if (MainFrame.tabel=="Decedati"){ confirm_data_transfer.ocazie="decesului";
confirm_data_transfer.tabel="Decedati";
                    confirm_data_transfer c = new confirm_data_transfer();
                    c.show();}else {

                    verificare_nume.cauta(MainFrame.tabel);
                    sql_take_ip.tak_ip("decedati");
                    sql_data_insert.executare_inserare("decedati");

                    int ip = Integer.parseInt(PersonalFile.jTextField1.getText());
                    try {
                        sql_data_insert.delete_data(MainFrame.tabel, ip);
                    } catch (SQLException e) {
                        System.out.println("EROAREA la stergerea persoanei din evidenta membrilor" + e);
                        e.printStackTrace();
                    }

                    JOptionPane.showMessageDialog(null, verificare_nume.firstName + " " + verificare_nume.lastName + " a fost transferat(ă) în tabelul decedați!");

                    MainFrame.af_lista(MainFrame.tabel);


                }
                check_begin=0;
         dispose();
            }
        });





       setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
check_begin=0;
                gen_selectat=0;
                  dispose();
                }

        });





        jButton6.setBackground(new Color(151, 190, 255));
        jButton6.setForeground(new Color(255, 255, 255));
        jButton6.setText("DISCIPLINA");
        jButton6.setEnabled(false);
       if (MainFrame.tabel == "Copii"){
        jButton6.setBorderPainted( false );
        jButton6.setFocusPainted( false );} else{
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });}

        jButton7.setBackground(new Color(255, 0, 51));
        jButton7.setForeground(new Color(255, 255, 255));
        jButton7.setText("STERGE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);


                // butonul_cauta.cauta1();

                String input = JOptionPane.showInputDialog("SUNTETI SIGUR? - Daca continuati veti sterge inregistrare"+jTextFieldName.getText()+" "+jTextFieldLastName.getText()+" !!!\n "
                        + " Pentru Da tastati codul 171" );

                try {
                    age = Integer.parseInt(input);
                }
                catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                }
                if (age >= 171) {

                    try {
                        sterge_persoana_dupa_ip.delete_data(MainFrame.tabel);
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null," Datele nu au fost sterse."+e);
                        e.printStackTrace();
                    }
MainFrame.af_lista(MainFrame.tabel);

                    PersonalFile.jTextField1.setText("");
                    PersonalFile.jTextFieldName.setText("");
                    PersonalFile.jTextFieldLastName.setText("");

                    PersonalFile.jTextFieldBirthDate.setText("");
                    //Edito_Manager.jComboBox2.setSelectedIndex(Query1.gender[Query1.y]);
                    Query1.cauta_dupa_ip_secound (MainFrame.tabel);

                    PersonalFile.jTextFieldMarriageDate.setText("");
                    PersonalFile.jTextFieldBaptizeDate.setText("");
                    PersonalFile.jTextFieldPhone1.setText("");
                    PersonalFile.jTextFieldPhone2.setText("");
                    PersonalFile.jTextFieldEmail.setText("");
                    Query1.cauta_dupa_ip_third (MainFrame.tabel);

                    PersonalFile.jTextFieldWife.setText("");
                    PersonalFile.jTextFieldChildren.setText("");
                    PersonalFile.jTextFieldSchool.setText("");
                    PersonalFile.jTextField15.setText("");
                    PersonalFile.jTextFieldWork.setText("");
                    PersonalFile.jTextAreaAdress.setText("");
                    PersonalFile.jTextAreaOthers.setText("");
                    jLabel7.setText("Puteti adauga alt membru ");


                } else {   JOptionPane.showMessageDialog(null,"Datele sunt INTACTE,  nu a fost ștearsă nici o înregistrare" );

                }








            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jButton2)
                                                                                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                                        .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                                        .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(291, 291, 291)
                                                                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)))))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(203, 203, 203)
                                                .addComponent(jButton3)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton6)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton7)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2)))
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/15;
        int y = (dim.height-h)/7;

        // Move the window
        this.setLocation(x, y);

        pack();

   if (MainFrame.tabel == "Decedati"){  jButton5.setEnabled(false);}
   if (MainFrame.tabel == "Apartinatori"){jButton4.setLabel("Devine membru");
       jButton5.setEnabled(false);
     //  jButton4.setEnabled(false);
       }
   //if (Home_search.tabel == "Decedati"){  jButton4.setEnabled(false);}
   if (MainFrame.tabel == "Decedati"){  jButton6.setEnabled(false);
       jButton5.setEnabled(true); jButton5.setText("Data Decesluli");}

   if (MainFrame.tabel == "Decedați"){  jButton4.setLabel("Data deces");}
   if (MainFrame.tabel == "Transferati"){  jButton4.setLabel("Data transfer");}
   if (MainFrame.tabel == "Transferati"){  jButton6.setEnabled(false);}
   if (MainFrame.tabel == "Copii"){  jButton6.setEnabled(false);}
   if (MainFrame.tabel == "Transfer"){  jButton6.setEnabled(false);}
//   if (Home_search.tabel == "Transfer"){  jButton4.setEnabled(false);}

    }// </editor-fold>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private void jButtonimagActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /* public void trimitere_din_home_click(){

         Query1.cauta_dupa_ip_tabel();

         jTextFieldName.setText(Query1.firstName[1]);
     }
 */



    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


















    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify

    public static JButton jButton2;
    public static JButton jButton3;
    public static JButton jButton4;
    public static JButton jButton5;
    public static JButton jButton6;
    public static JButton jButton7;
    public static JButton jButton8;

    public static  JComboBox<String> jComboBox2;
    public static JLabel jLabel1;
    public static JLabel jLabel10;
    public static JLabel jLabel13;
    public static JLabel jLabel14;
    public static JLabel jLabel15;
    public static JLabel jLabel16;
    public static JLabel jLabel17;
    public static JLabel jLabel18;
    public static JLabel jLabel2;
    public static JLabel jLabel26;
    public static JLabel jLabel27;
    public static JLabel jLabel28;
    public static JLabel jLabel29;
    public static JLabel jLabel3;
    public static JLabel jLabel4;
    public static JLabel jLabel5;
    public static JLabel jLabel7;
    public static JLabel jLabel8;
    public static JLabel jLabel9;
    public static JPanel jPanel1;
    public static JPanel jPanel2;
    public static JPanel jPanel3;
    public static JPanel jPanel5;
    public static JScrollPane jScrollPane1;
    public static JScrollPane jScrollPane2;
    public static JTextArea jTextAreaAdress;
    public static JTextArea jTextAreaOthers;
    public static JTextField jTextField1;
    public static JTextField jTextFieldBaptizeDate;
    public static JTextField jTextFieldBirthDate;
    public static JTextField jTextFieldEmail;
    public static JTextField jTextFieldLastName;
    public static JTextField jTextFieldMarriageDate;
    public static JTextField jTextFieldName;
    public static JTextField  jTextField15;
    public static JTextField jTextFieldPhone1;
    public static JTextField jTextFieldPhone2;
    public static JTextField jTextFieldSchool;
    public static JTextField jTextFieldWife;
    public static JTextField jTextFieldChildren;
    public static JTextField jTextFieldWork;
    public static JButton jButtonimag;
    public static JButton jToggleButton2;
    public static JButton jToggleButton3;
    // End of variables declaration
}
