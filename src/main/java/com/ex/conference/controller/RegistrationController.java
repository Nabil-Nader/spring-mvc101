package com.ex.conference.controller;

import com.ex.conference.controller.model.Registration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class RegistrationController {

    @GetMapping("/registration")
    public String registrationApp(@ModelAttribute("registration") Registration registration) {
        return "registration";
    }

    @PostMapping("/registration")
    public String add(@ModelAttribute("registration") Registration registration) {
        log.info("Regstration Name {}",registration.getName());
        return "registration";
    }
}
