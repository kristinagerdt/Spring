package org.ex.spring.eventLogger.component;

import org.ex.spring.eventLogger.component.loggers.CacheFileEventLogger;
import org.ex.spring.eventLogger.component.loggers.EventLogger;
import org.ex.spring.eventLogger.component.loggers.LoggerMap;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {
    private Client client;
    private CacheFileEventLogger defaultEventLogger;
    private LoggerMap loggerMap;

    public App(Client client, CacheFileEventLogger defaultEventLogger, LoggerMap loggerMap) {
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
        EventLogger eventLogger = loggerMap.getMap().get(eventType);
        String message = "";
        if (eventType == EventType.INFO) {
            message = "ConsoleEventLogger: First event";
        } else if (eventType == EventType.ERROR) {
            message = "FileEventLogger: Second event";
        } else if (eventType == null) {
            message = "CacheEventLogger: Third event";
            eventLogger = defaultEventLogger;
        }
        event.setMessage(message);
        eventLogger.logEvent(event);
    }
}