package org.ex.spring.eventLogger.xml;

import org.ex.spring.eventLogger.xml.loggers.EventLogger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class App {
    private Client client;
    private EventLogger defaultEventLogger;
    private Map<EventType, EventLogger> loggerMap;

    public App(Client client, EventLogger defaultEventLogger, Map<EventType, EventLogger> loggerMap) {
        this.client = client;
        this.defaultEventLogger = defaultEventLogger;
        this.loggerMap = loggerMap;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        App app = context.getBean(App.class);
        Client client = context.getBean(Client.class);
        System.out.println("Client " + client.getFullName() + " says: " + client.getGreeting());

        Event event = context.getBean(Event.class);
        app.logEvent(EventType.INFO, event, "ConsoleEventLogger: Some event for 1");

        event = context.getBean(Event.class);
        app.logEvent(EventType.ERROR, event, "Console and FileEventLogger: Some event for 2");

        event = context.getBean(Event.class);
        app.logEvent(null, event, "Cache or ConsoleEventLogger: Some event for 3");

        context.close();
    }

    private void logEvent(EventType eventType, Event event, String input) {
        String message = input.replaceAll(client.getId(), client.getFullName());
        event.setMessage(message);

        EventLogger eventLogger = loggerMap.get(eventType);
        if (eventLogger == null) {
            eventLogger = defaultEventLogger;
        }
        eventLogger.logEvent(event);
    }
}