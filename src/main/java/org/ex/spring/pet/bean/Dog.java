package org.ex.spring.pet.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog implements Animal {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getKind() {
        return Dog.class.getSimpleName();
    }

    @Override
    public String toString() {
        return getKind() + "{name=" + name + '}';
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println(getKind() + " init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println(getKind() + " destroy");
    }
}