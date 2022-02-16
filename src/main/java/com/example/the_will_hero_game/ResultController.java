package com.example.the_will_hero_game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ResultController {
    private Stage stage;
    private Stage previousStage;
    private Scene scene;
    private AnchorPane root;
    private Hero hero;
    private WillGame game;
    private GameController gameController;
    private boolean resurrection_done=false;

    @FXML
    private Label coins;

    @FXML
    private Label score;

    @FXML
    private Label infoLabel;


    public void changingScene(MouseEvent event, String fileName) throws IOException {
        root= FXMLLoader.load(getClass().getResource(fileName));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    //overloading or polymorphism
    public void changingScene(ActionEvent event, String fileName) throws IOException {
        root= FXMLLoader.load(getClass().getResource(fileName));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void display(String no_coins, String _score, Stage _stage, Hero realHero, WillGame realGame, GameController gameController){
        this.gameController=gameController;
        coins.setText(no_coins);
        score.setText(_score);
        game=realGame;
        hero=realHero;
        previousStage= _stage;
    }


    @FXML
    void backToMenu(ActionEvent event) throws IOException {
        this.previousStage.close();
        changingScene(event, "main_menu.fxml");
    }

    //overloading or polymorphism
    @FXML
    void backToMenuM(MouseEvent event) throws IOException {
        this.previousStage.close();
        changingScene(event, "main_menu.fxml");
    }

    @FXML
    void restartGame(MouseEvent event) throws IOException {
        this.previousStage.close();
        GameStarter new_gameStarter = new GameStarter();
        root= FXMLLoader.load(getClass().getResource("game.fxml"));
        new_gameStarter.start_game(root);
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void resurrect(MouseEvent event) {

        if( this.resurrection_done|| game.isRessurected()){
            infoLabel.setText("Resurrection can be done only once😥");
        }
        else if( Integer.parseInt(coins.getText())>29){
            Stage stage = (Stage) coins.getScene().getWindow();
            this.resurrection_done=true;
            game.setRessurected(true);
            game.setCoins(game.getCoins()-30);
            game.setLost(false);
            gameController.getCoinLabel().setText(""+game.getCoins());
            stage.close();
            gameController.initialize(null, null);
        }
        else {
            infoLabel.setText("🤑 You need 30 coins to resurrect, you only have "+coins);
        }
    }
}
