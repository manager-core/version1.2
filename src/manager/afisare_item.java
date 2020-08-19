package manager;

import manager.swing.PersonalFile;
import manager.swing.MainFrame;
import sql_data.Query1;
import sql_data.Query_Poza_plus_Inf;

import javax.swing.text.*;
import java.awt.*;
import java.io.IOException;

import static manager.NewJFrame.*;

public class afisare_item {



	public static void afisare() {
    Query1.cauta(MainFrame.tabel);
    
	String [] id1 = new String[3000];
    String[] name1 = new String[3000];
    String[] last_name1 = new String[3000];
 //   id1=null;
 //   name1=null;
 //   last_name1=null;
    for (int iy=1; iy<Query1.i+1; iy++){
    
    	id1[iy]= Query1.id[iy];
        name1[iy]= Query1.firstName[iy];
        last_name1[iy]= Query1.lastName[iy];
       

          }
    
	}

    public static class Initiere_din_Tabel {



        public Initiere_din_Tabel(){


        }


        public static void initiere1(){


            Query1.cauta_dupa_ip_tabel(MainFrame.tabel);
            Query1.cauta_dupa_ip_secound(MainFrame.tabel);
            Query1.cauta_dupa_ip_third(MainFrame.tabel);


            PersonalFile.jTextField1.setText(Query1.id[1]);
            PersonalFile.jTextFieldName.setText(Query1.firstName[1]);
            PersonalFile.jTextFieldLastName.setText(Query1.lastName[1]);
            PersonalFile.jTextFieldEmail.setText(Query1.email[1]);
            PersonalFile.jTextFieldBirthDate.setText(Query1.birthDate[1]);
            PersonalFile.jTextAreaAdress.setText(Query1.adress[1]);
            PersonalFile.jTextAreaOthers.setText(Query1.others[1]);
            PersonalFile.jTextFieldPhone1.setText(Query1.tel1[1]);
            PersonalFile.jTextFieldPhone2.setText(Query1.tel2[1]);
            PersonalFile.jTextFieldBaptizeDate.setText(Query1.baptizeDate[1]);
            PersonalFile.jTextFieldMarriageDate.setText(Query1.marryageDate[1]);
            PersonalFile.jTextFieldChildren.setText(Query1.children[1]);
            PersonalFile.jTextFieldSchool.setText(Query1.school[1]);
            PersonalFile.jTextFieldWife.setText(Query1.wife[1]);
            PersonalFile.jTextFieldWork.setText(Query1.work[1]);
            FileChooser1.nfile=Query1.pi[Query1.i];

            PersonalFile.jTextField15.setText(Query1.d15[1]);

        }
    }



    public static void initiere1_jnewframe() throws BadLocationException {


      Query_Poza_plus_Inf.cauta_dupa_ip_tabel(MainFrame.tabel);
        Query_Poza_plus_Inf.cauta_dupa_ip_secound(MainFrame.tabel);
        Query_Poza_plus_Inf.cauta_dupa_ip_third(MainFrame.tabel);

         nume = Query_Poza_plus_Inf.firstName[1]+" "+ Query_Poza_plus_Inf.lastName[1];




         NewJFrame.img = Query_Poza_plus_Inf.pi[Query_Poza_plus_Inf.i];

         System.out.println("Wuery.pi = " +NewJFrame.img);
        try {
            MainFrame.scurtatura_imagine(NewJFrame.img);
        } catch (IOException e1) {
            e1.printStackTrace();
        }


        StyleContext context = new StyleContext();

        String data_pt_varsta = Query_Poza_plus_Inf.birthDate[1];
        Style styleTitlu = context.getStyle(StyleContext.DEFAULT_STYLE);

        //  StyledDocument doc = new DefaultStyledDocument(context);
        Document doc = NewJFrame.jTextPane1.getStyledDocument();
        StyleConstants.setAlignment(styleTitlu, StyleConstants.ALIGN_CENTER);

        Style style = jTextPane1.getStyle(StyleContext.DEFAULT_STYLE);

      //  StyleConstants.setFontSize(style, 18);StyleConstants.setAlignment(style, StyleConstants.ALIGN_LEFT);


        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet, true);

