package com.example.kims.Repository;
import com.example.kims.Entity.EHR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EhrRepository extends JpaRepository<EHR,Integer> {
}
