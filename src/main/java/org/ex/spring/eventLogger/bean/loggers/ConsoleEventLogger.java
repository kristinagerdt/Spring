package org.ex.spring.eventLogger.bean.loggers;

import org.ex.spring.eventLogger.bean.Event;

public class ConsoleEventLogger implements EventLogger {
    @Override
    public void logEvent(Event event) {
        System.out.println(event);
    }
}