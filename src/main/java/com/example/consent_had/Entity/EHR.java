package com.example.consent_had.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "ehr")
public class EHR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ehr_id;

    @Column(name="hospital_id",nullable = false)
    private int hospitalId;

    @Column(name="doctor_id",nullable = false)
    private int doctorId;

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
    private Hospital_patient patient;

    public EHR(){

    }

    public EHR(int ehr_id, int hospitalId, int doctorId, Date timeStamp, String diagnosis, String medicine,Hospital_patient patient) {
        this.ehr_id = ehr_id;
        this.hospitalId = hospitalId;
        this.doctorId = doctorId;
        this.timeStamp = timeStamp;
        Diagnosis = diagnosis;
        this.medicine = medicine;
        this.patient = patient;
    }

    public int getEhr_id() {
        return ehr_id;
    }

    public void setEhr_id(int ehr_id) {
        this.ehr_id = ehr_id;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
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

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public Hospital_patient getPatient() {
        return patient;
    }

    public void setPatient(Hospital_patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "EHR{" +
                "ehr_id=" + ehr_id +
                ", hospitalId=" + hospitalId +
                ", doctorId=" + doctorId +
                ", timeStamp=" + timeStamp +
                ", Diagnosis='" + Diagnosis + '\'' +
                ", medicine='" + medicine + '\'' +
                '}';
    }
}
