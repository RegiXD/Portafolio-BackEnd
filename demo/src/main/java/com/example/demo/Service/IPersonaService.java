package com.example.demo.Service;

import com.example.demo.Model.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> ViewPersons();
    public void NewPerson(Persona p);
    public void DeletePerson(Long id);
    public Persona FindPerson(Long id);
}
