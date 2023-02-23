package com.example.consent_had.Repository;

import com.example.consent_had.Entity.EHR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EhrRepository extends JpaRepository<EHR,Integer> {
}
