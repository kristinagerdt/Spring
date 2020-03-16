package org.ex.spring.pet.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Person {
    @Value("Alex")
    private String firstName;
    @Value("Smith")
    private String lastName;
    @Value("32")
    private int age;
    private List<Animal> animals;

    @Autowired
    public Person(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Person{" + firstName + "" + lastName + ", " + age + " years old, animals=" + animals + '}';
    }
}

//    @Autowired
//    public Person(Cat cat, Dog dog1, Dog dog2) {
//        animals = new ArrayList<>(Arrays.asList(cat, dog1, dog2));
//    }

//    @Autowired
//    public Person(@Qualifier("cat") Animal cat, @Qualifier("dog") Animal dog1, @Qualifier("dog") Animal dog2) {
//        animals = new ArrayList<>(Arrays.asList(cat, dog1, dog2));
//    }