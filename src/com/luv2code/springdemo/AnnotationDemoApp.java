package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        
        //read spring config file
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach soccerCoach = context.getBean("footballPlayer", Coach.class);
        Coach pingpongCoach = context.getBean("pingPongCoach", Coach.class);
        
        
        //call a method on the bean
        System.out.println(theCoach.getDailyWorkOut());
        System.out.println(soccerCoach.getDailyWorkOut());
        // call method to getDailyFortune
        System.out.println(theCoach.getDailyFortune());
        System.out.println(pingpongCoach.getDailyFortune());
               
        //close the context
        context.close();
        
        

    }

}
