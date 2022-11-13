package org.example.designpatterns.observerpattern;

import java.util.LinkedList;
import java.util.List;

public class Follower implements Observer{
    String name;
    List<String> feed;

    Follower(String name) {
        this.name = name;
        feed = new LinkedList<>();
    }

    @Override
    public void inform(String content) {
        System.out.println("Got a notification : " + name);
        feed.add(content);
    }

    @Override
    public void subscribe(Publisher publisher) {
        publisher.subscribe(this);
    }

    @Override
    public void getFeed() {
        System.out.println("Getting feed for : " + name);
        feed.stream().forEach(System.out::println);
    }
}
