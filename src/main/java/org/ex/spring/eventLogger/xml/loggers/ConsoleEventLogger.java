package org.ex.spring.eventLogger.xml.loggers;

import org.ex.spring.eventLogger.xml.Event;

public class ConsoleEventLogger implements EventLogger {
    @Override
    public void logEvent(Event event) {
        System.out.println(event);
    }
}