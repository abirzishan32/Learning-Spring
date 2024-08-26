package com.abir.asho_spring_shikhi.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age) { }

@Configuration // This is a configuration class. It tells Spring that this class contains bean configurations
public class HelloWordConfiguration {

    @Bean // This is a bean configuration method. It tells Spring that this method returns a bean
    public String name(){
        return "Abir";
    }

    @Bean // This is a bean configuration method. It tells Spring that this method returns a bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Abir", 15);
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age());
    }

}
