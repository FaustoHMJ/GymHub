package com.example.gymhub.servico;

import java.util.List;

import com.example.gymhub.entidade.Plano;
import com.example.gymhub.repository.PlanoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanoServico {
    
    @Autowired
    private PlanoRepository repository;

    public List<Plano> getPlanos(){
        return repository.findAll();
    }    

    public void salvar(Plano plano) {
        repository.save(plano);
    }
}
