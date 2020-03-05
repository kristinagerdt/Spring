package com.gerdt.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());
        context.close();
    }
}