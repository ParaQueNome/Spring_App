package br.com.fatecararas.fatechelper.model.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;
import java.util.List;

public class Aluno {
    

    @Id
    @Column(nullable = false)
    private Integer rm;
    @Column(nullable = false)
    private String nome;

    @ManyToMany
    @JoinTable(
        name = "aluno_disciplina",
        joinColumns = @JoinColumn(name = "aluno_id"),
        inverseJoinColumns = @JoinColumn(name = "disciplina_id"))
    
    private List<Disciplina> disciplinas;
}
