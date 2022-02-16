package com.example.the_will_hero_game;

public class WeaponChest {
    private String weaponType;
    private boolean closed;

    public WeaponChest(){
        this.closed=true;
    }


    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }


    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
}
