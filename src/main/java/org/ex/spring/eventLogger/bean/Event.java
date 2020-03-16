package org.ex.spring.eventLogger.bean;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
    private int id;
    private String message;
    private LocalDateTime dateTime;
    private DateTimeFormatter formatter;

    public Event(LocalDateTime dateTime, DateTimeFormatter formatter) {
        this.id = (int) (Math.random() * 10 + 1);
        this.dateTime = dateTime;
        this.formatter = formatter;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Event{id=" + id + ", message=" + message + ", date=" + formatter.format(dateTime) + '}';
    }
}