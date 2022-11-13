package org.example.designpatterns.observerpattern_chatapp;

// change it to IUser
public interface IUser {
    public Event sendEvents(Subject groupName, String message);
    public void getNotified(Event event);
    public void printAllNotifications();

}
