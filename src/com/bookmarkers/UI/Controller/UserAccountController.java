package com.bookmarkers.UI.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UserAccountController {

    @FXML
    private JFXButton btnBack;

    @FXML
    private Label labelUserID;

    @FXML
    private Label labelAccountStatus;

    @FXML
    private Label labelVideoBalance;

    @FXML
    private JFXTreeTableView<?> tableCurrentItems;

    @FXML
    private Label labelMagBalance;

    @FXML
    private Label labelBookBalance;

    @FXML
    void onBtnBackClicked(ActionEvent event) {

    }

}

