package com.example.academiaidiomas.Modelo;

public class Profesor {
    private String id;
    private String nombre;

    public Profesor(String id, String nombre) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + id + ")";
    }
}
