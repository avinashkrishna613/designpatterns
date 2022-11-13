package org.example.designpatterns.observerpattern;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Blogger implements Publisher{

    private String name;
    private Set<Observer> observerList;
    private List<String> contentPosted;

    public Blogger(String name) {
        this.name = name;
        observerList = new HashSet<Observer>();
        contentPosted = new LinkedList<String>();
    }

    private void printLatest() {
        int size = contentPosted.size();
        if (size <= 0) {
            System.out.println("No content to display yet");
        } else {
            System.out.println(contentPosted.get(size-1));
        }
    }

    @Override
    public void publish(String content) {
        System.out.println("Publishing content");
        contentPosted.add(content);
        printLatest();
        notifySubscribers(content);
    }

    private void notifySubscribers(String content) {
        observerList.stream().forEach(observer -> {
            observer.inform(content);
        });
    }

    @Override
    public void subscribe(Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void unSubscribe(Observer observer) {
        observerList.remove(observer);
    }
}
