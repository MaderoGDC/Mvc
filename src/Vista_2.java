
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
public class Vista_2 extends Application{

    @Override
    public void start(Stage stage) throws Exception {
    //Elementos
        TextArea text = new TextArea("Text Here");
        Label info = new Label("informacion:");
        Button bt = new Button("Regresar");
    //pane
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.TOP_CENTER  );
        pane.setPadding(new Insets(10));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.add(info, 0, 0);
        pane.add(text, 0, 1, 2, 3);
        pane.add(bt, 0, 4);
        GridPane.setHalignment(bt, HPos.RIGHT);
    //Vgap
        VBox vgap = new VBox();
        vgap.getChildren().add(pane);
    //Scene
        Scene s = new Scene(vgap, 200, 200);
    //Mostrar
        stage.setScene(s);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
