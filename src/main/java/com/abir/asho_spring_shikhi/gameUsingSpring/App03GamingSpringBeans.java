package com.abir.asho_spring_shikhi.gameUsingSpring;

import com.abir.asho_spring_shikhi.gameUsingSpring.GameRunner;
import com.abir.asho_spring_shikhi.game.PacmanGame;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App03GamingSpringBeans {

        public static void main(String[] args) {
            /*
            The AnnotationConfigApplicationContext in the next line is
            used to create the Spring context, passing GamingConfiguration.class as the configuration class.
            Spring scans the GamingConfiguration class for bean definitions and registers the beans
            (game and gameRunner) in the context.
             */
            var context =
                    new AnnotationConfigApplicationContext(GamingConfiguration.class);

            /*
            context.getBean(GameRunner.class) retrieves the GameRunner bean from the Spring context.
            Since GameRunner depends on GamingConsole, Spring automatically injects the GamingConsole
            bean (PacmanGame in this case) into GameRunner.
             */
            context.getBean(GameRunner.class).run();

        }
}


/*
How Spring Handles It:

1. Configuration Class Scanning:
When the Spring context is initialized, Spring scans the GamingConfiguration class for any methods annotated with @Bean.
It finds the game() and gameRunner(GamingConsole game) methods and registers the returned objects as beans.

2. Bean Creation and Dependency Injection:
Spring first creates the GamingConsole bean by calling the game() method, which returns a PacmanGame instance.
Next, when creating the GameRunner bean, Spring automatically injects the GamingConsole bean (PacmanGame) into the gameRunner(GamingConsole game) method.

3. Bean Retrieval and Execution:
When context.getBean(GameRunner.class) is called, Spring returns the GameRunner bean from its container.
The run() method of GameRunner is then executed, using the injected GamingConsole (PacmanGame) to perform its tasks.
 */

/*
GamingConsole interface is implemented by PacmanGame.
GameRunner is dependent on GamingConsole. Because it has member variable of GamingConsole type.
So, we need to create GamingConsole bean first.
Then we can create GameRunner bean.
Then we can run the game.
 */