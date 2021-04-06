package clases.aeropuerto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class PrimaryController {
    ArrayList <Vuelo> vuelos = new ArrayList <Vuelo>();
    @FXML
    private TextField aerolinea;
    @FXML
    private TextField origen;
    @FXML
    private TextField destino;
    @FXML
    private DatePicker diaSalida;
    
    
    
    
    public boolean buscarVuelo(){
        boolean encontrado =false;
        for (Vuelo v: vuelos) {
            if (aerolinea.equals(v.getAerolinea())) {
                if (origen.equals(v.getOrigen())) {
                    if (destino.equals(v.getDestino())) {
                        //Falta la fecha
                        encontrado=true;
                    }
                }
            }
            
        }
        return encontrado;
    }
    @FXML
    private Button primaryButton;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
