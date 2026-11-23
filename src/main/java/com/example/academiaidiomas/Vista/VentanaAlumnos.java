package com.example.academiaidiomas.Vista;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VentanaAlumnos extends Stage {

    public VentanaAlumnos(Stage madre, AlumnosView vista) {
        setTitle("Fichas de alumnos");
        initOwner(madre);
        initModality(Modality.APPLICATION_MODAL);
        Scene escena = new Scene(vista);
        escena.getStylesheets().add(getClass().getResource("/estilos.css").toExternalForm());
        setScene(escena);
    }
}
