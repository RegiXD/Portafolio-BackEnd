package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id_Persona;
    
    private String Nombre;
    private String Apellido;
    private int DNI;
    
    public Persona(){};
    
    public Persona(Long Id_Persona, String Nombre, String Apellido, int DNI) {
        this.Id_Persona = Id_Persona;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
    }
}
