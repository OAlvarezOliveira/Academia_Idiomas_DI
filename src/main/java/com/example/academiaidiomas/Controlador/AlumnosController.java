package com.example.academiaidiomas.Controlador;

import com.example.academiaidiomas.Modelo.Alumno;
import com.example.academiaidiomas.Modelo.ModeloAlumnos;
import com.example.academiaidiomas.Modelo.ModeloProfesores;
import com.example.academiaidiomas.Modelo.Profesor;
import com.example.academiaidiomas.Vista.AlumnosView;
import javafx.scene.control.Alert;

public class AlumnosController {

    private AlumnosView vistaAlumnos;
    private ModeloAlumnos modeloAlumnos;
    private ModeloProfesores modeloProfesores;

    public AlumnosController(AlumnosView vistaAlumnos, ModeloAlumnos modeloAlumnos, ModeloProfesores modeloProfesores) {
        this.vistaAlumnos = vistaAlumnos;
        this.modeloAlumnos = modeloAlumnos;
        this.modeloProfesores = modeloProfesores;

        vistaAlumnos.cmbProfesores.setItems(modeloProfesores.getListaProfesores());
        vistaAlumnos.btnBuscar.setOnAction(e -> buscar());

        vistaAlumnos.tabla.getSelectionModel().selectedItemProperty().addListener((obs, viejo, nuevo) -> {
            vistaAlumnos.btnEditar.setVisible(nuevo != null);
        });
        vistaAlumnos.btnEditar.setOnAction(e -> editar());
        vistaAlumnos.btnGuardar.setOnAction(e -> guardar());
        vistaAlumnos.btnOcultar.setOnAction(e -> ocultar());

    }

    private void buscar() {

        Profesor profesor = vistaAlumnos.cmbProfesores.getValue();

        if (profesor == null) {
            Alert alerta1= new Alert(Alert.AlertType.INFORMATION);
            alerta1.setTitle("Aviso");
            alerta1.setHeaderText(null);
            alerta1.setContentText("Selecciona un profesor antes de buscar");
            alerta1.showAndWait();
            return;
        }else {
            vistaAlumnos.tabla.setItems(modeloAlumnos.getAlumnosDeProfesor(profesor.getId()));
            vistaAlumnos.tabla.getSelectionModel().selectFirst();
        }


    }


    private void editar() {
        Alumno a = vistaAlumnos.tabla.getSelectionModel().getSelectedItem();
        vistaAlumnos.txtNombre.setText(a.getNombreAlumno());
        vistaAlumnos.cmbNivel.setValue(a.getNivel());
        vistaAlumnos.txtTelefono.setText(a.getTelefono());
        vistaAlumnos.txtEmail.setText(a.getEmail());
        vistaAlumnos.txtObs.setText(a.getObs());
        vistaAlumnos.formulario.setVisible(true);
        vistaAlumnos.formulario.setManaged(true);
        vistaAlumnos.getScene().getWindow().sizeToScene();
    }

    private void guardar() {
        Alumno a = vistaAlumnos.tabla.getSelectionModel().getSelectedItem();
        a.setNombreAlumno(vistaAlumnos.txtNombre.getText());
        a.setNivel(vistaAlumnos.cmbNivel.getValue());
        a.setTelefono(vistaAlumnos.txtTelefono.getText());
        a.setEmail(vistaAlumnos.txtEmail.getText());
        a.setObs(vistaAlumnos.txtObs.getText());
        vistaAlumnos.tabla.refresh();
    }

    private void ocultar() {
        vistaAlumnos.txtNombre.clear();
        vistaAlumnos.cmbNivel.setValue(null);
        vistaAlumnos.txtTelefono.clear();
        vistaAlumnos.txtEmail.clear();
        vistaAlumnos.txtObs.clear();
        vistaAlumnos.formulario.setVisible(false);
        vistaAlumnos.formulario.setManaged(false);
        vistaAlumnos.getScene().getWindow().sizeToScene();
    }
}
