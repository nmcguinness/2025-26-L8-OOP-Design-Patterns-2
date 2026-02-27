package org.example.observer.model;

//immutable (only get, cannot set)
//will i inherit from this?
public final class CollectibleEvent extends GameEvent{

    private CollectibleItem collectible;
    public CollectibleItem getCollectible() {
        return collectible;
    }
    public CollectibleEvent(EventType eventType, CollectibleItem collectible) {
        super(eventType);
        this.collectible = collectible;
    }
}
