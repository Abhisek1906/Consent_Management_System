package com.example.consent_had.Repository;

import com.example.consent_had.Entity.EHR;
import com.example.consent_had.Entity.Hospital_patient;
import com.example.consent_had.Response.EhrResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalPatientRepository extends JpaRepository<Hospital_patient,Integer> {
    @Query(nativeQuery = true,value = "select * from hospital_patient h WHERE h.hospital_id=:hospitalId and h.patient_id=:patientId")
    Hospital_patient getPatient(int hospitalId, int patientId);

}
