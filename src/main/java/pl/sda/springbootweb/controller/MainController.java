package pl.sda.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/strona2")
    public String mainPage2(Model model) {
        model.addAttribute("variable", "ide do parku");
        return "index";
    }

    @GetMapping("/")
    public ModelAndView mainPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("variable", "ide na zakupy");
        return mv;
    }

    @PostMapping("/strona3")
    public String buttonClicked(Model model) {
        model.addAttribute("joinedText3", "xxx");
        return "index";
    }
}
