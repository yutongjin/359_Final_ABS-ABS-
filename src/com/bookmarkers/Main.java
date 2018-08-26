package com.bookmarkers;

import com.bookmarkers.UI.Stage.StageManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static String mainViewID = "Login";
    public static String mainViewRes = "Login.fxml";

    public static String loginViewID = "UI";
    public static String loginViewRes = "UI.fxml";

    private StageManager stageManager;


    //Button button ;
    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        stageManager = new StageManager();

        //将主舞台交给控制器处理
        stageManager.setPrimaryStage("primaryStage", primaryStage);

        //加载两个舞台，每个界面一个舞台
        stageManager.loadStage(loginViewID, loginViewRes);
        stageManager.loadStage(mainViewID, mainViewRes);

        //显示MainView舞台
        stageManager.setStage(mainViewID);

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
