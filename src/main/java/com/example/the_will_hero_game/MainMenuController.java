package com.example.the_will_hero_game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private Button exitButton;

    public GameStarter new_gameStarter;
    private Stage stage;
    private Scene scene;
    private AnchorPane root;

    public void changingScene(ActionEvent event,String fileName) throws IOException {
        root= FXMLLoader.load(getClass().getResource(fileName));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    public void changeToStartNewGame(ActionEvent event) throws IOException {

        //initiate the game
        //changingScene(event, "pause_menu.fxml");
        new_gameStarter = new GameStarter();
        root= FXMLLoader.load(getClass().getResource("game.fxml"));
        new_gameStarter.start_game(root);
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }

    public void changeToSavedGame(ActionEvent event) throws IOException {
        changingScene(event, "saved_games.fxml");
    }

    public void changeToCredits(ActionEvent event) throws IOException {
        changingScene(event, "credits.fxml");
    }
    public void changeToHow_To_Play(ActionEvent event) throws IOException {
        changingScene(event, "how_to_play.fxml");
    }

    public void changeToExit(ActionEvent event) {
        boolean close=CloseGame.display("Exit?😿","Are you sure you want to close?");
        //System.out.println(close);
        if(close) GameApplication.getStage().close();
    }

}
