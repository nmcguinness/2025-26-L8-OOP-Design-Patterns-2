package org.example.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Player{
    private String name;
    private int ammo;
    private List<CollectibleItem> keys;

    public Player(String name) {
        this.name = name;
        this.ammo = 100;
        this.keys = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public List<CollectibleItem> getKeys() {
        return keys;
    }

    public void addKey(KeyItem key) {
        this.keys.add(key);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", ammo=" + ammo +
                ", keys=" + keys +
                '}';
    }
}
