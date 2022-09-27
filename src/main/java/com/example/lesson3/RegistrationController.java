package com.example.lesson3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationController {



    @FXML
    TextField nameTextField, surTextField, emailTextField, numberTextField, passTextField;
    @FXML
    Button registerButton, cancelButton;

    @FXML
    protected void CancelOnClicked(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 356, 410);
            Stage stage = new Stage();
            stage.setTitle("");
            stage.setScene(scene);
            stage.show();
            ((Node) event.getSource()).getScene().getWindow().hide();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    @FXML
    protected void registrationOnClicked(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("welcome.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("Welcome to Application");
            stage.setScene(scene);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }

}
