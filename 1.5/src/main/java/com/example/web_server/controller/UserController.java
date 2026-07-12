package com.example.web_server.controller;

import com.example.web_server.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            users.add(new User("Korisnik " + i, "korisnik" + i + "@kubernetes.com"));
        }
        model.addAttribute("users", users);
        return "userList";
    }
}
