package org.ex.spring.eventLogger.component.loggers;

import org.ex.spring.eventLogger.component.Event;
import org.springframework.stereotype.Component;

@Component
public class ConsoleEventLogger implements EventLogger {
    @Override
    public void logEvent(Event event) {
        System.out.println(event);
    }
}