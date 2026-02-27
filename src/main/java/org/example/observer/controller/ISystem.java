package org.example.observer.controller;
import org.example.observer.model.GameEvent;

public interface ISystem {
    void handleEvent(GameEvent evt);
}
