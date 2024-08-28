package com.abir.asho_spring_shikhi.advancedSpringFeatures;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class someClass{
    private someDependency someDependency;

    public someClass(someDependency someDependency){
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are injected");
    }


    /*
    After someClass is instantiated and its dependency someDependency is injected,
    the init() method is automatically called by Spring due to the @PostConstruct annotation.
    Inside init(), the getReady() method of someDependency is called, printing "Dependency is ready"
    to the console.
     */
    @PostConstruct
    public void init(){
        someDependency.getReady();
    }


    /*
    The @PreDestroy annotation is used to mark a method that should be executed just before a bean is destroyed,
    which typically happens when the application context is being closed or the bean is being removed from the context.
     */
    @PreDestroy
    public void cleanup(){
        System.out.println("Clean Up");
    }

}

@Component
class someDependency{

    public void getReady(){
        System.out.println("Dependency is ready");
    }

}



@Configuration
@ComponentScan
public class PostConstructandPreDestroy {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(PostConstructandPreDestroy.class);
        context.close(); //closes the context to call the cleanup method
    }
}

/*
f the @PostConstruct annotation is not present:
The init() method in someClass would not be automatically invoked after the dependencies are injected.
As a result, the getReady() method of someDependency would not be called, and "Dependency is ready"
would not be printed to the console.
 */
