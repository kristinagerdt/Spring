package org.ex.spring.eventLogger.bean;

import org.ex.spring.eventLogger.bean.loggers.CacheFileEventLogger;
import org.ex.spring.eventLogger.bean.loggers.ConsoleEventLogger;
import org.ex.spring.eventLogger.bean.loggers.EventLogger;
import org.ex.spring.eventLogger.bean.loggers.FileEventLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class SpringConfig {
    @Bean
    public Client client() {
        return new Client();
    }

    @Bean
    public LocalDateTime dateTime() {
        return LocalDateTime.now();
    }

    @Bean
    public DateTimeFormatter formatter() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    @Bean
    @Scope("prototype")
    public Event event() {
        return new Event(dateTime(), formatter());
    }

    @Bean
    public ConsoleEventLogger consoleEventLogger() {
        return new ConsoleEventLogger();
    }

    @Bean
    public FileEventLogger fileEventLogger() {
        return new FileEventLogger();
    }

    @Bean
    public CacheFileEventLogger cacheFileEventLogger() {
        return new CacheFileEventLogger();
    }

    @Bean
    public Map<EventType, EventLogger> loggerMap() {
        Map<EventType, EventLogger> map = new HashMap<>();
        map.put(EventType.INFO, consoleEventLogger());
        map.put(EventType.ERROR, fileEventLogger());
        return map;
    }

    @Bean
    public App app() {
        return new App(client(), cacheFileEventLogger(), loggerMap());
    }
}