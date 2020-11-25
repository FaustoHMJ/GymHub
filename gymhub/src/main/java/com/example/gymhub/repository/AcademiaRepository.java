package com.example.gymhub.repository;

import com.example.gymhub.entidade.Academia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademiaRepository extends JpaRepository <Academia, Integer> {
    
}
