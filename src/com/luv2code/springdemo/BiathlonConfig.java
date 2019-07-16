package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("classpath:aplicationContext.xml")
public class BiathlonConfig {
    
    
    @Bean
    public FortuneService workFortuneService() {
        return new WorkFortuneService();
    }
    
    //define bean for our swim coach AND inject dependency! 
    @Bean
    public Coach biathlonCoach() {
        
        return new BiathlonCoach(workFortuneService());
    }

}
