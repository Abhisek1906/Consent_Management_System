package com.example.consent_had.Service;

import com.example.consent_had.Entity.Hospital_patient;
import com.example.consent_had.Repository.HospitalPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Hospital_PatientImpl implements Hospital_PatientService{

    @Autowired
    private HospitalPatientRepository hospitalPatientRepository;
    @Override
    public boolean addPatient(Hospital_patient hospitalPatient) {
        Hospital_patient temp=hospitalPatientRepository.save(hospitalPatient);
        if(temp==null)
            return false;
        else
            return true;
    }
}
