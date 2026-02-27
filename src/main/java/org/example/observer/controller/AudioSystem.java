package org.example.observer.controller;

import org.example.observer.model.GameEvent;

public class AudioSystem implements ISystem{
    @Override
    public void handleEvent(GameEvent evt) {
        System.out.println("AudioSystem handling: " + evt);
    }
}
