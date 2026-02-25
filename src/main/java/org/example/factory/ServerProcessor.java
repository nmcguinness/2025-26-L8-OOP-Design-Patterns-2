package org.example.factory;

public class ServerProcessor implements IProcessor{
    @Override
    public void process(Task t) {
        System.out.println("Sending task to server: " + t);
    }
}
