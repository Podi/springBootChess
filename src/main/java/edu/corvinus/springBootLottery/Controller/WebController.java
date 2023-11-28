package edu.corvinus.springBootLottery.Controller;
import edu.corvinus.springBootLottery.domain.LoginForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
}
