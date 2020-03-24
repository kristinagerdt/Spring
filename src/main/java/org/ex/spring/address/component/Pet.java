package org.ex.spring.address.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pet {
    private String kind;
    private String name;

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return kind + " " + name;
    }
}