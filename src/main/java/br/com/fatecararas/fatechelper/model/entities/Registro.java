package br.com.fatecararas.fatechelper.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="registro")

public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="datahorainicio", nullable = false)
    private Date datahorainicio;

    @Column(name="datahoratermino", nullable = false)
    private Date datahoratermino;

    @OneToOne
    @JoinColumn(name="id_professor")
    private Professor professor;


    @OneToOne
    @JoinColumn(name="id_aluno")
    private Aluno aluno;

    @OneToOne
    @JoinColumn(name="id_notebook")
    private Notebook notebook;

    @OneToOne
    @JoinColumn(name="id_disciplina")
    private Disciplina disciplina;

    @OneToOne
    @JoinColumn(name="id_curso")
    private Curso curso;


}
