package CTD.drager.Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckCalendar {
    public static String checkDate() {
        var formatter = new SimpleDateFormat("dd.MM.yyyy");
        var objectDate = new Date();
        String date = formatter.format(objectDate);
        return date;
    }
}
