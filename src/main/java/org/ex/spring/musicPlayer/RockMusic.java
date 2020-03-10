package org.ex.spring.musicPlayer;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Paranoid - Black Sabbath";
    }
}