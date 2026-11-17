package com.example.academiaidiomas.Vista;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.time.LocalDate;

public class LoginView extends BorderPane {

    public int anio = LocalDate.now().getYear();
    public Label lblTitulo = new Label("Academia de Idiomas");

    public Label lbltxtCodigo = new Label("Código de empleado");
    public TextField txtCodigo = new TextField();

    public Label grupoRadioButtons = new Label("Seleccione su perfil");
    public RadioButton rbProfesor=new RadioButton("Profesor");
    public RadioButton rbSecretaria=new RadioButton("Profesor");
    public RadioButton rbDireccion=new RadioButton("Profesor");
    public ToggleGroup grupoPerfil = new ToggleGroup();

    public ImageView imagen;

    public Button btnEntrar = new Button("Entrar");
    public Button btnSalir = new Button("Salir");

    public Label piePagina1 = new Label("@"+anio+"Academia de Idiomas");
    public Label piePagina2 = new Label("Contacto: info@academia.es | +34 988 111 222");


    public LoginView() {
        // Arriba: título
        lblTitulo.getStyleClass().add("titulo");
        BorderPane.setAlignment(lblTitulo, Pos.CENTER);
        setTop(lblTitulo);

        // Centro: imagen + formulario
        imagen.setImage(new Image(getClass()
                .getResource("/com/example/biblioteca/libro1.png").toExternalForm()));
        imagen.setFitWidth(140);
        imagen.setPreserveRatio(true);

        txtCodigo.setPromptText("txtCodigo");
        rbProfesor.setToggleGroup(grupoPerfil);
        rbSecretaria.setToggleGroup(grupoPerfil);
        rbDireccion.setToggleGroup(grupoPerfil);


        GridPane radiobuttons = new GridPane();
        radiobuttons.setHgap(10);
        radiobuttons.setVgap(10);
        radiobuttons.add(lbltxtCodigo, 0, 0);
        radiobuttons.add(txtCodigo, 1, 0);
        radiobuttons.add(grupoRadioButtons, 0, 1, 1, 1);
        radiobuttons.add(new VBox(rbProfesor, rbSecretaria, rbDireccion), 1, 2);
        radiobuttons.add(new HBox(btnEntrar, btnSalir), 1, 3);

        HBox centro = new HBox(30, imagen, radiobuttons);
        centro.setAlignment(Pos.CENTER);
        setCenter(centro);


        VBox pie = new VBox( piePagina1, piePagina2);
        pie.setAlignment(Pos.CENTER);
        pie.getStyleClass().add("pie");
        setBottom(pie);
    }


}
