package com.celestechicken.appweb.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class ClienteController {

private static final String Index ="cliente/index";

@GetMapping("/cliente/index")
public String index(Model MODEL){
return INDEX;
}
}