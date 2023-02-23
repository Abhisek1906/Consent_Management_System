package com.example.consent_had.Entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "ehr")
@NoArgsConstructor
public class EHR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ehr_id;



    @Column(name="doctorId",nullable = false)
    private int doctorId;

    @Column(name="timestamp", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP",nullable = false)
    private Date timeStamp;

    @Column(name="diagnosis",nullable = false)
    private String Diagnosis;

    @Column(name="medicine",nullable = false)
    private String medicine;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="patient_id",nullable = false)
    private Hospital_patient patient;

    public int getEhr_id() {
        return ehr_id;
    }

    public void setEhr_id(int ehr_id) {
        this.ehr_id = ehr_id;
    }




    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Hospital_patient getPatient() {
        return patient;
    }

    public void setPatient(Hospital_patient patient) {
        this.patient = patient;
    }

    public EHR( int doctorId, Date timeStamp, Hospital_patient patient) {
        this.doctorId = doctorId;
        this.timeStamp = timeStamp;
        this.patient = patient;
    }

}
