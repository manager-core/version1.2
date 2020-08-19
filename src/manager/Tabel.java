package manager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Tabel {
	

	private int id1;
	private String nume;
	private String prenume;
    private String tel;
    private String adresa;
    private String data_nasterii;
    private int realColCnt;

    public Tabel() {}

    public Tabel(String nume, String prenume, String tel, String adresa, String data_nasterii){

        this.nume = nume;
        this.prenume = prenume;
        this.tel = tel;
        this.adresa = adresa;
        this.data_nasterii = data_nasterii;
    }


	public Integer getId(){ return id1; }
    public String getNume(){ return nume; }
    public String getPrenume() { return prenume;}
    public String getTel() { return tel;}
    public String getAdresa() { return adresa;}
    public String getData_nasterii() { return data_nasterii;}


    public static void delTblCol(JTable table, int index) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        TableColumn col = table.getColumnModel().getColumn(index);
        table.removeColumn(col);
        table.revalidate();
      //  this.realColCnt--;
    };

}
