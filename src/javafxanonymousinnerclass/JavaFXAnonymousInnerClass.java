/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxanonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Miguel
 */
public class JavaFXAnonymousInnerClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Button Declaration
        Button newbtn = new Button();
        Button openbtn = new Button();
        Button savebtn = new Button();
        Button printbtn = new Button();
        
        
        //Button Text
        newbtn.setText("New");
        openbtn.setText("Open");
        savebtn.setText("Save");
        printbtn.setText("Print");
        
        //Button Size Config
        newbtn.setPrefSize(50, 25);
        openbtn.setPrefSize(50, 25);
        savebtn.setPrefSize(50, 25);
        printbtn.setPrefSize(50, 25);
        
        
        //Button Events
        newbtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("New process!");
            }
        });
        
        openbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Open process!");
            }
        });
        
        savebtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Save process!");
            }
        });
        
        printbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Print process!");
            }
        });
        
        HBox root = new HBox(8);
        root.getChildren().addAll(newbtn,openbtn,savebtn,printbtn);
        root.setAlignment(Pos.CENTER);
 
        Scene scene = new Scene(root, 310, 80);
        
        primaryStage.setTitle("AnonymousHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
