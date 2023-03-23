package com.example.kims.Repository;



import com.example.kims.Entity.HospitalPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalPatientRepository extends JpaRepository<HospitalPatient,Integer> {
    @Query(nativeQuery = true,value = "select * from hospital_patient h WHERE h.hospital_id=:hospitalId and h.patient_id=:patientId")
    HospitalPatient getPatient(int hospitalId, int patientId);

}
