
import javafx.application.Application;
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
        Label label1 = new Label("Bienvenidos");
        Label label4 = new Label("nombre: ");
        TextField textField1 = new TextField();
        Label label2 = new Label("Direccion");
        TextField textField = new TextField();
        
//GridPane
GridPane gridpane = new GridPane();
ColumnConstraints col1 = new ColumnConstraints();
col1.setPercentWidth(20);
ColumnConstraints col2 = new ColumnConstraints();
col2.setPercentWidth(30);
gridpane.getColumnConstraints().addAll(col1,col2,col2,col1);
//VBox
        VBox vlayout = new VBox();
        vlayout.getChildren().add(gridpane);
//Scene 
        Scene s = new Scene(vlayout, 500, 500);
        stage.setTitle("MyJavaFX");

        stage.setScene(s);
        stage.show();

        
        
    }
    

    public static void main(String[] args) {
        Application.launch(args);
    }
}
