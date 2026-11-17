package com.example.academiaidiomas.Modelo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class ModeloProfesores {

    private ObservableList<Profesor> listaProfesores = FXCollections.observableArrayList();


    public ModeloProfesores(ObservableList<Profesor> listaProfesores) {

        listaProfesores.add(new Profesor("PO1","Laura Vidal"));
        listaProfesores.add(new Profesor("PO2","Tom Baker"));
        listaProfesores.add(new Profesor("PO3","Claire Dubois"));
    }

    public ObservableList<Profesor> getListaProfesores() {

        return listaProfesores;
    }
}
