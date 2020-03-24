package org.ex.spring.address.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppComponent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        context.close();
    }
}