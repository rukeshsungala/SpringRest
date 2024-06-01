package com.developerSpringboot.First_Project.config;

import com.developerSpringboot.First_Project.common.Coach;
import com.developerSpringboot.First_Project.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
