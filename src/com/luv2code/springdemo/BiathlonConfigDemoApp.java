package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BiathlonConfigDemoApp {

    public static void main(String[] args) {
        
        //read spring config java class
       AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(BiathlonConfig.class);
        
        //get the bean from spring container
        Coach theCoach = context.getBean("biathlonCoach", Coach.class);
        
        
        
        //call a method on the bean
        System.out.println(theCoach.getDailyWorkOut());
        
        // call method to getDailyFortune
        System.out.println(theCoach.getDailyFortune());
        
        
        
               
        //close the context
        context.close();
        
        

    }

}
