package com.celestechicken.appweb.repository;

import com.celestechicken.appweb.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  ProductoRepository extends JpaRepository<Producto, Integer>{

    @Query(value = "SELECT o FROM Producto o WHERE o.status='A'")
    List<Producto> getAllActiveProductos();
<<<<<<< HEAD
}
=======
}
>>>>>>> b9e03d7c35b0c206ef8f2534d277abb723eb58b9
