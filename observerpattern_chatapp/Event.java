package org.example.designpatterns.observerpattern_chatapp;

public class Event {
    private IUser eventSource;
    private String message;

    public IUser getEventSource() {
        return eventSource;
    }

    public void setEventSource(IUser eventSource) {
        this.eventSource = eventSource;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Event(IUser eventSource, String message) {
        this.eventSource = eventSource;
        this.message = message;
    }
}
