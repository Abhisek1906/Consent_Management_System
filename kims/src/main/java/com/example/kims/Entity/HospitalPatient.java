package com.example.kims.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "Hospital_patient")
@Data
public class HospitalPatient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int patientId;

    @Column(name="hospital_id",nullable = false)
    private int hospitalId;



    @OneToMany(mappedBy = "patient")
    @JsonManagedReference
    private List<EHR> ehrList;

}
