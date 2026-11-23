package com.example.academiaidiomas.Vista;

import com.example.academiaidiomas.Modelo.Alumno;
import com.example.academiaidiomas.Modelo.Nivel;
import com.example.academiaidiomas.Modelo.Profesor;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AlumnosView extends VBox {
    public ComboBox<Profesor> cmbProfesores = new ComboBox<>();
    public Label lblCMB = new Label("Profesor:");
    public Button btnBuscar = new Button("Buscar Alumnos");
    public Button btnEditar = new Button("Editar Alumno");
    public TableView<Alumno> tabla = new TableView<>();

    // Formulario de edición
    public TextField txtNombre = new TextField();
    public ComboBox<Nivel> cmbNivel = new ComboBox<>();
    public TextField txtTelefono = new TextField();
    public TextField txtEmail = new TextField();
    public TextArea txtObs = new TextArea();
    public Button btnGuardar = new Button("Guardar");
    public Button btnOcultar = new Button("Ocultar formulario");
    public VBox formulario = new VBox(6);


    public AlumnosView() {

        //TOP
        HBox filaSuperior = new HBox(12);
        filaSuperior.setAlignment(Pos.CENTER);
        filaSuperior.getChildren().addAll(lblCMB,cmbProfesores,btnBuscar,btnEditar);


        //Tabla de resultados
        TableColumn<Alumno, String> colIdProf = new TableColumn<>("ID Prof");
        colIdProf.setCellValueFactory(new PropertyValueFactory<>("idProfesor"));

        TableColumn<Alumno, String> colNomAlum = new TableColumn<>("Alumno");
        colNomAlum.setCellValueFactory(new PropertyValueFactory<>("nombreAlumno"));

        TableColumn<Alumno, Nivel> colNivAlum = new TableColumn<>("Nivel");
        colNivAlum.setCellValueFactory(new PropertyValueFactory<>("nivel"));

        TableColumn<Alumno, String> colTLFAlum = new TableColumn<>("Teléfono");
        colTLFAlum.setCellValueFactory(new PropertyValueFactory<>("telefono"));

        TableColumn<Alumno, String> colEmail= new TableColumn<>("Email");
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        TableColumn<Alumno, String> colOBS = new TableColumn<>("Observaciones");
        colOBS.setCellValueFactory(new PropertyValueFactory<>("obs"));

        tabla.getColumns().addAll(colIdProf,colNomAlum,colNivAlum,colTLFAlum,colEmail,colOBS);
        tabla.setPrefSize(680 ,150);
        getChildren().addAll(filaSuperior,tabla);
        btnEditar.setVisible(false);
        cmbProfesores.setPromptText("Seleccione profesor");

        // Formulario
        cmbNivel.getItems().addAll(Nivel.values());
        txtObs.setPrefRowCount(3);
        txtObs.setWrapText(true);
        HBox botonesForm = new HBox(12, btnGuardar, btnOcultar);
        botonesForm.setAlignment(Pos.CENTER);
        formulario.getChildren().addAll(
                new Label("Nombre"), txtNombre,
                new Label("Nivel"), cmbNivel,
                new Label("Teléfono"), txtTelefono,
                new Label("Email"), txtEmail,
                new Label("Observaciones"), txtObs,
                botonesForm);
        getChildren().add(formulario);
        formulario.setVisible(false);
        formulario.setManaged(false);

    }
}