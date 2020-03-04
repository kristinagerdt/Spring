package com.gerdt.springcourse;

import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock - Wind cries Mary";
    }
}