package com.example.gymhub.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contrato implements Serializable {
    //id
    //id_Usuario
    //id_Plano
    //inicio
    //fim
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numerocontrato;

    public int getNumerocontrato() {
        return numerocontrato;
    }

    public void setNumerocontrato(int numerocontrato) {
        this.numerocontrato = numerocontrato;
    }

    @Override
    public String toString() {
        return "Contrato [numerocontrato=" + numerocontrato + "]";
    }

    
    

    
}
