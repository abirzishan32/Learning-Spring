package com.abir.asho_spring_shikhi.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

        public static void main(String[] args) {
            //1: Launch spring context

                var context =
                        new AnnotationConfigApplicationContext(HelloWordConfiguration.class);
            //2: Configure the things that we want Spring to manage - @Configuration
                //HelloWordConfiguration - @Configuration
                //name() - @Bean

            //3: Get the bean from Spring
                System.out.println(context.getBean("name"));
                System.out.println(context.getBean("age"));
                System.out.println(context.getBean("person"));
                System.out.println(context.getBean("person2MethodCall"));


                //4: Get all the beans using functional programming
                Arrays.stream(context.getBeanDefinitionNames())
                        .forEach(System.out::println);
        }
}
