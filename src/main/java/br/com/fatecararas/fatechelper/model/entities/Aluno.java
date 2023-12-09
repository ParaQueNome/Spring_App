package br.com.fatecararas.fatechelper.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "alunos")
public class Aluno {
    

    @Id
    @Column(nullable = false)
    private Integer rm;
    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "aluno")
    private List<Registro> registros;


}
