package com.example.the_will_hero_game;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class GameStarter {

    private static ImageView windmill_view;
    private static ImageView hero;
    private static TranslateTransition jump_hero1 = new TranslateTransition();

    public GameStarter(){
        Image hero_img = new Image("file:src/main/resources/com/example/the_will_hero_game/assets/hero.jpg",20,20,false,false);
        hero = new ImageView(hero_img);
        Image wm_img=  new Image("file:src/main/resources/com/example/the_will_hero_game/assets/windmill.png",36,30,false,false);
        windmill_view = new ImageView(wm_img);
    }

    public static ImageView getHeroView() {
        return hero;
    }

    public static ImageView getWindmill_view(){
        return windmill_view;
    }

    public void start_game(AnchorPane root){
        TranslateTransition jump_hero = new TranslateTransition();
        jump_hero.setCycleCount(Animation.INDEFINITE);
        jump_hero.setDuration(Duration.seconds(1));
        jump_hero.setNode(hero);
        jump_hero.setInterpolator(Interpolator.EASE_OUT);
        hero.setLayoutX(116);
        hero.setLayoutY(190);
        jump_hero.setToX(0);
        jump_hero.setByY(-65);
        jump_hero.setAutoReverse(true);
        root.getChildren().add(hero);
        jump_hero.play();
        jump_hero1 = jump_hero;
        RotateTransition windmill_rot = new RotateTransition();
        windmill_rot.setInterpolator(Interpolator.LINEAR);
        windmill_rot.setCycleCount(Animation.INDEFINITE);
        windmill_rot.setByAngle(360);
        windmill_view.setLayoutX(438);
        windmill_view.setLayoutY(117);
        windmill_rot.setDuration(Duration.seconds(2));
        root.getChildren().add(windmill_view);
        windmill_rot.setNode(windmill_view);
        windmill_rot.play();
    }
    public static TranslateTransition getHeroJump(){
        return jump_hero1;
    }
}
