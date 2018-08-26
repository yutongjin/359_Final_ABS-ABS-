package com.bookmarkers.UI.Controller;

import com.bookmarkers.UI.Stage.StageManager;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

// 3 管理员登录成功页面
public class AdminPanelController implements ControlledStage{
    StageManager stageManager;
    @Override
    public void setStageController(StageManager stageManager) {
        this.stageManager = stageManager;
    }
    @FXML
    private JFXButton btnSearch;

    @FXML
    private Label labelWelcome;

    @FXML
    private JFXButton btnLogout;

    @FXML
    private Label labelUsername;

    @FXML
    private JFXButton btnCheckRatio;

    @FXML
    private JFXButton btnCheckInventory;

    @FXML
    void onBtnCheckInventoryClicked(ActionEvent event) {

    }

    @FXML
    void onBtnSearchClicked(ActionEvent event) {
        stageManager.setStage("SearchPanel","AdminPanel");
    }

    @FXML
    void onBtnCheckRatioClicked(ActionEvent event) {

    }

    @FXML
    void onBtnLogoutClicked(ActionEvent event) {
        stageManager.setStage("Login","AdminPanel");
    }

}

