package com.gerdt.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        for (int i = 0; i < 5; i++) {
            System.out.println("-- " + (i + 1) + " --");
            musicPlayer.playMusic(MusicGenre.ROCK);
            musicPlayer.playMusic(MusicGenre.CLASSICAL);
        }
        context.close();
    }
}