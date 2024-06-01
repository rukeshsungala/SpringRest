package com.developerSpringboot.First_Project.rest;

import com.developerSpringboot.First_Project.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {

    //define private filed for the dependency
    private Coach myCoach;
    //private Coach anotherCoach;


    @Value("${team.name}")
    private String teamName;

    @Value("${lead.name}")
    private String leadName;

    //define a constructor for dependancy
   /*@Autowired
    public FunRestController(Coach theCoach) {
        this.myCoach = theCoach;
    }*/

    //define a setter injection
   /* @Autowired
    public void setCoach(Coach theCoach){
        myCoach=theCoach;
    }*/

    //define a constructor for @Qualifier dependency
    /*@Autowired
    public FunRestController(@Qualifier("cricketCoach")Coach theCoach,@Qualifier("cricketCoach")Coach theanotherCoach) {
        System.out.println("In Constructor "+getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach= theanotherCoach;
    }
    @GetMapping("/check")
    public String check(){
        return "Comparing beans: mycoach == anotherCoach : "+(myCoach==anotherCoach);
    }
*/
    //define a constructor for @Primary add dependency in which coach you want
    /*@Autowired
    public FunRestController(Coach theCoach) {
        this.myCoach = theCoach;
    }*/

    public FunRestController(@Qualifier("swimCoach")Coach theCoach) {
        System.out.println("In Constructor "+getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return teamName+" "+leadName;
    }

    @GetMapping("/")
    public String sayHelllo(){
        return "Hello World !";
    }

    //Expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getdailyWorkout(){
        return "Run daily 5k!";
    }

    //Expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getdailyFortune(){
        return "Today is your lucky day!";
    }

}
