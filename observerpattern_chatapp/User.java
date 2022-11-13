package org.example.designpatterns.observerpattern_chatapp;

import java.util.ArrayList;
import java.util.List;

public class User implements IUser{

    private String name;
    private List<Event> eventList;
    private boolean onLine;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User(String name) {
        this.name = name;
        this.eventList = new ArrayList<>();
    }

    @Override
    public Event sendEvents(Subject groupName, String message) {
        Event event = new Event(this, message);
        groupName.receiveEvents(event);
        return event;
    }

    @Override
    public void getNotified(Event event) {
        if (!eventList.contains(event)) {
            eventList.add(event);
        }
        System.out.println(this);
        printNotification(event);
    }

    private void printNotification(Event event) {
        System.out.println("Got notification from user :" + event.getEventSource()
                + " and content is : " + event.getMessage());
    }

    @Override
    public void printAllNotifications() {
        System.out.println(this);
        for (Event event: eventList) {
            printNotification(event);
        }
        return;
    }
}
