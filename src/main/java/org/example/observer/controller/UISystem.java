package org.example.observer.controller;

public class UISystem implements ISystem{
    @Override
    public void handleEvent(String msg) {
        System.out.println("UISystem handling: " + msg);
    }
}
