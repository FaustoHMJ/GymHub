package com.example.gymhub.controle;

import org.springframework.stereotype.Controller;

import com.example.gymhub.entidade.Plano;
import com.example.gymhub.servico.PlanoServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlanoControle {
    
    @Autowired
    private PlanoServico planoServico;

    @GetMapping("/planosCadastro")
    public ModelAndView getProdutos(){
        ModelAndView mv = new ModelAndView("cadastroPlano");
        
        mv.addObject("plano",  new Plano());
        mv.addObject("planos", planoServico.getPlanos());

        return mv;
    }

    @GetMapping("/mostraPlanos")
    public ModelAndView mostraPlanos(){
        ModelAndView mv = new ModelAndView("planos");

        mv.addObject("planos", planoServico.getPlanos());

        return mv;
    }

    @PostMapping("/salvarPlano")
    public String salvar(@ModelAttribute Plano plano){
        planoServico.salvar(plano);
        return "redirect:/planosCadastro";
    }
}
