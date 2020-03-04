package com.gerdt.springcourse;

public class MusicPlayer {
    private Music music;
    private String name;
    private int Volume;

    // Inversion of Control (IoC)
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music = music;
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
        System.out.println("Playing: " + music.getSong());
    }
}