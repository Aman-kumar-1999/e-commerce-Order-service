package com.eqipped.orderservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Success {

    @RequestMapping(value = "/")
    public String get(){
        return "success";
    }


}
