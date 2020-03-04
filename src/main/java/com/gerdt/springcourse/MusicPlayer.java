package com.gerdt.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int Volume;

    // Inversion of Control (IoC)
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    public void playMusic() {
        musicList.forEach(m -> System.out.println("Playing: " + m.getSong()));
    }

    public void doMyInit() {
        System.out.println("Doing my initialization: MusicPlayer");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction: MusicPlayer");
    }
}