package com.example.lesson3;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {

    @FXML
    private ImageView Exit;
    Stage stage = null;
    @FXML
    private Label menu;

    @FXML
    private AnchorPane Pane1;
    @FXML
    private Label menuClose;

    @FXML
    private AnchorPane sliderpane;

    @FXML
    private AnchorPane Pane;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Exit.setOnMouseClicked(event -> {
            System.exit(0);
        });
        sliderpane.setTranslateX(-176);






        menu.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(sliderpane);

            slide.setToX(0);
            slide.play();

            sliderpane.setTranslateX(-176);

            slide.setOnFinished((ActionEvent e) -> {
                menu.setVisible(false);
                menuClose.setVisible(true);
            });
        });




        menuClose.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(sliderpane);

            slide.setToX(-176);
            slide.play();

            sliderpane.setTranslateX(0);

            slide.setOnFinished((ActionEvent e) -> {
                menu.setVisible(true);
                menuClose.setVisible(false);
            });
        });
    }




    @FXML
    private  void showDash(ActionEvent event) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            Pane.getChildren().clear();
            Pane.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private  void showAdd(ActionEvent event) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            Pane.getChildren().clear();
            Pane.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @FXML
    private  void showReport(ActionEvent event) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("report.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            Pane.getChildren().clear();
            Pane.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private  void showBackup(ActionEvent event) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BackUp.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            Pane.getChildren().clear();
            Pane.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }}