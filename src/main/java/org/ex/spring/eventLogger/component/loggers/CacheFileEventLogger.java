package org.ex.spring.eventLogger.component.loggers;

import org.ex.spring.eventLogger.component.Event;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class CacheFileEventLogger extends FileEventLogger {
    @Value("1")
    private int cacheSize;
    private List<Event> cache;

    @PostConstruct
    public void initCache() {
        this.cache = new ArrayList<>(cacheSize);
    }

    @PreDestroy
    public void destroy() {
        if (!cache.isEmpty()) {
            writeEventsFromCache();
        }
    }

    @Override
    public void logEvent(Event event) {
        cache.add(event);
        if (cache.size() == cacheSize) {
            writeEventsFromCache();
            cache.clear();
        }
    }

    private void writeEventsFromCache() {
        cache.forEach(super::logEvent);
    }
}