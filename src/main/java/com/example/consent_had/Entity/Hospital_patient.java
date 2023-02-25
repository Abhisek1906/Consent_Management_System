package com.example.consent_had.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "Hospital_patient")
@Data
public class Hospital_patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int patientId;

    @Column(name="hospital_id",nullable = false)
    private int hospitalId;



    @OneToMany(mappedBy = "patient")
    @JsonManagedReference
    private List<EHR> ehrList;

    public int getHid() {
        return hospitalId;
    }

    public void setHid(int hid) {
        this.hospitalId = hid;
    }

    public int getPid() {
        return patientId;
    }

    public void setPid(int pid) {
        this.patientId = pid;
    }



    public Hospital_patient() {
    }

    public Hospital_patient(int hid, int pid) {
        this.hospitalId = hid;
        this.patientId = pid;
    }
}
