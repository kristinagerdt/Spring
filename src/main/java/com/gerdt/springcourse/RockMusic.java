package com.gerdt.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rockMusic")
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    public RockMusic() {
        songs.add("Paranoid - Black Sabbath");
        songs.add("Highway Star - Deep Purple");
        songs.add("Enter Sandman - Metallica");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}