package org.ex.spring.eventLogger.bean.loggers;

import org.ex.spring.eventLogger.bean.Event;

public interface EventLogger {
    void logEvent(Event event);
}