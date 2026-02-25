package org.example.factory;

public class ConsoleProcessor implements  IProcessor{
    @Override
    public void process(Task t) {
        System.out.println("Sending task to console:" + t);
    }
}
