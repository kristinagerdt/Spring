package org.ex.spring.eventLogger.component.loggers;

import org.ex.spring.eventLogger.component.Event;

public interface EventLogger {
    void logEvent(Event event);
}