package com.celestechicken.appweb.repository;

import java.util.List;
import java.util.Optional;

import com.celestechicken.appweb.model.Producto;
import com.celestechicken.appweb.model.Proforma;
import com.celestechicken.appweb.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProformaRepository extends JpaRepository<Proforma, Integer>{
    
    @Query(value = "SELECT o FROM Proforma o WHERE o.user=?1")
    List<Proforma> findItemsByUsuario(Usuario user);

    @Query(value = "SELECT o FROM Proforma o WHERE o.user=?1 And o.product=?2")
    Optional<Proforma> findProformaByUsuarioAndProducto(Usuario user, Producto product);
}
