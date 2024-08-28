package com.abir.asho_spring_shikhi.advancedSpringFeatures;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class classA{
    public classA(){
        System.out.println("classA Initialized");
    }
}
@Component
@Lazy
class classB{
    private classA classA;
    public classB(classA classA){
        System.out.println("classB Initialized");
        this.classA = classA;
    }
}
@Configuration
@ComponentScan
public class LazyInitializationDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(LazyInitializationDemo.class);
        context.getBean(classA.class);
        context.getBean(classB.class);
    }
}
