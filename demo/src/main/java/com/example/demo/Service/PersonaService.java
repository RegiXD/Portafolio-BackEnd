package com.example.demo.Service;

import com.example.demo.Model.Persona;
import com.example.demo.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private PersonaRepository pr;

    @Override
    public List<Persona> ViewPersons() {
        return pr.findAll();
    }

    @Override
    public void NewPerson(Persona p) {
        pr.save(p);
    }

    @Override
    public void DeletePerson(Long id) {
        pr.deleteById(id);
    }

    @Override
    public Persona FindPerson(Long id) {
        return pr.findById(id).orElse(null);
    }
    
}
