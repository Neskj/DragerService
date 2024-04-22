package CTD.drager.Controller;

import CTD.drager.Calendar.CheckCalendar;
import CTD.drager.Model.Drager;
import CTD.drager.Service.DragerService;
import CTD.drager.Service.LoginService;
import CTD.drager.Service.SimpleLoginService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MainControllerTest {

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



    /*

    @Test
    public void getDragerHtmlPageWhenLogedIn(){


    }

    @Test
    public void getLoginHtmlPageHappyFlow(){

    }

    @Test
    public void postLoginHtmlPageHappyFlow(){

    }

  */
}
