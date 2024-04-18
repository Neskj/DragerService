package CTD.drager.Calendar;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckCalendarTest {

    @Test
    public void checkDateHappyFlow() {

        String expectDate = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
        String resultDate = CheckCalendar.checkDate();
        assertEquals(expectDate, resultDate); //бредово, но пусть будет
    }
}
