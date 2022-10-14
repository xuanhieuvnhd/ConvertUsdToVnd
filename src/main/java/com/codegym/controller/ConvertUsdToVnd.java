package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("curency")
public class ConvertUsdToVnd {
    @GetMapping
    private String moveToWelcome(){
        return "convert";
    }
    @PostMapping
    private ModelAndView convert(String usd, String rate) {
        Double.parseDouble(usd);
        Double.parseDouble(rate);
    double origin = Double.parseDouble(usd);
    double convertRate = Double.parseDouble(rate);
    double converted = origin*convertRate;
    ModelAndView modelAndView = new ModelAndView("converted");
    modelAndView.addObject("origin",origin);
    modelAndView.addObject("converted",converted);
    return modelAndView;
    }
}
