package com.developerSpringboot.First_Project.common;

public class SwimCoach implements Coach{


    public SwimCoach(){
        System.out.println("In Constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Daily practise for Swimming!";
    }
}
