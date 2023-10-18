package com.example.demo.dto;

public class Clientes {
    
    private String edad;
    private String nombre;
    private String telefono;


    public Clientes(String edad, String nombre, String telefono) {
        super();
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
