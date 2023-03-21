package com.example.demo.Controller;

import com.example.demo.Model.Persona;
import com.example.demo.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private IPersonaService ps;
    
    @PostMapping("/nueva/persona")
    public void CrearPersona (@RequestBody Persona p){
        ps.NewPerson(p);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> VerPersonas(){
        return ps.ViewPersons();
    }
    
    @DeleteMapping("/borrar/persona/{id}")
    public void BorrarPersona (@PathVariable Long id){
        ps.DeletePerson(id);
    }
}
