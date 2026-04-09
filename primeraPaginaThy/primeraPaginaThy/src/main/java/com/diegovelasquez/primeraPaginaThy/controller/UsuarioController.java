package com.diegovelasquez.primeraPaginaThy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UsuarioController {

    @GetMapping("/usuario")
    public String mostrarUsuario(Model model){

        model.addAttribute("Nombre", "Colocho");
        model.addAttribute("Edad", 15);

        List<String> habilidades = Arrays.asList("Java", "CSS", "Html", "Js", "Phyton");
        model.addAttribute("Habilidades", habilidades);

        return "usuario";
    }
}
