/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author rbs
 */
public class JavaFXApplication1 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Hello World!");
        
        TaskCollection tasks = new TaskCollection();
        tasks.addTask(new TaskPane(1, "Adresse der Basis"));
        tasks.addTask(new TaskPane(2, "Ausrückbereich definieren"));
        tasks.addTask(new TaskPane(3, "Straßen im Ausrückbereich"));
        tasks.addTask(new TaskPane(4, "Gebäude im Ausrückbereich"));
        tasks.addTask(new TaskPane(5, "Fahrzeuge"));
        
        StackPane root = new StackPane();
        root.getChildren().add(tasks);
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
        primaryStage.getScene().getStylesheets().add(getClass().getResource("tasks.css").toExternalForm());
    }
}
