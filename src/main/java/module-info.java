module com.example.academiaidiomas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.academiaidiomas to javafx.fxml;
    exports com.example.academiaidiomas.Controlador;
    exports com.example.academiaidiomas.Modelo;
    exports com.example.academiaidiomas.Vista;
    exports com.example.academiaidiomas;
}