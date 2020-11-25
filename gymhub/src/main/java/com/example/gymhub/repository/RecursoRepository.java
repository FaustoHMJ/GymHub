package com.example.gymhub.repository;

import com.example.gymhub.entidade.Recurso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecursoRepository extends JpaRepository <Recurso, Integer> {
    
}
