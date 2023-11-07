package edu.corvinus.springBootChess.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChessController {
    @RequestMapping("/index")
    @ResponseBody
    public String getHomepage() {
        //return "index";
        return "nem vagyok a kurvád srác";
    }
}
