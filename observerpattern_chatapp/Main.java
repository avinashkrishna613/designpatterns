package org.example.designpatterns.observerpattern_chatapp;

public class Main {
    public static void main(String[] args) {
        ChatGroup group = new ChatGroup("Group 1");
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Mary");

        group.addToGroup(user1);
        group.addToGroup(user2);
        group.addToGroup(user3);

        user1.sendEvents(group, "Hi");
    }
}
