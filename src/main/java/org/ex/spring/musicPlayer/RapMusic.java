package org.ex.spring.musicPlayer;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Lose yourself - Eminem";
    }
}