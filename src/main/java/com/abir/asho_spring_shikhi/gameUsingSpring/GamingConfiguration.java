package com.abir.asho_spring_shikhi.gameUsingSpring;

import com.abir.asho_spring_shikhi.game.GamingConsole;
import com.abir.asho_spring_shikhi.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

}
