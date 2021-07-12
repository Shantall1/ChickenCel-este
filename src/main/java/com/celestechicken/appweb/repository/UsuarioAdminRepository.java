package com.celestechicken.appweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celestechicken.appweb.model.AdminUsuario;

public interface UsuarioAdminRepository extends JpaRepository<AdminUsuario,String>{

}
