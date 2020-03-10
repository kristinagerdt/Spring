package org.ex.spring.pets.component;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.ex.spring.pets.component")
@PropertySource("classpath:value.properties")
public class SpringConfig {
}