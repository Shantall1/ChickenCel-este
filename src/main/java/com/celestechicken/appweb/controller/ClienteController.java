package com.celestechicken.appweb.model;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class ClienteController {

private static final String Index="cliente/index";
@getMapping("/cliente/index")
public String index(Model MODEL);{
return INDEX;
}
}