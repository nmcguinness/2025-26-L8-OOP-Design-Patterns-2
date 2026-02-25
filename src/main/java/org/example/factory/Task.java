package org.example.factory;

public class Task {
    private static long startID = 0;

    private long id;
    private String description;
    //more parameters go here...

    public Task(String description)
    {
        this.id = ++startID;
        this.description = description;
    }

    public static long getStartID() {
        return startID;
    }

    public static void setStartID(long startID) {
        Task.startID = startID;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "{" + id + "," + description + '}';
    }
}
