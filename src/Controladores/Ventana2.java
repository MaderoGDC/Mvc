/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author dmadero
 */
public class Ventana2 {
    Scene scene;
    TextArea t1;
    Button bt;
    VBox v;
    public Ventana2() {
        this.v = new VBox();
        this.t1 = new TextArea();
        this.bt = new Button("Regresar");
        
        v.getChildren().add(t1);
        v.getChildren().add(bt);
        
        this.bt = new Button();
        this.scene = new Scene(v,200, 200);
    }

    public Scene getScene() {
        return scene;
    }


    public Button getBt() {
        return bt;
    }

    public VBox getV() {
        return v;
    }
    public void mostrar(Stage stage){
        stage.setTitle("Ventana_1");
        stage.setScene(scene);
    }
    
}
