package com.example.the_will_hero_game;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SavedGameController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void changingScene(ActionEvent event, String fileName) throws IOException {
        root= FXMLLoader.load(getClass().getResource(fileName));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();

    }

    public void changeToMainMenu(ActionEvent event) throws IOException {

        //initiate the game
        changingScene(event, "main_menu.fxml");

    }
}
