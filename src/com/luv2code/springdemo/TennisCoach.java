package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component  // default bean ID will be used
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
       
        return "Practice your backhand volley";
    }

    

}
