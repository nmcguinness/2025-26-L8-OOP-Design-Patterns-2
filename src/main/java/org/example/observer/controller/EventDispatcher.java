package org.example.observer.controller;

import org.example.observer.model.GameEvent;

import java.util.ArrayList;
import java.util.List;

public class EventDispatcher {
    private List<ISystem> eventHandlers = new ArrayList<>();     //FIFO queue

    public void register(ISystem system){
        eventHandlers.add(system);
    }
    public void deregister(ISystem system){
        eventHandlers.remove(system);
    }
    public void handleEvent(GameEvent evt){
        for(ISystem system : eventHandlers){
            system.handleEvent(evt);
        }
    }
}

/*
* public class EventDispatcher {
    private List<ISystem> eventHandlers = new ArrayList<>();     //FIFO queue
    public void register(ISystem system){
        eventHandlers.add(system);
    }
    public void deregister(ISystem system){
        eventHandlers.remove(system);
    }
    public void handleEvent(String msg){
        for(ISystem system : eventHandlers){
            system.handleEvent(msg);
        }
    }
}
* */
