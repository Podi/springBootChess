package edu.corvinus.springBootLottery.Controller;
import edu.corvinus.springBootLottery.domain.LoginForm;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.apache.juli.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.http.HttpRequest;

@Controller
public class WebController {
    @GetMapping("/login")
    public  String showForm(LoginForm loginForm){
        return "login";
    }
    @GetMapping()
    public String checkUser(@Valid LoginForm loginForm, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "login";
        }
        return "main";
    }
    @PostMapping()
    public String checkUser(@Valid LoginForm loginForm, BindingResult bindingResult, Log log, HttpServletRequest request, Model model){
        if (bindingResult.hasErrors()){
            return "login";
        }
        HttpSession session = request.getSession();
        session.setAttribute("validuser", loginForm.getUsername());
        model.addAttribute( "validuser", loginForm.getUsername());
        return "main";
    }
    @GetMapping("logout")
    public String logout(HttpSession session, LoginForm loginForm){
        session.invalidate();
        return  "login";
    }
}
