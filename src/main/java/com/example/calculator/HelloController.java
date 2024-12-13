package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.PopupWindow;

import java.awt.*;

public class HelloController {
    @FXML
    private Label output;

    @FXML
    private TextField numF;

    @FXML
    private TextField numS;

    @FXML
    private Button plusBtn;
    @FXML
    private Button minusBtn;
    @FXML
    private Button multBtn;
    @FXML
    private Button divBtn;
    @FXML
    private Button modBtn;
    
    private boolean checkInputs(){
        
        if(numF.getText().isEmpty() || numS.getText().isEmpty()){
            output.setText("Please enter a number!");
            return false;
        }

        try{
            Double.parseDouble(numF.getText());
            Double.parseDouble(numS.getText());
        }catch (NumberFormatException e){
            output.setText("Please enter only numbers!");
            return false;
        }

        return true;
    }

    @FXML
    protected void onPlusButtonClick() {
        if(checkInputs()){
            double num = Double.parseDouble(numF.getText()) + Double.parseDouble(numS.getText());
            output.setText(String.valueOf(num));
        }
    }

    @FXML
    protected void onMinusButtonClick() {
        if (checkInputs()){
            double num = Double.parseDouble(numF.getText()) - Double.parseDouble(numS.getText());
            output.setText(String.valueOf(num));
        }
    }

    @FXML
    protected void onMultButtonClick() {
        if (checkInputs()){
            double num = Double.parseDouble(numF.getText()) * Double.parseDouble(numS.getText());
            output.setText(String.valueOf(num));
        }
    }

    @FXML
    protected void onDivButtonClick() {
        if (checkInputs()){
            double num = Double.parseDouble(numF.getText()) / Double.parseDouble(numS.getText());
            double roundOff = Math.round(num * 100.0) / 100.0;
            output.setText(String.valueOf(roundOff));
        }
    }

    @FXML
    protected void onModButtonClick() {
        if (checkInputs()){
            double num = Double.parseDouble(numF.getText()) % Double.parseDouble(numS.getText());
            output.setText(String.valueOf(num));
        }
    }
}