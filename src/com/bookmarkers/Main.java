package com.bookmarkers;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
public class Main extends Application {


    //Button button ;
    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("UserHome.fxml"));
        primaryStage.setTitle("Welcome to bookmarks");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
//    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setTitle("BookMarkers");
//        button = new Button();
//        button.setText("Click me ");
//        StackPane layout =  new StackPane();
//        layout.getChildren().add(button);
//
//        Scene scene = new Scene(layout,300,250);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
}
