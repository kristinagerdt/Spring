package org.ex.spring.eventLogger.xml;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Event {
    private int id;
    private String message;
    private LocalDate date;
    private DateTimeFormatter formatter;

    public Event(LocalDate date, DateTimeFormatter formatter) {
        this.date = date;
        this.formatter = formatter;
        this.id = (int) (Math.random() * 10 + 1); //1-10
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static boolean isDay(int start, int end) {
        LocalTime time = LocalTime.now();
        return time.getHour() > start && time.getHour() < end;
    }

    @Override
    public String toString() {
        return "Event{id=" + id + ", message=" + message + ", date=" + formatter.format(date) + '}';
    }
}