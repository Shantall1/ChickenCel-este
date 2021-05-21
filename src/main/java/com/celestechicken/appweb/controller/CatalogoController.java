package com.celestechicken.appweb.controller;
<<<<<<< HEAD

import java.util.List;

import com.celestechicken.appweb.model.Producto;
import com.celestechicken.appweb.repository.ProductoRepository;
=======
       
import java.util.List;
import java.util.Optional;

import com.celestechicken.appweb.model.Producto;
import com.celestechicken.appweb.model.Proforma;
import com.celestechicken.appweb.model.Usuario;
import com.celestechicken.appweb.repository.ProductoRepository;
import com.celestechicken.appweb.repository.ProformaRepository;

>>>>>>> b9e03d7c35b0c206ef8f2534d277abb723eb58b9

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestParam;
>>>>>>> b9e03d7c35b0c206ef8f2534d277abb723eb58b9
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;


@Controller
public class CatalogoController{

    private static final String INDEX ="catalogo/index"; 
    private final ProductoRepository productsData;
<<<<<<< HEAD
    

    public CatalogoController(ProductoRepository productsData
        ){
        this.productsData = productsData;
=======
    private final ProformaRepository proformaData;
    

    public CatalogoController(ProductoRepository productsData,
        ProformaRepository proformaData         ){
        this.productsData = productsData;
        this.proformaData = proformaData; 
>>>>>>> b9e03d7c35b0c206ef8f2534d277abb723eb58b9
        
    }      

    @GetMapping("/catalogo/index")
<<<<<<< HEAD
    public String index(Model model){
        List<Producto> listProducto = this.productsData.getAllActiveProductos();
        model.addAttribute("productos",listProducto);
=======
    public String index(
        @RequestParam(defaultValue="") String searchName,
        Model model){
        List<Producto> listProducto = this.productsData.getAllActiveProductos();
        model.addAttribute("products",listProducto);
>>>>>>> b9e03d7c35b0c206ef8f2534d277abb723eb58b9
        return INDEX;
    }    

    @GetMapping("/catalogo/add/{id}")
<<<<<<< HEAD
    public String add(@PathVariable("id") int id, 
        Model model){
=======
    public String add(@PathVariable("id") Integer id, 
        HttpSession session,
        Model model){
        Usuario user = (Usuario)session.getAttribute("user"); 
        if(user==null) {
            model.addAttribute("mensaje", "Debe loguearse antes de agregar");
        }else{
            Producto productSeleccionado = productsData.getOne(id);
            Optional<Proforma> item= 
                proformaData.findProformaByUsuarioAndProducto(user, productSeleccionado);
            if(!item.isPresent()){
                Proforma itemCarrito = new Proforma();
                itemCarrito.setCantidad(1);
                itemCarrito.setUser(user);
                itemCarrito.setPrecio(productSeleccionado.getPrecio());
                itemCarrito.setProduct(productSeleccionado);
                proformaData.save(itemCarrito);
                model.addAttribute("mensaje", "Se agrego el producto al carrito");
            }else{
                Proforma itemCarritoExistente=item.get();
                itemCarritoExistente.setCantidad(itemCarritoExistente.getCantidad()+1);
                proformaData.save(itemCarritoExistente);
                model.addAttribute("mensaje", "Se adiciono el producto al carrito");
            }
        }   
>>>>>>> b9e03d7c35b0c206ef8f2534d277abb723eb58b9
        return INDEX;
    }  
}