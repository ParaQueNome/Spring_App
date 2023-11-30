package br.com.fatecararas.fatechelper.model.services;

import org.springframework.stereotype.Service;

import br.com.fatecararas.fatechelper.model.repositories.RegistroRepository;

@Service
public class RegistroService {
    
    private final RegistroRepository repository;
    public RegistroService(RegistroRepository repository){
        this.repository = repository;
    }
}
