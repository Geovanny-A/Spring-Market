package com.spring.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/saludar")
public class ClassSaludar {

    @GetMapping("/hola")
    public String saludar(){
        return "Si puedes imaginarlo, puedes programarlo";

    }
}
