package org.example.observer.controller;
import org.example.observer.model.CollectibleEvent;
import org.example.observer.model.GameEvent;

public class UISystem implements ISystem{
    @Override
    public void handleEvent(GameEvent evt) {

        CollectibleEvent collEvt = (CollectibleEvent) evt;
        if(collEvt != null)
            System.out.println("UISystem handling: " + collEvt.getCollectible().getDescription());
    }
}
