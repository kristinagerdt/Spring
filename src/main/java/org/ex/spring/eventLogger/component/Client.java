package org.ex.spring.eventLogger.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Client {
    @Value("1")
    private String id;
    @Value("John Smith")
    private String fullName;
    @Value("Hello there!")
    private String greeting;

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGreeting() {
        return greeting;
    }
}