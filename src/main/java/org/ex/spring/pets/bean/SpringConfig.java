package org.ex.spring.pets.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:value.properties")
public class SpringConfig {
    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Dog dog1() {
        return new Dog("Charlie");
    }

    @Bean
    public Dog dog2() {
        Dog dog = new Dog();
        dog.setName("Max");
        return dog;
    }

    @Bean
    public List<Animal> animals() {
        return new ArrayList<>(Arrays.asList(cat(), dog1(), dog2()));
    }

    @Bean
    public Person person() {
        return new Person(animals());
    }
}