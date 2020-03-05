package com.gerdt.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(MusicGenre musicGenre) {
        int index = (int) (Math.random() * 3); //0-2
        if (musicGenre == MusicGenre.ROCK) {
            System.out.println(rockMusic.getSong().get(index));
        } else if (musicGenre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(index));
        }
    }
}