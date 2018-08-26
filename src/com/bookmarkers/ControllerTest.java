package com.bookmarkers;

import com.bookmarkers.Main;
import com.bookmarkers.Stage.ControlledStage;
import com.bookmarkers.Stage.StageManager;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/**
 * @Author : Yutong Jin
 * @date : 8/25/18
 * @Description :
 */

public class ControllerTest implements ControlledStage {

    StageManager stageManager;
    private static final String ASS_WE_CAN = "Ass we can";
    private static final String BOY_NEXT_DOOR = "Boy next door";

    @FXML
    private JFXButton button;

    @FXML
    void onButonCLick(ActionEvent event) {
        if (button.getText().equals(ASS_WE_CAN)) button.setText(BOY_NEXT_DOOR);
        else button.setText(ASS_WE_CAN);
    }
    @FXML
    public void login(ActionEvent actionEvent) {


    }

    @Override
    public void setStageController(StageManager stageManager) {
        this.stageManager = stageManager;
    }
}

