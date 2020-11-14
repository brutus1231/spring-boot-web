package pl.sda.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
    public String buttonClicked(@ModelAttribute("myText3") String myText3,
                                @ModelAttribute("oldJoinedText") String oldJoinedText,
                                Model model) {
        model.addAttribute("joinedText3", myText3);
        return "index";
    }

    @GetMapping("/strona4")
    public String forwardButtonClicked(HttpServletResponse response, @ModelAttribute("myText4") String myText4, Model model) throws IOException {
        model.addAttribute("myText4", myText4);
        response.sendRedirect("/details");
        return "details";
    }

    @GetMapping("/details")
    public String details(){
        return "details";
    }
}
