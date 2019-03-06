
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
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
 * @author dmadero
 */
public class Vista extends Application{

    @Override
    public void start(Stage stage) throws Exception {

//GridPane
GridPane pane = new GridPane();
        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.add(new Label("Bienvenidos"), 0, 0);
        pane.add(new Label("Name:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Apellido:"), 0, 2);
        pane.add(new TextField(), 1, 2);
        Button bt1 = new Button("Insertar");
        Button bt2 = new Button("Listar Todo");
        pane.add(bt1, 1, 3);
        pane.add(bt2, 3, 3);
        GridPane.setHalignment(bt1, HPos.RIGHT);
        GridPane.setHalignment(bt2, HPos.RIGHT);

//VBox
        VBox vlayout = new VBox();
        vlayout.getChildren().add(pane);
//Scene 
        Scene s = new Scene(vlayout, 400, 200);
        stage.setTitle("Vista");
        stage.setScene(s);
        stage.show();

        
        
    }
    
//    public GridPane getPanel(){
//        return pane;
//    }
//    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
