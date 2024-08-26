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
