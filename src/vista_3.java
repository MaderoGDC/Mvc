
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CARITO
 */
public class vista_3 extends Application{
    
        @Override
    public void start(Stage stage) throws Exception {
    //Elementos        
        Label info = new Label("informacion:");
        Button bt = new Button("Regresar");
                TableView table = new TableView();
        javafx.scene.control.TableColumn firstNameCol = new javafx.scene.control.TableColumn("First Name");
        javafx.scene.control.TableColumn lastNameCol = new javafx.scene.control.TableColumn("Last Name");
        javafx.scene.control.TableColumn emailCol = new javafx.scene.control.TableColumn("Email");
    //pane
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.TOP_CENTER  );
        pane.setPadding(new Insets(10));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.add(info, 0, 0);
        pane.add(table, 0, 1);
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
