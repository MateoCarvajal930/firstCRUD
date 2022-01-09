package com.springboot.CRUD.service.impl;

import com.springboot.CRUD.repository.PersonaRepository;
import com.springboot.CRUD.modelo.Persona;
import com.springboot.CRUD.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImp implements IPersonaService {

    @Autowired
    private PersonaRepository data;
    @Override
    public List<Persona> listar() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Persona p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
