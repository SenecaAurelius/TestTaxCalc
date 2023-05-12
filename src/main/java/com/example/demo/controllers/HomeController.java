package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String HomeController(){
        return "index";
    }

//    @GetMapping("create")
//    public String displayCreateEventForm(Model model) {
//        model.addAttribute("title", "Create Event");
//        model.addAttribute(new Event());
//        model.addAttribute("types", EventType.values());
//        return "events/create";
//    }
    public String displayReport(Model model){
        //model.addAttribute()
        //TODO
        return "report";
    }
}
