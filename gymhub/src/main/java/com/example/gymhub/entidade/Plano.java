package com.example.gymhub.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plano implements Serializable {
//id
//id_Academia
//valor
//duração
//agendamentos por semana    

private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private float valor;
    private int agendamentosporsemana;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getAgendamentosporsemana() {
        return agendamentosporsemana;
    }

    public void setAgendamentosporsemana(int agendamentosporsemana) {
        this.agendamentosporsemana = agendamentosporsemana;
    }

    @Override
    public String toString() {
        return "Plano [agendamentosporsemana=" + agendamentosporsemana + ", valor=" + valor + "]";
    }

    

}