        // Set the attributes before adding text

        NewJFrame.jTextPane1.setCharacterAttributes(attributeSet, true);
     //   NewJFrame.jPanel1.setFont(new Font("Helvetica", Font.PLAIN, 18));

    //    NewJFrame.jTextPane1.setText("\n                                             "+nume+"               \n\n");

        attributeSet = new SimpleAttributeSet();







        String nastere = ConversUserData.con_home_search1(Query_Poza_plus_Inf.birthDate[1]);
        if ( Query_Poza_plus_Inf.gender[1]==1) {

            NewJFrame.data_nastere = "Născută la data de: " ;
        }
        if ( Query_Poza_plus_Inf.gender[1]==0) {
            NewJFrame.data_nastere = "Născut(ă) la data de: " ;
        }
        if ( Query_Poza_plus_Inf.gender[1]==2) {
            NewJFrame.data_nastere = "Născut la data de: " ;
        }
String copii = Query_Poza_plus_Inf.children[Query_Poza_plus_Inf.i];
        if (copii.length() <=1){copii="--";}

        data_calendaristica.initiere_data(data_pt_varsta);


        NewJFrame.jLabel2.setText("<html><font color='black'><font size=3 color='black'> Nume: </font><font size=4 color='black'> "+nume+"</b></font><br>"+
                "<font size=3 color='black'> Data Nașterii: </font><font size=4 color='black'> "+nastere+": <font color='black'>" +data_calendaristica.an_final+"</font><br>"+
                "<font size=3 color='black'> Tel.: </font><font size=4 color='black'> "+Query_Poza_plus_Inf.tel1[Query_Poza_plus_Inf.i]+"</font><br>"+
                "<font size=3 color='black'> Loc de Muncă: </font><font size=4 color='black'> "+Query_Poza_plus_Inf.work[Query_Poza_plus_Inf.i]+"</font><br>"+
                "<font size=3 color='black'> Slujire în Biserica: </font><font size=4 color='black'> "+Query_Poza_plus_Inf.slujire[Query_Poza_plus_Inf.i]+"</font><br>"+
                "<font size=3 color='black'> Studii: </font><font size=4 color='black'> "+Query_Poza_plus_Inf.school[Query_Poza_plus_Inf.i]+"</font><br>"+
                "<font size=3 color='black'> Căsătorit(ă) cu: </font><font size=4 color='black'> "+Query_Poza_plus_Inf.wife[Query_Poza_plus_Inf.i]+"</font><br>"+
                "<font size=3 color='black'> Copii: </font><font size=4 color='black'> "+copii+"</font><br>"+
                "<font size=3 color='black'> Alte informații: </font><font size=4 color='black'> "+"</font>"+
                "</font></html><br>");
      //  NewJFrame.jLabel4.setText("<html><font color='black'><b><CENTER><font face=Time New Roman size=2 color='black'> Ocupație: </font><font size=4 color='#726E6D'> "+Query_Poza_plus_Inf.work[Query_Poza_plus_Inf.i]+"</font></CENTER></b></font></html>");

