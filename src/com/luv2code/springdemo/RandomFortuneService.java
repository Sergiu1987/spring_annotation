package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {
            "Wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };
    
    // create a random number generate
    private Random myRandom = new Random();
    
    @Override
    public String getFortune() {
        //pick a random string from the array
        int index = myRandom.nextInt(data.length);
        
        String theFortune = data[index];
        
        return theFortune;
    }

}
