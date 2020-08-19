package despre;

import java.awt.*;
import java.io.*;

/**
 * Created by Daniel on 2/8/2018.
 */
public class read_help_file {

public static void rea_file() throws FileNotFoundException {
    try  {

        String charset = "ISO-8859-1"; // or what corresponds
        BufferedReader in = new BufferedReader(
                new InputStreamReader (new FileInputStream("d:\\manager\\data\\manual.txt"), charset));
        String line;
        while( (line = in.readLine()) != null) {



            System.out.println(line);
          // help.jTextArea1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
          //  help.jTextArea1.setText(str);
        }
        in.close();
        // line is not visible here.
    } catch (IOException e) {
        e.printStackTrace();
    }





}}
