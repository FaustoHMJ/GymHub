package com.example.gymhub.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProdutoVitrine implements Serializable {
//id
//id_Academia
//nome do produto
//descrição
//valor do produto
//imagem

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idproduto;
    private String nomeproduto;
    private String descricao;
    private float valorproduto;
    private String imagemproduto;

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorproduto() {
        return valorproduto;
    }

    public void setValorproduto(float valorproduto) {
        this.valorproduto = valorproduto;
    }

    public String getImagemproduto() {
        return imagemproduto;
    }

    public void setImagemproduto(String imagemproduto) {
        this.imagemproduto = imagemproduto;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    @Override
    public String toString() {
        return "ProdutoVitrine [descricao=" + descricao + ", idproduto=" + idproduto + ", imagemproduto="
                + imagemproduto + ", nomeproduto=" + nomeproduto + ", valorproduto=" + valorproduto + "]";
    }

    
    

    
}
