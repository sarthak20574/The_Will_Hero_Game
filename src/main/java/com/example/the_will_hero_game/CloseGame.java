package com.example.the_will_hero_game;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class CloseGame{

    private static boolean answer;

    public static boolean display(String title, String message){

        Stage window=new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label=new Label(message);

        Button yesbutton=new Button("Yes");
        yesbutton.setOnAction(e->{
                    answer=true;
                    window.close();
                }
        );

        Button nobutton=new Button("No");
        nobutton.setOnAction(e->{
                    answer=false;
                    window.close();
                }
        );


        VBox layout= new VBox(10);
        layout.getChildren().addAll(label, yesbutton, nobutton);
        layout.setAlignment(Pos.CENTER);

        Scene scene=new Scene(layout);

        window.setScene(scene);
        window.showAndWait();
        return answer;
    }
}
