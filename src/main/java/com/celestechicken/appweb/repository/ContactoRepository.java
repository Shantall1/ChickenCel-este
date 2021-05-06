package com.celestechicken.appweb.repository;
import com.celestechicken.appweb.model.Contacto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ContactoRepository extends JpaRepository<Contacto, Integer>{

    
}