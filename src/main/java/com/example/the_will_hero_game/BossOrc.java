package com.example.the_will_hero_game;

public class BossOrc extends Orc{
    public BossOrc() {
        this.power = 50;
        this.coins_on_killing=500;
    }

    public int getPower() {
        return power;
    }

    public int getCoins_on_killing() {
        return coins_on_killing;
    }
}
