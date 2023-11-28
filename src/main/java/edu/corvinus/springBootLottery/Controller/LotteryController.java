package edu.corvinus.springBootLottery.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LotteryController {
    @RequestMapping("/index")
    @ResponseBody
    public ModelAndView getHomepage() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
