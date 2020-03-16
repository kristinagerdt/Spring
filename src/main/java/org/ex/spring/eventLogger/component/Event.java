package org.ex.spring.eventLogger.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Scope("prototype")
public class Event {
    private int id;
    private String message;
    //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime dateTime;
    private DateTimeFormatter formatter;

    public Event(@Qualifier("formatter") DateTimeFormatter formatter) {
        this.id = (int) (Math.random() * 10 + 1);
        this.dateTime = LocalDateTime.now();
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