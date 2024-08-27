package com.abir.asho_spring_shikhi.gameUsingSpring;

import com.abir.asho_spring_shikhi.gameUsingSpring.GameRunner;
import com.abir.asho_spring_shikhi.game.PacmanGame;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App03GamingSpringBeans {

        public static void main(String[] args) {
            var context =
                    new AnnotationConfigApplicationContext(GamingConfiguration.class);

            context.getBean(GameRunner.class).run();

        }
}

/*
GamingConsole interface is implemented by PacmanGame.
GameRunner is dependent on GamingConsole. Because it has member variable of GamingConsole type.
So, we need to create GamingConsole bean first.
Then we can create GameRunner bean.
Then we can run the game.
 */