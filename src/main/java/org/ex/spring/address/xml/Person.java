package org.ex.spring.address.xml;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private List<Pet> pets;

    public Person(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
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