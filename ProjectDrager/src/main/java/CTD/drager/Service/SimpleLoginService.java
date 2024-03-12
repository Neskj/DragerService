package CTD.drager.Service;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${ref.log}")
    private String referenceLoggin;
    @Value("${ref.pass}")
    private String referencePassword;

    public boolean getLogged(String username, String password){

        return username.equals(referenceLoggin)&&password.equals(referencePassword);
    }
}
