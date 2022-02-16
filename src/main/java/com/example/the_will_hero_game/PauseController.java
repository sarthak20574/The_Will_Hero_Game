package com.example.the_will_hero_game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PauseController {
    private Stage stage;
    private Scene scene;
    private AnchorPane root;


    public void changingScene(MouseEvent event, String fileName) throws IOException {
        root = FXMLLoader.load(getClass().getResource(fileName));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    //overloading or polymorphism
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
    @FXML
    void restart(ActionEvent event) throws IOException {
        GameStarter new_gameStarter = new GameStarter();
        root= FXMLLoader.load(getClass().getResource("game.fxml"));
        new_gameStarter.start_game(root);
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}