package org.ex.spring.musicPlayer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.ex.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}