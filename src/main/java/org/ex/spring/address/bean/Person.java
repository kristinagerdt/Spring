package org.ex.spring.address.bean;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Person {
    @Value("${person.firstName}")
    private String firstName;
    @Value("${person.lastName}")
    private String lastName;
    @Value("${person.age}")
    private int age;
    private Address address;
    private List<Pet> pets;

    public Person(Address address, List<Pet> pets) {
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