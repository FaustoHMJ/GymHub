package com.example.gymhub.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disponibilidade implements Serializable {

    //id
    //id_recurso
    //quantidade disponivel
    //inicio
    //fim
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int quantidadedisponivel;

    public int getQuantidadedisponivel() {
        return quantidadedisponivel;
    }

    public void setQuantidadedisponivel(int quantidadedisponivel) {
        this.quantidadedisponivel = quantidadedisponivel;
    }

    @Override
    public String toString() {
        return "Disponibilidade [quantidadedisponivel=" + quantidadedisponivel + "]";
    }

    

}
