package br.com.fatecararas.fatechelper.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;




@Entity(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = true)
    private String nome;

    @Column(length = 500)
    private String descricao;
    
    @OneToMany
    @JoinTable(
        name = "curso_disciplinas",
        joinColumns = @JoinColumn(name = "curso_id"),
        inverseJoinColumns = @JoinColumn(name = "id_disciplina"))
    
    private List<Disciplina> disciplinas;

    public void setNome(String string) {
    }

    public Integer getId() {
        return null;
    }

    public String getNome() {
        return null;
    }

    public Object getDescricao() {
        return null;
    }

    public void setDescricao(Object descricao2) {
    }
}
