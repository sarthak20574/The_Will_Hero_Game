package com.example.the_will_hero_game;

public class WillGame {
    private boolean ressurected;
    private boolean lost;
    private int score;
    private int coins;
    private Hero hero;
    private Helmet helmetType;
    private CoinChest coinChest;
    private WeaponChest weaponChest;

    public WillGame(Helmet helmetType, Hero hero){
        this.ressurected=false;
        this.lost=false;
        this.hero= hero;
        this.score=0;
        this.coins=0;
        this.coinChest=new CoinChest();
        this.weaponChest=new WeaponChest();
    }

    public boolean isRessurected() {
        return ressurected;
    }

    public void setRessurected(boolean ressurected) {
        this.ressurected = ressurected;
    }

    public boolean isLost() {
        return lost;
    }

    public void setLost(boolean lost) {
        this.lost = lost;
    }

    public CoinChest getCoinChest() {
        return coinChest;
    }

    public void setCoinChest(CoinChest coinChest) {
        this.coinChest = coinChest;
    }

    public WeaponChest getWeaponChest() {
        return weaponChest;
    }

    public void setWeaponChest(WeaponChest weaponChest) {
        this.weaponChest = weaponChest;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Helmet getHelmetType() {
        return helmetType;
    }

    public void setHelmetType(Helmet helmetType) {
        this.helmetType = helmetType;
    }


//+save(): void
//+ generate_bg(): void
//+generate_islands(): void
//+pause(): void
//+resume(): void
//+end(): void

}
