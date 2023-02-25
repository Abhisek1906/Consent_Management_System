package com.example.consent_had.Service;

import com.example.consent_had.Entity.EHR;
import com.example.consent_had.Entity.Hospital_patient;
import com.example.consent_had.Entity.Patient;
import com.example.consent_had.Repository.HospitalPatientRepository;
import com.example.consent_had.Repository.MappingRepo;
import com.example.consent_had.Repository.PatientRepository;
import com.example.consent_had.Response.EhrResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private MappingRepo mappingRepo;

    @Autowired
    private HospitalPatientRepository hospitalPatientRepository;

    @Autowired
    private ModelMapper modelMapper;
   

    @Override
    public List<EHR> fetchEhrOfPatient(int id) {
//        List<EhrResponse> result=new ArrayList<>();
        List<EHR> result=new ArrayList<>();
        System.out.println(id);
        List<List<Integer>> hospitalAndPatientIds=fetchHospitalAndPatientIds(id);
        for(int i=0;i<hospitalAndPatientIds.size();i++){
            List<Integer> sub=hospitalAndPatientIds.get(i);
            int hospitalId=sub.get(0);
            int patientId=sub.get(1);
//            System.out.println(hospitalId+"#########"+patientId);
            List<EHR> getPatientsSpecificToEHR=fetchPatientsSpecificToEhr(hospitalId,patientId);
//            System.out.println(getPatientsSpecificToEHR);
           for(int j=0;j<getPatientsSpecificToEHR.size();j++){
                EHR e1=getPatientsSpecificToEHR.get(j);
                //System.out.println(e1.toString());
//                //EhrResponse ehrResponse=modelMapper.map(e1,EhrResponse.class);
//                //result.add(ehrResponse);
                result.add(e1);
            }

        }

        return result;
    }

    @Override
    public boolean addPatient(Patient patient) {
        Patient temp=patientRepository.save(patient);
        if(temp==null)
            return false;
        return true;
    }

    private List<EHR> fetchPatientsSpecificToEhr(int hospitalId, int patientId) {
        Hospital_patient getPatientsSpecificToEhr=hospitalPatientRepository.getPatient(hospitalId,patientId);
        return getPatientsSpecificToEhr.getEhrList();
    }


    private List<List<Integer>> fetchHospitalAndPatientIds(int id) {
        List<List<Integer>> getHospitalAndPatientIds=mappingRepo.getPatientHospitalPair(id);
        return getHospitalAndPatientIds;
    }
}
