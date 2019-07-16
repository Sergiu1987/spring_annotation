package com.luv2code.springdemo;

public class BiathlonCoach implements Coach {
    
    private FortuneService fortuneService;

    public BiathlonCoach(FortuneService theFortuneService) {
        // TODO Auto-generated constructor stub
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        
        return "Shoot few times and run ";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return fortuneService.getFortune();
    }

}
