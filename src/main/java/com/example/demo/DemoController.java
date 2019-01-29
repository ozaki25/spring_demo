package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {
    @Autowired
    private DemoRepository demoRepository;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("list", demoRepository.findAll());
        return "index";
    }

    @PostMapping
    public String post(@ModelAttribute Demo demo) {
        demoRepository.save(demo);
        return "redirect:/";
    }
}