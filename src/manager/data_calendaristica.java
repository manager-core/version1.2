package manager;

import sql_data.Query1;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Created by Daniel on 1/21/2018.
 */
public class data_calendaristica {
  public static   String   an1, luna1, zi1, an_final;
  public static   int   an, luna, zi;
public static void main (String[] args){
an_final="";
   String s = "1992.12.12";

   initiere_data(s);
   // System.out.print("Datele gata sunt"+ an+ luna+ zi);
}











public static String data_sistem(int an , int luna, int zi){

    LocalDate today = LocalDate.now();
    System.out.println(today);
    int p1=0;


    try {
//System.out.print("Zi ="+zi);
    LocalDate birthday = LocalDate.of(an,luna,zi);



    Period p = Period.between(birthday, today);
    long p2 = ChronoUnit.DAYS.between(birthday, today);
    p1= p.getYears();
 //   System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
     //       " months, and " + p.getDays() +
      //      " days old. (" + p2 + " days total)");
 if(p.getYears()>1){  an_final= "   "+p.getYears()+" ani";}else{an_final=" ";}

} catch ( Exception e2){an_final="";}
   // return an;
if (p1<1){an_final="";}else{}


return an_final;
}

















public static void initiere_data(String data){
//System.out.print("GGGGGGG"+data);
//System.out.println("Data este preluata: "+ Query1.birthDate[Query1.i]);

             an1="";
            luna1="";
            zi1="";

                try {
              //      System.out.println(data);

                    char[] c_arr = data.toCharArray();
                //    System.out.println("char e:"+c_arr[0]+c_arr[1]);

                luna1 = "" + c_arr[5] + c_arr[6];
                an1 =  "" + c_arr[0] + c_arr[1]+ c_arr[2] + c_arr[3];
                    zi1 = ""+c_arr[8] + c_arr[9];


                } catch (Exception e) {        // System.out.print("Eroare impartire char");   an_final=" ";
                      }

try {
    an = Integer.valueOf(an1);
    luna = Integer.valueOf(luna1);
    zi = Integer.valueOf(zi1);

} catch (Exception e){System.out.print("Eroare Integer.value.Of"); an_final=" ";}

//System.out.println("Datele sunt:" +zi);

        data_sistem(an, luna,zi);
}





    public static void reamintire(String data){
       // System.out.print("GGGGGGG"+data);
      //  System.out.println("Data este preluata: "+ Query1.birthDate[Query1.i]);

        an1="";
        luna1="";
        zi1="";

        try {
        //    System.out.println(data);

            char[] c_arr = data.toCharArray();
            //    System.out.println("char e:"+c_arr[0]+c_arr[1]);

            luna1 = "" + c_arr[5] + c_arr[6];
            an1 =  "" + c_arr[0] + c_arr[1]+ c_arr[2] + c_arr[3];
            zi1 = ""+c_arr[8] + c_arr[9];


        } catch (Exception e) {      //   System.out.print("Eroare impartire char");   an_final=" ";
             }

        try {
            an = Integer.valueOf(an1);
            luna = Integer.valueOf(luna1);
            zi = Integer.valueOf(zi1);

        } catch (Exception e){
        //    System.out.print("Eroare Integer.value.Of"); an_final=" ";
        }

  //      System.out.println("Datele sunt:" +zi);




    }



}
