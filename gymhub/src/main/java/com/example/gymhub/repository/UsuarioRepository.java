package com.example.gymhub.repository;

import com.example.gymhub.entidade.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
    
}
