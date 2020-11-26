package com.example.gymhub.controle;


import com.example.gymhub.entidade.Academia;
import com.example.gymhub.servico.AcademiaServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AcademiaControle {
    

    @Autowired
    private AcademiaServico academiaServico;

    @GetMapping("/academiasCadastro")
    public ModelAndView getProdutos(){
        ModelAndView mv = new ModelAndView("cadastroAcademia");
        
        mv.addObject("academia",  new Academia());
        mv.addObject("academias", academiaServico.getAcademias());

        return mv;
    }

    @GetMapping("/mostraAcademias")
    public ModelAndView mostraAcademias(){
        ModelAndView mv = new ModelAndView("academias");

        mv.addObject("academias", academiaServico.getAcademias());

        return mv;
    }

    @PostMapping("/salvarAcademia")
    public String salvar(@ModelAttribute Academia academia){
        academiaServico.salvar(academia);
        return "redirect:/academiasCadastro";
    }
}
