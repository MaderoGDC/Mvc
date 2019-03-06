/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author dmadero
 */
public class Controlador1 {
    private Ventana1 ventana;
    private Modelo1 modelo;
    public Controlador1(Modelo1 modelo) {
        this.modelo = modelo;
        this.ventana = new Ventana1();
        //adicionar eventos
        this.ventana.getBt().setOnAction(new EventBoton());
    }
    //Clase Interna
    class EventBoton implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            modelo.setNombre(ventana.t1.getText());
            modelo.setDireccion(ventana.t2.getText());
            Controlador2 v2 = new Controlador2(modelo);
            v2.mostrarVista();
        }
        
    }


    public void mostrarVista(){
        Singleton singleton = Singleton.getSigleton();
        this.ventana.mostrar(singleton.getStage());
    }
}
