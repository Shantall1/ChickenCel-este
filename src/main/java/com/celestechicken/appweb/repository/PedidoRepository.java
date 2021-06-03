package com.celestechicken.appweb.repository;

import com.celestechicken.appweb.model.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PedidoRepository extends JpaRepository<Pedido, Integer>{
    
}
