package br.com.fatecararas.fatechelper.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecararas.fatechelper.model.entities.Registro;

public interface RegistroRepository extends JpaRepository<Registro, Integer>{
    
}
