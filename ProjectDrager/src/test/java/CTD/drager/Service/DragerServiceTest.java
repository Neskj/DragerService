package CTD.drager.Service;

import CTD.drager.Model.Drager;
import CTD.drager.Repository.DragerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.awaitility.Awaitility.given;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DragerServiceTest {

    @Mock
    private DragerRepository dragerRepository;

    @InjectMocks
    private DragerService dragerService;


    @Test
    public void getDragerListHappyFlow(){

        ArrayList<Drager> dragerList=new ArrayList<>();
        Drager drager1=new Drager("Drager x-Am 1000", "ARXX-0001", "0123456", "Aleksandr Pushkin", "31.12.2054", "Calibration");
        Drager drager2=new Drager("Drager x-Am 2000", "ARXX-0002", "6543210", "Mikhail Lermontov", "31.12.2036", "Working");
        Drager drager3=new Drager("Drager x-Am 3000", "ARXX-0003", "9876543", "Nikolay Gogol", "31.12.2042", "Working");
        dragerList.add(drager1);
        dragerList.add(drager2);
        dragerList.add(drager3);

        when(dragerRepository.returnDrager()).thenReturn(dragerList);
        dragerService.getDragerList();
        verify(dragerRepository).returnDrager();    //getDragerList вернет void, по этому не можем исп. assertEuals
        
    }
/*
    @Test
    public void showDragerListHappyFlow(){

    }

    @Test
    public void checkFlagsHappyFlow(){

    }

 */
}
