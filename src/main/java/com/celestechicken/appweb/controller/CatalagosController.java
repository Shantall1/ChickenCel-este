package com.celestechicken.appweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class CatalagosController {

private static final String Index="catalogo/index";
@getMapping("/catalogo/index")
public String index(Model MODEL){
return INDEX;
}
}