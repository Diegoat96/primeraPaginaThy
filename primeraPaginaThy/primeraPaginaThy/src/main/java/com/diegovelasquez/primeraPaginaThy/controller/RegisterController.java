package com.diegovelasquez.primeraPaginaThy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RegisterController {
    @Autowired
    private InMemoryUserDetailsManager userDetailsManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }

    @PostMapping("/register")
    public String processRegister(@RequestParam String username,
                                  @RequestParam String password,
                                  Model model) {

        if (userDetailsManager.userExists(username)) {
            model.addAttribute("error", "El usuario ya existe.");
            return "register";
        }

        UserDetails newUser = User.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .roles("USER")
                .build();

        userDetailsManager.createUser(newUser);
        return "redirect:/login?registered";
}
}
