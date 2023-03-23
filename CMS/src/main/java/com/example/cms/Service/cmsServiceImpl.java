package com.example.cms.Service;

import com.example.cms.Entity.Mapping;
import com.example.cms.Repository.MappingRepository;
import com.example.cms.Response.EhrResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class cmsServiceImpl implements cmsService {

    @Autowired
    private GetEHRfeign ehrlist;
    @Autowired
    private MappingRepository mappingRepo;

    @Override
    public List<EhrResponse> getEHR(int Id) {
        List<EhrResponse> getEhrSpecificToPatient = new ArrayList<>();

        List<Mapping> hospitalPatientPair = fetchHospitalAndPatientIds(Id);
        for (int i = 0; i < hospitalPatientPair.size(); i++) {
            Mapping sub = hospitalPatientPair.get(i);
            int hospitalId = sub.getHospitalId();
            int patientId = sub.getPatientId();
            getEhrSpecificToPatient = ehrlist.getEHR(patientId);
            System.out.println(getEhrSpecificToPatient);
        }
        return getEhrSpecificToPatient;

    }
    private List<Mapping> fetchHospitalAndPatientIds(int id) {
        List<Mapping> getHospitalAndPatientIds=mappingRepo.findByAbhaId(id);
        return getHospitalAndPatientIds;
    }


    @Override
    public boolean addMapping(Mapping map) {
        Mapping temp=mappingRepo.save(map);
        if(temp==null)
            return false;
        return true;
    }
}
