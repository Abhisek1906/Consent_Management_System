package com.example.consent_had.Config;

import com.example.consent_had.Entity.EHR;
import com.example.consent_had.Response.EhrResponse;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PatientAppConfig {

    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper=new ModelMapper();

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        modelMapper.createTypeMap(EHR.class, EhrResponse.class)
                .addMapping(EHR::getEhr_id, EhrResponse::setEhrId);


        return modelMapper;
    }
}
