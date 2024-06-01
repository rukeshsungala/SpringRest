package com.developerSpringboot.First_Project.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In Constructor "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practise your backhand volley!";
    }
}
