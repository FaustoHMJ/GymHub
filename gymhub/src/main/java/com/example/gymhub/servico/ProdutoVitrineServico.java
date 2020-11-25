package com.example.gymhub.servico;

import java.util.List;

import com.example.gymhub.entidade.ProdutoVitrine;
import com.example.gymhub.repository.ProdutoVitrineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoVitrineServico {
    
    @Autowired
    private ProdutoVitrineRepository repository;

    public List<ProdutoVitrine> getProdutos(){
        return repository.findAll();
    }    

    public void salvar(ProdutoVitrine produtoVitrine) {
        repository.save(produtoVitrine);
    }
}
