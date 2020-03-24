package org.ex.spring.address.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextAddress.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        context.close();
    }
}