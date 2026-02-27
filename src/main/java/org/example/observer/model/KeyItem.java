package org.example.observer.model;

import org.example.observer.controller.EventDispatcher;

public class KeyItem extends CollectibleItem implements IModifyPlayer {
    private int lockID;

    public KeyItem(CollectibleType collectibleType, String description, int lockID) {
        super(collectibleType, description);
        this.lockID = lockID;
    }

    @Override
    public void modify(Player p) {
        //notify the event system (audio, collectible, ui, narrative)
        EventDispatcher.getInstance().handleEvent(new CollectibleEvent(EventType.Pickup, this));
        p.addKey(this);
    }
}
