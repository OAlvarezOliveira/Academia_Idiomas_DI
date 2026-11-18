package com.example.academiaidiomas.Vista;

import com.example.academiaidiomas.Controlador.LoginController;
import com.example.academiaidiomas.Modelo.ModeloAlumnos;
import com.example.academiaidiomas.Modelo.ModeloProfesores;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AcademiaAPP extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        ModeloAlumnos modeloAlumnos = new ModeloAlumnos();
        ModeloProfesores modeloProfesores = new ModeloProfesores();
        LoginView vista = new LoginView();
        new LoginController(stage, vista, modeloAlumnos, modeloProfesores);

        Scene escena = new Scene(vista, 520, 360);
        escena.getStylesheets().add(getClass().getResource("/estilos.css").toExternalForm());
        stage.setTitle("Academia de Idiomas - Acceso");
        stage.setScene(escena);
        stage.show();
    }
}
