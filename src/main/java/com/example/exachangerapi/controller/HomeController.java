package com.example.exachangerapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class HomeController {

    @GetMapping("/nbp")
    public String getNbp(ModelMap modelMap) {
        modelMap.put("currencies", Arrays.asList("eur", "usd"));
        return "nbp";
    }
}