         NewJFrame.jLabel11.setText("<html><font color='black'></b><font size=2 color='black'> </font><font size=4 color='black'> "+" "+Query_Poza_plus_Inf.adress[Query_Poza_plus_Inf.i]+"</CENTER></b></font></html>");

if (MainFrame.fisa=="printare") {
    jLabel2.setPreferredSize(new Dimension(100, 25));


    StyleConstants.setForeground(style, new Color(0, 0, 0));
    StyleConstants.setFontSize(attributeSet, 12);
//        StyleConstants.setBold(attributeSet, true);
    //  StyleConstants.setAlignment(style, StyleConstants.ALIGN_CENTER);

       /* StyleConstants.setBold(attributeSet, true);
        doc.insertString(doc.getLength(),"\n", attributeSet);
        doc.insertString(doc.getLength(),"\n", attributeSet);
       // doc.insertString(doc.getLength(), "                                                "+nume+"\n\n", attributeSet );
        StyleConstants.setAlignment(style, StyleConstants.ALIGN_LEFT);
        StyleConstants.setFontSize(attributeSet, 12);
        StyleConstants.setBold(attributeSet, false);
        doc.insertString(doc.getLength(), ""+data_nastere, attributeSet);
        StyleConstants.setBold(attributeSet, true);
        doc.insertString(doc.getLength(),"\n ", attributeSet);
        doc.insertString(doc.getLength(), "         "+ nastere, attributeSet);

        StyleConstants.setFontSize(attributeSet, 7);
        doc.insertString(doc.getLength(),"\n ", attributeSet);
        StyleConstants.setFontSize(attributeSet, 12);
        StyleConstants.setBold(attributeSet, false);
        doc.insertString(doc.getLength(),"Adresa: " , attributeSet);
        StyleConstants.setBold(attributeSet, true);
        StyleConstants.setFontSize(attributeSet, 7);
        doc.insertString(doc.getLength(),"\n ", attributeSet);
        StyleConstants.setFontSize(attributeSet, 12);
        doc.insertString(doc.getLength(),"          " +Query_Poza_plus_Inf.adress[Query_Poza_plus_Inf.i], attributeSet);
        StyleConstants.setFontSize(attributeSet, 7);
        doc.insertString(doc.getLength(),"\n ", attributeSet);
        StyleConstants.setFontSize(attributeSet, 12);
        StyleConstants.setBold(attributeSet, false);
        doc.insertString(doc.getLength(),"Telefon: " , attributeSet);
        StyleConstants.setBold(attributeSet, true);
        doc.insertString(doc.getLength(),"\n            " +Query_Poza_plus_Inf.tel1[Query_Poza_plus_Inf.i], attributeSet);
        StyleConstants.setFontSize(attributeSet, 7);
        doc.insertString(doc.getLength(),"\n " , attributeSet);
        StyleConstants.setFontSize(attributeSet, 12);
        if (Query_Poza_plus_Inf.wife[Query_Poza_plus_Inf.i].length()>2 || Query_Poza_plus_Inf.wife[Query_Poza_plus_Inf.i].length()>2 ){
            StyleConstants.setBold(attributeSet, false);
            doc.insertString(doc.getLength(),"Căsătorit(ă) cu:  \n" , attributeSet);
            StyleConstants.setBold(attributeSet, true);
            doc.insertString(doc.getLength(),"          " +Query_Poza_plus_Inf.wife[Query_Poza_plus_Inf.i], attributeSet);
            String casatorie = ConversUserData.con_home_search1(Query_Poza_plus_Inf.marryageDate[Query_Poza_plus_Inf.i]);

            doc.insertString(doc.getLength()," la data de: " +casatorie, attributeSet);
        }else
        {    StyleConstants.setBold(attributeSet, false);
             doc.insertString(doc.getLength(),"Căsătorit(ă) cu: " , attributeSet);
             StyleConstants.setBold(attributeSet, true);
             doc.insertString(doc.getLength(),"         " +Query_Poza_plus_Inf.wife[Query_Poza_plus_Inf.i], attributeSet);}

        StyleConstants.setFontSize(attributeSet, 7);
        doc.insertString(doc.getLength(),"\n " , attributeSet);
        StyleConstants.setFontSize(attributeSet, 12);
        StyleConstants.setBold(attributeSet, false);
        doc.insertString(doc.getLength(),"Loc de muncă: \n", attributeSet);
        StyleConstants.setBold(attributeSet, true);
        doc.insertString(doc.getLength(),"          " +Query_Poza_plus_Inf.work[Query_Poza_plus_Inf.i], attributeSet);
        StyleConstants.setFontSize(attributeSet, 7);
        doc.insertString(doc.getLength(),"\n " , attributeSet);
        StyleConstants.setFontSize(attributeSet, 7);
        StyleConstants.setFontSize(attributeSet, 12);
        StyleConstants.setBold(attributeSet, false);
        doc.insertString(doc.getLength(),"Alte Informații: \n" , attributeSet);
        StyleConstants.setBold(attributeSet, true);
*/
    doc.insertString(doc.getLength(), "" + Query_Poza_plus_Inf.others[Query_Poza_plus_Inf.i], attributeSet);
    StyleConstants.setFontSize(attributeSet, 7);
    doc.insertString(doc.getLength(), "\n ", attributeSet);

    StyleConstants.setFontSize(attributeSet, 12);


    //attributeSet = new SimpleAttributeSet();
    // doc.insertString(doc.getLength(), "\n World", attributeSet);


    NewJFrame.tel = Query_Poza_plus_Inf.tel1[1];


} else if (MainFrame.fisa=="editare"){

    jLabel2.setPreferredSize(new Dimension(100, 25));


    StyleConstants.setForeground(style, new Color(52, 52, 52));
    StyleConstants.setFontSize(attributeSet, 12);
        StyleConstants.setBold(attributeSet, true);
      StyleConstants.setAlignment(style, StyleConstants.ALIGN_CENTER);

        StyleConstants.setBold(attributeSet, true);
        doc.insertString(doc.getLength(),"\n", attributeSet);
        doc.insertString(doc.getLength(),"\n", attributeSet);
       // doc.insertString(doc.getLength(), "                                                "+nume+"\n\n", attributeSet );
        StyleConstants.setAlignment(style, StyleConstants.ALIGN_LEFT);
        StyleConstants.setFontSize(attributeSet, 12);
        StyleConstants.setBold(attributeSet, false);
        doc.insertString(doc.getLength(), ""+data_nastere, attributeSet);
        StyleConstants.setBold(attributeSet, true);
        doc.insertString(doc.getLength(),"\n ", attributeSet);
        doc.insertString(doc.getLength(), "         "+ nastere, attributeSet);

        StyleConstants.setFontSize(attributeSet, 7);
        doc.insertString(doc.getLength(),"\n ", attributeSet);
        StyleConstants.setFontSize(attributeSet, 12);
        StyleConstants.setBold(attributeSet, false);
        doc.insertString(doc.getLength(),"Adresa: " , attributeSet);
        StyleConstants.setBold(attributeSet, true);
        StyleConstants.setFontSize(attributeSet, 7);
        doc.insertString(doc.getLength(),"\n ", attributeSet);
        StyleConstants.setFontSize(attributeSet, 12);
        doc.insertString(doc.getLength(),"          " +Query_Poza_plus_Inf.adress[Query_Poza_plus_Inf.i], attributeSet);
        StyleConstants.setFontSize(attributeSet, 7);
        doc.insertString(doc.getLength(),"\n ", attributeSet);
        StyleConstants.setFontSize(attributeSet, 12);
        StyleConstants.setBold(attributeSet, false);
        doc.insertString(doc.getLength(),"Telefon: " , attributeSet);
        StyleConstants.setBold(attributeSet, true);
        doc.insertString(doc.getLength(),"\n            " +Query_Poza_plus_Inf.tel1[Query_Poza_plus_Inf.i], attributeSet);
        StyleConstants.setFontSize(attributeSet, 7);
        doc.insertString(doc.getLength(),"\n " , attributeSet);
        StyleConstants.setFontSize(attributeSet, 12);
        if (Query_Poza_plus_Inf.wife[Query_Poza_plus_Inf.i].length()>2 || Query_Poza_plus_Inf.wife[Query_Poza_plus_Inf.i].length()>2 ){
            StyleConstants.setBold(attributeSet, false);
            doc.insertString(doc.getLength(),"Căsătorit(ă) cu:  \n" , attributeSet);
            StyleConstants.setBold(attributeSet, true);
            doc.insertString(doc.getLength(),"          " +Query_Poza_plus_Inf.wife[Query_Poza_plus_Inf.i], attributeSet);
            String casatorie = ConversUserData.con_home_search1(Query_Poza_plus_Inf.marryageDate[Query_Poza_plus_Inf.i]);

            doc.insertString(doc.getLength()," la data de: " +casatorie, attributeSet);
        }else
        {    StyleConstants.setBold(attributeSet, false);
             doc.insertString(doc.getLength(),"Căsătorit(ă) cu: " , attributeSet);
             StyleConstants.setBold(attributeSet, true);
             doc.insertString(doc.getLength(),"         " +Query_Poza_plus_Inf.wife[Query_Poza_plus_Inf.i], attributeSet);}

        StyleConstants.setFontSize(attributeSet, 7);
        doc.insertString(doc.getLength(),"\n " , attributeSet);
        StyleConstants.setFontSize(attributeSet, 12);
        StyleConstants.setBold(attributeSet, false);
        doc.insertString(doc.getLength(),"Loc de muncă: \n", attributeSet);
        StyleConstants.setBold(attributeSet, true);
        doc.insertString(doc.getLength(),"          " +Query_Poza_plus_Inf.work[Query_Poza_plus_Inf.i], attributeSet);
        StyleConstants.setFontSize(attributeSet, 7);
        doc.insertString(doc.getLength(),"\n " , attributeSet);
        StyleConstants.setFontSize(attributeSet, 7);
        StyleConstants.setFontSize(attributeSet, 12);
        StyleConstants.setBold(attributeSet, false);
        doc.insertString(doc.getLength(),"Alte Informații: \n" , attributeSet);
        StyleConstants.setBold(attributeSet, true);

    doc.insertString(doc.getLength(), "" + Query_Poza_plus_Inf.others[Query_Poza_plus_Inf.i], attributeSet);
    StyleConstants.setFontSize(attributeSet, 7);
    doc.insertString(doc.getLength(), "\n ", attributeSet);

    StyleConstants.setFontSize(attributeSet, 12);


    //attributeSet = new SimpleAttributeSet();
    // doc.insertString(doc.getLength(), "\n World", attributeSet);


    NewJFrame.tel = Query_Poza_plus_Inf.tel1[1];



}


