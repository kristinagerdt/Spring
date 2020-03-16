package org.ex.spring.pet.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
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