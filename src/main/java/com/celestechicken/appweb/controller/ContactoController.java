package com.celestechicken.appweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ContactoController {

    private static final String Index="contacto/create";
    @getMapping("/contacto/create")
    public String index(Model MODEL){
    return INDEX;
    }
    

}