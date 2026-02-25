package org.example.observer;

public interface ISystem {
    void handleEvent(String msg);
}
class AudioSystem implements ISystem{
    @Override
    public void handleEvent(String msg) {
        System.out.println("AudioSystem handling: " + msg);
    }
}
class UISystem implements ISystem{
    @Override
    public void handleEvent(String msg) {
        System.out.println("UISystem handling: " + msg);
    }
}
