package org.ex.spring.address.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("${person.firstName}")
    private String firstName;
    @Value("${person.lastName}")
    private String lastName;
    @Value("${person.age}")
    private int age;
    private Address address;
    private Pets pets;

    public Person(Address address, Pets pets) {
        this.address = address;
        this.pets = pets;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Person{" + getFullName() + ", age: " + age + ", address: " + address + ", pets: " + pets + '}';
    }
}