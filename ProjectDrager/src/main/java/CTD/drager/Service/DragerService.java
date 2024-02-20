package CTD.drager.Service;

import CTD.drager.Calendar.CheckCalendar;
import CTD.drager.Model.Drager;
import CTD.drager.Repository.DragerClassRepository;
import CTD.drager.Repository.DragerRepository;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


@Service
public class DragerService {
    private ArrayList<Drager> spisokDrager;
    private DragerRepository dragerRepository;


    DragerService(DragerRepository dragerRepository){
        this.dragerRepository=dragerRepository;
    }

    public void getSpisok(){
        DragerRepository dragerRepository=new DragerClassRepository();
        this.spisokDrager=dragerRepository.returnDrager();


    }

    public ArrayList<Drager> showSpisok(){
        try {
            checkSpisokFlags();
        }catch (ParseException e){
            System.out.println("Oshibka pri popitke parsirovat' stroku --->> "+ e);
        }
        return spisokDrager;
    }

    private void checkSpisokFlags() throws ParseException {

        SimpleDateFormat former=new SimpleDateFormat("dd.MM.yyyy");
        Calendar cal1=Calendar.getInstance();
        Calendar cal2=Calendar.getInstance();

        cal2.setTime(former.parse(CheckCalendar.checkDate()));

        for(Drager x: spisokDrager){
            cal1.setTime(former.parse(x.getVerification()));
            if(cal1.before(cal2)||cal1.equals(cal2)) x.setFlag("red");
            else if(cal1.after(cal2)){
                if((cal1.get(Calendar.DAY_OF_YEAR)-(cal2.get(Calendar.DAY_OF_YEAR))<=5)) x.setFlag("yellow");
                else x.setFlag("white");
            }


        }


    }


}
