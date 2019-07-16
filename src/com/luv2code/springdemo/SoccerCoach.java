package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("footballPlayer")
public class SoccerCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        
        return "Hey go run for a while ";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return null;
    }

}
