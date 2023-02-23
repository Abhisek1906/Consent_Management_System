package com.example.consent_had.Entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Hospital_patient")
public class Hospital_patient {

    @Column(name="hospitalId",nullable = false)
    private int hospitalId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patientId",nullable = false)
    private int patientId;

    @OneToMany(mappedBy = "patient")
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

    public List<EHR> getEhrList() {
        return ehrList;
    }

    public void setEhrList(List<EHR> ehrList) {
        this.ehrList = ehrList;
    }

    public Hospital_patient() {
    }

    public Hospital_patient(int hid, int pid) {
        this.hospitalId = hid;
        this.patientId = pid;
    }
}
