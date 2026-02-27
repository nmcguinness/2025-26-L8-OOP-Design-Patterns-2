package org.example.observer.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

enum EventType { Win, Lose, Spawn, Pickup,
    InventoryAdd, InventoryRemove, InventoryMove,
    Equip, Use, Throw, Drop, Consume};

public class GameEvent {
    private EventType eventType;
    private long eventTime;
    //getters, constructor, toString
    public long getEventTime() {
        return eventTime;
    }
    public EventType getEventType() {
        return eventType;
    }

    public GameEvent(EventType eventType) {
        this.eventType = eventType;
        this.eventTime =  Instant.now().toEpochMilli();
    }

    @Override
    public String toString() {
        return "GameEvent{" +
                "eventType=" + eventType +
                ", eventTime=" + eventTime +
                '}';
    }
}
