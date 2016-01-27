import org.omg.CORBA.INTERNAL;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Searis on 2015/12/28.
 * 这个程序没有输出结果，理解力去处理，等下次有能力在说
 */
public class CalenderTest {
    public static void main(String[] args) {
        //construct d as current date
        GregorianCalendar d = new GregorianCalendar();

        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);

        //set d to start date of the month
        d.set(Calendar.DAY_OF_MONTH, 1);

        int weekday = d.get(Calendar.DAY_OF_WEEK);

        //get first day of week (Sunday  in the U.S.)
        int firstDayOfWeek = d.getFirstDayOfWeek();

        //determin the required indentation for the first lind
        int indent = 0;
        while (weekday != firstDayOfWeek) ;
        {
            indent++;
            d.add(Calendar.DAY_OF_MONTH, -1);
            weekday = d.get(Calendar.DAY_OF_WEEK);

        }

        //print weekday names
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s", weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);

        }
        while (weekday != firstDayOfWeek);
        System.out.println();
        for (int i = 1; i <= indent; i++)
            System.out.println("    ");
        d.set(Calendar.DAY_OF_MONTH, 1);
        do {
            //print day
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);

            //mark current day with
            if (day == today) System.out.println("*");
            else System.out.println(" ");

            //advance d to the next
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);

            //start a new line at the start of the week
            if (weekday == firstDayOfWeek) System.out.println();
        }
        while (d.get(Calendar.DAY_OF_MONTH) == month);
        //the loop exits when d is day 1 of the next month

        //print final end of line if necessary
        if (weekday != firstDayOfWeek) System.out.println();


    }

}
