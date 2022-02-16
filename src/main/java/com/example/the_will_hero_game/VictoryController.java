package com.example.the_will_hero_game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class VictoryController {
    private Stage stage;
    private  Stage previousStage;
    private Scene scene;
    private AnchorPane root;


    @FXML
    private Text no_of_coins;

    @FXML
    private Text score;

    @FXML
    public void changingScene(ActionEvent event, String fileName) throws IOException {
        root = FXMLLoader.load(getClass().getResource(fileName));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void backToMenu(ActionEvent event) throws IOException {
        changingScene(event, "main_menu.fxml");
    }

    public void display(String no_coins, String _score, Stage _stage){
        this.previousStage= _stage;
        previousStage.close();
        no_of_coins.setText(no_coins);
        score.setText(_score);
    }




//    @FXML
//    void backToMenuM(MouseEvent event) throws IOException {
//        changingScene(event, "main_menu.fxml");
//    }
}