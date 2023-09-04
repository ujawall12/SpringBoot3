package com.javadev.springboot3.Controller;

import com.javadev.springboot3.Configuration.CurrencyServiceConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequiredArgsConstructor
public class CurrencyController {

    @Autowired
    private CurrencyServiceConfig config;

    @RequestMapping("/currency")
    public CurrencyServiceConfig retrieveConfiguration(){
        return config;
    }




}

