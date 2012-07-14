/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.util.ArrayList;
import javafx.scene.layout.VBox;

/**
 *
 * @author rbs
 */
public class TaskCollection extends VBox{

    private ArrayList<TaskPane> tasks = new ArrayList<TaskPane>();
    
    public TaskCollection() {
        this.setFillWidth(true);
    }
    
    public void addTask(TaskPane pane){
        tasks.add(pane);
        this.getChildren().add(pane);
    }
    
}
