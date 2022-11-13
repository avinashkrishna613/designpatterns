package org.example.designpatterns.observerpattern;

public class Main {
    public static void main(String[] args) {
        Blogger blogger = new Blogger("Max");
        Follower follower = new Follower("f1");
        Follower follower1 = new Follower("f2");

        follower.subscribe(blogger);
        follower1.subscribe(blogger);

        blogger.publish("My first post");

        follower.getFeed();
        follower1.getFeed();
    }
}
