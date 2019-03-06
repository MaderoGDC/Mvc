/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author dmadero
 */
public class Controlador2 {
    private Ventana2 ventana;
    private Modelo1 modelo;
    
    public Controlador2(Modelo1 modelo) {
        this.modelo = modelo;
        this.ventana = new Ventana2();
        //adicionar eventos
        this.ventana.getBt().setOnAction(new EventBoton());

    }
    //Clase Interna
    class EventBoton implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }


    public void mostrarVista(){
        Singleton singleton = Singleton.getSigleton();
        this.ventana.mostrar(singleton.getStage());
    }
}
