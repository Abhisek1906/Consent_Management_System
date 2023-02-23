package com.example.consent_had.Service;

import com.example.consent_had.Entity.Mapping;
import com.example.consent_had.Repository.MappingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MappingServiceImpl implements MappingService{

    @Autowired
    private MappingRepo mappingRepo;
    @Override
    public boolean addMapping(Mapping mapping) {
        Mapping temp=mappingRepo.save(mapping);
        if(temp==null)
            return false;
        return true;
    }
}
