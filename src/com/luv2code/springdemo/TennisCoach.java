package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // default bean ID will be used
public class TennisCoach implements Coach {
    
    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;
    
    public TennisCoach() {
        System.out.println("Defaul constructor TennisCoach");
    }
    
   /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;        
    }    
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println("inside doSomeCrazyStuff! ");
        this.fortuneService = fortuneService;
    }
     */  

    @Override
    public String getDailyWorkOut() {
       
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        
        return fortuneService.getFortune();
    }
    

    

}
