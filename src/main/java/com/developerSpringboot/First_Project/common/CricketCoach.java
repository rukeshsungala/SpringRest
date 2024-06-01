package com.developerSpringboot.First_Project.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{


    public CricketCoach(){
        System.out.println("In Constructor "+getClass().getSimpleName());
    }

//    //define an init method
//    @PostConstruct
//    public void doMyStartUpStuff(){
//        System.out.println("In doMyStartupStuff : "+getClass().getSimpleName());
//    }
//
//    // define the destroy method
//    @PreDestroy
//    public void doMyCleanUpStuff(){
//        System.out.println("In doMyCleanUpStuff : "+getClass().getSimpleName());
//    }


    @Override
    public String getDailyWorkout() {
        return "Practice fast-bowling for 15 mins";
    }
}
