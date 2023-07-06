/*
Nombre: Selvin Raúl Chuquiej Andrade
Codigo Tecnico: IN5AM
Carné: 2018354
Fecha de Creacion: 21/03/2022
Fecha de modificaciones: 22/03/2022 | 27/02/2022 | 30/03/2022 | 31/03/2022 | 02/04/2022
*/
package org.selvinchuquiej.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalculadoraView.fxml"));
        
        Scene escena = new Scene(root);
        
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
