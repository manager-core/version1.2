package manager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Daniel on 2/9/2018.
 */
public class Year_Old {


    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();

        long t;
        t= timeUnit.convert(diffInMillies,TimeUnit.DAYS);
        System.out.print(t/ (1000 * 60 * 60 * 24));
        return t;

    }

    public static void main (String[] args){

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        Date date1 = new Date(2018, 02, 01);

        getDateDiff(date1, date, TimeUnit.MINUTES);

    }
}
