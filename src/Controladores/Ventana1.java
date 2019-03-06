/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author dmadero
 */
public class Ventana1 {
            Scene scene;
            VBox vBox;
            GridPane pane;
            MenuBar menuBar;
            Button bt; 
            TextField t1;
            TextField t2;
    public Ventana1() {
        this.t1 = new TextField();
        this.t2 = new TextField();
        this.pane = new GridPane();
        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(10) );
        pane.setHgap(5);
        pane.setVgap(5);
        pane.add(new Label("Nombre:"), 0, 0);
        pane.add(this.t1, 1, 0);
        pane.add(new Label("Direccion:"), 0, 1);
        pane.add(this.t2, 1, 1);
        this.bt = new Button("Adicionar");
        pane.add(bt, 1, 3);
        GridPane.setHalignment(bt, HPos.CENTER);
        this.menuBar = new MenuBar();
        Menu menu1 = new Menu("Menu1");
        Menu menu2 = new Menu("Menu2");
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);

        this.vBox = new VBox();
        vBox.getChildren().add(menuBar);
        vBox.getChildren().add(pane);
        this.scene = new Scene(vBox,400,400);
        
    }

    public Scene getScene() {
        return scene;
    }

    public VBox getvBox() {
        return vBox;
    }

    public GridPane getPane() {
        return pane;
    }


    public MenuBar getMenuBar() {
        return menuBar;
    }
    
    public Button getBt() {
        return bt;
    }

    public TextField getT1() {
        return t1;
    }

    public TextField getT2() {
        return t2;
    }
        public void mostrar(Stage stage){
        stage.setTitle("Ventana_1");
        stage.setScene(scene);
        stage.show();
        }

}
