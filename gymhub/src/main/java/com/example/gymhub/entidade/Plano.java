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

private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nomeplano;
    private String descricao;
    private String diferenciais;
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeplano() {
        return nomeplano;
    }

    public void setNomeplano(String nomeplano) {
        this.nomeplano = nomeplano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDiferenciais() {
        return diferenciais;
    }

    public void setDiferenciais(String diferenciais) {
        this.diferenciais = diferenciais;
    }

    @Override
    public String toString() {
        return "Plano [descricao=" + descricao + ", diferenciais=" + diferenciais + ", id=" + id + ", nomeplano="
                + nomeplano + ", valor=" + valor + "]";
    }

    

    

    
    

}
