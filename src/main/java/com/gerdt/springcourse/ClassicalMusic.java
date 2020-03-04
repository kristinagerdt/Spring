package com.gerdt.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classic - Hungarian Rhapsody";
    }
}