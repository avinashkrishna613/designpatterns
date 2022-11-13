package org.example.designpatterns.observerpattern;

public interface Observer {
    void inform(String content);
    void subscribe(Publisher publisher);
    void getFeed();
}
