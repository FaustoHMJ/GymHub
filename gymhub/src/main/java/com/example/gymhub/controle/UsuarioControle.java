package com.example.gymhub.controle;

import com.example.gymhub.entidade.Usuario;
import com.example.gymhub.servico.UsuarioServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioControle {
    
    @Autowired
    private UsuarioServico servico;

    @GetMapping("/usuarios")
    public ModelAndView getUsuarios(){
        ModelAndView mv = new ModelAndView("cadastro");
        mv.addObject("usuarios", servico.getUsuarios());

        return mv;
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Usuario usuario){
        servico.salvar(usuario);
        return "redirect:/usuarios";
    }
}
