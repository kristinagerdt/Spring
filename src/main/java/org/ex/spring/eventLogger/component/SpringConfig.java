package org.ex.spring.eventLogger.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.format.DateTimeFormatter;

@Configuration
@ComponentScan("org.ex.spring.eventLogger.component")
public class SpringConfig {
    @Bean
    public DateTimeFormatter formatter() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }
}