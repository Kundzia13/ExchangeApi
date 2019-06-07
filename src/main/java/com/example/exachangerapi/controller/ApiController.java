package com.example.exachangerapi.controller;

import com.example.exachangerapi.model.Currency;
import com.example.exachangerapi.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// RestController daje adnotacje @Controller oraz do każdej metody dorzuca @ResponseBody
@RequestMapping("/api")
@RestController
public class ApiController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/exchangerates/{code}")
    public Currency index(@PathVariable String code) {
        return currencyService.getCurrency(code);
    }
}
