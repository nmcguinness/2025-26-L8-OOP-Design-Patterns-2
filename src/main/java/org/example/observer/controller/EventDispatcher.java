package org.example.observer.controller;

import org.example.observer.model.GameEvent;

import java.util.ArrayList;
import java.util.List;

//how to make a Singleton class in Java?

public class EventDispatcher {
    //step 3 - make the reference to the SINGLE event dispatcher
    private static EventDispatcher instance;
    private List<ISystem> eventHandlers = new ArrayList<>();     //FIFO queue

    //step 1 - make private
    private EventDispatcher() {

    }

    //step 2 - make a function that makes ONLY 1 instance and returns it
    public static EventDispatcher getInstance(){

        if(instance == null) {
            //notice we now CAN internally call constructor
            instance = new EventDispatcher();
        }
        return instance;
    }

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

//public class EventDispatcher {
//    private List<ISystem> eventHandlers = new ArrayList<>();     //FIFO queue
//    //private List<ISystem> eventHandlers;     //this list is not initialized
//
//    public void register(ISystem system){
//
//        if(eventHandlers == null)
//            throw new NullPointerException("List is not yet initialized!");
//
//        eventHandlers.add(system);
//    }
//    public void deregister(ISystem system){
//        eventHandlers.remove(system);
//    }
//    public void handleEvent(GameEvent evt){
//        for(ISystem system : eventHandlers){
//            system.handleEvent(evt);
//        }
//    }
//}

//public class EventDispatcher {
//    private List<ISystem> eventHandlers = new ArrayList<>();     //FIFO queue
//
//    public void register(ISystem system){
//        eventHandlers.add(system);
//    }
//    public void deregister(ISystem system){
//        eventHandlers.remove(system);
//    }
//    public void handleEvent(GameEvent evt){
//        for(ISystem system : eventHandlers){
//            system.handleEvent(evt);
//        }
//    }
//}

// public class EventDispatcher {
//    private List<ISystem> eventHandlers = new ArrayList<>();     //FIFO queue
//    public void register(ISystem system){
//        eventHandlers.add(system);
//    }
//    public void deregister(ISystem system){
//        eventHandlers.remove(system);
//    }
//    public void handleEvent(String msg){
//        for(ISystem system : eventHandlers){
//            system.handleEvent(msg);
//        }
//    }
//}

