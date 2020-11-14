package pl.sda.springbootweb.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.springbootweb.dto.UserDto;
import pl.sda.springbootweb.service.UserService;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public String users(Model model) {
        model.addAttribute("users", userService.list());
        model.addAttribute("user", UserDto.builder().build());
        return "users";
    }

    @PostMapping
    public String addUser(@ModelAttribute("user") UserDto user, Model model) {
        userService.add(user);
        return "users";
    }

}
