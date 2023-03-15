package com.example.kims.Service;

import com.example.kims.Entity.EHR;
import com.example.kims.Entity.HospitalPatient;
import com.example.kims.Repository.EhrRepository;
import com.example.kims.Repository.HospitalPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalPatientServiceImpl implements HospitalPatientService{
    @Autowired
    private HospitalPatientRepository hospitalPatientRepository;

    @Autowired
    private EhrRepository ehrRepository;
    @Override
    public boolean addPatient(HospitalPatient hospitalPatient) {
        HospitalPatient temp=hospitalPatientRepository.save(hospitalPatient);
        if(temp==null)
            return false;
        else
            return true;
    }

    @Override
    public boolean addEhrForPatient(EHR ehr) {
        EHR temp=ehrRepository.save(ehr);
        if(temp==null)
            return false;
        return true;
    }
    @Override
    public List<EHR> getEHR(int patientId){
        return hospitalPatientRepository
                .findById(patientId)
                .get()
                .getEhrList();
    }
}
