package org.ex.spring.address.component;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Pets {
    private List<Pet> list = new ArrayList<>();

    public Pets(Pet cat, Pet dog) {
       // Pet cat = new Pet();
        cat.setKind("Cat");
        cat.setName("Merry");
        list.add(cat);

       // Pet dog = new Pet();
        dog.setKind("Dog");
        dog.setName("Jerry");
        list.add(dog);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}