package com.celestechicken.appweb.repository;
import com.celestechicken.appweb.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ProductoRepository extends JpaRepository<Producto, Integer>{

    
}