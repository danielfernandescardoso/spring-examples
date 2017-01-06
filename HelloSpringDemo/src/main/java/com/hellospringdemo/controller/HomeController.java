package com.hellospringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Daniel on 1/5/2017.
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
