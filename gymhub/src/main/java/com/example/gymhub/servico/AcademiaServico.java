package com.example.gymhub.servico;

import java.util.List;

import com.example.gymhub.entidade.Academia;
import com.example.gymhub.repository.AcademiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcademiaServico {
    
    @Autowired
    private AcademiaRepository repository;

    public List<Academia> getAcademias(){
        return repository.findAll();
    }

    public void salvar(Academia academia) {
        repository.save(academia);
    }
}
