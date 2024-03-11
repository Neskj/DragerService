package CTD.drager.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

/*
*
* Это учебный логин сервис. В реальных приложениях рекомендуют использовать Spring Security
*
 */

@Service
@RequestScope
public class SimpleLoginService implements LoginService{

    public boolean getLogged(String username, String password){
        return username.equals("ctd")&&password.equals("1234");
    }
}
