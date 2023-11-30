package br.com.fatecararas.fatechelper.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecararas.fatechelper.model.entities.Curso;
import br.com.fatecararas.fatechelper.model.repositories.CursoRepository;

@Controller
@RequestMapping("/helper/curso")
public class CursoController {
    @Autowired
    private CursoRepository repository;
    @GetMapping("/novo")
    String incluir(Curso curso){
        return "cursos/cadastrar";
    }

    @PostMapping("/salvar")
    String salvar(Curso curso){
        repository.save(curso);
        return "redirect:todos";
}

    @GetMapping("/todos")
    String listar(){
        return "cursos/listar";
    }
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Integer id){
            repository.deleteById(id);
            return "redirect:todos";

    }
    
    @ModelAttribute("cursos")
    public List<Curso> getCursos(){
        return repository.findAll();
    
    }
}