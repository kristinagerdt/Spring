package com.gerdt.springcourse;

public class ClassicalMusic implements Music {
    // private constructor
    private ClassicalMusic() {
    }

    // factory method
    public static ClassicalMusic getInstance() {
        return new ClassicalMusic(); // Spring creates ONLY ONE object/bean despite on "new" keyword, if scope=singleton
    }

    @Override
    public String getSong() {
        return "Classic - Hungarian Rhapsody";
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}