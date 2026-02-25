package org.example.observer;

class Player{
    public String name;
    public int ammo;
    public int rank;
    public Player(String name) { this.name = name; this.ammo = 100; this.rank = 1; }
}
public interface IModifyPlayer {
    void modify(Player p);
}
class KeyItem implements IModifyPlayer{
    private int rankBoost;
    @Override
    public void modify(Player p) {
        p.rank += rankBoost;
    }
}
class AmmoItem implements IModifyPlayer{
    private int size;

    @Override
    public void modify(Player p) {
        p.ammo += size;
    }
}
