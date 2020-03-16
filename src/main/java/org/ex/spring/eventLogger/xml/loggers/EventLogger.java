package org.ex.spring.eventLogger.xml.loggers;

import org.ex.spring.eventLogger.xml.Event;

public interface EventLogger {
    void logEvent(Event event);
}