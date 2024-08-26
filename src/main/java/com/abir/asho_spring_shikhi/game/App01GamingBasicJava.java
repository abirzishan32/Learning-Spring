package com.abir.asho_spring_shikhi.game;

import com.abir.asho_spring_shikhi.game.GameRunner;
import com.abir.asho_spring_shikhi.game.PacmanGame;

public class App01GamingBasicJava {

        public static void main(String[] args) {
//            var game = new MarioGame();
            var game = new PacmanGame();
            var gameRunner = new GameRunner(game);
            gameRunner.run();
        }
}
