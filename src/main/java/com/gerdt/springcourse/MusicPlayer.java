package com.gerdt.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Playing:\n" + classicalMusic.getSong() + "\n" + rockMusic.getSong();
    }
}

//@Component
//public class MusicPlayer {
//    private ClassicalMusic classicalMusic;
//
//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;
//    }
//}

//@Component
//public class MusicPlayer {
//    private Music music;
//
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//}

//@Component - NOT Recommended
//public class MusicPlayer {
//    @Autowired
//    private Music music;
//}