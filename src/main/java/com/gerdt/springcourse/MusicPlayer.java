package com.gerdt.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music rockMusic;
    private Music classicalMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        return "Playing:\n" + rockMusic.getSong() + "\n" + classicalMusic.getSong();
    }
}