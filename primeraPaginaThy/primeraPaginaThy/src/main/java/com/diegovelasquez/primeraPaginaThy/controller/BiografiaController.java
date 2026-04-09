package com.diegovelasquez.primeraPaginaThy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BiografiaController {

    @GetMapping("/biografia")
    public String biografia(){

        return "biografia";
    }
}
