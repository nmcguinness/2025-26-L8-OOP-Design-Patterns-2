package org.example.factory;

enum ProcessorType {Console, Server, Disk};

public class ProcessorFactory {
    public static IProcessor create(ProcessorType type) {

        //why use a switch?
        switch (type)
        {
            case ProcessorType.Console: return new ConsoleProcessor();
            case ProcessorType.Server: return new ServerProcessor();
            default: return null;
        }

        /*
        //why not use an if...else?
        if(type == 1)
            return new ConsoleProcessor();
        else if(type == 2)
            return new ServerProcessor();
        else
            return null;
        */
    }
}
