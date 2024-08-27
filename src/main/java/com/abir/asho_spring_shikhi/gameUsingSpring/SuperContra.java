package com.abir.asho_spring_shikhi.gameUsingSpring;

import com.abir.asho_spring_shikhi.game.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContra")
public class SuperContra implements GamingConsole {
    public void up() {
        System.out.println("Jump High");
    }

    public void down() {
        System.out.println("Go into the home");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Shoot a bullet");
    }
}
