package CTD.drager.Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleLoginServiceTest {

    @Test
    public void getLoggedHappyFlow(){

        SimpleLoginService simpleLoginService=new SimpleLoginService();
        String username="testLogin";
        String password="testPass";
        assertEquals(true,simpleLoginService.getLogged(username,password),"Not pass test : Loggin and password --->> are not correct");
    }

    @Test
    public void getLoggedNegativeFlow(){

        SimpleLoginService simpleLoginService=new SimpleLoginService();
        String username="wrongTestLogin";
        String password="wrongTestPass";
        assertEquals(false,simpleLoginService.getLogged(username,password));
    }
}
