package com.example.the_will_hero_game;

public abstract class Orc {
    protected int power;
    protected int coins_on_killing;

    public Orc() {
        this.power = 1;
        this.coins_on_killing=10;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public int getCoins_on_killing() {
        return coins_on_killing;
    }
}
