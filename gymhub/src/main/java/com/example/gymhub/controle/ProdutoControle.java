package com.example.gymhub.controle;

import com.example.gymhub.entidade.ProdutoVitrine;
import com.example.gymhub.servico.ProdutoVitrineServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProdutoControle {
    
    @Autowired
    private ProdutoVitrineServico produtoServico;

    @GetMapping("/produtosVitrine")
    public ModelAndView getProdutos(){
        ModelAndView mv = new ModelAndView("cadastroProduto");
        
        mv.addObject("produtoVitrine",  new ProdutoVitrine());
        mv.addObject("produtosVitrine", produtoServico.getProdutos());

        return mv;
    }

    @GetMapping("/mostraProdutos")
    public ModelAndView mostraProdutos(){
        ModelAndView mv = new ModelAndView("produtos");

        mv.addObject("produtosVitrine", produtoServico.getProdutos());

        return mv;
    }

    @PostMapping("/salvarProduto")
    public String salvar(@ModelAttribute ProdutoVitrine produtoVitrine){
        produtoServico.salvar(produtoVitrine);
        return "redirect:/produtosVitrine";
    }
}
