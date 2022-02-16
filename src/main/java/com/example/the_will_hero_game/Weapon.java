package com.example.the_will_hero_game;

import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;

public class Weapon {
    private ImageView img;
    private String name;
    int level = 0;
    public Weapon(ImageView img, String name){
        this.name = name;
        this.img = img;
    }

    public void fireWeapon(String name){
        if (name=="Rocket"){
            TranslateTransition rocket_transition = new TranslateTransition();

        }
        if (name=="Lance"){

        }
    }
}