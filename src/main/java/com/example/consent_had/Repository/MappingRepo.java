package com.example.consent_had.Repository;

import com.example.consent_had.Entity.Mapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MappingRepo extends JpaRepository<Mapping,Integer> {

    @Query(value = "SELECT m.hospitalId,m.patientId from Mapping m WHERE m.abhaId=:abhaId",nativeQuery = true)
    List<List<Integer>> getPatientHospitalPair(int abhaId);
}
