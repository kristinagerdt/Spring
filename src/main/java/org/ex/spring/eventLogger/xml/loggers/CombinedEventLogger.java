package org.ex.spring.eventLogger.xml.loggers;

import org.ex.spring.eventLogger.xml.Event;

import java.util.List;

public class CombinedEventLogger implements EventLogger {
    private List<EventLogger> eventLoggers;

    public CombinedEventLogger(List<EventLogger> eventLoggers) {
        this.eventLoggers = eventLoggers;
    }

    @Override
    public void logEvent(Event event) {
        eventLoggers.forEach(eventLogger -> eventLogger.logEvent(event));
    }
}