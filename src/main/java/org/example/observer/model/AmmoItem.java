package org.example.observer.model;

public class AmmoItem extends CollectibleItem implements IModifyPlayer {
    private int size;

    public AmmoItem(CollectibleType collectibleType, String description, int size) {
        super(collectibleType, description);
        this.size = size;
    }

    @Override
    public void modify(Player p) {
        p.setAmmo(p.getAmmo() + size);
    }
}
