package org.ex.spring.pets.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Dog implements Animal {
    @Value("Charlie")
    private String name;

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