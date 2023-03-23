package com.example.kims.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "ehr")
@Data
public class EHR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ehrId;

    @Column(name="hospitalName")
    private String hospitalName;

    @Column(name="hospital_id",nullable = false)
    private int hospitalId;

    @Column(name="doctor_id",nullable = false)
    private int doctorId;

    @Column(name="doctorName")
    private String doctorName;

    @Column(name="timestamp", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private Date timeStamp;

    @Column(name="diagnosis")
    private String Diagnosis;

    @Column(name="medicine")
    private String medicine;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="patient_id",nullable = false)
    @JsonBackReference
    private HospitalPatient patient;


}
