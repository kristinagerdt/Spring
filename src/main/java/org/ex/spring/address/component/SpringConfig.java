package org.ex.spring.address.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:address.properties")
@ComponentScan("org.ex.spring.address.component")
public class SpringConfig {
}