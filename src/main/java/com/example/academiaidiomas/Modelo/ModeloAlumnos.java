package com.example.academiaidiomas.Modelo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ModeloAlumnos {

    private ObservableList<Alumno> listaAlumnos = FXCollections.observableArrayList();

    public ModeloAlumnos() {
        listaAlumnos.add(new Alumno("PO1","Sara Nuñez",Nivel.BASICO,"611223344","sara@mail.com","necesita repasar verbos"));
        listaAlumnos.add(new Alumno("PO1","Ivan Rey",Nivel.INTERMEDIO,"622334455","ivan@mail.com","preparar examen B1"));
        listaAlumnos.add(new Alumno("PO2","Lucía Pazos",Nivel.AVANZADO,"633445566","lucia@mail.com","Muy buena pronunciación"));
        listaAlumnos.add(new Alumno("PO2","Hugo Lago",Nivel.BASICO,"644556677","hugo@mail.com","Falta a menudo"));
        listaAlumnos.add(new Alumno("PO3","Nerea Gil",Nivel.INTERMEDIO,"655667788","nerea@mail.com","Quiere pasar a avanzado"));

    }

    public ObservableList<Alumno> getListaAlumnos() {

        return listaAlumnos;
    }

    public ObservableList<Alumno> getAlumnosDeProfesor (String id){

        ObservableList<Alumno> resultado = FXCollections.observableArrayList();
        for (Alumno a : listaAlumnos) {
            if (a.getIdProfesor().equals(id)) {
                resultado.add(a);
            }
        }
        return resultado;
    }


}



