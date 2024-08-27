package com.abir.asho_spring_shikhi.gameUsingSpring;

import com.abir.asho_spring_shikhi.game.GamingConsole;
import com.abir.asho_spring_shikhi.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    /*
    These methods are annotated with @Bean,
    indicating that Spring should treat the return values of these methods
    as beans managed by the Spring container.
     */


    /*GamingConsole is needed in AnnotationConfigApplicationContext.
    Spring registers this instance as a bean in the context with the name game.
     */
    @Bean
    public GamingConsole game(){
        return new PacmanGame();
    }

    //GameRunner is needed in AnnotationConfigApplicationContext
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

}