       /* Edito_Manager.jTextFieldName.setText(Query1.firstName[1]);
        Edito_Manager.jTextFieldLastName.setText(Query1.lastName[1]);
        Edito_Manager.jTextFieldEmail.setText(Query1.email[1]);
        Edito_Manager.jTextFieldBirthDate.setText(Query1.birthDate[1]);
        Edito_Manager.jTextAreaAdress.setText(Query1.adress[1]);
        Edito_Manager.jTextAreaOthers.setText(Query1.others[1]);
        Edito_Manager.jTextFieldPhone1.setText(Query1.tel1[1]);
        Edito_Manager.jTextFieldPhone2.setText(Query1.tel2[1]);
        Edito_Manager.jTextFieldBaptizeDate.setText(Query1.baptizeDate[1]);
        Edito_Manager.jTextFieldMarriageDate.setText(Query1.marryageDate[1]);
        Edito_Manager.jTextFieldChildren.setText(Query1.children[1]);
        Edito_Manager.jTextFieldSchool.setText(Query1.school[1]);
        Edito_Manager.jTextFieldWife.setText(Query1.wife[1]);
        Edito_Manager.jTextFieldWork.setText(Query1.work[1]);
        FileChooser1.nfile=Query1.pi[1];

        Edito_Manager.jTextField15.setText(Query1.d15[1]);*/

    }

}
