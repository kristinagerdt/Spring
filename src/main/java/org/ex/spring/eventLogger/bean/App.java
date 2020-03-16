package org.ex.spring.eventLogger.bean;

import org.ex.spring.eventLogger.bean.loggers.CacheFileEventLogger;
import org.ex.spring.eventLogger.bean.loggers.EventLogger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class App {
    private Client client;
    private CacheFileEventLogger defaultEventLogger;
    private Map<EventType, EventLogger> loggerMap;

    public App(Client client, CacheFileEventLogger defaultEventLogger, Map<EventType, EventLogger> loggerMap) {
        this.client = client;
        this.defaultEventLogger = defaultEventLogger;
        this.loggerMap = loggerMap;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        App app = context.getBean(App.class);

        Client client = context.getBean(Client.class);
        System.out.println("Client " + client.getFullName() + " says: " + client.getGreeting());

        Event event = context.getBean(Event.class);
        app.logEvent(EventType.INFO, event);

        event = context.getBean(Event.class);
        app.logEvent(EventType.ERROR, event);

        event = context.getBean(Event.class);
        app.logEvent(null, event);
        context.close();
    }

    private void logEvent(EventType eventType, Event event) {
        EventLogger eventLogger = loggerMap.get(eventType);
        String message = "";
        if (eventType == EventType.INFO) {
            message = "ConsoleLoggerEvent: First event";
        } else if (eventType == EventType.ERROR) {
            message = "FileLoggerEvent: Second event";
        } else if (eventType == null) {
            message = "CacheLoggerEvent: Third event";
            eventLogger = defaultEventLogger;
        }
        event.setMessage(message);
        eventLogger.logEvent(event);
    }
}