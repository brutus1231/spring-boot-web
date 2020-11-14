package pl.sda.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

//    @RequestMapping("/", method = RequestMethod.GET)
//    public String mainPage() {
//        return "index";
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView mainPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("variable", "ide na zakupy");
        return mv;
    }
}
