package com.abir.asho_spring_shikhi.gameUsingSpring;

import com.abir.asho_spring_shikhi.game.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration //indicates that this class contains bean definitions.
@ComponentScan("com.abir.asho_spring_shikhi.gameUsingSpring") /*  tells Spring to scan the specified package for any classes
                                                                annotated with @Component, @Service, @Repository, etc. */
public class App03GamingSpringBeans {

    @Bean
    public GameRunner gameRunner( GamingConsole game) {  /*The method parameter 'GamingConsole game' tells Spring to inject the GamingConsole bean
                                                        (which is implemented by PacmanGame) into the GameRunner constructor. */
        System.out.println("Parameter : " + game);
        return new GameRunner(game);
    }


    public static void main(String[] args) {
            /*
            The AnnotationConfigApplicationContext in the next line is
            used to create the Spring context, passing GamingConfiguration.class as the configuration class.
            Spring scans the GamingConfiguration class for bean definitions and registers the beans
            (game and gameRunner) in the context.
             */
            var context =
                    new AnnotationConfigApplicationContext(App03GamingSpringBeans.class);

            /*
            context.getBean(GameRunner.class) retrieves the GameRunner bean from the Spring context.
            Since GameRunner depends on GamingConsole, Spring automatically injects the GamingConsole
            bean (PacmanGame in this case) into GameRunner.
             */
            context.getBean(GameRunner.class).run();

        }
}


/*
Behind the Scenes: How Spring Handles This

1.Component Scanning:
When Spring starts up (via AnnotationConfigApplicationContext), it scans the package specified in @ComponentScan.
It looks for classes annotated with @Component, @Service, @Repository, or @Controller. When it finds PacmanGame, it registers this class as a bean in the application context.

2. Bean Creation:
Spring then creates an instance of the PacmanGame class. This happens during the context initialization, even before any beans are explicitly requested.
The PacmanGame bean is stored in the application context, a central container that manages all beans.

3. Dependency Injection:
When you define a method like gameRunner(GamingConsole game) in the configuration class, Spring sees that the gameRunner bean needs a GamingConsole bean.
Spring checks its context, finds the PacmanGame bean (since it implements GamingConsole), and injects it into the GameRunner constructor.

4.Lifecycle Management:
Spring manages the lifecycle of the beans. When the context is initialized, Spring creates all the necessary beans (like PacmanGame and GameRunner).
When the context is closed, Spring will also destroy the beans if necessary, handling any cleanup or resource management.
 */





