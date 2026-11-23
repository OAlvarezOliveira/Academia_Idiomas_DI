package com.example.academiaidiomas.Controlador;

import com.example.academiaidiomas.Modelo.ModeloAlumnos;
import com.example.academiaidiomas.Modelo.ModeloProfesores;
import com.example.academiaidiomas.Vista.AlumnosView;
import com.example.academiaidiomas.Vista.LoginView;
import com.example.academiaidiomas.Vista.VentanaAlumnos;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;




public class LoginController {

    public LoginController(Stage stage, LoginView vista, ModeloAlumnos modeloAlumnos, ModeloProfesores modeloProfesores) {

        vista.txtCodigo.addEventFilter(KeyEvent.KEY_TYPED, e -> {

            String tecla = e.getCharacter();
            int logitud = vista.txtCodigo.getText().length();

            if (logitud >= 6) {
                e.consume();
            } else if (logitud >= 2 && (tecla.matches("[a-zA-Z]"))) {
                e.consume();
            } else if (logitud < 2 && (tecla.matches("[0-9]"))) {
                e.consume();
            }
        });

        vista.btnEntrar.setOnAction(event -> {

            if (vista.txtCodigo.getText().isBlank()  ){
                Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
                alerta1.setContentText("El código de empleado no puede estar vacío");
                alerta1.showAndWait();
                vista.txtCodigo.clear();
                return;
            }
            if (!vista.txtCodigo.getText().matches("[a-zA-Z]{2}[0-9]{4}")) {
                Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
                alerta1.setContentText("El código debe tener 6 caracteres : 2 Letras y 4 dígitos");
                alerta1.showAndWait();
                vista.txtCodigo.clear();
                return;
            }

            if(!(vista.rbProfesor.isSelected()) && !(vista.rbSecretaria.isSelected()) && !(vista.rbDireccion.isSelected()) ){
                Alert alerta2 = new Alert(Alert.AlertType.INFORMATION);
                alerta2.setContentText("El perfil es obligatorio.Por favor ,selecciona un perfil");
                alerta2.showAndWait();
                vista.rbDireccion.setSelected(true);
                return;
            }
            crearVentanaAlumnos(stage, modeloAlumnos, modeloProfesores);

        });

        vista.btnSalir.setOnAction(event -> {
            Platform.exit();
        });


    }

    private void crearVentanaAlumnos(Stage stage, ModeloAlumnos modeloAlumnos, ModeloProfesores modeloProfesores) {
        AlumnosView vistaAlumnos = new AlumnosView();
        new AlumnosController(vistaAlumnos, modeloAlumnos, modeloProfesores);
        VentanaAlumnos ventana = new VentanaAlumnos(stage, vistaAlumnos);
        ventana.showAndWait();
    }


}
