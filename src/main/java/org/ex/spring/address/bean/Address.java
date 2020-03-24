package org.ex.spring.address.bean;

import org.springframework.beans.factory.annotation.Value;

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