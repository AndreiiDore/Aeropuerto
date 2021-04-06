module clases.aeropuerto {
    requires javafx.controls;
    requires javafx.fxml;

    opens clases.aeropuerto to javafx.fxml;
    exports clases.aeropuerto;
}
