package com.celestechicken.appweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class UsuarioController {
    private static final String Index="usuario/login";

@getMapping("/usuario/login")
public String login(Model MODEL){
return INDEX;
}
}