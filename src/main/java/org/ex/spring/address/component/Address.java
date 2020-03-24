package org.ex.spring.address.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${address.street}")
    private String street;
    @Value("${address.houseNumber}")
    private int houseNumber;

    @Override
    public String toString() {
        return houseNumber + " " + street + " street";
    }
}