package programlist3;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Dix on 2015/12/28.
 */
public class GregorianCalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar now= new GregorianCalendar();
        int mounth =now.get(Calendar.MONTH);
        int weekDay = now.get(Calendar.DAY_OF_WEEK);
        int monthDay =now.get(Calendar.DAY_OF_MONTH);

        System.out.println("mounth: "+mounth);
        System.out.println("weekDay: "+weekDay);
        System.out.println("monthDay: "+monthDay);
    }
}
