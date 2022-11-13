package org.example.designpatterns.observerpattern;

public interface Publisher {
    static void printMessage() {
        System.out.println("Hi");
    }
    void publish(String content);
    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
}

// why do we need interfaces
// strategy design pattern
// cyclic dependency get resolved
// chat group for observer pattern

