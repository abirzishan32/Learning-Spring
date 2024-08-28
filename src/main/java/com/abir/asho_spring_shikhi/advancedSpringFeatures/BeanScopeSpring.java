package com.abir.asho_spring_shikhi.advancedSpringFeatures;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {
    public NormalClass() {
        System.out.println("Singleton Scoped Bean (NormalClass) is created"); // This should be printed only once
    }
}

@Scope(value = "prototype")
@Component
class PrototypeClass {
    public PrototypeClass() {
        System.out.println("Prototype Scoped Bean (PrototypeClass) is created"); // This should be printed every time a new instance is created
    }
}

@Configuration
@ComponentScan
public class BeanScopeSpring {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanScopeSpring.class);

        // Singleton Scope
        System.out.println("Requesting Singleton Scoped Bean...");
        System.out.println(context.getBean(NormalClass.class));  // Should create and return the same instance
        System.out.println(context.getBean(NormalClass.class));  // Should return the same instance

        // Prototype Scope
        System.out.println("\nRequesting Prototype Scoped Bean...");
        System.out.println(context.getBean(PrototypeClass.class));  // Should create a new instance
        System.out.println(context.getBean(PrototypeClass.class));  // Should create a new instance
        System.out.println(context.getBean(PrototypeClass.class));  // Should create a new instance
    }
}