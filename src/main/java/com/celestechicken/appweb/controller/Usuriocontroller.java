package com.celestechicken.appweb.model;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class UsuarioController {
    private static final String Index="usuario/index";
@getMapping("/usuario/index")
public String index(Model MODEL);{
return INDEX;
}}