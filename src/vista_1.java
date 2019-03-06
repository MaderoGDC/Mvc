
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CARITO
 */
public class vista_1 extends Application{

    @Override
    public void start(Stage stage) throws Exception {
    //Stage
     stage.setTitle("Inscripcion");
    //Elementos:
    //Menu Arriba
        MenuBar menuBar = new MenuBar();
        Menu menu1 = new Menu("Menu1");
        Menu menu2 = new Menu("Menu2");
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        
    //menu desplegable
        ObservableList telefonia =  FXCollections.observableArrayList();
        telefonia.add("Tigo");
        telefonia.add("Movistar");
        telefonia.add("Claro");
        ChoiceBox cb = new ChoiceBox(telefonia);  

    //Hbox
        HBox hBox = new HBox();
        hBox.getChildren().add(new Label("Telefono"));
        hBox.getChildren().add(cb);        
    
//GridPane    
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(10) );
        pane.setHgap(5);
        pane.setVgap(5);
        pane.add(new Label("Nombre:"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("Direccion:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.setVgap(10);
        pane.add(new Label("Telefono"),0,2);
        pane.add(cb, 1, 2);
        Button bt = new Button("Adicionar");
        pane.add(bt, 1, 3);
        GridPane.setHalignment(bt, HPos.CENTER);
        
//        bt.setOnAction(new EventHandler<ActionEvent>(){
//            public void handle(ActionEvent e){
//                pane.add(Vista.getPanel());
//            }
//            });

    //Vbox
        VBox vBox = new VBox();
        vBox.getChildren().add(menuBar);
        vBox.getChildren().add(pane);

    
    //Escena
        Scene scene = new Scene(vBox,400, 200);
            
    //Mostrar
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
