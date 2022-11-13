package org.example.designpatterns.observerpattern_chatapp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChatGroup implements Subject{

    private UUID groupId;
    private String groupName;
    private List<IUser> members;
    private List<Event> events;

    public ChatGroup(String groupName) {
        this.groupId = UUID.randomUUID();
        this.groupName = groupName;
        this.members = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ChatGroup{" +
                "groupName='" + groupName + '\'' +
                '}';
    }

    @Override
    public void addToGroup(IUser observer) {
        if (!members.contains(observer)) {
            members.add(observer);
        }
        return;
    }

    @Override
    public void removeFromGroup(IUser observer) {
        members.remove(observer);
        return;
    }

    @Override
    public void receiveEvents(Event event) {
        events.add(event);
        System.out.println("Group : " + this.groupName+ " got new message " + event.getMessage());
        for (IUser observer: members) {
            observer.getNotified(event);
        }
        return;
    }
}
