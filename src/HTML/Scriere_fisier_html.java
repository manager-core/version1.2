package HTML;

import manager.swing.MainFrame;

import java.io.*;

public class Scriere_fisier_html {
    public static String nume_fisier="";
    public static void main(String[] args) throws IOException {
        createFileUsingFileClass();

    }

    public static void createFileUsingFileClass() throws IOException {
        nume_fisier="Index.html";

        if (MainFrame.tabel=="Persons"){nume_fisier="mb.html";}
        if (MainFrame.tabel=="Decedati"){nume_fisier="dc.html";}
        if (MainFrame.tabel=="Apartinatori"){nume_fisier="ap.html";}


        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(nume_fisier), "UTF-8"));




        try {
            out.write("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "<style>\n img {   border-radius: 50%;            }"+
                    "* {\n" +
                    "  box-sizing: border-box;\n" +
                    "}\n" +
                    "\n" +
                    "#myInput {\n" +
                 //   "  background-image: url('/css/searchicon.png');\n" +
                    "  background-position: 10px 12px;\n" +
                    "  background-repeat: no-repeat;\n" +
                    "  width: 100%;\n" +
                    "  font-size: 17px;\n" +
                    "  padding: 13px 21px 13px 41px;\n" +
                    "  border: 1px solid #ddd;\n" +
                    "  margin-bottom: 13px;\n" +
                    "}\n" +
                    "\n" +
                    "#myUL {\n" +
                    "  list-style-type: none;\n" +
                    "  padding: 0;\n" +
                    "  margin: 0;\n" +
                    "}\n" +
                    "\n" +
                    "#myUL li a {\n" +
                 //   "  border: 1px solid #ddd;\n" +
                 //   "  margin-top: -1px; /* Prevent double borders */\n" +
                 //   " background-color:#e6f2d9;\n" +
                 //   "  padding: 12px;\n" +
                    "  text-decoration: none;\n" +
                 //   "  font-size: 18px;\n" +
                      "  color: black;\n" +
                    "  display: block\n" +
                    "}\n" +
                    "\n" +
                    "body {\n" +
                    "color : #32435e;"+
                //    "    background-color: lightblue;\n" +
                 //   "background-color: '/html/i1.png"+
                    "}"+
                    "#myUL li a:hover:not(.header) {\n" +
               //     "  background-color: #e6f2d9;\n" +
                    "}\n" +
                    "</style>\n" +
                    "</head>\n" +
                    "<body>" +
                  // "<body background='/html/i1.jpg'>"+
                    "<h2> Agendă Bisericească:</h2>" +
                    "&ensp;&ensp;<a href='mb.html'> <b> MEMBRI </a>&ensp;&ensp; <a href='ap.html'>APARTINATORI </a>&ensp;&ensp;<a href='dc.html'> ACASĂ </a> \n" +
                    "<input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Cauta dupa nume..\" title=\"Type in a name\">\n" +
                    "\n" +
                    "<ul id=\"myUL\">" );
        } finally {
            out.close();
        }

        }
    }
