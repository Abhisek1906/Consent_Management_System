package com.example.cms.Repository;

import com.example.cms.Entity.Mapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MappingRepository extends JpaRepository<Mapping,Integer> {

    //@Query(value = "SELECT * from mapping m WHERE m.abhaId=",nativeQuery = true)
    List<Mapping> findByAbhaId(int Id);
}