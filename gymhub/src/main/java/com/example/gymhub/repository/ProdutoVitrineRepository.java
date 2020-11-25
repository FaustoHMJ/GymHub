package com.example.gymhub.repository;

import com.example.gymhub.entidade.ProdutoVitrine;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoVitrineRepository extends JpaRepository <ProdutoVitrine, Integer> {
    
}
