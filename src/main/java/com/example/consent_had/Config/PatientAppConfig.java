package com.example.consent_had.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PatientAppConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
