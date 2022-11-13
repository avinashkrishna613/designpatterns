package org.example.designpatterns.observerpattern_chatapp;

public interface Subject {
    public void addToGroup(IUser observer);
    public void removeFromGroup(IUser observer);
    public void receiveEvents(Event event);
}
