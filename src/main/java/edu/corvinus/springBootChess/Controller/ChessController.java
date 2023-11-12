package edu.corvinus.springBootChess.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChessController {
    @RequestMapping("/home")
    @ResponseBody
    public ModelAndView getHomepage() {
        ModelAndView modelAndView = new ModelAndView("Home");
        return modelAndView;
    }

    //20231112 - Azonnal error page
    @RequestMapping("/game")
    @ResponseBody
    public ModelAndView getGame() {
        ModelAndView modelAndView = new ModelAndView("Game");
        return modelAndView;
    }

    //20231112 - Mukodik, de a form elkuldesekor behal, makeNewChessben lesz a hiba (nem tudom mi az)
    @RequestMapping("/makegame")
    @ResponseBody
    public ModelAndView getGameMaker() {
        ModelAndView modelAndView = new ModelAndView("MakeGame");
        return modelAndView;
    }

    //20231112 - Mukodik de nem is tudom ez minek van
    @RequestMapping("/chess")
    @ResponseBody
    public ModelAndView getChessGame() {
        ModelAndView modelAndView = new ModelAndView("chess");
        return modelAndView;
    }

    //20231112 - Azonnal error page
    @RequestMapping("/getid")
    @ResponseBody
    public ModelAndView getChessId() {
        ModelAndView modelAndView = new ModelAndView("chessid");
        return modelAndView;
    }
    /*
    @RequestMapping("/")
    @ResponseBody
    public String getHomePage(){
        return "index";
    }
    */
}
