package com.luv2code.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        
        // load spring config file
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContextContext.xml");
        
        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

    }

}
