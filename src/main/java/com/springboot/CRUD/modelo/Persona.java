package com.springboot.CRUD.modelo;

import javax.persistence.*;

@Entity
//nombre de la tabla en la DB
@Table(name = "persona")
public class Persona {
    //definiendo clave primaria
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telefono;

    public Persona() {
    }

    public Persona(int id, String name, String telefono) {
        super();
        this.id = id;
        this.name = name;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}



