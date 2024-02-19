package CTD.drager.Controller;

import CTD.drager.Service.DragerService;
import CTD.drager.Service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import CTD.drager.Calendar.CheckCalendar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private final DragerService dragerService;
    private final LoginService loginService;
    private boolean checkLogin=false;

    @Autowired
    MainController(DragerService dragerService,LoginService loginService){
        this.dragerService=dragerService;
        this.loginService=loginService;
    }

    @GetMapping("/drager")
    public String drager(Model page){
        String date=CheckCalendar.CheckDate();
        page.addAttribute("date",date);

        dragerService.getSpisok();
        var pribory=dragerService.showSpisok();
        page.addAttribute("pribory",pribory);
        if(checkLogin) return "drager.html";
        else return "login.html";
    }

    @GetMapping("/")
    public String loginGet(){
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username, @RequestParam String password, Model page){
        if(loginService.getLogged(username,password)){
            page.addAttribute("message","Добро пожаловать!");
            checkLogin=true;
            return "redirect:/drager";
        }
        else {
            page.addAttribute("message","Не правильный логин или пароль!");
            return "login.html";
        }
    }


}
