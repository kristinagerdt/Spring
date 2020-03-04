package com.gerdt.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Music rockMusic = context.getBean("rockMusic", RockMusic.class);
        Music classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        Music rapMusic = context.getBean("rapMusic", RapMusic.class);

        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
        rockMusicPlayer.playMusic();

        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
        classicalMusicPlayer.playMusic();

        MusicPlayer rapMusicPlayer = new MusicPlayer(rapMusic);
        rapMusicPlayer.playMusic();

        context.close();
    }
}