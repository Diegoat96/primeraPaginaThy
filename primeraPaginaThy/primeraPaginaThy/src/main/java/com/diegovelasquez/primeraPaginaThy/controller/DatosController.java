package com.diegovelasquez.primeraPaginaThy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatosController {

    @GetMapping("/datos")
    public String mostrarDatos(Model model){

        model.addAttribute("Nombre", "Diego");
        model.addAttribute("Apellido", "Velásquez");
        model.addAttribute("Edad", 17);

        return "datos";
    }
}
