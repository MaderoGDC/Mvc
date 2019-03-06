/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javafx.stage.Stage;

/**
 *
 * @author dmadero
 */
public class Singleton {
    private static Singleton singleton = null;
    private Stage stage;
    
    public static Singleton getSigleton(){
        if(singleton==null){
            singleton = new Singleton();
                    
        }
        return singleton;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
    
}
