package com.developerSpringboot.First_Project.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary it is used when qualifier not used
//@Lazy it is used to not load this class without using
public class BaseBallCoach implements Coach{

    public BaseBallCoach(){
        System.out.println("In Constructor "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practise 30mins for daily batting!";
    }
}
