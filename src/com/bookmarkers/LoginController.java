package com.bookmarkers;

import com.bookmarkers.DB.Service.Impl.UserServiceImpl;
import com.bookmarkers.Main;
import com.jfoenix.controls.JFXButton;
import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @Author : Yutong Jin
 * @date : 8/25/18
 * @Description :
 */
public class LoginController extends Main {


        @FXML
        private PasswordField password;

        @FXML
        private TextField username;

        @FXML
        private JFXButton userlogin;

        @FXML
        void login(ActionEvent event) {
            String userName = username.getText();
            String passWord = password.getText();
            System.out.println(userName + passWord);
           boolean result =  new UserServiceImpl().login(userName,passWord);
           if(result){
               //
               //stage.close();
               System.out.println("success");
               Parent root = null;
               try {
                   root = FXMLLoader.load(getClass().getResource("UI.fxml"));
                   System.out.println("success change ");
               } catch (IOException e) {
                   System.out.println("faild");
                   e.printStackTrace();
               }
               ObservableList<Stage> stage = FXRobotHelper.getStages();
               Scene scene = null;
               try {
                   scene = new Scene(FXMLLoader.load(getClass().getResource("UI.fxml")));
               } catch (IOException e) {
                   e.printStackTrace();
               }
               stage.get(0).setScene(scene);
               stage.get(0).show();


               //跳转至用户界面
           }

           //弹出登陆失败界面
           else System.out.println("login failed");

        }

}

