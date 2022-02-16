package com.example.the_will_hero_game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GameApplication extends Application {
    private static Stage stage;

    public static Stage getStage() {
        return stage;
    }

    @Override
    public void start(Stage stage) throws Exception {
        GameApplication.stage =stage;
        stage.setResizable(false);

        try{
            AnchorPane root= FXMLLoader.load(getClass().getResource("main_menu.fxml"));
            stage.setTitle("Will Hero");
            stage.setScene((new Scene(root)));
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }

        stage.setOnCloseRequest(e->{
            e.consume();
            closeProgram();
        });


    }
    private void closeProgram() {
        Boolean answer = CloseGame.display("Exit?😿", "Do you want to close the window");
        if (answer) stage.close();
    }



    public static void main(String[] args) {
        launch();
    }

}
