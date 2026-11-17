package com.example.academiaidiomas.Modelo;

public class Alumno {
    private String idProfesor;
    private String nombreAlumno;
    private Nivel nivel;
    private String telefono;
    private String email;
    private String obs;

    public Alumno(String idProfesor, String nombreAlumno,Nivel nivel ,String telefono, String email, String obs) {
        this.idProfesor = idProfesor;
        this.nombreAlumno = nombreAlumno;
        this.telefono = telefono;
        this.nivel = nivel;
        this.email = email;
        this.obs = obs;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
