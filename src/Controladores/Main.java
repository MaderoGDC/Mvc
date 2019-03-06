/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author dmadero
 */
public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        //Registrar variable en el singleton
        Singleton singleton = Singleton.getSigleton();
        singleton.setStage(stage);
        
        //Modelo de memoria
        Modelo1 modelo = new Modelo1();
        //Invocar el controlador de la vista que quiero ver
        Controlador1 ventana1 = new Controlador1(modelo);
        ventana1.mostrarVista();
        System.out.println(modelo.nombre);
        
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}
