package com.diegovelasquez.primeraPaginaThy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AmigosController {

    @GetMapping("/amigos")
    public String amigos(){

        return "amigos";
    }
}
