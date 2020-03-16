package org.ex.spring.pet.bean;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cat implements Animal {
    @Value("${cat.name}")
    private String name;

    @Override
    public String getKind() {
        return Cat.class.getSimpleName();
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