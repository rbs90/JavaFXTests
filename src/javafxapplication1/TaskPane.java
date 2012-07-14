/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.HBox;

/**
 *
 * @author rbs
 */
public class TaskPane extends HBox{

    private ProgressIndicator progressIndicator;
    private int progress = 0;
    private final int id;
    
    public TaskPane(int id, String title) {
        progressIndicator = new ProgressIndicator();
        progressIndicator.setProgress(0);
        progressIndicator.setPrefSize(50, 50);
        progressIndicator.setMaxSize(50, 50);

        this.getChildren().add(new Label(title));
        this.setAlignment(Pos.BASELINE_RIGHT);
        this.getChildren().add(progressIndicator);
        this.id = id;
        this.getStyleClass().add("task");
    }
    
    public void setProgress(int progress){
        this.setProgress(progress);
        progressIndicator.setProgress(100F / progress);
    }
}
