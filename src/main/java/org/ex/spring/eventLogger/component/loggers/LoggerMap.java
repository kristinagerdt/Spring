package org.ex.spring.eventLogger.component.loggers;

import org.ex.spring.eventLogger.component.EventType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class LoggerMap {
    private Map<EventType, EventLogger> map = new HashMap<>();

    public LoggerMap(ConsoleEventLogger consoleEventLogger, FileEventLogger fileEventLogger) {
        map.put(EventType.INFO, consoleEventLogger);
        map.put(EventType.ERROR, fileEventLogger);
    }

    public Map<EventType, EventLogger> getMap() {
        return map;
    }
}