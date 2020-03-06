package com.gerdt.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        int index = (int) (Math.random() * 3);
        return getName() + ", volume " + getVolume() + "\nPlaying: " + musicList.get(index).getSong();
    }
}