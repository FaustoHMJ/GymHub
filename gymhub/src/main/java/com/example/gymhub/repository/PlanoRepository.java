package com.example.gymhub.repository;

import com.example.gymhub.entidade.Plano;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanoRepository extends JpaRepository <Plano, Integer> {
    
}
