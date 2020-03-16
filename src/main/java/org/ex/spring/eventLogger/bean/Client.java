package org.ex.spring.eventLogger.bean;

import org.springframework.beans.factory.annotation.Value;

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