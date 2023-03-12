package com.inventario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
@RequestMapping(value = "/home",method = RequestMethod.GET)
public class HomeController {
    @GetMapping("/inicio")
    public String home(Model model){
        model.addAttribute("saludo","funcionamiento"+
                LocalDate.now());

        return "home";
    }


}
