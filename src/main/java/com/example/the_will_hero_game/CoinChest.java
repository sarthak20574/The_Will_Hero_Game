package com.example.the_will_hero_game;

public class CoinChest {
    private int coins;
    private boolean closed;

    public CoinChest(){
        this.coins= 30;
        this.closed=true;
    }


    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }



    public int getCoins() {
        return coins;
    }
}
