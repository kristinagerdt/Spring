package org.ex.spring.address.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:address.properties")
public class SpringConfig {
    // first cat
    @Value("${pet.kind}")
    private String petKind;

    @Value("${pet.name}")
    private String petName;

    @Bean
    public Pet catMerry() {
        return new Pet(petKind, petName);
    }

    // second cat
    @Bean
    public String petKind() {
        return "Cat";
    }

    @Bean
    public String petName() {
        return "Perry";
    }

    @Bean
    public Pet catPerry() {
        return new Pet(petKind(), petName());
    }

    // first dog
    @Bean
    public Pet dogJerry() {
        return new Pet("Dog", "Jerry");
    }

    @Bean
    public Pet dogGerry() {
        return new Pet("Dog", "Gerry");
    }

    @Bean
    public List<Pet> pets() {
        return Arrays.asList(catMerry(), catPerry(), dogJerry(), dogGerry());
    }

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Person person() {
        return new Person(address(), pets());
    }
}