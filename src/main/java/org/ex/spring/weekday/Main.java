package org.ex.spring.weekday;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("Today is " + weekDay.getWeekDayName());
    }
}