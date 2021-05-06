package com.celestechicken.appweb.repository;
import com.celestechicken.appweb.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UsuarioRepository extends JpaRepository<Usuario, String>{

    
}
© 2021 GitHub, Inc.