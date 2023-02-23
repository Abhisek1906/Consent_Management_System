package com.example.consent_had.Entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name="mapping")
@NoArgsConstructor
public class Mapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mapping_id;

    @Column(name="abha_Id",nullable = false)
    private int abhaId;

    @Column(name="hospitalId",nullable = false)
    private int hospitalId;

    @Column(name = "patientId",nullable = false)
    private int patientId;

    public int getMapping_id() {
        return mapping_id;
    }

    public void setMapping_id(int mapping_id) {
        this.mapping_id = mapping_id;
    }

    public int getAbha_Id() {
        return abhaId;
    }

    public void setAbha_Id(int abha_Id) {
        this.abhaId = abha_Id;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Mapping(int abha_Id, int hospitalId, int patientId) {
        this.abhaId = abha_Id;
        this.hospitalId = hospitalId;
        this.patientId = patientId;
    }

}
