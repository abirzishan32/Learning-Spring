package com.abir.asho_spring_shikhi.gameUsingSpring;

import com.abir.asho_spring_shikhi.game.GamingConsole;
import org.springframework.stereotype.Component;

@Component /*
                * This annotation tells Spring that this class is a bean. Spring will automatically create an instance of this
                * class and register it as a bean in the application context.
                */
public class PacmanGame implements GamingConsole {

    public void up() {
        System.out.println("Move up");
    }

    public void down() {
        System.out.println("Move down");
    }

    public void left() {
        System.out.println("Move left");
    }

    public void right() {
        System.out.println("Move right");
    }
}
