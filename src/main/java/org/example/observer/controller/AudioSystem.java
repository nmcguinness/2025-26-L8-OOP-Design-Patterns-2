package org.example.observer.controller;

public class AudioSystem implements ISystem{
    @Override
    public void handleEvent(String msg) {
        System.out.println("AudioSystem handling: " + msg);
    }
}
