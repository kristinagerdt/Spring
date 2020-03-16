package org.ex.spring.pet.component;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.ex.spring.pet.component")
@PropertySource("classpath:pet.properties")
public class SpringConfig {
}