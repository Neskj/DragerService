package CTD.drager.Controller;

import CTD.drager.Calendar.CheckCalendar;
import CTD.drager.Model.Drager;
import CTD.drager.Service.DragerService;
import CTD.drager.Service.LoginService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MainControllerTest {

    @Mock
    private Model page;
    @Mock
    private LoginService loginService;
    @Mock
    private DragerService dragerService;
    @InjectMocks
    private MainController mainController;

    @Test
    public void loginGetTestreturnNotNull(){

        String result=mainController.loginGet();
        assertNotNull(result);
    }
    @Test
    public void loginGetTestHappyFlow(){

        String result=mainController.loginGet();
        assertEquals("login.html",result);
    }

    @Test
    public void loginPostEnterRightParametres(){

        String username="testLogin";
        String password="testPass";

        when(loginService.getLogged(username,password)).thenReturn(true);
        String result=mainController.loginPost(username,password,page);
        assertNotNull(result);
        assertEquals("redirect:/drager",result);
        verify(page).addAttribute("message","Добро пожаловать!");
    }

    @Test
    public void loginPostEnterWrongParametres(){

        String username = "wrongLogin";
        String password = "wrongPass";

        when(loginService.getLogged(username, password)).thenReturn(false);
        String result = mainController.loginPost(username, password, page);
        assertNotNull(result);
        assertEquals("login.html", result);
        verify(page).addAttribute("message", "Неправильный логин или пароль!");
    }

    @Test
    public void getDragerViewHappyFlow() {

        Drager drager1 = new Drager("Drager x-Am 1000", "ARXX-0001", "0123456", "Aleksandr Pushkin", "31.12.2054", "Calibration");
        Drager drager2 = new Drager("Drager x-Am 2000", "ARXX-0002", "6543210", "Mikhail Lermontov", "31.12.2036", "Working");
        Drager drager3 = new Drager("Drager x-Am 3000", "ARXX-0003", "9876543", "Nikolay Gogol", "31.12.2042", "Working");

        ArrayList<Drager> dragers = new ArrayList<>();
        dragers.add(drager1);
        dragers.add(drager2);
        dragers.add(drager3);

        when(dragerService.showDragerList()).thenReturn(dragers);
        mainController.drager(page);
        verify(dragerService).getDragerList();
        verify(dragerService).showDragerList();
        verify(page).addAttribute("dragers", dragers);
        verify(page).addAttribute("date", CheckCalendar.checkDate());
    }
}
