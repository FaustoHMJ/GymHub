package com.example.gymhub.servico;

import java.util.List;

import com.example.gymhub.entidade.Usuario;
import com.example.gymhub.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServico {
    
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> getUsuarios(){
        return repository.findAll();
    }

    public void salvar(Usuario usuario) {
        repository.save(usuario);
    }
}
