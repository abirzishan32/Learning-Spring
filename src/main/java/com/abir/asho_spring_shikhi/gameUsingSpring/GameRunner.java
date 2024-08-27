package com.abir.asho_spring_shikhi.gameUsingSpring;

import com.abir.asho_spring_shikhi.game.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(@Qualifier("superContra") GamingConsole game) {
        this.game = game;
    }


    public void run() {
        System.out.println("Game is running : " + game);
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
