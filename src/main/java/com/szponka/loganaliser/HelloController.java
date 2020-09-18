package com.szponka.loganaliser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HelloController {

    Repo repos;

    @Autowired
    public HelloController(Repo repos) {
        this.repos = repos;
    }

    @GetMapping("/logs")
    public String getCar(Model model) {
        model.addAttribute("lista", repos.getLogs("asdf", "sdfasdf"));
        return "index";
    }


    @RequestMapping("/process")
    public String process(Model model, @RequestParam String sourceText) {
        System.out.println(sourceText);
        repos.addToList(sourceText);
        return "redirect:/logs/";
    }
}
