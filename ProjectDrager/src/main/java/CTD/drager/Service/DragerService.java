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
    private ArrayList<Drager> dragerList;
    private DragerRepository dragerRepository;


    DragerService(DragerRepository dragerRepository){
        this.dragerRepository=dragerRepository;
    }

    public void getDragerList(){
        DragerRepository dragerRepository=new DragerClassRepository();
        this.dragerList=dragerRepository.returnDrager();


    }

    public ArrayList<Drager> showDragerList(){
        try {
            checkFlags();
        }catch (ParseException e){
            System.out.println("Error when trying to parse a string --->> "+ e);
        }
        return dragerList;
    }

    private void checkFlags() throws ParseException {

        SimpleDateFormat former=new SimpleDateFormat("dd.MM.yyyy");
        Calendar dragerDate=Calendar.getInstance();
        Calendar curretDate=Calendar.getInstance();

        curretDate.setTime(former.parse(CheckCalendar.checkDate()));

        for(Drager x: dragerList){
            dragerDate.setTime(former.parse(x.getVerification()));
            if(dragerDate.before(curretDate)||dragerDate.equals(curretDate)) x.setFlag("red");
            else if(dragerDate.after(curretDate)){
                if((dragerDate.get(Calendar.DAY_OF_YEAR)-(curretDate.get(Calendar.DAY_OF_YEAR))<=5)) x.setFlag("yellow");
                else x.setFlag("white");
            }


        }


    }


}
