package com.celestechicken.appweb.model;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class ContactoController {
    private static final String Index="contacto/index";
    @getMapping("/contacto/index")
    public String index(Model MODEL);{
    return INDEX;
    }
    

}