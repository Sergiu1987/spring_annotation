package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

    private FortuneService fortuneService;
    
 // define a default constructor
    public PingPongCoach() {
        System.out.println(">> PingPongCoach: inside default constructor");
    }
        
    @Override
    public String getDailyWorkOut() {
        return "Practice your pingpong drop shot";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
