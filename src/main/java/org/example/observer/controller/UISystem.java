package org.example.observer.controller;
import org.example.observer.model.GameEvent;

public class UISystem implements ISystem{
    @Override
    public void handleEvent(GameEvent evt) {
        System.out.println("UISystem handling: " + evt);
    }
}
