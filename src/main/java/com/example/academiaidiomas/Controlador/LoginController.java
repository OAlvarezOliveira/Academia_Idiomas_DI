package com.example.academiaidiomas.Controlador;

import com.example.academiaidiomas.Modelo.ModeloAlumnos;
import com.example.academiaidiomas.Modelo.ModeloProfesores;
import com.example.academiaidiomas.Vista.LoginView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;




public class LoginController {

    private Stage sta;
    private LoginView vista;
    private ModeloAlumnos modeloAlumnos;
    private ModeloProfesores modeloProfesores;

    public LoginController(Stage sta, LoginView vista, ModeloAlumnos modeloAlumnos, ModeloProfesores modeloProfesores) {
        this.sta = sta;
        this.vista = vista;
        this.modeloAlumnos = modeloAlumnos;
        this.modeloProfesores = modeloProfesores;

        vista.txtCodigo.addEventFilter(KeyEvent.KEY_TYPED, e -> {
            String c = e.getCharacter();


        });

    }



}
