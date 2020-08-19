package manager;

import javax.swing.*;

public class ConversUserData {
    public static String noua_data="";
    private static String luna="";
    public static int verificare;


    static {
        verificare = 0;
    }

    public static String identificare_data;

    public static String con(String data, String d) {


        if (data.length()<1){noua_data="";}else {


            if (data.length()>1 || data.length()<9 ){


                JInternalFrame frame = new JInternalFrame();
                JOptionPane.showMessageDialog(frame,"Ati introdus gresit data "+d+" !");


            }else{

                try {


                    char[] c_arr = data.toCharArray();
                    noua_data = "" + c_arr[6] + c_arr[7] + c_arr[8] + c_arr[9] + "-" + c_arr[3] + c_arr[4] + "-" + c_arr[0] + c_arr[1];
                    System.out.println("noua dATA               ESTE" + noua_data);

                } catch (Exception e)
                {
                    noua_data = "0001-01-01";

                }



            }}





        return noua_data;

    }



    public static String con_home_search1(String data) {

        String aux_test="";

        try {     char[] c_arr = data.toCharArray();
            aux_test = ""+c_arr[5]+c_arr[6];
            int foo = Integer.parseInt(aux_test);
            if (foo == 1){ luna = "ianuarie" ;}
            if (foo == 2){ luna = "februarie" ;}
            if (foo == 3){ luna = "martie" ;}
            if (foo == 4){ luna = "aprilie" ;}
            if (foo == 5){ luna = "mai" ;}
            if (foo == 6){ luna = "iunie" ;}
            if (foo == 7){ luna = "iulie" ;}
            if (foo == 8){ luna = "august" ;}
            if (foo == 9){ luna = "septembrie" ;}
            if (foo == 10){ luna = "octombrie" ;}
            if (foo == 11){ luna = "noiembrie" ;}
            if (foo == 12){ luna = "decembrie" ;}

            noua_data = "" + c_arr[8] + c_arr[9] + " "+luna+" " + c_arr[0] + c_arr[1] + c_arr[2] + c_arr[3];







        } catch (Exception e){noua_data="";}

      //  System.out.print("CARARRRRRRRRRR 5+6 ete"+ aux_test);

      //

        //System.out.print("SE POTRIVESC!!!!!!!!!!!!!!!!!!!11");
      //  }




        return noua_data;

    }



    public static String con_home_search(String data) {


        try {     char[] c_arr = data.toCharArray();


            noua_data = "" + c_arr[8] + c_arr[9] +"."+ c_arr[5] + c_arr[6] +"."+ c_arr[0] + c_arr[1] + c_arr[2] + c_arr[3];







        } catch (Exception e){noua_data="";}



        //

        System.out.print("SE POTRIVESC!!!!!!!!!!!!!!!!!!!11");
        //  }




        return noua_data;

    }






    public static String modific_1(String data) {

        if (data.length()<1){ verificare=1;}else{verificare=0;}

        try {
            char[] c_arr = data.toCharArray();
            noua_data = "" + c_arr[6] + c_arr[7] + c_arr[8] + c_arr[9] + "-" + c_arr[3] + c_arr[4] + "-" + c_arr[0] + c_arr[1];
            System.out.println("noua dATA               ESTE" + noua_data);


        }catch (Exception e) { noua_data="nu"; System.out.print("data este incorecta");

        }

        return noua_data;
    }

    public static String modific_transfer(String data) {

        System.out.print("^^^^^^^^^^^^^^^^^^^^^^+data este"+data);

        if (data.length()<1){ verificare=1;}else{verificare=0;}

        try {
            char[] c_arr = data.toCharArray();
            noua_data = "" + c_arr[6] + c_arr[7] + c_arr[8] + c_arr[9] + "-" + c_arr[3] + c_arr[4] + "-" + c_arr[0] + c_arr[1];



        }catch (Exception e) { noua_data="nu"; System.out.print("Data introdusă pentru transfer este incorectă, membrul a fost transferat insă nu are o data a transferului");

        }

        return noua_data;
    }



}
