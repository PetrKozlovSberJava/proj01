package org.example.proj01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LmsController {

    @GetMapping("/lms")
    public String lmsMain(Model model) {
        return "lms-main";

    }
}
