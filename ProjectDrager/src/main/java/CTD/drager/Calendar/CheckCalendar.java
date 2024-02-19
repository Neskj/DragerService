package CTD.drager.Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckCalendar {
    public static String CheckDate(){
        var formatter=new SimpleDateFormat("dd.MM.yyyy");
        var objDate=new Date();
        String date=formatter.format(objDate);
        return date;
    }

}
