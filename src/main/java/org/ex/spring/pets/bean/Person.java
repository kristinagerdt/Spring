package org.ex.spring.pets.bean;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Person {
    @Value("Alex")
    private String firstName;
    @Value("Smith")
    private String lastName;
    @Value("32")
    private int age;
    private List<Animal> animals;

    public Person(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Person{" + firstName + " " + lastName + ", " + age + " years old, animals=" + animals + '}';
    }
}