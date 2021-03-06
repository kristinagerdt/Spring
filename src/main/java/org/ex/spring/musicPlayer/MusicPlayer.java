package org.ex.spring.musicPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
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
        StringBuilder result = new StringBuilder();
        result.append(getName()).append(", volume ").append(getVolume());
        for (Music music : musicList) {
            result.append("\nPlaying: ").append(music.getSong());
        }
        return result.toString();
    }
}