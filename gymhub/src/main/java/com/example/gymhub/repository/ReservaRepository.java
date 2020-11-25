package com.example.gymhub.repository;

import com.example.gymhub.entidade.Reserva;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository <Reserva, Integer> {
    
}
