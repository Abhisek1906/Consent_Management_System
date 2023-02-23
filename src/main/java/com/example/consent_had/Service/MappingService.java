package com.example.consent_had.Service;

import com.example.consent_had.Entity.Mapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;



public interface MappingService  {
    boolean addMapping(Mapping mapping);
}
