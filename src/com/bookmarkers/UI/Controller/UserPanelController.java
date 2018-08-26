package com.bookmarkers.UI.Controller;
import com.bookmarkers.UI.Stage.StageManager;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
//2 用户登录成功页面
public class UserPanelController implements ControlledStage{
    StageManager stageManager;
    @FXML
    private JFXButton btnCheckMyAccount;

    @FXML
    private JFXButton btnSearch;

    @FXML
    private Label labelWelcome;

    @FXML
    private JFXButton btnLogout;

    @FXML
    private Label labelUsername;

    @FXML
    private JFXButton btnCheckOutBooks;

    @FXML
    private JFXButton btnReturnBooks;

    @FXML
    void onBtnCheckMyAccountClicked(ActionEvent event) {
        stageManager.setStage("UserAccount","UserPanel");
    }

    @FXML
    void onBtnSearchClicked(ActionEvent event) {
        stageManager.setStage("SearchPanel","UserPanel");
    }

    @FXML
    void onBtnCheckOutBooksClicked(ActionEvent event) {

    }

    @FXML
    void onBtnReturnBooksClicked(ActionEvent event) {

    }

    @FXML
    void onBtnLogoutClicked(ActionEvent event) {
        stageManager.setStage("Login","UserPanel");
    }

    @Override
    public void setStageController(StageManager stageManager) {
        this.stageManager = stageManager;
    }
}

