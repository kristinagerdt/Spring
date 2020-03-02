package com.gerdt.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
        context.close();
    }
}

// I - Spring does:
// 1. Music classicalMusic = new ClassicalMusic();
// 2. MusicPlayer musicPlayer = new MusicPlayer();
// 3. musicPlayer.setMusic(classicalMusic);

// II - Spring does:
// 1. Music classicalMusic = new ClassicalMusic();
// 2. MusicPlayer musicPlayer = new MusicPlayer();
// 3. musicPlayer.setMusic(classicalMusic);
// 4. musicPlayer.setName("Cool player");
// 5. musicPlayer.setVolume(50);
