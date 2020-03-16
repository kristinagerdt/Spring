package org.ex.spring.pet.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
        context.close();
    }
}