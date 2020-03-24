package org.ex.spring.address.xml;

public class Pet {
    private String kind;
    private String name;

    public Pet(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    @Override
    public String toString() {
        return kind + " " + name;
    }
}