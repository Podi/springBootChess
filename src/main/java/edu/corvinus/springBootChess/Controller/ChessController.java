package edu.corvinus.springBootChess.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChessController {

    @GetMapping("/index")
    @ResponseBody
    public ModelAndView getHomepage() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @RequestMapping("/")
    @ResponseBody
    public String getHomePage(){
        return "index";
    }

}
