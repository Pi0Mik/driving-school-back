package com.drivingschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/courses")
public class OrganizeController {
    @GetMapping("/lessons/calendar")
    public String getCalendar(){
        return "/courses/lessons/lessonsCalendar";
    }
}
