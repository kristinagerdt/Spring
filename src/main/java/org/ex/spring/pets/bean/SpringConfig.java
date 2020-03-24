package org.ex.spring.pets.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:pets.properties")
public class SpringConfig {
    // first cat
    @Bean
    public Cat catBella() {
        return new Cat();
    }

    // first dog
    @Value("Charlie")
    private String dogName;

    @Bean
    public Dog dogCharlie() {
        return new Dog(dogName);
    }

    // second dog
    @Bean
    public String dogName() {
        return "Max";
    }

    @Bean
    public Dog dogMax() {
        return new Dog(dogName());
    }

    // third dog
    @Bean
    public Dog dogJerry() {
        Dog dog = new Dog();
        dog.setName("Jerry");
        return dog;
    }

    @Bean
    public List<Animal> animals() {
        return new ArrayList<>(Arrays.asList(catBella(), dogCharlie(), dogMax(), dogJerry()));
    }

    @Bean
    public Person person() {
        return new Person(animals());
    }
}