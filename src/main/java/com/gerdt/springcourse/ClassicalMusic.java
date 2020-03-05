package com.gerdt.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    // Instance initialization block
    {
        songs.add("Hungarian Dance - Johannes Brahms");
        songs.add("The Four Seasons - Antonio Vivaldi");
        songs.add("Ride of the Valkyries - Richard Wagner");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}