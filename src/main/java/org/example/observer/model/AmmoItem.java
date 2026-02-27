package org.example.observer.model;

import org.example.observer.controller.EventDispatcher;

public class AmmoItem extends CollectibleItem implements IModifyPlayer {
    private int size;

    public AmmoItem(CollectibleType collectibleType, String description, int size) {
        super(collectibleType, description);
        this.size = size;
    }

    @Override
    public void modify(Player p) {
        //notify the event system (audio, collectible, ui, narrative)
        EventDispatcher.getInstance().handleEvent(new CollectibleEvent(EventType.Equip, this));
        p.setAmmo(p.getAmmo() + size);
    }
}
